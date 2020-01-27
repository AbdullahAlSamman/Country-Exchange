package com.aals.countriesexchange.Model;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "countries")
public class Country implements Serializable {

    @SerializedName("area")
    @Expose
    private double area;

    @SerializedName("cioc")
    @Expose
    private String cioc;

    @SerializedName("flag")
    @Expose
    private String flag;

    @SerializedName("gini")
    @Expose
    private double gini;

    @SerializedName("name")
    @Expose
    @PrimaryKey
    @NonNull
    private String name;

    @SerializedName("latlng")
    @Expose
    private List<Double> latlng = null;

    @SerializedName("region")
    @Expose
    private String region;

    @SerializedName("borders")
    @Expose
    private List<String> borders = null;

    @SerializedName("capital")
    @Expose
    private String capital;

    @SerializedName("demonym")
    @Expose
    private String demonym;

    @SerializedName("languages")
    @Expose
    private List<Language> languages = null;

    @SerializedName("subregion")
    @Expose
    private String subregion;

    @SerializedName("timezones")
    @Expose
    private List<String> timezones = null;

    @SerializedName("alpha2Code")
    @Expose
    private String alpha2Code;

    @SerializedName("alpha3Code")
    @Expose
    private String alpha3Code;

    @SerializedName("currencies")
    @Expose
    private List<Currency> currencies = null;

    @SerializedName("nativeName")
    @Expose
    private String nativeName;

    @SerializedName("population")
    @Expose
    private Integer population;

    @SerializedName("numericCode")
    @Expose
    private String numericCode;

    @SerializedName("altSpellings")
    @Expose
    private List<String> altSpellings = null;

    @SerializedName("callingCodes")
    @Expose
    private List<String> callingCodes = null;

    @SerializedName("translations")
    @Expose
    @Ignore
    private Translations translations;
    @SerializedName("regionalBlocs")
    @Expose
    private List<RegionalBloc> regionalBlocs = null;
    @SerializedName("topLevelDomain")
    @Expose
    private List<String> topLevelDomain = null;

    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private SerializableBitmap flagImage;

    @ColumnInfo(typeAffinity = ColumnInfo.BLOB)
    private byte[] flagHighImage;

    public byte[] getFlagHighImage() {
        return flagHighImage;
    }

    public void setFlagHighImage(byte[] flagHighImage) {
        this.flagHighImage = flagHighImage;
    }

    public SerializableBitmap getFlagImage() {
        return flagImage;
    }

    public void setFlagImage(SerializableBitmap flagImage) {
        this.flagImage = flagImage;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
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

    public double getGini() {
        return gini;
    }

    public void setGini(double gini) {
        this.gini = gini;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
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

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public List<String> getTimezones() {
        return timezones;
    }

    public void setTimezones(List<String> timezones) {
        this.timezones = timezones;
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

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

    public String getNativeName() {
        return nativeName;
    }

    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public List<String> getCallingCodes() {
        return callingCodes;
    }

    public void setCallingCodes(List<String> callingCodes) {
        this.callingCodes = callingCodes;
    }

    public Translations getTranslations() {
        return translations;
    }

    public void setTranslations(Translations translations) {
        this.translations = translations;
    }

    public List<RegionalBloc> getRegionalBlocs() {
        return regionalBlocs;
    }

    public void setRegionalBlocs(List<RegionalBloc> regionalBlocs) {
        this.regionalBlocs = regionalBlocs;
    }

    public List<String> getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(List<String> topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    /**
     * Languages to string.
     * get the languages from the list to one string to be displayed.
     *
     * @return the string
     */
    public String languagesToString() {
        String result = "";
        for (int i = 0; i < languages.size(); i++) {
            if (i == languages.size() - 1)
                result += languages.get(i).getName();
            else
                result += languages.get(i).getName() + ", ";
        }
        return result;
    }

    /**
     * Calling codes to string string.
     * get the calling codes from the list into a single string to be displayed.
     *
     * @return the string
     */
    public String callingCodesToString() {
        String result = "";
        for (int i = 0; i < callingCodes.size(); i++) {
            if (i == callingCodes.size() - 1)
                result += "+" + callingCodes.get(i).toString();
            else
                result += "+" + callingCodes.get(i).toString() + ", ";
        }
        return result;
    }

    /**
     * Borders to string string.
     * get the Borders codes from the list into a single string to be displayed.
     *
     * @return the string
     */
    @Deprecated
    public String bordersToString() {
        String result = "";
        if (borders.size() == 0)
            return "Island has no orders";
        for (int i = 0; i < borders.size(); i++) {
            if (i == borders.size() - 1)
                result += borders.get(i).toString();
            else
                result += borders.get(i).toString() + ", ";
        }
        return result;
    }

    /**
     * Timezone to string string.
     * get the time zones from the list into a single string to be displayed.
     *
     * @return the string
     */
    public String timezoneToString() {
        String result = "";
        if (timezones.size() == 0)
            return "No Times Zones";
        for (int i = 0; i < timezones.size(); i++) {
            if (i == timezones.size() - 1)
                result += timezones.get(i);
            else
                result += timezones.get(i) + ", ";
        }
        return result;
    }

    /**
     * Currencies codes list.
     * get the currencies codes from the list into a single string to be displayed.
     *
     * @return the list
     */
    public List<String> currenciesCodes() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < currencies.size(); i++) {
            if (currencies.get(i).getName() != null)
                list.add(i, currencies.get(i).getCode());
        }
        return list;
    }

}