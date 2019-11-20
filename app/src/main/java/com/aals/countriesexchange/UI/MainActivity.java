package com.aals.countriesexchange.UI;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aals.countriesexchange.Adapter.CountriesAdapter;
import com.aals.countriesexchange.DB.AppDB;
import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCoutries;
    private List<Country> countries;
    private CountriesAdapter countriesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCoutries = findViewById(R.id.rv_countries);

//        countries = (List<Country>) getIntent().getSerializableExtra("countries");
        new getDataFromDB().execute(getApplicationContext());


    }

    public class getDataFromDB extends AsyncTask<Context, String, String> {

        @Override
        protected String doInBackground(Context... contexts) {
            countries = AppDB.getInstance(getApplicationContext()).userDao().getAll();
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            countriesAdapter = new CountriesAdapter(countries);
            Log.i("main", countries.size() + "");
            rvCoutries.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            rvCoutries.setAdapter(countriesAdapter);
            super.onPostExecute(s);
        }
    }
}
