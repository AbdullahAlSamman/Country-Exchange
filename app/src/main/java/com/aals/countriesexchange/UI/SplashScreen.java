package com.aals.countriesexchange.UI;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.aals.countriesexchange.DB.AppDB;
import com.aals.countriesexchange.DataControllers.DataManager;
import com.aals.countriesexchange.R;
import com.aals.countriesexchange.Utils.Utils;

public class SplashScreen extends AppCompatActivity {

    private DataManager ODSManager;
    private Utils tools;
    private AppDB instance;
    private TextView tvInfo;
    private ProgressBar pbLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        tvInfo = findViewById(R.id.tv_ss_info);
        pbLoading = findViewById(R.id.pb_ss_loading);
        tools = Utils.create(getApplicationContext());
        instance = AppDB.getInstance(getApplicationContext());

        //set progressbar color
        pbLoading.getIndeterminateDrawable().setColorFilter(ContextCompat.getColor(this, R.color.colorText), PorterDuff.Mode.SRC_IN);

        new StartUp().execute();
    }


    public class StartUp extends AsyncTask<Void, Void, Void> {
        int dbCount = 0;

        @Override
        protected Void doInBackground(Void... voids) {
            dbCount = instance.countryDao().getCountriesCount();
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            if (dbCount <= 0) {
                if (tools.isNetworkAvailable()) {
                    tvInfo.setText(R.string.splash_loading);
                    ODSManager = new DataManager(getResources().getString(R.string.server_url));
                    ODSManager.setBaseContext(getApplicationContext());
                    ODSManager.startGetExchangeRates();
                } else {
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            tvInfo.setText(getResources().getString(R.string.internet_disconnected));
                            retry();
                        }
                    }, 3000);
                }
            } else {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        ODSManager = new DataManager(getResources().getString(R.string.server_url));
                        ODSManager.setBaseContext(getApplicationContext());
                        ODSManager.updateExchangeRates();

                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);

                    }
                }, 800);

            }
        }
    }

    public void retry() {
        new StartUp().execute();
    }

}