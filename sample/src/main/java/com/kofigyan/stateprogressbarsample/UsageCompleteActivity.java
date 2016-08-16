package com.kofigyan.stateprogressbarsample;

import android.os.Bundle;
import android.view.View;


/**
 * Created by Kofi Gyan on 7/13/2016.
 */

public class UsageCompleteActivity extends UsageBaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usage_complete);

        nextBtn.setText("Back");
        stateprogressbar.setAllStatesCompleted(true);
        stateprogressbar.enableAnimationToCurrentState(false);
    }


    @Override
    public void onClick(View v) {
        finish();
    }
}
