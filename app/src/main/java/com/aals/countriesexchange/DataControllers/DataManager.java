package com.aals.countriesexchange.DataControllers;

import android.content.Context;

import com.aals.countriesexchange.Model.CountryODS;
import com.aals.countriesexchange.Model.ExchangeODS;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataManager {

    private static Gson gson;
    private static String url;
    private static Context baseContext;
    private Retrofit querry;
    private CountryCallBack countryCallBack;
    private ExchangeCallBack exchangeCallBack;

    public DataManager(String url) {
        this.url = url;

        gson = new GsonBuilder()
                .setLenient()
                .create();

        querry = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public static Context getBaseContext() {
        return baseContext;
    }

    public void setBaseContext(Context baseContext) {
        this.baseContext = baseContext;
    }

    public void startGetCountries() {

        ODSAPI odsapi = querry.create(ODSAPI.class);

        Call<List<CountryODS>> call = odsapi.getCountries();

        countryCallBack = new CountryCallBack();
        countryCallBack.setBaseContext(baseContext);
        call.enqueue(countryCallBack);
    }

    public void startGetExchangeRates() {

        ODSAPI odsapi = querry.create(ODSAPI.class);

        Call<List<ExchangeODS>> call = odsapi.getExchangeRates();

        exchangeCallBack = new ExchangeCallBack();
        exchangeCallBack.setBaseContext(baseContext);
        call.enqueue(exchangeCallBack);
    }

    public void updateExhcangeRates() {

        ODSAPI odsapi = querry.create(ODSAPI.class);

        Call<List<ExchangeODS>> call = odsapi.getExchangeRates();

        exchangeCallBack = new ExchangeCallBack();
        exchangeCallBack.setBaseContext(baseContext);
        exchangeCallBack.setUpdate(true);
        call.enqueue(exchangeCallBack);
    }
}

