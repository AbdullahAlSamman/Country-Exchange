package com.aals.countriesexchange.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The type Country ods.
 * represent the parent response from the server as class entity for retrofit to parse serialization is required to match server response.
 */
public class CountryODS {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("data")
    @Expose
    private List<Country> data;
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

    public CountryODS() {
        data = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Country> getData() {
        return data;
    }

    public void setData(List<Country> data) {
        this.data = data;
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