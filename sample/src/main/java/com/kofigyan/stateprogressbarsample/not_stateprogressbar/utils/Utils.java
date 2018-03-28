package com.kofigyan.stateprogressbarsample.not_stateprogressbar.utils;


import com.kofigyan.stateprogressbarsample.AllStatesCompletedActivity;
import com.kofigyan.stateprogressbarsample.AnimationFourStatesActivity;
import com.kofigyan.stateprogressbarsample.BasicFiveDescendingStatesActivity;
import com.kofigyan.stateprogressbarsample.BasicFiveStatesActivity;
import com.kofigyan.stateprogressbarsample.BasicFourDescendingStatesActivity;
import com.kofigyan.stateprogressbarsample.BasicFourStatesActivity;
import com.kofigyan.stateprogressbarsample.BasicThreeDescendingStatesActivity;
import com.kofigyan.stateprogressbarsample.BasicThreeStatesActivity;
import com.kofigyan.stateprogressbarsample.BasicTwoDescendingStatesActivity;
import com.kofigyan.stateprogressbarsample.BasicTwoStatesActivity;
import com.kofigyan.stateprogressbarsample.ChangingStatesSizeActivity;
import com.kofigyan.stateprogressbarsample.CheckFourStatesActivity;
import com.kofigyan.stateprogressbarsample.ColoringStatesActivity;
import com.kofigyan.stateprogressbarsample.DescriptionFourStatesActivity;
import com.kofigyan.stateprogressbarsample.StatesListActivity;
import com.kofigyan.stateprogressbarsample.UsageDetailsActivity;

/**
 * Created by Kofi Gyan on 7/15/2016.
 */

public class Utils {

    public static Class[] basicActivities = {BasicFiveStatesActivity.class,BasicFourStatesActivity.class, BasicThreeStatesActivity.class, BasicTwoStatesActivity.class};
    public static Class[] basicDescendingActivities = {BasicFiveDescendingStatesActivity.class,BasicFourDescendingStatesActivity.class, BasicThreeDescendingStatesActivity.class, BasicTwoDescendingStatesActivity.class};

    public static Class[] allActivities = {StatesListActivity.class, CheckFourStatesActivity.class, AllStatesCompletedActivity.class, AnimationFourStatesActivity.class, DescriptionFourStatesActivity.class, ChangingStatesSizeActivity.class, ColoringStatesActivity.class, UsageDetailsActivity.class};


    public static Class selectActivity(int position, Class[] activities) {
        Class activity = activities[position];
        return activity;
    }


}
