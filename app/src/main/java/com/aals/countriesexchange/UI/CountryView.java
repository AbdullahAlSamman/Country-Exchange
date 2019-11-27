package com.aals.countriesexchange.UI;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.R;
import com.pixplicity.sharp.Sharp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CountryView extends AppCompatActivity {

    private Country country;
    private TextView tvCountryName;
    private ImageView ivCountryFlag;
    private TextView tvCountryCallingCodes;
    private TextView tvCountryPopulation;
    private TextView tvCountryLanguages;
    private TextView tvCountryCapital;
    private TextView tvCountryTimeZones;
    private TextView tvCountryBorders;
    private TextView tvCountryAlpah2Codes;
    private TextView tvCountryAlpah3Codes;
    private TextView tvCountryNativeName;
    private TextView tvCountryRegion;
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_view);
        toolbar = getSupportActionBar();
        toolbar.setDisplayHomeAsUpEnabled(true);
        toolbar.setDisplayShowHomeEnabled(true);
        ivCountryFlag = findViewById(R.id.iv_cs_image);
        tvCountryName = findViewById(R.id.tv_cs_name);
        tvCountryAlpah2Codes = findViewById(R.id.tv_cs_alpah2code);
        tvCountryAlpah3Codes = findViewById(R.id.tv_cs_alpah3code);
        tvCountryBorders = findViewById(R.id.tv_cs_borders);
        tvCountryCallingCodes = findViewById(R.id.tv_cs_callingcodes);
        tvCountryLanguages = findViewById(R.id.tv_cs_languages);
        tvCountryCapital = findViewById(R.id.tv_cs_capital);
        tvCountryPopulation = findViewById(R.id.tv_cs_population);
        tvCountryTimeZones = findViewById(R.id.tv_cs_timezones);
        tvCountryNativeName = findViewById(R.id.tv_cs_nativename);
        tvCountryRegion = findViewById(R.id.tv_cs_region);

        country = (Country) getIntent().getSerializableExtra("country");
        tvCountryName.setText(country.getName());
        toolbar.setTitle(country.getName());

        InputStream targetStream = new ByteArrayInputStream(country.getFlagImage());
        Sharp.loadInputStream(targetStream).into(ivCountryFlag);

        tvCountryPopulation.setText(country.getPopulation().toString());
        tvCountryCapital.setText(country.getCapital());
        tvCountryCallingCodes.setText(country.callingCodesToString());
        tvCountryLanguages.setText(country.languagesToString());
        tvCountryAlpah3Codes.setText(country.getAlpha3Code());
        tvCountryAlpah2Codes.setText(country.getAlpha2Code());
        tvCountryTimeZones.setText(country.getTimezones().toString());
        tvCountryBorders.setText(country.getBorders().toString());
        tvCountryNativeName.setText(country.getNativeName());
        tvCountryRegion.setText(country.getRegion());

    }
}
