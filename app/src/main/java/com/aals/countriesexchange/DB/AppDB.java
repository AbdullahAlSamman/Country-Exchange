package com.aals.countriesexchange.DB;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.aals.countriesexchange.Model.Country;
import com.aals.countriesexchange.Model.Quotes;

/**
 * The type App db.
 * defines all information about the local db for Room library in the device including type converters.
 */
@Database(entities = {Country.class, Quotes.class}, version = 1, exportSchema = false)
@TypeConverters(Converters.class)
public abstract class AppDB extends RoomDatabase {
    private static final String DB_NAME = "app-db";
    private static AppDB instance;

    /**
     * Gets instance.
     * Singleton implementation to forbid creating more than one data base connection.
     *
     * @param context the context of current activity.
     * @return the instance
     */
    public static synchronized AppDB getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDB.class, DB_NAME).build();
        }
        return instance;
    }

    /**
     * Country dao country dao.
     * implementation will be generated in compile time from Room Library.
     *
     * @return the country dao
     */
    public abstract CountryDao countryDao();

    /**
     * Exchange rates dao exchange rates dao.
     * implementation will be generated in compile time from Room Library.
     *
     * @return the exchange rates dao
     */
    public abstract ExchangeRatesDao exchangeRatesDao();
}

