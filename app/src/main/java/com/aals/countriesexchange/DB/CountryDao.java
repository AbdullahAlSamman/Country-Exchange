package com.aals.countriesexchange.DB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.aals.countriesexchange.Model.Country;

import java.util.List;

@Dao
public interface CountryDao {

    @Query("SELECT * FROM countries")
    List<Country> getAllCountries();

    @Query("SELECT * FROM countries WHERE name LIKE :name  LIMIT 1")
    Country findByName(String name);

    @Query("SELECT count(name) FROM countries")
    int getCountriesCount();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertAllCountries(List<Country> countries);

    @Delete
    void delete(Country country);

}
