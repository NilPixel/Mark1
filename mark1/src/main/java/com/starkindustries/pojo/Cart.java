package com.starkindustries.pojo;

import java.util.Date;

public class Cart {
    private Byte id;

    private Byte userid;

    private Byte productid;

    private Byte quantity;

    private Byte checked;

    private Date createtime;

    private Date updatetime;

    public Cart(Byte id, Byte userid, Byte productid, Byte quantity, Byte checked, Date createtime, Date updatetime) {
        this.id = id;
        this.userid = userid;
        this.productid = productid;
        this.quantity = quantity;
        this.checked = checked;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public Cart() {
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

    public Byte getProductid() {
        return productid;
    }

    public void setProductid(Byte productid) {
        this.productid = productid;
    }

    public Byte getQuantity() {
        return quantity;
    }

    public void setQuantity(Byte quantity) {
        this.quantity = quantity;
    }

    public Byte getChecked() {
        return checked;
    }

    public void setChecked(Byte checked) {
        this.checked = checked;
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