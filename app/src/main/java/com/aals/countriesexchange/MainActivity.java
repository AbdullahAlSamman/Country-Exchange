package com.aals.countriesexchange;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private Controller controller;
    private RecyclerView rvCoutries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCoutries = findViewById(R.id.rv_countries);

        controller = new Controller(getResources().getString(R.string.server_url));
        controller.start();

        //TODO: sync data from Retrofit with UI
        CountriesAdapter adpCountries = new CountriesAdapter(controller.getCountries());
        rvCoutries.setAdapter(adpCountries);
        rvCoutries.setLayoutManager(new LinearLayoutManager(this));
    }
}
