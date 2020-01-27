package com.aals.countriesexchange.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The type Exchange rates.
 * represent the parent response from the server as class entity for retrofit to parse serialization is required to match server response.
 */
public class ExchangeRates {

    @SerializedName("terms")
    @Expose
    private String terms;

    @SerializedName("quotes")
    @Expose
    private Quotes quotes;

    @SerializedName("source")
    @Expose
    private String source;

    @SerializedName("privacy")
    @Expose
    private String privacy;

    @SerializedName("success")
    @Expose
    private Boolean success;

    @SerializedName("timestamp")
    @Expose
    private Long timestamp;

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public Quotes getQuotes() {
        return quotes;
    }

    public void setQuotes(Quotes quotes) {
        this.quotes = quotes;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

}
