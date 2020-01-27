package com.aals.countriesexchange.Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * The type Utils.
 */
public class Utils {
    private static Utils instance;
    private static Context context;

    private Utils() {
    }

    /**
     * Create utils.
     * Singleton pattern applied to avoid creating more than one instance.
     * implementation of all external checks
     *
     * @param currentContext the current context
     * @return the utils
     */
    public static synchronized Utils create(Context currentContext) {
        context = currentContext;
        if (instance == null)
            instance = new Utils();
        return instance;
    }

    /**
     * Is network available boolean.
     * check if the network has valued internet connection.
     *
     * <p>
     * deprecation is From api 29 and higher this stays as it is for backward compatibility.
     *
     * @return the boolean
     */

    @SuppressWarnings("deprecation")
    public Boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }


}
