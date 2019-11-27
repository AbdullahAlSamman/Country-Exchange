package com.aals.countriesexchange.UI;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.R;

public class CountryView extends AppCompatActivity {

    private Country country;
    private TextView tv;
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_view);
        toolbar = getSupportActionBar();
        toolbar.setDisplayHomeAsUpEnabled(true);
        toolbar.setDisplayShowHomeEnabled(true);

        tv = findViewById(R.id.tv_cs_name);

        country = (Country) getIntent().getSerializableExtra("country");
        tv.setText(country.getName());

    }
}
