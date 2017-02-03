package com.kofigyan.stateprogressbarsample;

import android.app.Activity;
import android.os.Bundle;

import com.kofigyan.stateprogressbar.StateProgressBar;

/**
 * Created by Kofi Gyan on 7/22/2016.
 */
public class ChangingStatesSizeActivity extends Activity{

    String[] descriptionData = {"Details" , "Status" , "Photo" , "Event" , "Promo" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changing_states_size);
        StateProgressBar stateProgressBar = (StateProgressBar)findViewById(R.id.state_progress_bar);
        stateProgressBar.setStateDescriptionData(descriptionData);
    }
}
