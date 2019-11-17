package com.aals.countriesexchange.Model;

public class ODSObject {
    Data data;
    private float id;
    private String timestamp;
    private String origin;
    private String license;
    private String pipelineId;


    // Getter Methods

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data dataObject) {
        this.data = dataObject;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    // Setter Methods

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
