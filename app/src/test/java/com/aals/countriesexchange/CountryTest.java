package com.aals.countriesexchange;

import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.Model.Currency;
import com.aals.countriesexchange.Model.Language;
import com.google.gson.Gson;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CountryTest {
    Country country;

    @Before
    public void inti() {
        country = new Country();
    }

    @Test
    public void callingCodesToStringTest() {
        List<String> call = new ArrayList<>();
        country.setCallingCodes(call);
        assertEquals(country.callingCodesToString(), "");

        call.add("963");
        call.add("966");
        call.add("969");

        country.setCallingCodes(call);
        assertEquals(country.callingCodesToString(), "+963, +966, +969");

        call.clear();
        call.add("999");

        country.setCallingCodes(call);
        assertEquals(country.callingCodesToString(), "+999");
    }

    @Test
    public void timeZoneToStringTest() {
        List<String> timeZones = new ArrayList<>();
        country.setTimezones(timeZones);
        assertEquals(country.timezoneToString(), "No Times Zones");

        timeZones.add("UTC-04:00");
        timeZones.add("UTC-03:00");
        timeZones.add("UTC+02:00");
        assertEquals(country.timezoneToString(), "UTC-04:00, UTC-03:00, UTC+02:00");

        timeZones.clear();
        timeZones.add("UTC+02:00");
        assertEquals(country.timezoneToString(), "UTC+02:00");
    }

    @Test
    public void languagesToStringTest() {
        List<Language> langs = new ArrayList<>();
        country.setLanguages(langs);
        assertEquals(country.languagesToString(), "");

        Language lang = new Language();
        lang.setName("eng");
        langs.add(lang);
        country.setLanguages(langs);
        assertEquals(country.languagesToString(), "eng");

        langs.clear();
        for (int i = 0; i < 3; i++) {
            lang = new Language();
            lang.setName("eng" + i);
            langs.add(lang);
        }
        country.setLanguages(langs);
        assertEquals(country.languagesToString(), "eng0, eng1, eng2");
    }

    @Test
    public void bordersToStringTest() {
        List<String> borders = new ArrayList<>();
        country.setBorders(borders);
        assertEquals(country.bordersToString(), "Island has no orders");

        borders.add("DEU");

        country.setBorders(borders);
        assertEquals(country.bordersToString(), "DEU");

        borders.add("NLD");
        borders.add("ITL");
        country.setBorders(borders);
        assertEquals(country.bordersToString(), "DEU, NLD, ITL");
    }

    @Test
    public void currenciesCodesTest() {
        List<Currency> currencies = new ArrayList<>();
        Currency currency = new Currency();
        country.setCurrencies(currencies);

        assertEquals(country.currenciesCodes(), new ArrayList<String>());

        currency.setName("EUR");
        currencies.add(currency);
        country.setCurrencies(currencies);
        assertEquals(country.currenciesCodes().size(), 1);

        currencies.clear();
        for (int i = 0; i < 3; i++) {
            currency = new Currency();
            currency.setName("USD" + i);
            currencies.add(currency);
        }
        country.setCurrencies(currencies);
        assertEquals(country.currenciesCodes().size(), 3);
    }

}
