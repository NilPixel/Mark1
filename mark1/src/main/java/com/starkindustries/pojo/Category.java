package com.starkindustries.pojo;

public class Category {
    private String test;

    public Category(String test) {
        this.test = test;
    }

    public Category() {
        super();
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }
}