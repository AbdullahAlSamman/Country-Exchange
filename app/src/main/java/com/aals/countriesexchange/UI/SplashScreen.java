package com.aals.countriesexchange.UI;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.aals.countriesexchange.Controller.MainController;
import com.aals.countriesexchange.R;

public class SplashScreen extends AppCompatActivity {

    private MainController mainController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

//        mainController = new MainController(getResources().getString(R.string.server_url));
//        mainController.setBaseContext(getBaseContext());
//        mainController.start();
    }
}
