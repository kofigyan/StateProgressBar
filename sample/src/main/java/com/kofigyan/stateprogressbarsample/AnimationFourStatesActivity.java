package com.kofigyan.stateprogressbarsample;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


/**
 * Created by Kofi Gyan on 7/14/2016.
 */
public class AnimationFourStatesActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_four_states);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.menu_anim, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        super.onOptionsItemSelected(item);


        if (stateProgressBar == null)
            return false;


        switch (item.getItemId()) {


            case R.id.anim_start_delay:

                stateProgressBar.setAnimationStartDelay(5000);

                break;

            case R.id.anim_duration:

                stateProgressBar.setAnimationDuration(5000);

                break;


        }

        return true;
    }



}

