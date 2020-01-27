package com.aals.countriesexchange.UI;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.PictureDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.Model.Currency;
import com.aals.countriesexchange.Model.Quotes;
import com.aals.countriesexchange.R;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Map;

public class CountryView extends AppCompatActivity {

    private Country country;
    private Quotes rates;
    private Map<String, String> alpha2names;
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
    private TextView tvNoHighFlag;
    private LinearLayout llCurrency;
    private Spinner spBaseCurrency;
    private Spinner spCountryCurrency;
    private TextView tvExchangeValue;
    private Button btMap;
    private ActionBar toolbar;
    private Context context;
    private SVG flagSVG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        context = getBaseContext();

        setContentView(R.layout.activity_country_view);

        //Layout Config
        toolbar = getSupportActionBar();
        toolbar.setDisplayHomeAsUpEnabled(true);
        toolbar.setDisplayShowHomeEnabled(true);

        ivCountryFlag = findViewById(R.id.iv_cs_image);
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
        tvNoHighFlag = findViewById(R.id.tv_cs_noHiflag);
        btMap = findViewById(R.id.bt_cs_map);
        llCurrency = findViewById(R.id.ll_currencies_list);
        spBaseCurrency = findViewById(R.id.sp_cs_base_exchange);
        spCountryCurrency = findViewById(R.id.sp_cs_country_exchange);

        getDataFromIntent();

        toolbar.setTitle(country.getName());

        setCountryData();

        setFlag();

        setCurrencyList();

        setBaseCurrencySpinner();

        setTargetCurrencySpinner();

        btMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startMap = new Intent(getBaseContext(), MapView.class);
                startMap.putExtra("country", country);
                startActivity(startMap);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            onBackPressed();
        return true;
    }

    /**
     * Border country names string.
     * convert all borders from alpha3code to full string name.
     *
     * @return the string
     */
    protected String borderCountryNames() {
        String result = "";
        List<String> list = country.getBorders();
        if (list.size() == 0) {
            result = getResources().getString(R.string.country_no_borders);
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1)
                    result += alpha2names.get(list.get(i));
                else
                    result += alpha2names.get(list.get(i)) + ", ";
            }
        }
        return result;
    }

    /**
     * Sets country data.
     * all UI element gets country details values.
     */
    public void setCountryData() {
        //Country Data
        tvCountryPopulation.setText(country.getPopulation().toString());
        tvCountryArea.setText(Double.toString(country.getArea()));
        tvCountryCapital.setText(country.getCapital());
        tvCountryCallingCodes.setText(country.callingCodesToString());
        tvCountryLanguages.setText(country.languagesToString());
        tvCountryAlpah3Codes.setText(country.getAlpha3Code());
        tvCountryAlpah2Codes.setText(country.getAlpha2Code());
        tvCountryTimeZones.setText(country.timezoneToString());
        tvCountryBorders.setText(borderCountryNames());
        tvCountryNativeName.setText(country.getNativeName());
        tvCountryRegion.setText(country.getRegion());
    }

    /**
     * Sets flag.
     * checks if the svg data of the file is renderable picture and send the user a massage if not.
     */
    public void setFlag() {
        try {
            flagSVG = SVG.getFromInputStream(new ByteArrayInputStream(country.getFlagHighImage()));
            PictureDrawable pd = new PictureDrawable(flagSVG.renderToPicture());
            ivCountryFlag.setImageDrawable(pd);
        } catch (SVGParseException e) {
            tvNoHighFlag.setText(getResources().getString(R.string.country_no_hi_flag));
            e.printStackTrace();
        }
    }

    /**
     * Sets currency list.
     * for each official currency add UI elements.
     */
    public void setCurrencyList() {
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
                currencyName.setTextColor(ContextCompat.getColor(this, R.color.colorText));
                currencyName.setLayoutParams(new TableLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1f));

                TextView currencyCode = new TextView(context);
                currencyCode.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                currencyCode.setTextColor(ContextCompat.getColor(this, R.color.colorText));
                currencyCode.setLayoutParams(new TableLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1f));

                TextView currencySymbol = new TextView(context);
                currencySymbol.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                currencySymbol.setTextColor(ContextCompat.getColor(this, R.color.colorText));
                currencySymbol.setLayoutParams(new TableLayout.LayoutParams(0, ViewGroup.LayoutParams.MATCH_PARENT, 1f));

                currencyName.setText(currency.getName());
                currencyCode.setText(currency.getCode());
                currencySymbol.setText(currency.getSymbol());


                innerLinearlayout.addView(currencyName);
                innerLinearlayout.addView(currencyCode);
                innerLinearlayout.addView(currencySymbol);
            }
        }
    }

    /**
     * Sets base currency spinner.
     * get list of base currencies from strings file.
     */
    public void setBaseCurrencySpinner() {
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
    }

    /**
     * Sets target currency spinner.
     * get country official currencies.
     */
    public void setTargetCurrencySpinner() {
        //Base exchange spinner from Strings array
        ArrayAdapter<String> exchangeCurrencyAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, country.currenciesCodes());
        exchangeCurrencyAdapter.setDropDownViewResource(R.layout.spinner_item_base_exchange);
        spCountryCurrency.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String base = spBaseCurrency.getSelectedItem().toString();
                String target = spCountryCurrency.getSelectedItem().toString();
                tvExchangeValue.setText(rates.convertBaseToTarget(base, target));
                Log.i("Spinners", base + "," + target);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spCountryCurrency.setAdapter(exchangeCurrencyAdapter);
    }

    /**
     * Gets data from intent.
     */
    public void getDataFromIntent() {
        //Get country & rates from intent set Name Title
        country = (Country) getIntent().getSerializableExtra("country");
        rates = (Quotes) getIntent().getSerializableExtra("rates");
        alpha2names = (Map<String, String>) getIntent().getSerializableExtra("alpha2names");
    }
}
