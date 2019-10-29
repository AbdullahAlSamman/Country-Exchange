package com.aals.countriesexchange;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ODSAPI {

    @GET("datasources")
    Call<List<Data>> getData();
}
