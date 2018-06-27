package com.starkindustries.pojo;

public class Shipping {
    private String test;

    public Shipping(String test) {
        this.test = test;
    }

    public Shipping() {
        super();
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }
}