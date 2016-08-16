package com.kofigyan.stateprogressbarsample.not_stateprogressbar.pojo;

/**
 * Created by Kofi Gyan on 7/12/2016.
 */

public class ApiFeature {

    private String title;
    private String description;

    public ApiFeature() {
    }

    public ApiFeature(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
