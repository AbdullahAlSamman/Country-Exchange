package com.aals.countriesexchange.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ODSAPI {

    @GET("storage/4?order=id.desc&limit=1")
    Call<List<CountryODS>> getCountries();

    @GET("storage/7?order=id.desc&limit=1")
    Call<List<ExchangeODS>> getExchangeRates();
}
