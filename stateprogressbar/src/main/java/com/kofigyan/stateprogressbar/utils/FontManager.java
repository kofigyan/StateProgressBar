package com.kofigyan.stateprogressbar.utils;


import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kofi Gyan on 5/22/2016.
 */

public class FontManager {

    private static final Map<String, Typeface> FONTS = new HashMap<String, Typeface>();

    public static final String ROOT = "fonts/",
            FONTAWESOME = ROOT + "fontawesome-webfont.ttf";

    public static Typeface getTypeface(Context context, String fontName) {

        Typeface typeface = FONTS.get(fontName);

        if (typeface == null) {
            typeface = Typeface.createFromAsset(context.getAssets(), fontName);
            FONTS.put(fontName, typeface);
        }

        return typeface;
    }

}