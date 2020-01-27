package com.aals.countriesexchange.DB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.aals.countriesexchange.Model.Quotes;

import java.util.List;

/**
 * The interface Exchange rates dao.
 * defines all the queries as function with sql query to retrive or insert or delete data from data base the implementation with be generated in compile time form Room Library.
 */
@Dao
public interface ExchangeRatesDao {

    /**
     * Gets rates.
     *
     * @return the rates
     */
    @Query("SELECT * FROM rates")
    List<Quotes> getRates();

    /**
     * Gets last rate.
     *
     * @return the last rate inserted to db.
     */
    @Query("SELECT * FROM rates ORDER BY id DESC LIMIT 1")
    Quotes getLastRate();

    /**
     * Insert rates.
     *
     * @param rates the rates
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertRates(Quotes rates);

    /**
     * Delete.
     *
     * @param rates the rates
     */
    @Delete
    void delete(Quotes rates);
}
