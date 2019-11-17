package com.aals.countriesexchange.Controller;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;

import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ImageController {
    private static OkHttpClient httpClient;
    private static CacheController memoryCache;

    public ImageController() {
        memoryCache = new CacheController();
    }

    public static void fetchSvg(Context context, final String url, final String key) {
        if (httpClient == null) {
            // Use cache for performance and basic offline capability
            httpClient = new OkHttpClient.Builder()
                    .cache(new Cache(context.getCacheDir(), 5 * 1024 * 1014))
                    .build();
        }

        Request request = new Request.Builder().url(url).build();
        httpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e("Image", e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                InputStream stream = response.body().byteStream();

                Log.i("image", key + ": " + url + " : ");
//                memoryCache.addBitmapToMemoryCache(key, BitmapFactory.decodeStream(stream));
                stream.close();
            }
        });
    }
}
