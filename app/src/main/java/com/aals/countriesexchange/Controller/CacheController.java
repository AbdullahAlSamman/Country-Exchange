package com.aals.countriesexchange.Controller;

import android.graphics.Bitmap;
import android.util.LruCache;

public class CacheController {

    private final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
    private final int cacheSize = maxMemory / 8;
    private LruCache<String, Bitmap> mMemoryCache;

    public CacheController() {
        mMemoryCache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {
                return bitmap.getByteCount() / 1024;
            }
        };
    }

    public void addBitmapToMemoryCache(String key, Bitmap bitmap) {
        if (getBitmapFromMemCache(key) == null) {
            mMemoryCache.put(key, bitmap);
        }
    }

    public Bitmap getBitmapFromMemCache(String key) {
        return mMemoryCache.get(key);
    }

    public boolean isCached(String key) {
        if (getBitmapFromMemCache(key) == null) {
            return false;
        }
        return true;
    }
}
