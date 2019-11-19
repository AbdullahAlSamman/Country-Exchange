package com.aals.countriesexchange.Controller;

import android.content.Context;
import android.os.Handler;
import android.util.Log;

import androidx.recyclerview.widget.RecyclerView;

import com.aals.countriesexchange.DB.AppDB;
import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.Model.ODS;
import com.aals.countriesexchange.Model.ODSAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainController implements Callback<List<ODS>> {

    private static Gson gson;
    AppDB db;
    private List<ODS> odsList = new ArrayList<ODS>();
    private String url;
    private List<Country> countries = new ArrayList<Country>();
    private Handler uiHandler;
    private CacheController memoryCache;
    private ImageController imageController;
    private RecyclerView recyclerView;
    private Context baseContext;


    public MainController(String url) {
        this.url = url;
    }

    public RecyclerView getRecyclerView() {
        return recyclerView;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public Context getBaseContext() {
        return baseContext;
    }

    public void setBaseContext(Context baseContext) {
        this.baseContext = baseContext;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    public void start() {

        imageController = new ImageController();

        db = AppDB.getInstance(this.baseContext);

        gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit querry = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        ODSAPI odsapi = querry.create(ODSAPI.class);

        Call<List<ODS>> call = odsapi.getCountries();
        call.enqueue(this);

    }

    @Override
    public void onResponse(Call<List<ODS>> call, Response<List<ODS>> response) {
        if (response.isSuccessful()) {
            odsList = response.body();

            logging();

            Log.i("ODSObject", "Data as String: " + odsList.get(0).getData() + "");
            try {
                for (int i = 0; i < odsList.size(); i++) {
                    countries = odsList.get(i).getData();


                }
            } catch (Exception e) {
                e.printStackTrace();
            }

//            db.userDao().insertAll(countries);
        } else {
            //TODO:Handle error or internet
            Log.e("Error", response.errorBody().toString());
        }


    }

    @Override
    public void onFailure(Call<List<ODS>> call, Throwable t) {
        //TODO:send message to user
        // TODS:Testing
        Log.e("MainController Error", t.getMessage());
    }

    public void logging() {
        //Log Data
        Log.i("ODSObject", "Size: " + odsList.size() + "");
        Log.i("ODSObject", "ID: " + odsList.get(0).getId() + "");
        Log.i("ODSObject", "License: " + odsList.get(0).getLicense() + "");
        Log.i("ODSObject", "TimeStamp: " + odsList.get(0).getTimestamp() + "");
        Log.i("ODSObject", "Origin: " + odsList.get(0).getOrigin() + "");
        Log.i("ODSObject", "Data Array Size: " + odsList.get(0).getData().size() + "");
    }
}

