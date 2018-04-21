package com.kofigyan.stateprogressbar.utils;


import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kofi Gyan on 5/22/2016.
 */

public class FontManager {

    private static final Map<String, Typeface> mFontCache = new HashMap<String, Typeface>();

    private static final String FONTAWESOME = "fonts/fontawesome-webfont.ttf";

    public static Typeface getTypeface(Context context) {

        Typeface typeface = mFontCache.get(FONTAWESOME);

        if (typeface == null) {
            typeface = Typeface.createFromAsset(context.getAssets(), FONTAWESOME);
            mFontCache.put(FONTAWESOME, typeface);
        }

        return typeface;
    }


    public static Typeface getTypeface(Context context, final String filePath) {
        synchronized (mFontCache) {
            try {
                if (!mFontCache.containsKey(filePath)) {
                    final Typeface typeface = Typeface.createFromAsset(context.getAssets(), filePath);
                    mFontCache.put(filePath, typeface);
                    return typeface;
                }
            } catch (Exception e) {
                Log.w("StateProgressBar", "Cannot create asset from " + filePath + ". Ensure you have passed in the correct path and file name.", e);
                mFontCache.put(filePath, null);
                return null;
            }
            return mFontCache.get(filePath);
        }
    }


}