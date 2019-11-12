package com.aals.countriesexchange;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ODSAPI {

    @GET("storage/1?order=id.desc&limit=1")
    Call<List<ODSObject>> getCountries();
}
