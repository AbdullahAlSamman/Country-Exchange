package com.aals.countriesexchange.UI;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.aals.countriesexchange.Controller.ODSManager;
import com.aals.countriesexchange.R;

public class MainActivity extends AppCompatActivity {

    private ODSManager ODSManager;
    private RecyclerView rvCoutries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCoutries = findViewById(R.id.rv_countries);

        ODSManager = new ODSManager(getResources().getString(R.string.server_url));
        ODSManager.setBaseContext(getBaseContext());
        ODSManager.setRecyclerView(rvCoutries);
        ODSManager.start();
    }
}
