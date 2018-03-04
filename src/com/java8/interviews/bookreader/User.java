package com.java8.interviews.bookreader;

/**
 * Created by Pavithra Sachidananda on 1/6/18.
 */
public class User {

    private long userId;

    private String userName;

    private String details;

    public User(long id, String name, String details) {
        this.userId = id;
        this.userName = name;
        this.details = details;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
