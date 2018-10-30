package com.example.user.uts3cyahya.FungsiClass;

/**
 * Created by user on 23/10/2018.
 */

public class PostImage {
    private String idUser;
    private String caption;
    private String likes;
    private int ImagePost,ImageProfile;

    public PostImage(String idUser, String caption, String likes, int imagePost) {
        this.idUser = idUser;
        this.caption = caption;
        this.likes = likes;
        ImagePost = imagePost;
    }

    public PostImage(String idUser, String caption, String likes, int imagePost, int imageProfile) {
        this.idUser = idUser;
        this.caption = caption;
        this.likes = likes;
        ImagePost = imagePost;
        ImageProfile = imageProfile;
    }

    public int getImageProfile() {
        return ImageProfile;
    }

    public void setImageProfile(int imageProfile) {
        ImageProfile = imageProfile;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public PostImage(String idUser, String caption, String likes) {
        this.idUser = idUser;
        this.caption = caption;
        this.likes = likes;
    }

    public PostImage(String idUser, String caption) {
        this.idUser = idUser;
        this.caption = caption;
    }

    public int getImagePost() {
        return ImagePost;
    }

    public void setImagePost(int imagePost) {
        ImagePost = imagePost;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
