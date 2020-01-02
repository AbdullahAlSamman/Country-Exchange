package com.aals.countriesexchange.DataControllers;

import com.aals.countriesexchange.Model.CountryODS;
import com.aals.countriesexchange.Model.ExchangeODS;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ODSAPI {

    @GET("1?order=id.desc&limit=1")
    Call<List<CountryODS>> getCountries();

    @GET("2?order=id.desc&limit=1")
    Call<List<ExchangeODS>> getExchangeRates();
}
