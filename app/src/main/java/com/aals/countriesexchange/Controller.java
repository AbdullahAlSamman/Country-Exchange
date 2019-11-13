package com.aals.countriesexchange;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller implements Callback<List<ODSObject>> {

    private static Gson gson;
    List<ODSObject> odsObjectList;
    private String url;
    private ArrayList<Country> countries = new ArrayList<Country>();

    public Controller(String url) {
        this.url = url;
    }

    public ArrayList<Country> getCountries() {
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

        Call<List<ODSObject>> call = odsapi.getCountries();
        call.enqueue(this);

    }

    @Override
    public void onResponse(Call<List<ODSObject>> call, Response<List<ODSObject>> response) {
        if (response.isSuccessful()) {
            odsObjectList = response.body();

            ArrayList<Object> jsonData = odsObjectList.get(0).getData().getData();

            //Log Data
            Log.i("ODSObject", "Size: " + odsObjectList.size() + "");
            Log.i("ODSObject", "ID: " + odsObjectList.get(0).getId() + "");
            Log.i("ODSObject", "License: " + odsObjectList.get(0).getLicense() + "");
            Log.i("ODSObject", "TimeStamp: " + odsObjectList.get(0).getTimestamp() + "");
            Log.i("ODSObject", "Origin: " + odsObjectList.get(0).getOrigin() + "");
            Log.i("ODSObject", "Data Array Size: " + odsObjectList.get(0).getData().getData().size() + "");
            Log.i("ODSObject", "Data as String: " + odsObjectList.get(0).getData().getData().get(0).toString() + "");
            Log.i("ODSObject", "DurationInMilliSeconds: " + odsObjectList.get(0).getData().getStats().getDurationInMilliSeconds() + "");
            Log.i("ODSObject", "StartTimestamp: " + odsObjectList.get(0).getData().getStats().getStartTimestamp() + "");
            Log.i("ODSObject", "EndTimeStamp: " + odsObjectList.get(0).getData().getStats().getEndTimestamp() + "");


            for (int i = 0; i < jsonData.size(); i++) {
                countries.add(gson.fromJson(gson.toJson(jsonData.get(i)), Country.class));
                //Log Countries
                Log.i("Country " + i, countries.get(i).getName() + " ");
            }

        } else {
            Log.e("Error", response.errorBody().toString());
        }
    }

    @Override
    public void onFailure(Call<List<ODSObject>> call, Throwable t) {
        //TODO:send message to user
        // TODS:Testing
        Log.e("Controller Error", t.getMessage());
    }
}

