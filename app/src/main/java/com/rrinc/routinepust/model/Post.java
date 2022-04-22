package com.rrinc.routinepust.model;


public class Post {
    private String postId;
    private String name;
    private String imageURL;
    private String description;
    private String time;

    public Post() {
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Post(String postId, String name, String imageURL, String description, String time) {
        this.postId = postId;
        this.name = name;
        this.imageURL = imageURL;
        this.description = description;
        this.time = time;
    }


}
