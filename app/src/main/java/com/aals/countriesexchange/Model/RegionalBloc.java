package com.aals.countriesexchange.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * The type Regional bloc.
 * represent the parent response from the server as class entity for retrofit to parse serialization is required to match server response.
 */
public class RegionalBloc implements Serializable {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("acronym")
    @Expose
    private String acronym;
    @SerializedName("otherNames")
    @Expose
    private List<String> otherNames = null;
    @SerializedName("otherAcronyms")
    @Expose
    private List<Object> otherAcronyms = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public List<String> getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(List<String> otherNames) {
        this.otherNames = otherNames;
    }

    public List<Object> getOtherAcronyms() {
        return otherAcronyms;
    }

    public void setOtherAcronyms(List<Object> otherAcronyms) {
        this.otherAcronyms = otherAcronyms;
    }

}