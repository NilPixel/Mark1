package com.starkindustries.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderItem {
    private Byte id;

    private Byte userid;

    private Integer orderno;

    private Byte productid;

    private String productname;

    private String productimage;

    private BigDecimal currentunitprice;

    private Byte quantity;

    private BigDecimal totalprice;

    private Date createtime;

    private Date updatetime;

    public OrderItem(Byte id, Byte userid, Integer orderno, Byte productid, String productname, String productimage, BigDecimal currentunitprice, Byte quantity, BigDecimal totalprice, Date createtime, Date updatetime) {
        this.id = id;
        this.userid = userid;
        this.orderno = orderno;
        this.productid = productid;
        this.productname = productname;
        this.productimage = productimage;
        this.currentunitprice = currentunitprice;
        this.quantity = quantity;
        this.totalprice = totalprice;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public OrderItem() {
        super();
    }

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Byte getUserid() {
        return userid;
    }

    public void setUserid(Byte userid) {
        this.userid = userid;
    }

    public Integer getOrderno() {
        return orderno;
    }

    public void setOrderno(Integer orderno) {
        this.orderno = orderno;
    }

    public Byte getProductid() {
        return productid;
    }

    public void setProductid(Byte productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProductimage() {
        return productimage;
    }

    public void setProductimage(String productimage) {
        this.productimage = productimage == null ? null : productimage.trim();
    }

    public BigDecimal getCurrentunitprice() {
        return currentunitprice;
    }

    public void setCurrentunitprice(BigDecimal currentunitprice) {
        this.currentunitprice = currentunitprice;
    }

    public Byte getQuantity() {
        return quantity;
    }

    public void setQuantity(Byte quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
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