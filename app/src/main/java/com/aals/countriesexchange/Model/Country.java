package com.aals.countriesexchange.Model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

@Entity(tableName = "countries")
public class Country {
    @Ignore
    ArrayList<Object> latlng = new ArrayList<Object>();
    @Ignore
    ArrayList<Object> borders = new ArrayList<Object>();
    @Ignore
    ArrayList<Object> languages = new ArrayList<Object>();
    @Ignore
    ArrayList<Object> timezones = new ArrayList<Object>();
    @Ignore
    ArrayList<Object> currencies = new ArrayList<Object>();
    @Ignore
    ArrayList<Object> altSpellings = new ArrayList<Object>();
    @Ignore
    ArrayList<Object> callingCodes = new ArrayList<Object>();
    @Ignore
    Translations TranslationsObject = new Translations();
    @Ignore
    ArrayList<Object> regionalBlocs = new ArrayList<Object>();
    @Ignore
    ArrayList<Object> topLevelDomain = new ArrayList<Object>();
    @PrimaryKey
    @NonNull
    private String alpha3Code;
    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private byte[] countryFlag;
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
    private String nativeName;
    private float population;
    private String numericCode;
    private double lat;
    private double lng;
    private String stringBorders;
    private String stringLanguages;
    private String stringTimesZones;
    private String stringCallingsCodes;
    private String stringCurrencies;

    public Country() {
    }

    public String getStringCurrencies() {
        return stringCurrencies;
    }

    public void setStringCurrencies(String stringCurrencies) {
        this.stringCurrencies = stringCurrencies;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getStringBorders() {
        return stringBorders;
    }

    public void setStringBorders(String stringBorders) {
        this.stringBorders = stringBorders;
    }

    public String getStringLanguages() {
        return stringLanguages;
    }

    public void setStringLanguages(String stringLanguages) {
        this.stringLanguages = stringLanguages;
    }

    public String getStringTimesZones() {
        return stringTimesZones;
    }

    public void setStringTimesZones(String stringtimeszones) {
        this.stringTimesZones = stringtimeszones;
    }

    public String getStringCallingsCodes() {
        return stringCallingsCodes;
    }

    public void setStringCallingsCodes(String stringCallingsCodes) {
        this.stringCallingsCodes = stringCallingsCodes;
    }

    public byte[] getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(byte[] countryFlag) {
        this.countryFlag = countryFlag;
    }

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

    public String languagesToString(ArrayList<Object> arrayList) throws Exception {
        String result = "";
        JSONArray languageJSONArray = new JSONArray(arrayList);
        for (int i = 0; i < languageJSONArray.length(); i++) {
            JSONObject obj = languageJSONArray.getJSONObject(i);
            if (i == languageJSONArray.length() - 1)
                result += obj.getString("name");
            else
                result += obj.getString("name") + ", ";
        }
        return result;
    }

    public String currenciesToString(ArrayList<Object> arrayList) throws Exception {
        String result = "";
        JSONArray languageJSONArray = new JSONArray(arrayList);
        for (int i = 0; i < languageJSONArray.length(); i++) {
            JSONObject obj = languageJSONArray.getJSONObject(i);
            if (i == languageJSONArray.length() - 1)
                result += obj.getString("name");
            else
                result += obj.getString("name") + ", ";
        }
        return result;
    }

    /**
     * This is for CallingsCodes, Timezones, Borders
     */
    public String jsonArrayToString(ArrayList<Object> arrayList) throws Exception {
        String result = "";
        JSONArray callingJSONArray = new JSONArray(arrayList);
        for (int i = 0; i < callingJSONArray.length(); i++) {
            if (i == callingJSONArray.length() - 1)
                result += callingJSONArray.getString(i);
            else
                result += callingJSONArray.getString(i) + ", ";
        }
        return result;
    }

    protected void latLngToDouble() throws Exception {
        JSONArray callingJSONArray = new JSONArray(getLatlng());
        setLat(callingJSONArray.getDouble(0));
        setLng(callingJSONArray.getDouble(1));
    }


    public void convertValuesToString() {
        try {
            setStringCallingsCodes(jsonArrayToString(getCallingCodes()));
            setStringTimesZones(jsonArrayToString(getTimezones()));
            setStringBorders(jsonArrayToString(getBorders()));
            setStringCurrencies(currenciesToString(getCurrencies()));
            setStringLanguages(languagesToString(getLanguages()));
            latLngToDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

