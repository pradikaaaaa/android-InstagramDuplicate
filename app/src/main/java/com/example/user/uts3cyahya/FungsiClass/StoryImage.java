package com.example.user.uts3cyahya.FungsiClass;

/**
 * Created by user on 30/10/2018.
 */

public class StoryImage {
    private Integer imagePP;
    private String username;

    public StoryImage(Integer imagePP, String username) {
        this.imagePP = imagePP;
        this.username = username;
    }

    public Integer getImagePP() {
        return imagePP;
    }

    public void setImagePP(Integer imagePP) {
        this.imagePP = imagePP;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
