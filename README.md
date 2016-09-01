# StateProgressBar
StateProgressBar is an Android Library to realise the various states and transitions in a progressbar.

![alt tag](https://raw.githubusercontent.com/kofigyan/StateProgressBar/master/screenshots/final_preview.gif)

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

## XML Attributes

        spb_currentStateNumber => Current state number. Must be one of the following constant values : one , two , three , four .
        Related method : setCurrentStateNumber(StateNumber)

        spb_maxStateNumber  => Maximum state number. Must be one of the following constant values : one , two , three , four .
        Related method : setMaxStateNumber(StateNumber)

        spb_stateBackgroundColor  => State background color. May be a color value, in the form of "#rgb", "#argb", "#rrggbb", or "#aarrggbb".
        Related method : setBackgroundColor(int)

        spb_stateForegroundColor  => State foreground color. May be a color value, in the form of "#rgb", "#argb", "#rrggbb", or "#aarrggbb".
        Related method : setForegroundColor(int)

        spb_stateNumberBackgroundColor => State number background color. May be a color value, in the form of "#rgb", "#argb", "#rrggbb", or "#aarrggbb".
        Related method : setStateNumberBackgroundColor(int)

        spb_stateNumberForegroundColor => State number foreground color. May be a color value, in the form of "#rgb", "#argb", "#rrggbb", or "#aarrggbb".
        Related method : setStateNumberForegroundColor(int)

        spb_currentStateDescriptionColor => Current state description color. May be a color value, in the form of "#rgb", "#argb", "#rrggbb", or "#aarrggbb".
        Related method : setCurrentStateDescriptionColor(int)

        spb_stateDescriptionColor => State description color. May be a color value, in the form of "#rgb", "#argb", "#rrggbb", or "#aarrggbb".
        Related method : setStateDescriptionColor(int)

        spb_stateSize => State size . Must be a dimension value with preferrable unit of dp eg. 25dp
        Related method : setStateSize(float)

        spb_stateTextSize => State text(number) size . Must be a dimension value with preferrable unit of sp eg. 15sp
        Related method : setStateNumberTextSize(float)

        spb_stateDescriptionSize => State description size . Must be a dimension value with preferrable unit of dp eg. 20dp
        Related method : setStateDescriptionSize(float)        

        spb_stateLineThickness => State joining line size(thickness) . Must be a dimension value with preferrable unit of dp eg. 10dp
        Related method : setStateLineThickness(float)

        spb_checkStateCompleted => Check completed states . Must be a boolean value,either "true" or "false"
        Related method : checkStateCompleted(boolean)        

        spb_animateToCurrentProgressState => Animate joining line to current progress state . Must be a boolean value,either "true" or "false"
        Related method : enableAnimationToCurrentState(boolean)        

        spb_enableAllStatesCompleted => Check all states . Must be a boolean value,either "true" or "false"
        Related method : setAllStatesCompleted(boolean)         

        spb_descriptionTopSpaceDecrementer => Space between state and description decrementer . Must be a dimension value with preferrable unit of dp eg. 10dp
        Related method : setDescriptionTopSpaceDecrementer(float)

        spb_descriptionTopSpaceIncrementer => Space between state and description incrementer . Must be a dimension value with preferrable unit of dp eg. 10dp
        Related method : setDescriptionTopSpaceIncrementer(float)

        spb_animationDuration => State joining line animation duration . Must be an integer value eg. "500" , "1000" , "2000" , "5000" , "10000" etc
        Related method : setAnimationDuration(int)

        spb_animationStartDelay => State joining line animation start delay . Must be an integer value eg. "500" , "1000" , "2000" , "5000" , "10000" etc
        Related method : setAnimationStartDelay(int)


## JAVA

StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.state_progress_bar);

    stateProgressBar.setForegroundColor(ContextCompat.getColor(this, R.color.demo_state_foreground_color));
    stateProgressBar.setBackgroundColor(ContextCompat.getColor(this, android.R.color.darker_gray));

    stateProgressBar.setStateNumberForegroundColor(ContextCompat.getColor(this, android.R.color.white));
    stateProgressBar.setStateNumberBackgroundColor(ContextCompat.getColor(this, android.R.color.background_dark));

    stateProgressBar.setStateSize(40f);
    stateProgressBar.setStateNumberTextSize(20f);
    stateProgressBar.setStateLineThickness(10f);

    stateProgressBar.enableAnimationToCurrentState(true);

    stateProgressBar.setDescriptionTopSpaceIncrementer(10f);
    stateProgressBar.setStateDescriptionSize(18f);

    stateProgressBar.setCurrentStateDescriptionColor(ContextCompat.getColor(this, R.color.description_foreground_color));
    stateProgressBar.setStateDescriptionColor(ContextCompat.getColor(this,  R.color.description_background_color));





