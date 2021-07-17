package com.kofigyan.stateprogressbarsample;

import android.app.Activity;
import androidx.core.content.ContextCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.kofigyan.stateprogressbar.StateProgressBar;

/**
 * Created by Kofi Gyan on 7/22/2016.
 */

public abstract class BaseActivity extends Activity {

    protected StateProgressBar stateProgressBar;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        stateProgressBar = (StateProgressBar) findViewById(R.id.state_progress_bar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_base, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (stateProgressBar == null)
            return false;


        switch (item.getItemId()) {

            case R.id.color:

                stateProgressBar.setForegroundColor(ContextCompat.getColor(this, R.color.demo_state_foreground_color));
                stateProgressBar.setBackgroundColor(ContextCompat.getColor(this, android.R.color.darker_gray));

                stateProgressBar.setStateNumberForegroundColor(ContextCompat.getColor(this, android.R.color.white));
                stateProgressBar.setStateNumberBackgroundColor(ContextCompat.getColor(this, android.R.color.background_dark));

                break;

            case R.id.size:

                stateProgressBar.setStateSize(40f);
                stateProgressBar.setStateNumberTextSize(20f);

                break;

            case R.id.animation:

                stateProgressBar.enableAnimationToCurrentState(true);

                break;

            case R.id.line_thickness:

                stateProgressBar.setStateLineThickness(10f);

                break;

            case R.id.current_state:
                if (stateProgressBar.getMaxStateNumber() >= StateProgressBar.StateNumber.TWO.getValue())
                    stateProgressBar.setCurrentStateNumber(StateProgressBar.StateNumber.TWO);
                else
                    Toast.makeText(getApplicationContext() , getResources().getString(R.string.max_error_message) , Toast.LENGTH_LONG).show();


                break;

            case R.id.max_state:
                if (stateProgressBar.getCurrentStateNumber() <= StateProgressBar.StateNumber.FOUR.getValue())
                    stateProgressBar.setMaxStateNumber(StateProgressBar.StateNumber.FOUR);
                else
                Toast.makeText(getApplicationContext() , getResources().getString(R.string.max_error_message) , Toast.LENGTH_LONG).show();

                break;

            case R.id.check_state_completed:

                stateProgressBar.checkStateCompleted(Boolean.TRUE);

                break;


            case R.id.enable_all_states_completed:

                stateProgressBar.setAllStatesCompleted(Boolean.TRUE);

                break;


        }

        return true;
    }

}
