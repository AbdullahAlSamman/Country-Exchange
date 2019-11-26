package com.aals.countriesexchange.Controller;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import com.aals.countriesexchange.DB.AppDB;
import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.Model.CountryODS;
import com.aals.countriesexchange.Model.ODSAPI;
import com.aals.countriesexchange.UI.MainActivity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.ByteArrayOutputStream;
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

public class ODSManager implements Callback<List<CountryODS>> {

    private static Gson gson;
    private static OkHttpClient httpClient;
    private static String url;
    private static Context baseContext;
    private static List<Country> countries = new ArrayList<Country>();
    private List<CountryODS> countryOdsList = new ArrayList<CountryODS>();


    public ODSManager(String url) {
        this.url = url;
    }

    public static void fetchSvg(final int index, String flagUrl) throws Exception {
        if (httpClient == null) {
            httpClient = new OkHttpClient.Builder()
                    .build();
        }

        Request request = new Request.Builder().url(flagUrl).build();
        okhttp3.Response response = httpClient.newCall(request).execute();

        if (response.isSuccessful()) {
            InputStream stream = response.body().byteStream();
            countries.get(index).setFlagImage(toByteArray(stream));
            Log.e("flag", countries.get(index).getFlagImage().length + "");
            stream.close();
        } else {
            Log.e("flag", "failed to get data");
        }
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

        gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit querry = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        ODSAPI odsapi = querry.create(ODSAPI.class);

        Call<List<CountryODS>> call = odsapi.getCountries();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<List<CountryODS>> call, Response<List<CountryODS>> response) {
        if (response.isSuccessful()) {
            countryOdsList = response.body();

            logging();

            countries = countryOdsList.get(0).getData();

            new dbInsertAll().execute(null, null, null);

        } else {
            //TODO:Handle error or internet
            Log.e("Error", response.errorBody().toString());
        }

    }

    @Override
    public void onFailure(Call<List<CountryODS>> call, Throwable t) {
        //TODO:send message to user
        // TODS:Testing
        Log.e("ODSManager Error", t.getMessage());
    }

    public void logging() {
        //Log ExchangeRates
        Log.i("ODSObject", "Size: " + countryOdsList.size() + "");
        Log.i("ODSObject", "ID: " + countryOdsList.get(0).getId() + "");
        Log.i("ODSObject", "License: " + countryOdsList.get(0).getLicense() + "");
        Log.i("ODSObject", "TimeStamp: " + countryOdsList.get(0).getTimestamp() + "");
        Log.i("ODSObject", "Origin: " + countryOdsList.get(0).getOrigin() + "");
        Log.i("ODSObject", "ExchangeRates Array Size: " + countryOdsList.get(0).getData().size() + "");
    }

    public class dbInsertAll extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                for (int i = 0; i < countries.size(); i++) {
                    fetchSvg(i, countries.get(i).getFlag());
                }
                AppDB.getInstance(baseContext).countryDao().insertAllCountries(countries);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Intent startMain = new Intent(getBaseContext(), MainActivity.class);
            startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            baseContext.startActivity(startMain);
        }
    }

}

