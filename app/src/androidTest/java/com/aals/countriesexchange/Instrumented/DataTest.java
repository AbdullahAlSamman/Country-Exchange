package com.aals.countriesexchange.Instrumented;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.aals.countriesexchange.DataControllers.DataManager;
import com.aals.countriesexchange.DataControllers.ODSAPI;
import com.aals.countriesexchange.R;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class DataTest {
    private Context appContext;
    private DataManager dataManager;


    @Before
    public void inits() {
        // Context of the app under test.
        appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.aals.countriesexchange", appContext.getPackageName());

    }

    @Test
    public void getCountriesTest() {

    }

    @Test
    public void getExchangeRatesTest() {

    }

    @Test
    public void getFlagTest() {

    }
}
