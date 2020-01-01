package com.aals.countriesexchange;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.aals.countriesexchange.DB.AppDB;
import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.Model.Quotes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class DBInstrumentedTest {
    private Context appContext;
    private AppDB dbInstance;

    //The test will fail unless you open the app at least once to get all data from server
    @Test
    public void useAppContext() {
        // Context of the app under test.
        appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.aals.countriesexchange", appContext.getPackageName());

        dbInstance = AppDB.getInstance(appContext);
        assertNotNull(dbInstance);
    }

    @After
    public void getCountriesTest() {
        assertEquals(dbInstance.countryDao().getCountriesCount(), 250);
    }

    @After
    public void findbyCountryNameTest() {
        Country country = dbInstance.countryDao().findByName("Brazil");
        assertEquals(country.getName(), "Brazil");
    }

    @After
    public void getAllCountriesTest() {
        List<Country> countries = dbInstance.countryDao().getAllCountries();
        assertEquals(countries.size(), 250);
    }

    @After
    public void deleteInsertCountryTest() {
        // create country
        Country country = new Country();
        country.setName("deleteTest");

        //create list of countries
        List<Country> countries = new ArrayList<>();
        countries.add(country);

        //add all new countries in this case deleteTest
        dbInstance.countryDao().insertAllCountries(countries);

        //make sure deleteTest inserted to DB
        country = dbInstance.countryDao().findByName("deleteTest");
        assertEquals(country.getName(), "deleteTest");

        //make sure countries count is increased
        countries = dbInstance.countryDao().getAllCountries();
        assertEquals(countries.size(), 251);

        //delete country deleteTest
        dbInstance.countryDao().delete(country);

        //make sure country deleteTest is deleted
        countries = dbInstance.countryDao().getAllCountries();
        assertEquals(countries.size(), 250);
    }

    @After
    public void getQuotesTest() {
        List<Quotes> rates = dbInstance.exchangeRatesDao().getRates();
        assertThat(rates.size(),is(not(0)));
    }

    @After
    public void getLastRateTest(){
        Quotes rate = dbInstance.exchangeRatesDao().getLastRate();
        assertNotNull(rate);
        assertTrue(rate.isValidCurrency("USD"));
        assertFalse(rate.isValidCurrency("new"));
    }

    @After
    public void deleteInsertTest(){
        //create new rates
        Quotes rate = new Quotes();
        rate.setUSD(11.0);

        //insert rates
        dbInstance.exchangeRatesDao().insertRates(rate);

        //get last rates
        rate = dbInstance.exchangeRatesDao().getLastRate();
        //make sure the value matched the test value
        assertEquals(rate.getUSD(), 11.0,0.0);

        //delete the rates
        dbInstance.exchangeRatesDao().delete(rate);

        //make sure the test rates are deleted by checking the real value instead
        rate = dbInstance.exchangeRatesDao().getLastRate();
        assertThat(rate.getUSD(),is(not(11.0)));
    }
}
