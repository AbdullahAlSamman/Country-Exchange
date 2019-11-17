package com.aals.countriesexchange.Model;

import java.math.BigDecimal;

public class Stats {
    private BigDecimal endTimestamp;
    private BigDecimal startTimestamp;
    private BigDecimal durationInMilliSeconds;

    public BigDecimal getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(BigDecimal endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public BigDecimal getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(BigDecimal startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public BigDecimal getDurationInMilliSeconds() {
        return durationInMilliSeconds;
    }

    public void setDurationInMilliSeconds(BigDecimal durationInMilliSeconds) {
        this.durationInMilliSeconds = durationInMilliSeconds;
    }

}
