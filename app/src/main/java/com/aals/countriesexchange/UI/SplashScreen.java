package com.aals.countriesexchange.UI;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.aals.countriesexchange.DataControllers.DataManager;
import com.aals.countriesexchange.R;

public class SplashScreen extends AppCompatActivity {

    private DataManager ODSManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //TODO: check internet connection.
        ODSManager = new DataManager(getResources().getString(R.string.server_url));
        ODSManager.setBaseContext(getApplicationContext());
        ODSManager.startGetExchangeRates();

    }
}
