package com.aals.countriesexchange.UI;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.aals.countriesexchange.Controller.ODSManager;
import com.aals.countriesexchange.R;

public class SplashScreen extends AppCompatActivity {

    private ODSManager ODSManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ODSManager = new ODSManager(getResources().getString(R.string.server_url));
        ODSManager.setBaseContext(getBaseContext());
        ODSManager.start();
    }
}
