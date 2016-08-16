package com.kofigyan.stateprogressbarsample;

import android.content.res.Resources;
import android.os.Bundle;

import com.kofigyan.stateprogressbarsample.not_stateprogressbar.adapter.StatesListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kofi Gyan on 7/14/2016.
 */

public class StatesListActivity extends ListBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_states_list);

        List<String> items = getItems();

        StatesListAdapter adapter = new StatesListAdapter(items, this);
        recyclerView.setAdapter(adapter);
    }


    private List<String> getItems() {
        List<String> items = new ArrayList<>();

        Resources res = getResources();
        String[] statesItems = res.getStringArray(R.array.states_list_items);

        for (int i = 0; i < statesItems.length; i++) {
            items.add(statesItems[i]);
        }

        return items;
    }


}
