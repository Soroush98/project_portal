package com.aut.Main;

/**
 * Created by zahra_ynp on 11/7/2017.
 */
public class Human {

    private String name;
    private String id;
    private long phoneNumber;
    private String email;
    private String userName;

    public Human(String name, String id, long phoneNumber, String email, String userName, String password) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;


    public String getName() {
        return name;
    }

    public Human setName(String name) {
        this.name = name;
        return this;
    }


    public String getEmail() {
        return email;
    }

    public Human setEmail(String email) {
        this.email = email;
        return this;
    }
}
