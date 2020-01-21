package com.aals.countriesexchange.DataControllers;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import com.aals.countriesexchange.DB.AppDB;
import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.Model.CountryODS;
import com.aals.countriesexchange.Model.SerializableBitmap;
import com.aals.countriesexchange.UI.MainActivity;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CountryCallBack implements Callback<List<CountryODS>> {

    private static Context baseContext;
    private static List<Country> countries = new ArrayList<Country>();
    private static OkHttpClient httpClient;
    private List<CountryODS> countryOdsList = new ArrayList<CountryODS>();
    private final static String flagURLStart = "https://www.countryflags.io/";
    private final static String flagURLEnd = "/flat/64.png";

    public void setBaseContext(Context baseContext) {
        CountryCallBack.baseContext = baseContext;
    }

    @Override
    public void onResponse(Call<List<CountryODS>> call, Response<List<CountryODS>> response) {
        if (response.isSuccessful()) {
            countryOdsList = response.body();

            infoLogging();

            countries = countryOdsList.get(0).getData();

            new DBInsertAll().execute(null, null, null);

        } else {
            Log.e(getClass().getSimpleName(), response.errorBody().toString());
            call.cancel();
        }

    }

    @Override
    public void onFailure(Call<List<CountryODS>> call, Throwable t) {
        Log.e(getClass().getSimpleName(), t.getMessage());
        call.clone().enqueue(this);
    }

    public static void fetchFlag(final int index, String flagUrl) throws Exception {

        if (httpClient == null) {
            httpClient = new OkHttpClient.Builder()
                    .build();
        }

        Request request = new Request.Builder().url(flagUrl).build();
        okhttp3.Response response = httpClient.newCall(request).execute();

        if (response.code() == 200) {
            InputStream stream = response.body().byteStream();
            countries.get(index).setFlagImage(new SerializableBitmap(BitmapFactory.decodeStream(stream)));
            Log.e(countries.get(index).getAlpha3Code() + " fetchFlag", countries.get(index).getFlagImage().getWidth() + "*" + countries.get(index).getFlagImage().getHeight());
            stream.close();
        } else {
            countries.get(index).setFlagImage(null);
            Log.e("fetchFlag", String.valueOf(response.code()));
        }
    }

    public static void fetchSVG(final int index, String flagUrl) throws Exception {
        if (httpClient == null) {
            httpClient = new OkHttpClient.Builder()
                    .build();
        }

        Request request = new Request.Builder().url(flagUrl).build();
        okhttp3.Response response = httpClient.newCall(request).execute();
        if (response.code() == 200) {
            byte[] stream = response.body().bytes();
            countries.get(index).setFlagHighImage(stream);
            Log.i(countries.get(index).getAlpha3Code() + " ImageSvg# " + index, stream.length + "");
        } else {
            countries.get(index).setFlagImage(null);
            Log.e("fetchFlag", String.valueOf(response.code()));
        }
    }

    public static class DBInsertAll extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                if (countries.size() != AppDB.getInstance(baseContext).countryDao().getCountriesCount())
                    for (int i = 0; i < countries.size(); i++) {
                        String svgUrl = countries.get(i).getFlag();
                        String url = flagURLStart + countries.get(i).getAlpha2Code() + flagURLEnd;
                        Log.i(getClass().getSimpleName(), url);
                        fetchFlag(i, url);
                        fetchSVG(i, svgUrl);

                    }
                AppDB.getInstance(baseContext).countryDao().insertAllCountries(countries);
            } catch (Exception e) {
                Log.e(getClass().getSimpleName(), e.getMessage());
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Intent intent = new Intent(baseContext, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            baseContext.startActivity(intent);
        }
    }

    public void infoLogging() {
        //Log ExchangeRates
        Log.i(getClass().getSimpleName(), "Size: " + countryOdsList.size() + "");
        Log.i(getClass().getSimpleName(), "ID: " + countryOdsList.get(0).getId() + "");
        Log.i(getClass().getSimpleName(), "License: " + countryOdsList.get(0).getLicense() + "");
        Log.i(getClass().getSimpleName(), "TimeStamp: " + countryOdsList.get(0).getTimestamp() + "");
        Log.i(getClass().getSimpleName(), "Origin: " + countryOdsList.get(0).getOrigin() + "");
        Log.i(getClass().getSimpleName(), "ExchangeRates Array Size: " + countryOdsList.get(0).getData().size() + "");
    }
}
