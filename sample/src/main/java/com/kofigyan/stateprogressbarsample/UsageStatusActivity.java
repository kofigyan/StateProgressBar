package com.kofigyan.stateprogressbarsample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.kofigyan.stateprogressbar.StateProgressBar;

/**
 * Created by Kofi Gyan on 7/13/2016.
 */

public class UsageStatusActivity extends  UsageBaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_usage_status);

        injectBackView();

        nextBtn.setText("Submit");
        stateprogressbar.setCurrentStateNumber(StateProgressBar.StateNumber.FOUR);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnNext:
                Intent intent = new Intent(getApplicationContext(), UsageCompleteActivity.class);
                startActivity(intent);
                break;

            case R.id.btnBack:
                finish();
                break;
        }
    }

}
