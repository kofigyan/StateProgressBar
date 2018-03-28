package com.kofigyan.stateprogressbar.listeners;


import com.kofigyan.stateprogressbar.StateProgressBar;
import com.kofigyan.stateprogressbar.components.StateItem;

/**
 * Created by Kofi Gyan on 2/20/2018.
 */

public interface OnStateItemClickListener {

    void onStateItemClick(StateProgressBar stateProgressBar, StateItem stateItem, int stateNumber, boolean isCurrentState);

}
