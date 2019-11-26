package com.aals.countriesexchange.DB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.aals.countriesexchange.Model.Quotes;

@Dao
public interface ExchangeRatesDao {

    @Query("SELECT * FROM rates")
    Quotes getRates();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertRates(Quotes rates);
}
