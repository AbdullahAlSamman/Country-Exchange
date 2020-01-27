package com.aals.countriesexchange.Model;

import android.graphics.Bitmap;

import java.io.Serializable;


/**
 * The type Serializable bitmap.
 * convert normal bitmaps to a serialized so can be send using intent extra to avoid an extra db request.
 */
public class SerializableBitmap implements Serializable {

    private final int[] pixels;
    private final int width, height;

    /**
     * Gets width.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Instantiates a new Serializable bitmap.
     *
     * @param bitmap the bitmap
     */
    public SerializableBitmap(Bitmap bitmap) {
        width = bitmap.getWidth();
        height = bitmap.getHeight();
        pixels = new int[width * height];
        bitmap.getPixels(pixels, 0, width, 0, 0, width, height);
    }

    /**
     * Gets bitmap.
     * use current serialized data to produce bitmap again.
     *
     * @return the bitmap
     */
    public Bitmap getBitmap() {
        return Bitmap.createBitmap(pixels, width, height, Bitmap.Config.ARGB_8888);
    }
}

