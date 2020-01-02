package com.aals.countriesexchange;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import com.aals.countriesexchange.DB.AppDB;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class DataInstrumentedTest {
    private Context appContext;


    @Before
    public void setups(){
        // Context of the app under test.
        appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.aals.countriesexchange", appContext.getPackageName());
    }

    @Test
    public void getCountriesTest(){

    }
    @Test
    public void getExchangeRatesTest(){

    }

    @Test
    public void getFlagTest(){

    }
}
