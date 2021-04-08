package com.kofigyan.stateprogressbarsample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.kofigyan.stateprogressbar.StateProgressBar;
import com.kofigyan.stateprogressbarsample.not_stateprogressbar.custom.UserDetailsView;

/**
 * Created by Kofi Gyan on 7/13/2016.
 */

public class UsageDetailsActivity extends UsageBaseActivity implements UserDetailsView.OnUserDetailClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usage_details);

        stateprogressbar.setCurrentStateNumber(1);
        setupUserDetailsView();

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), UsagePricingActivity.class);
        startActivity(intent);
    }

    @Override
    public void onUserDetailClickListener(View v) {

        switch (v.getId()) {
            case R.id.udvName:
                Toast.makeText(getApplicationContext(), "User Name Detail Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.udvEmail:
                Toast.makeText(getApplicationContext(), "User Email Detail Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.udvPhoneNumber:
                Toast.makeText(getApplicationContext(), "User Phone Number Detail Clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.udvPassword:
                Toast.makeText(getApplicationContext(), "User Password Detail Clicked", Toast.LENGTH_LONG).show();
                break;
        }
    }

    private void setupUserDetailsView() {
        setupUserDetailsView(R.id.udvName);
        setupUserDetailsView(R.id.udvEmail);
        setupUserDetailsView(R.id.udvPhoneNumber);
        setupUserDetailsView(R.id.udvPassword);
    }

    private void setupUserDetailsView(int viewId) {
        UserDetailsView udvView = (UserDetailsView) findViewById(viewId);
        udvView.setOnUserDetailClickListener(this);
    }
}
