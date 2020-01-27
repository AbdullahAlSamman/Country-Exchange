package com.aals.countriesexchange.DataControllers;

import com.aals.countriesexchange.Model.CountryODS;
import com.aals.countriesexchange.Model.ExchangeODS;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * The interface Odsapi.
 * Here all requests are defined to be called via Retrofit.
 */
public interface ODSAPI {

    /**
     * Gets countries.
     *
     * @return the countries as defined in entity classes.
     */
    @GET("1?order=id.desc&limit=1")
    Call<List<CountryODS>> getCountries();

    /**
     * Gets exchange rates.
     *
     * @return the exchange rates as defined in entity classes.
     */
    @GET("2?order=id.desc&limit=1")
    Call<List<ExchangeODS>> getExchangeRates();
}
