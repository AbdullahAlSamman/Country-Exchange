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

/**
 * The type Data manager.
 */
public class DataManager {

    private static Gson gson;
    private static String url;
    private static Context baseContext;
    private Retrofit quarry;
    private CountryCallBack countryCallBack;
    private ExchangeCallBack exchangeCallBack;

    /**
     * Instantiates a new Data manager.
     *
     * @param url the server url
     */
    public DataManager(String url) {
        this.url = url;

        gson = new GsonBuilder()
                .setLenient()
                .create();

        quarry = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    /**
     * Gets base context.
     *
     * @return the base context of current activity
     */
    public static Context getBaseContext() {
        return baseContext;
    }

    /**
     * Sets base context.
     *
     * @param baseContext the base context of current activity.
     */
    public void setBaseContext(Context baseContext) {
        this.baseContext = baseContext;
    }

    /**
     * Start get countries.
     */
    public void startGetCountries() {

        ODSAPI odsapi = quarry.create(ODSAPI.class);

        Call<List<CountryODS>> call = odsapi.getCountries();

        countryCallBack = new CountryCallBack();
        countryCallBack.setBaseContext(baseContext);
        call.enqueue(countryCallBack);
    }

    /**
     * Start get exchange rates.
     */
    public void startGetExchangeRates() {

        ODSAPI odsapi = quarry.create(ODSAPI.class);

        Call<List<ExchangeODS>> call = odsapi.getExchangeRates();

        exchangeCallBack = new ExchangeCallBack();
        exchangeCallBack.setBaseContext(baseContext);
        call.enqueue(exchangeCallBack);
    }

    /**
     * Update exchange rates.
     */
    public void updateExchangeRates() {

        ODSAPI odsapi = quarry.create(ODSAPI.class);

        Call<List<ExchangeODS>> call = odsapi.getExchangeRates();

        exchangeCallBack = new ExchangeCallBack();
        exchangeCallBack.setBaseContext(baseContext);
        exchangeCallBack.setUpdate(true);
        call.enqueue(exchangeCallBack);
    }
}

