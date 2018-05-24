package com.kofigyan.stateprogressbarsample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.kofigyan.stateprogressbarsample.not_stateprogressbar.custom.DividerItemDecoration;

/**
 * Created by Kofi Gyan on 8/9/2016.
 */
public abstract class ListBaseActivity extends Activity {

    protected RecyclerView recyclerView;

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        injectCommonViews();
    }


    protected void injectCommonViews() {

        setTitle("StateProgressBar Example");

        recyclerView = (RecyclerView) findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent i = null;

        switch (item.getItemId()) {
            case R.id.viewGithub:
                i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://github.com/kofigyan/StateProgressBar"));
                startActivity(i);
                break;
            case R.id.feedback:
                i = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "kofigyan2011@gmail.com", null));
                i.putExtra(Intent.EXTRA_SUBJECT, "StateProgressBar Feedback");
                i.putExtra(Intent.EXTRA_TEXT, "Your feedback here...");
                startActivity(Intent.createChooser(i, "Feedback"));
                break;

        }

        return true;
    }


}
