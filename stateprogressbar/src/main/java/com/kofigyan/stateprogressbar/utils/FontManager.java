package com.kofigyan.stateprogressbar.utils;


import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kofi Gyan on 5/22/2016.
 */

public class FontManager {

    private static final Map<String, Typeface> mFontCache = new HashMap<>();

    private static final String FONTAWESOME = "fonts/fontawesome-webfont.ttf";

    public static Typeface getTypeface(Context context) {

        Typeface typeface = mFontCache.get(FONTAWESOME);

        if (typeface == null) {
            typeface = Typeface.createFromAsset(context.getAssets(), FONTAWESOME);
            mFontCache.put(FONTAWESOME, typeface);
        }

        return typeface;
    }

}