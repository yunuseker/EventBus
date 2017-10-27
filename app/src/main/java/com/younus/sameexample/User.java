package com.younus.sameexample;

/**
 * Created by younus on 17.10.2017.
 */

public class User {

    String username;
    String password;
    String lastLoginDate;

    public User(String username, String password, String lastLoginDate) {
        this.username = username;
        this.password = password;
        this.lastLoginDate = lastLoginDate;
    }
    public User(User user){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
