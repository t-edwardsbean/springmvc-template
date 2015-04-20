package com.springapp.model;

/**
 * Created by edwardsbean on 2015/4/18 0018.
 */
public class User {
    private String username;
    private String msg;

    public User(String username, String msg) {
        this.username = username;
        this.msg = msg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
