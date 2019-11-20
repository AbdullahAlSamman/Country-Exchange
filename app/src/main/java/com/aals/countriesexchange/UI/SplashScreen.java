package com.aals.countriesexchange.UI;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.aals.countriesexchange.Controller.ODSManager;
import com.aals.countriesexchange.DB.AppDB;
import com.aals.countriesexchange.R;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class SplashScreen extends AppCompatActivity {

    private ODSManager ODSManager;
    private ImageLoader imageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext())
                .writeDebugLogs()
                .build();

        ImageLoader.getInstance().init(config);

        ODSManager = new ODSManager(getResources().getString(R.string.server_url));
        ODSManager.setBaseContext(getApplicationContext());
        ODSManager.start();


    }
}
