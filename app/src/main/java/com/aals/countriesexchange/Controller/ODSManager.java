package com.aals.countriesexchange.Controller;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import com.aals.countriesexchange.DB.AppDB;
import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.Model.ODS;
import com.aals.countriesexchange.Model.ODSAPI;
import com.aals.countriesexchange.UI.MainActivity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ODSManager implements Callback<List<ODS>> {

    private static Gson gson;
    private static OkHttpClient httpClient;
    private static String url;
    private static Context baseContext;
    private static List<Country> countries = new ArrayList<Country>();
    private List<ODS> odsList = new ArrayList<ODS>();
    private AppDB db;


    public ODSManager(String url) {
        this.url = url;
    }

    public static void fetchSvg(final int index, String flagUrl) {
        if (httpClient == null) {
            httpClient = new OkHttpClient.Builder()
                    .build();
        }

        Request request = new Request.Builder().url(flagUrl).build();
        httpClient.newCall(request).enqueue(new okhttp3.Callback() {
            @Override
            public void onFailure(okhttp3.Call call, IOException e) {
                Log.e("Flag", e.getMessage());
            }

            @Override
            public void onResponse(okhttp3.Call call, okhttp3.Response response) throws IOException {
                try {
                    if (response.isSuccessful()) {
                        InputStream stream = response.body().byteStream();
                        countries.get(index).setFlagImage(toByteArray(stream));
                        Log.e("flag", countries.get(index).getFlagImage().length + "");
                        stream.close();
                    } else {
                        Log.e("flag", "failed to get data");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static byte[] toByteArray(InputStream bitmap) throws Exception {
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[16384];

        while ((nRead = bitmap.read(data, 0, data.length)) != -1) {
            byteArray.write(data, 0, nRead);
        }

        return byteArray.toByteArray();
    }

    public Context getBaseContext() {
        return baseContext;
    }

    public void setBaseContext(Context baseContext) {
        this.baseContext = baseContext;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    public void start() {

        db = AppDB.getInstance(baseContext);

        gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit querry = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        ODSAPI odsapi = querry.create(ODSAPI.class);

        Call<List<ODS>> call = odsapi.getCountries();
        call.enqueue(this);

    }

    @Override
    public void onResponse(Call<List<ODS>> call, Response<List<ODS>> response) {
        if (response.isSuccessful()) {
            odsList = response.body();

            logging();

            countries = odsList.get(0).getData();


            for (int i = 0; i < countries.size(); i++) {

                fetchSvg(i, countries.get(i).getFlag());
            }

            new dbInsertAll().execute(null, null, null);

//            Intent startMain = new Intent(getBaseContext(), MainActivity.class);
//            startMain.putExtra("countries", (Serializable) countries);
//            startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            baseContext.startActivity(startMain);


            //TODO: Start image bring from server
        } else {
            //TODO:Handle error or internet
            Log.e("Error", response.errorBody().toString());
        }

    }

    @Override
    public void onFailure(Call<List<ODS>> call, Throwable t) {
        //TODO:send message to user
        // TODS:Testing
        Log.e("ODSManager Error", t.getMessage());
    }

    public void logging() {
        //Log Data
        Log.i("ODSObject", "Size: " + odsList.size() + "");
        Log.i("ODSObject", "ID: " + odsList.get(0).getId() + "");
        Log.i("ODSObject", "License: " + odsList.get(0).getLicense() + "");
        Log.i("ODSObject", "TimeStamp: " + odsList.get(0).getTimestamp() + "");
        Log.i("ODSObject", "Origin: " + odsList.get(0).getOrigin() + "");
        Log.i("ODSObject", "Data Array Size: " + odsList.get(0).getData().size() + "");
    }

    public class dbInsertAll extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            AppDB.getInstance(getBaseContext()).userDao().insertAll(countries);
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Intent startMain = new Intent(getBaseContext(), MainActivity.class);
//            startMain.putExtra("countries", (Serializable) countries);
            startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            baseContext.startActivity(startMain);
        }
    }

}

