package com.kofigyan.stateprogressbarsample;

import android.content.res.Resources;
import android.os.Bundle;

import com.kofigyan.stateprogressbarsample.not_stateprogressbar.adapter.StatesListAdapter;

import java.util.ArrayList;
import java.util.List;

import static com.kofigyan.stateprogressbarsample.not_stateprogressbar.utils.Constants.DESCENDING;
import static com.kofigyan.stateprogressbarsample.not_stateprogressbar.utils.Constants.IS_DESCENDING_ASCENDING_OPTIONS;

/**
 * Created by Kofi Gyan on 7/14/2016.
 */

public class StatesListActivity extends ListBaseActivity {

    private boolean isDescending;
    private boolean isDescendingAscendingOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_states_list);

        isDescending = getIntent().getBooleanExtra(DESCENDING, false);

        isDescendingAscendingOptions = getIntent().getBooleanExtra(IS_DESCENDING_ASCENDING_OPTIONS, false );


        List<String> items = getItems();

        StatesListAdapter adapter = new StatesListAdapter(items, this , isDescending);
        recyclerView.setAdapter(adapter);
    }


    private List<String> getItems() {
        List<String> items = new ArrayList<>();

        Resources res = getResources();

        int arrayValues = isDescendingAscendingOptions ? R.array.state_ascending_descending_test  : R.array.states_list_items ;


        String[] statesItems = res.getStringArray(arrayValues);

        for (int i = 0; i < statesItems.length; i++) {
            items.add(statesItems[i]);
        }

        return items;
    }


}
