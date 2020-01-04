package com.aals.countriesexchange.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Utils {
    private static Utils instance;
    private static Context context;

    private Utils() {
    }

    public static synchronized Utils create(Context currentContext) {
        context = currentContext;
        if (instance == null)
            instance = new Utils();
        return instance;
    }

    // deprecation is From api 29 and higher this stays as it is for backward compatibility
    @SuppressWarnings("deprecation")
    public Boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


}
