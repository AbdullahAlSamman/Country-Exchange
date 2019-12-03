package com.aals.countriesexchange.UI;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.Model.Quotes;
import com.aals.countriesexchange.R;
import com.pixplicity.sharp.Sharp;

import org.osmdroid.api.IMapController;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CountryView extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Country country;
    private Quotes rate;
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
    private TextView tvCountryArea;
    private Spinner spBaseCurrency;
    private TextView tvExchangeValue;
    private ActionBar toolbar;
    private MapView countryMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //View Map configuration to Local storage and App Context
        Configuration.getInstance().load(getApplicationContext(), PreferenceManager.getDefaultSharedPreferences(getApplicationContext()));

        setContentView(R.layout.activity_country_view);

        //Layout Config
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
        tvCountryArea = findViewById(R.id.tv_cs_area);
        tvExchangeValue = findViewById(R.id.tv_cs_currency_exchange_value);
        spBaseCurrency = findViewById(R.id.sp_cs_exchange);
        countryMap = findViewById(R.id.osm_cs_map);

        //Get country & rates from intent set Name Title
        country = (Country) getIntent().getSerializableExtra("country");
        rate = (Quotes) getIntent().getSerializableExtra("rates");
        tvCountryName.setText(country.getName());
        toolbar.setTitle(country.getName());

        InputStream targetStream = new ByteArrayInputStream(country.getFlagImage());
        Sharp.loadInputStream(targetStream).into(ivCountryFlag);

        //Country Data
        tvCountryPopulation.setText(country.getPopulation().toString());
        tvCountryArea.setText(Double.toString(country.getArea()));
        tvCountryCapital.setText(country.getCapital());
        tvCountryCallingCodes.setText(country.callingCodesToString());
        tvCountryLanguages.setText(country.languagesToString());
        tvCountryAlpah3Codes.setText(country.getAlpha3Code());
        tvCountryAlpah2Codes.setText(country.getAlpha2Code());
        tvCountryTimeZones.setText(country.getTimezones().toString());
        tvCountryBorders.setText(country.getBorders().toString());
        tvCountryNativeName.setText(country.getNativeName());
        tvCountryRegion.setText(country.getRegion());


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.base_exchange_currencies, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(R.layout.spinner_item_base_exchange);
        spBaseCurrency.setOnItemSelectedListener(this);
        spBaseCurrency.setAdapter(adapter);

        //Map config
        countryMap.setTileSource(TileSourceFactory.MAPNIK);
        countryMap.setMultiTouchControls(true);

        //Go to country location , enable multitouch
        IMapController mapController = countryMap.getController();
        mapController.setZoom(7.5); //TODO:Zoom calculate using area
        GeoPoint geoPoint = new GeoPoint(country.getLatlng().get(0), country.getLatlng().get(1));
        mapController.setCenter(geoPoint);
    }

    @Override
    protected void onResume() {
        super.onResume();
        countryMap.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        countryMap.onPause();
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // An item was selected. You can retrieve the selected item using
        parent.getItemAtPosition(position).toString();
        tvExchangeValue.setText(rate.getEUR().toString());
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
