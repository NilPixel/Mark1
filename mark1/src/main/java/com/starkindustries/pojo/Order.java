package com.starkindustries.pojo;

public class Order {
    private String test;

    public Order(String test) {
        this.test = test;
    }

    public Order() {
        super();
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }
}