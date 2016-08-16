package com.kofigyan.stateprogressbarsample;

import android.content.res.Resources;
import android.os.Bundle;

import com.kofigyan.stateprogressbarsample.not_stateprogressbar.adapter.ApiFeatureAdapter;
import com.kofigyan.stateprogressbarsample.not_stateprogressbar.pojo.ApiFeature;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        List<ApiFeature> features = getApiFeatures();

        ApiFeatureAdapter adapter = new ApiFeatureAdapter(features, this);
        recyclerView.setAdapter(adapter);
    }

    private List<ApiFeature> getApiFeatures() {

        List<ApiFeature> features = new ArrayList<>();

        Resources res = getResources();
        String[] titles = res.getStringArray(R.array.features_titles);
        String[] descriptions = res.getStringArray(R.array.features_descriptions);

        for (int i = 0; i < titles.length; i++) {
            features.add(new ApiFeature(titles[i], descriptions[i]));
        }

        return features;
    }


}
