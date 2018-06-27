package com.starkindustries.pojo;

public class OrderItem {
    private String test;

    public OrderItem(String test) {
        this.test = test;
    }

    public OrderItem() {
        super();
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }
}