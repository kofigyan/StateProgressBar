package com.kofigyan.stateprogressbarsample.not_stateprogressbar.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.kofigyan.stateprogressbarsample.R;

/**
 * Created by Kofi Gyan on 8/3/2016.
 */

public class ContentHeaderView extends LinearLayout {


    TextView mHeaderTitle;
    ImageView mHeaderImage;

    public ContentHeaderView(Context context) {
        super(context);
        init(context, null, 0);
    }

    public ContentHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public ContentHeaderView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyle) {

        inflate(context, R.layout.view_content_header, this);

        mHeaderTitle = (TextView) findViewById(R.id.tvHeaderTitle);
        mHeaderImage = (ImageView) findViewById(R.id.ivHeaderImage);

        if (attrs != null) {
            final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ContentHeaderView, defStyle, 0);

            final String headerTitle = a.getString(R.styleable.ContentHeaderView_headerTitle);
            final Drawable headerImage = a.getDrawable(R.styleable.ContentHeaderView_headerSrc);

            a.recycle();

            setHeaderTitle(headerTitle);
            setHeaderImage(headerImage);
        }

    }


    public void setHeaderTitle(String headerTitle) {
        this.mHeaderTitle.setText(headerTitle);
    }

    public void setHeaderImage(Drawable headerImage) {
        this.mHeaderImage.setImageDrawable(headerImage);
    }


}
