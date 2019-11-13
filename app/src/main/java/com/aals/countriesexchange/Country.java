package com.aals.countriesexchange;

import java.util.ArrayList;

public class Country {

    ArrayList<Object> latlng = new ArrayList<Object>();
    ArrayList<Object> borders = new ArrayList<Object>();
    ArrayList<Object> languages = new ArrayList<Object>();
    ArrayList<Object> timezones = new ArrayList<Object>();
    ArrayList<Object> currencies = new ArrayList<Object>();
    ArrayList<Object> altSpellings = new ArrayList<Object>();
    ArrayList<Object> callingCodes = new ArrayList<Object>();
    Translations TranslationsObject = new Translations();
    ArrayList<Object> regionalBlocs = new ArrayList<Object>();
    ArrayList<Object> topLevelDomain = new ArrayList<Object>();
    private float area;
    private String cioc;
    private String flag;
    private float gini;
    private String name;
    private String region;
    private String capital;
    private String demonym;
    private String subregion;
    private String alpha2Code;
    private String alpha3Code;
    private String nativeName;
    private float population;
    private String numericCode;

    public ArrayList<Object> getLatlng() {
        return latlng;
    }

    public void setLatlng(ArrayList<Object> latlng) {
        this.latlng = latlng;
    }

    public ArrayList<Object> getBorders() {
        return borders;
    }

    public void setBorders(ArrayList<Object> borders) {
        this.borders = borders;
    }

    public ArrayList<Object> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<Object> languages) {
        this.languages = languages;
    }

    public ArrayList<Object> getTimezones() {
        return timezones;
    }

    public void setTimezones(ArrayList<Object> timezones) {
        this.timezones = timezones;
    }

    public ArrayList<Object> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(ArrayList<Object> currencies) {
        this.currencies = currencies;
    }

    public ArrayList<Object> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(ArrayList<Object> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public ArrayList<Object> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(ArrayList<Object> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public Translations getTranslationsObject() {
        return TranslationsObject;
    }

    public void setTranslationsObject(Translations translationsObject) {
        TranslationsObject = translationsObject;
    }

    public ArrayList<Object> getRegionalBlocs() {
        return regionalBlocs;
    }

    public void setRegionalBlocs(ArrayList<Object> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
    }

    public ArrayList<Object> getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(ArrayList<Object> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public float getGini() {
        return gini;
    }

    public void setGini(float gini) {
        this.gini = gini;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getDemonym() {
        return demonym;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public float getPopulation() {
        return population;
    }

    public void setPopulation(float population) {
        this.population = population;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }


}

