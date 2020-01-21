package com.aals.countriesexchange.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;

import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.R;

import org.osmdroid.api.IMapController;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;

public class MapView extends AppCompatActivity {
    private org.osmdroid.views.MapView countryMap;
    private Country country;
    private Context context;
    private ActionBar toolbar;


    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_view);

        countryMap = findViewById(R.id.osm_cs_map);
        context = getApplicationContext();

        //View Map configuration to Local storage and App Context
        Configuration.getInstance().load(context, PreferenceManager.getDefaultSharedPreferences(context));

        //Layout Config
        toolbar = getSupportActionBar();
        toolbar.setDisplayHomeAsUpEnabled(true);
        toolbar.setDisplayShowHomeEnabled(true);

        country = (Country) getIntent().getSerializableExtra("country");

        toolbar.setTitle(country.getName());


        //Map config
        countryMap.setTileSource(TileSourceFactory.MAPNIK);
        countryMap.setMultiTouchControls(true);

        //Go to country location , enable multitouch
        IMapController mapController = countryMap.getController();
        mapController.setZoom(zoomRatio(country.getArea()));
        GeoPoint geoPoint = new GeoPoint(country.getLatlng().get(0), country.getLatlng().get(1));
        mapController.setCenter(geoPoint);

    }

    public double zoomRatio(double area) {
        if (area < 1000.0) {
            return 12.0;
        } else if (area < 5000) {
            return 11.5;
        } else if (area < 10000) {
            return 11.0;
        } else if (area < 70000) {
            return 10.5;
        } else if (area < 100000) {
            return 10.0;
        } else if (area < 150000) {
            return 9.0;
        } else if (area < 200000) {
            return 8.5;
        } else if (area < 300000) {
            return 8.0;
        } else if (area < 1000000) {
            return 7.0;
        } else if (area < 5000000) {
            return 6.0;
        }
        return 3.0;
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
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                break;
            default:
                break;
        }
        return true;
    }
}
