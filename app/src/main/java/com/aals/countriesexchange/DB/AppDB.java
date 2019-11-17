package com.aals.countriesexchange.DB;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.aals.countriesexchange.Model.Country;

@Database(entities = {Country.class}, version = 1, exportSchema = false)
public abstract class AppDB extends RoomDatabase {
    private static final String DB_NAME = "app-db";
    private static AppDB instance;

    public static synchronized AppDB getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDB.class, DB_NAME).build();
        }
        return instance;
    }

    public abstract CountryDao userDao();
}

