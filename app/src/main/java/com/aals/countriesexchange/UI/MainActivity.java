package com.aals.countriesexchange.UI;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aals.countriesexchange.Adapter.CountriesAdapter;
import com.aals.countriesexchange.DB.AppDB;
import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.Model.Quotes;
import com.aals.countriesexchange.R;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements CountriesAdapter.OnCountryListener {

    private RecyclerView rvCoutries;
    private List<Country> countries;
    private Map<String, String> alpha2Name;
    private Quotes rates;
    private CountriesAdapter countriesAdapter;
    private TextView tvMainInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCoutries = findViewById(R.id.rv_countries);
        tvMainInfo = findViewById(R.id.tv_ma_message);

        new GetDataFromDB().execute(getApplicationContext());
    }

    @Override
    public void onCountryClick(int position) {
        countries.get(position);
        //start other intents CountryView here
        Intent intent = new Intent(this, CountryView.class);
        intent.putExtra("country", countries.get(position));
        intent.putExtra("rates", rates);
        intent.putExtra("alpha2names", (Serializable) alpha2Name);
        startActivity(intent);
    }

    public void iniRecyclerView() {
        countriesAdapter = new CountriesAdapter(countries, this);
        rvCoutries.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvCoutries.setAdapter(countriesAdapter);
    }

    public void alpha2Names() {
        alpha2Name = new HashMap<>();
        for (Country country : countries) {
            alpha2Name.put(country.getAlpha3Code(), country.getName());
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Log.e("search event", "onsubmit");
                countriesAdapter.getFilter().filter(query);
                countriesAdapter.notifyAll();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.e("search event", "onQueryTextChanged");
                countriesAdapter.getFilter().filter(newText);
                countriesAdapter.notifyDataSetChanged();
                return false;
            }
        });

        return true;
    }

    public class GetDataFromDB extends AsyncTask<Context, CountriesAdapter.OnCountryListener, String> {

        @Override
        protected String doInBackground(Context... contexts) {
            countries = AppDB.getInstance(getApplicationContext()).countryDao().getAllCountries();
            rates = AppDB.getInstance(getApplicationContext()).exchangeRatesDao().getLastRate();
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if (countries.size() == 0) {
                tvMainInfo.setText(getResources().getString(R.string.internet_disconnected_retry));
            } else {
                alpha2Names();
                iniRecyclerView();
            }
        }
    }
}
