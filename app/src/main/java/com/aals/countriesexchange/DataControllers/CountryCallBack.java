package com.aals.countriesexchange.DataControllers;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import com.aals.countriesexchange.DB.AppDB;
import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.Model.CountryODS;
import com.aals.countriesexchange.UI.MainActivity;

import java.io.ByteArrayOutputStream;
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

    public static byte[] toByteArray(InputStream bitmap) throws Exception {
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[16384];

        while ((nRead = bitmap.read(data, 0, data.length)) != -1) {
            byteArray.write(data, 0, nRead);
        }

        return byteArray.toByteArray();
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
            Log.e("fetchSVG", countries.get(index).getFlagImage().length + "");
            stream.close();
        } else {
            Log.e("fetchSVG", "failed to get flag");
        }
    }

    public void setBaseContext(Context baseContext) {
        CountryCallBack.baseContext = baseContext;
    }

    @Override
    public void onResponse(Call<List<CountryODS>> call, Response<List<CountryODS>> response) {
        if (response.isSuccessful()) {
            countryOdsList = response.body();

            logging();

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

    public void logging() {
        //Log ExchangeRates
        Log.i(getClass().getSimpleName(), "Size: " + countryOdsList.size() + "");
        Log.i(getClass().getSimpleName(), "ID: " + countryOdsList.get(0).getId() + "");
        Log.i(getClass().getSimpleName(), "License: " + countryOdsList.get(0).getLicense() + "");
        Log.i(getClass().getSimpleName(), "TimeStamp: " + countryOdsList.get(0).getTimestamp() + "");
        Log.i(getClass().getSimpleName(), "Origin: " + countryOdsList.get(0).getOrigin() + "");
        Log.i(getClass().getSimpleName(), "ExchangeRates Array Size: " + countryOdsList.get(0).getData().size() + "");
    }

    public static class DBInsertAll extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {

            try {
                if (countries.size() != AppDB.getInstance(baseContext).countryDao().getCountriesCount())
                    for (int i = 0; i < countries.size(); i++) {
                        fetchSvg(i, countries.get(i).getFlag());
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

}
