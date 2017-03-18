package com.kofigyan.stateprogressbar.utils;


import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kofi Gyan on 5/22/2016.
 */

public class FontManager {

    private static Typeface checkMarkTypeface;

    private static final String FONTAWESOME = "fonts/fontawesome-webfont.ttf";

    public static Typeface getCheckMarkTypeface(Context context) {

        if (checkMarkTypeface == null) {
            checkMarkTypeface = Typeface.createFromAsset(context.getAssets(), FONTAWESOME);
        }

        return checkMarkTypeface;
    }

}