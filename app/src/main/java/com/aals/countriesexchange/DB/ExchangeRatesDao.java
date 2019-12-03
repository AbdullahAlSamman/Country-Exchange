package com.aals.countriesexchange.DB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.aals.countriesexchange.Model.Quotes;

import java.util.List;

@Dao
public interface ExchangeRatesDao {

    @Query("SELECT * FROM rates")
    List<Quotes> getRates();

    @Query("SELECT * FROM rates ORDER BY id DESC LIMIT 1")
    Quotes getLastRate();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertRates(Quotes rates);
}
