package com.aals.countriesexchange;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
    private List<Country> countries = new ArrayList<Country>();
    private Handler uiHandler;
    private RecyclerView recyclerView;
    private Context baseContext;

    public Controller(String url) {
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

        uiHandler = new Handler(Looper.getMainLooper());

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
            Log.i("ODSObject", "DurationInMilliSeconds: " + odsObjectList.get(0).getData().getStats().getDurationInMilliSeconds() + "");
            Log.i("ODSObject", "StartTimestamp: " + odsObjectList.get(0).getData().getStats().getStartTimestamp() + "");
            Log.i("ODSObject", "EndTimeStamp: " + odsObjectList.get(0).getData().getStats().getEndTimestamp() + "");


            if (jsonData.size() > 0) {
                Log.i("ODSObject", "Data as String: " + odsObjectList.get(0).getData().getData().get(0).toString() + "");
                for (int i = 0; i < jsonData.size(); i++) {
                    countries.add(gson.fromJson(gson.toJson(jsonData.get(i)), Country.class));
                    //Log Countries
                    Log.i("Country " + i, countries.get(i).getName() + " ");
                }

                if (recyclerView != null)
                    uiHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            Log.i("UIHandler", getCountries().size() + "");
                            CountriesAdapter adpCountries = new CountriesAdapter(getCountries());
                            recyclerView.setAdapter(adpCountries);
                            adpCountries.notifyDataSetChanged();
                            recyclerView.setLayoutManager(new LinearLayoutManager(baseContext));
                        }
                    });
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

