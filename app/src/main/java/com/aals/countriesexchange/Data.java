package com.aals.countriesexchange;

import java.util.ArrayList;

public class Data {
    private ArrayList<Object> data = new ArrayList<Object>();
    private Stats stats;

    public ArrayList<Object> getData() {
        return data;
    }

    public void setData(ArrayList<Object> data) {
        this.data = data;
    }


    public Stats getStats() {
        return stats;
    }


    public void setStats(Stats statsObject) {
        this.stats = statsObject;
    }
}

