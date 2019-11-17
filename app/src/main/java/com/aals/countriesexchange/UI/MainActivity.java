package com.aals.countriesexchange.UI;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.aals.countriesexchange.Controller.MainController;
import com.aals.countriesexchange.R;

public class MainActivity extends AppCompatActivity {

    private MainController mainController;
    private RecyclerView rvCoutries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCoutries = findViewById(R.id.rv_countries);

        mainController = new MainController(getResources().getString(R.string.server_url));
        mainController.setBaseContext(getBaseContext());
        mainController.setRecyclerView(rvCoutries);
        mainController.start();
    }
}