### EXTRA DEMOS(WITH CODES)

 - A Two-State StateProgressBar

 ![alt tag](https://raw.githubusercontent.com/kofigyan/StateProgressBar/master/screenshots/two_state_spb.png)

```
<com.kofigyan.stateprogressbar.StateProgressBar
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  app:spb_currentStateNumber="one"
  app:spb_maxStateNumber="two"/>

```


 - A Three-State StateProgressBar

  ![alt tag](https://raw.githubusercontent.com/kofigyan/StateProgressBar/master/screenshots/three_state_spb.png)

```
  <com.kofigyan.stateprogressbar.StateProgressBar
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  app:spb_currentStateNumber="two"
  app:spb_maxStateNumber="three"/>

  ```


  -  A Four-State StateProgressBar

  ![alt tag](https://raw.githubusercontent.com/kofigyan/StateProgressBar/master/screenshots/four_state_spb.png)

```
   <com.kofigyan.stateprogressbar.StateProgressBar
   android:layout_width="wrap_content"
   android:layout_height="wrap_content"
   app:spb_currentStateNumber="three"
   app:spb_maxStateNumber="four"/>

```

  -  Check States Completed

  ![alt tag](https://raw.githubusercontent.com/kofigyan/StateProgressBar/master/screenshots/check_states_completed.png)

```
   <com.kofigyan.stateprogressbar.StateProgressBar
   android:layout_width="wrap_content"
   android:layout_height="wrap_content"
   app:spb_currentStateNumber="three"
   app:spb_maxStateNumber="four"
   app:spb_checkStateCompleted="true"/>

 ```



  - Check All States

 ![alt tag](https://raw.githubusercontent.com/kofigyan/StateProgressBar/master/screenshots/check_all_states.png)

  ```
         <com.kofigyan.stateprogressbar.StateProgressBar
         android:layout_width="wrap_content"
         android:layout_height="wrap_content"
         app:spb_currentStateNumber="three"
         app:spb_maxStateNumber="four"
         app:spb_enableAllStatesCompleted="true"/>

  ```

  - Animate To Current State

 ![alt tag](https://raw.githubusercontent.com/kofigyan/StateProgressBar/master/screenshots/anim_to_current.gif)

 ```
     <com.kofigyan.stateprogressbar.StateProgressBar
         android:layout_width="wrap_content"
         android:layout_height="wrap_content"
         app:spb_currentStateNumber="three"
         app:spb_maxStateNumber="four"
         app:spb_stateBackgroundColor="#BDBDBD"
         app:spb_stateForegroundColor="#DB0082"
         app:spb_stateNumberBackgroundColor="#808080"
         app:spb_stateNumberForegroundColor="#eeeeee"
         app:spb_currentStateDescriptionColor="#DB0082"
         app:spb_stateDescriptionColor="#808080"
         app:spb_animateToCurrentProgressState="true"
         app:spb_checkStateCompleted="true"/>       
```


- Add Description Data to StateProgressBar

 ![alt tag](https://raw.githubusercontent.com/kofigyan/StateProgressBar/master/screenshots/add_description_data.png)

```
 <com.kofigyan.stateprogressbar.StateProgressBar
 android:id="@+id/your_state_progress_bar_id"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 app:spb_currentStateNumber="two"
 app:spb_maxStateNumber="four"/>

String[] descriptionData = {"Details", "Status", "Photo", "Confirm"};

@Override
protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.your_layout);

 StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.your_state_progress_bar_id);
 stateProgressBar.setStateDescriptionData(descriptionData);

}

```


- Change Dimensions (State,State Number ,State Line and State Description sizes)

 ![alt tag](https://raw.githubusercontent.com/kofigyan/StateProgressBar/master/screenshots/state_dimension_change.png)

 ```
<com.kofigyan.stateprogressbar.StateProgressBar
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 app:spb_descriptionTopSpaceIncrementer="2dp"
 app:spb_stateDescriptionSize="20sp"
 app:spb_stateLineThickness="10dp"
 app:spb_stateSize="40dp"
 app:spb_stateTextSize="15sp" />

```




- Change Colors(State background ,foreground, state number background ,state number foreground, current state description, state description )

![alt tag](https://raw.githubusercontent.com/kofigyan/StateProgressBar/master/screenshots/state_color_change.png)

```
<com.kofigyan.stateprogressbar.StateProgressBar
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
 app:spb_checkStateCompleted="true"/>

```
