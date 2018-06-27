package com.starkindustries.pojo;

public class Cart {
    private String test;

    public Cart(String test) {
        this.test = test;
    }

    public Cart() {
        super();
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }
}