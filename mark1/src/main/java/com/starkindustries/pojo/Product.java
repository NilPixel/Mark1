package com.starkindustries.pojo;

public class Product {
    private String detail;

    private String subImages;

    public Product(String detail, String subImages) {
        this.detail = detail;
        this.subImages = subImages;
    }

    public Product() {
        super();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getSubImages() {
        return subImages;
    }

    public void setSubImages(String subImages) {
        this.subImages = subImages == null ? null : subImages.trim();
    }
}