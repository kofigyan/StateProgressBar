package com.kofigyan.stateprogressbarsample.not_stateprogressbar.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.kofigyan.stateprogressbarsample.R;

/**
 * Created by Kofi Gyan on 8/2/2016.
 */

public class UserDetailsView extends RelativeLayout implements View.OnClickListener {

    private TextView mDetailLabel;
    private TextView mDetailValue;
    private OnUserDetailClickListener onUserDetailClickListener;

    public UserDetailsView(Context context) {
        super(context);
        init(context, null, 0);
    }

    public UserDetailsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public UserDetailsView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }


    private void init(Context context, AttributeSet attrs, int defStyle) {
        inflate(context, R.layout.view_user_details, this);

        mDetailLabel = (TextView) findViewById(R.id.tvLabel);
        mDetailValue = (TextView) findViewById(R.id.tvValue);


        if (attrs != null) {
            final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.UserDetailsView, defStyle, 0);

            final String detailsLabel = a.getString(R.styleable.UserDetailsView_detailsLabel);
            final String detailsValue = a.getString(R.styleable.UserDetailsView_detailsValue);

            a.recycle();

            setDetailLabel(detailsLabel);
            setDetailValue(detailsValue);
        }

    }


    public void setDetailLabel(String label) {
        this.mDetailLabel.setText(label);
    }

    public void setDetailValue(String value) {
        this.mDetailValue.setText(value);
    }

    @Override
    public void onClick(View v) {
        if (onUserDetailClickListener != null) {
            onUserDetailClickListener.onUserDetailClickListener(this);
        }
    }

    public void setOnUserDetailClickListener(OnUserDetailClickListener onUserDetailClickListener) {
        this.onUserDetailClickListener = onUserDetailClickListener;
    }

    @Override
    public void setOnClickListener(OnClickListener l) {
        //No implementation here. onClickListener implementation in OnUserDetailClickListener
    }

    public interface OnUserDetailClickListener {
        public void onUserDetailClickListener(View v);
    }


    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        super.setOnClickListener(this);
    }

}
