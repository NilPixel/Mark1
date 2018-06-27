package com.starkindustries.pojo;

public class PayInfo {
    private String test;

    public PayInfo(String test) {
        this.test = test;
    }

    public PayInfo() {
        super();
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test == null ? null : test.trim();
    }
}