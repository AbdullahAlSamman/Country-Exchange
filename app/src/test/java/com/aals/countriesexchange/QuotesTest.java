package com.aals.countriesexchange;

import com.aals.countriesexchange.Model.Quotes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuotesTest {

    Quotes rates;

    @Before
    public void init() {
        rates = new Quotes();
    }

    @Test
    public void isValidTest() {
        assertTrue(rates.isValidCurrency("EUR"));
        assertTrue(rates.isValidCurrency("USD"));
        assertTrue(rates.isValidCurrency("GBP"));

        assertFalse(rates.isValidCurrency("DEU"));
        assertFalse(rates.isValidCurrency("DE"));
        assertFalse(rates.isValidCurrency("SZY"));
    }

    @Test
    public void getValueByCodeTest() {
        assertEquals(rates.getValueByCode("EUR"), 0.0, 0.01);
        assertEquals(rates.getValueByCode("USD"), 0.0, 0.01);
        assertEquals(rates.getValueByCode("GBP"), 0.0, 0.01);
    }

    @Test
    public void convertBaseTargetTest() {
        //exchange prices 18.12.19 11:45
        rates.setUSD(1.0);
        rates.setEUR(0.898041);
        rates.setGBP(0.762872);
        rates.setINR(71.0384);
        rates.setAUD(1.45903);
        rates.setCAD(1.31520);

        //String testing
        assertEquals(rates.convertBaseToTarget("EUR", "EUR"), "1.0");
        assertEquals(rates.convertBaseToTarget("USD", "USD"), "1.0");
        assertEquals(rates.convertBaseToTarget("USD", ""), "1.0");
        assertEquals(rates.convertBaseToTarget("", "USD"), "1.0");
        assertEquals(rates.convertBaseToTarget("", ""), "1.0");
        assertEquals(rates.convertBaseToTarget("USD", "EUR"), "0.898041");

        // more precision not applicable
        assertEquals(Double.parseDouble(rates.convertBaseToTarget("EUR", "USD")), 1.11339, 0.001);
        assertEquals(Double.parseDouble(rates.convertBaseToTarget("INR", "EUR")), 0.0126446, 0.001);
        assertEquals(Double.parseDouble(rates.convertBaseToTarget("INR", "CAD")), 0.0185065, 0.001);
        assertEquals(Double.parseDouble(rates.convertBaseToTarget("CAD", "EUR")), 0.683230, 0.001);
        assertEquals(Double.parseDouble(rates.convertBaseToTarget("AUD", "GBP")), 0.523064, 0.001);
        assertEquals(Double.parseDouble(rates.convertBaseToTarget("USD", "EUR")), 0.898041, 0.001);

    }
}
