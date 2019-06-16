package com.gfg.varunchhabra16.RESTDemo.model;

public class User {

    public String userName;
    public String lastName;
    public Long id;


    public User(String userName, String lastName, Long id) {
        this.userName = userName;
        this.lastName = lastName;
        this.id = id;
    }

    public User(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
