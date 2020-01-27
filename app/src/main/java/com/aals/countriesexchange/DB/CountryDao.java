package com.aals.countriesexchange.DB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.aals.countriesexchange.Model.Country;

import java.util.List;

/**
 * The interface Country dao.
 * defines all the queries as function with sql query to retrive or insert or delete data from data base the implementation with be generated in compile time form Room Library.
 */
@Dao
public interface CountryDao {

    /**
     * Gets all countries.
     *
     * @return the all countries
     */
    @Query("SELECT * FROM countries")
    List<Country> getAllCountries();

    /**
     * Find by name country.
     *
     * @param name the name
     * @return the country
     */
    @Query("SELECT * FROM countries WHERE name LIKE :name  LIMIT 1")
    Country findByName(String name);

    /**
     * Gets countries count.
     *
     * @return the countries count
     */
    @Query("SELECT count(name) FROM countries")
    int getCountriesCount();

    /**
     * Insert all countries.
     *
     * @param countries the countries
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertAllCountries(List<Country> countries);

    /**
     * Delete.
     *
     * @param country the country
     */
    @Delete
    void delete(Country country);

}
