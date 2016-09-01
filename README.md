# StateProgressBar
StateProgressBar is an Android Library to realise the various states and transitions in a progressbar.

![alt tag](https://github.com/kofigyan/StateProgressBar/blob/master/screenshots/final_preview.gif)

## Quick Start

Add the following dependency to your build.gradle :
```
dependencies {
     compile 'com.kofigyan.stateprogressbar:stateprogressbar:0.0.1'
}
```

### XML

```
<com.kofigyan.stateprogressbar.StateProgressBar
    android:id="@+id/your_state_progress_bar_id"

    android:layout_width="wrap_content"
    android:layout_height="wrap_content"

    app:spb_currentStateNumber="three"
    app:spb_maxStateNumber="four"

    app:spb_stateBackgroundColor="#BDBDBD"
    app:spb_stateForegroundColor="#009688"

    app:spb_stateNumberBackgroundColor="#808080"
    app:spb_stateNumberForegroundColor="#eeeeee"

    app:spb_currentStateDescriptionColor="#009688"
    app:spb_stateDescriptionColor="#808080"

    app:spb_animateToCurrentProgressState="true"
    app:spb_checkStateCompleted="true"/>

```

To add description data to StateProgressBar :

```
String[] descriptionData = {"Details", "Status", "Photo", "Confirm"};

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.your_layout);

    StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.your_state_progress_bar_id);
    stateProgressBar.setStateDescriptionData(descriptionData);

}

```
