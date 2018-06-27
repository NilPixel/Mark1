package com.starkindustries.pojo;

public class User {
    private String test;

    public User(String test) {
        this.test = test;
    }

    public User() {
        super();
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }
}