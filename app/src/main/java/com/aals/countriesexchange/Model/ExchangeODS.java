package com.aals.countriesexchange.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExchangeODS {

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("data")
    @Expose
    private ExchangeRates exchangeRates;

    @SerializedName("timestamp")
    @Expose
    private String timestamp;

    @SerializedName("origin")
    @Expose
    private String origin;

    @SerializedName("license")
    @Expose
    private String license;

    @SerializedName("pipelineId")
    @Expose
    private String pipelineId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ExchangeRates getExchangeRates() {
        return exchangeRates;
    }

    public void setExchangeRates(ExchangeRates exchangeRates) {
        this.exchangeRates = exchangeRates;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

}
