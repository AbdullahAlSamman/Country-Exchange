package com.aals.countriesexchange.DB;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import androidx.room.TypeConverter;

import com.aals.countriesexchange.Model.Currency;
import com.aals.countriesexchange.Model.Language;
import com.aals.countriesexchange.Model.RegionalBloc;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

public class Converters {

    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }

    @TypeConverter
    public static List<String> toList(String string) {
        Type listType = new TypeToken<List<String>>() {
        }.getType();
        return new Gson().fromJson(string, listType);
    }

    @TypeConverter
    public static String fromList(List<String> list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }

    @TypeConverter
    public static List<Double> doublesToList(String string) {
        Type listType = new TypeToken<List<Double>>() {
        }.getType();
        return new Gson().fromJson(string, listType);
    }

    @TypeConverter
    public static String doublesFromList(List<Double> list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }

    @TypeConverter
    public static List<Language> languagesToList(String string) {
        Type listType = new TypeToken<List<Language>>() {
        }.getType();
        return new Gson().fromJson(string, listType);
    }

    @TypeConverter
    public static String languagesFromList(List<Language> list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }

    @TypeConverter
    public static List<Currency> currenciesToList(String string) {
        Type listType = new TypeToken<List<Currency>>() {
        }.getType();
        return new Gson().fromJson(string, listType);
    }

    @TypeConverter
    public static String currenciesFromList(List<Currency> list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }

    @TypeConverter
    public static List<RegionalBloc> regionalBlocsToList(String string) {
        Type listType = new TypeToken<List<RegionalBloc>>() {
        }.getType();
        return new Gson().fromJson(string, listType);
    }

    @TypeConverter
    public static String regionalBlocsFromList(List<RegionalBloc> list) {
        Gson gson = new Gson();
        return gson.toJson(list);
    }

    @TypeConverter
    public static byte[] bitmapToByteArray(Bitmap bitmap) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, outputStream);
        return outputStream.toByteArray();
    }

    @TypeConverter
    public static Bitmap byteArrayToBitmap(byte[] imgByte) {
        return BitmapFactory.decodeByteArray(imgByte, 0, imgByte.length);
    }
}
