package com.starkindustries.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Byte id;

    private String detail;

    private String subImages;

    private Byte categoryid;

    private String name;

    private String subtitle;

    private String mainimage;

    private BigDecimal price;

    private Byte stock;

    private Byte status;

    private Date createtime;

    private Date updatetime;

    public Product(Byte id, String detail, String subImages, Byte categoryid, String name, String subtitle, String mainimage, BigDecimal price, Byte stock, Byte status, Date createtime, Date updatetime) {
        this.id = id;
        this.detail = detail;
        this.subImages = subImages;
        this.categoryid = categoryid;
        this.name = name;
        this.subtitle = subtitle;
        this.mainimage = mainimage;
        this.price = price;
        this.stock = stock;
        this.status = status;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public Product() {
        super();
    }

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
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

    public Byte getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Byte categoryid) {
        this.categoryid = categoryid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    public String getMainimage() {
        return mainimage;
    }

    public void setMainimage(String mainimage) {
        this.mainimage = mainimage == null ? null : mainimage.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getStock() {
        return stock;
    }

    public void setStock(Byte stock) {
        this.stock = stock;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}