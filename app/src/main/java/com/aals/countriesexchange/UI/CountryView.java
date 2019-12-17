package com.aals.countriesexchange.UI;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.Model.Currency;
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

public class CountryView extends AppCompatActivity {

    private Country country;
    private Quotes rates;
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
    private TextView tvCountryCurrencies;
    private LinearLayout llCurrency;
    private Spinner spBaseCurrency;
    private Spinner spCountryCurrency;
    private TextView tvExchangeValue;
    private ActionBar toolbar;
    private MapView countryMap;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context = getApplicationContext();

        //View Map configuration to Local storage and App Context
        Configuration.getInstance().load(context, PreferenceManager.getDefaultSharedPreferences(context));

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
        tvCountryCurrencies = findViewById(R.id.tv_cs_currencies);
        llCurrency = findViewById(R.id.ll_currencies_list);
        tvExchangeValue = findViewById(R.id.tv_cs_currency_exchange_value);
        spBaseCurrency = findViewById(R.id.sp_cs_base_exchange);
        spCountryCurrency = findViewById(R.id.sp_cs_country_exchange);
        countryMap = findViewById(R.id.osm_cs_map);

        //Get country & rates from intent set Name Title
        country = (Country) getIntent().getSerializableExtra("country");
        rates = (Quotes) getIntent().getSerializableExtra("rates");
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
        tvCountryTimeZones.setText(country.timezoneToString());
        tvCountryBorders.setText(country.bordersToString());
        tvCountryNativeName.setText(country.getNativeName());
        tvCountryRegion.setText(country.getRegion());


        for (Currency currency : country.getCurrencies()) {
            if (currency.getName() != null) {
                LinearLayout innerLinearlayout = new LinearLayout(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                layoutParams.setMargins(5, 5, 5, 5);
                innerLinearlayout.setLayoutParams(layoutParams);
                innerLinearlayout.setOrientation(LinearLayout.HORIZONTAL);

                llCurrency.addView(innerLinearlayout);

                TextView currencyName = new TextView(context);
                currencyName.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                currencyName.setLayoutParams(new TableLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1f));

                TextView currencyCode = new TextView(context);
                currencyCode.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                currencyCode.setLayoutParams(new TableLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1f));

                TextView currencySymbol = new TextView(context);
                currencySymbol.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                currencySymbol.setLayoutParams(new TableLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1f));

                currencyName.setText(currency.getName());
                currencyCode.setText(currency.getCode());
                currencySymbol.setText(currency.getSymbol());


                innerLinearlayout.addView(currencyName);
                innerLinearlayout.addView(currencyCode);
                innerLinearlayout.addView(currencySymbol);
            }
        }

        //Base exchange spinner from Strings array
        ArrayAdapter<CharSequence> baseCurrencyAdapter = ArrayAdapter.createFromResource(this,
                R.array.base_exchange_currencies, android.R.layout.simple_spinner_item);
        baseCurrencyAdapter.setDropDownViewResource(R.layout.spinner_item_base_exchange);
        spBaseCurrency.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String base = parent.getItemAtPosition(position).toString();
                String target = spCountryCurrency.getSelectedItem().toString();
                Log.i("Spinners", base + "," + target);
                tvExchangeValue.setText(rates.convertBaseToTarget(base, target));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spBaseCurrency.setAdapter(baseCurrencyAdapter);


        //Base exchange spinner from Strings array
        ArrayAdapter<String> exchangeCurrencyAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, country.currenciesCodes());
        exchangeCurrencyAdapter.setDropDownViewResource(R.layout.spinner_item_base_exchange);
        spCountryCurrency.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String base = spBaseCurrency.getSelectedItem().toString();
                String target = spCountryCurrency.getSelectedItem().toString();
                Log.i("Spinners", base + "," + target);
                tvExchangeValue.setText(rates.convertBaseToTarget(base, target));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spCountryCurrency.setAdapter(exchangeCurrencyAdapter);

        //Map config
        countryMap.setTileSource(TileSourceFactory.MAPNIK);
        countryMap.setMultiTouchControls(true);

        //Go to country location , enable multitouch
        IMapController mapController = countryMap.getController();
        mapController.setZoom(zoomRatio(country.getArea())); //TODO:Zoom calculate using area
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

    public double zoomRatio(double area) {
        if (area < 300.0) {
            return 15.0;
        } else if (area < 5000) {
            return 12.0;
        } else if (area < 10000) {
            return 10.0;
        } else if (area < 100000) {
            return 9.0;
        } else if (area < 200000) {
            return 7.0;
        } else if (area < 400000) {
            return 8.0;
        } else if (area < 800000) {
            return 6.0;
        } else if (area < 800000) {
            return 5.0;
        } else if (area < 1000000) {
            return 4.0;
        }
        return 3.0;
    }

}
