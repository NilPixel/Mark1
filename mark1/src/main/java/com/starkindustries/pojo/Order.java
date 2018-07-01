package com.starkindustries.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Byte id;

    private Integer orderno;

    private Byte userid;

    private Byte shippingid;

    private BigDecimal payment;

    private Byte paymenttype;

    private Byte postage;

    private Byte status;

    private Date paymenttime;

    private Date sendtime;

    private Date endtime;

    private Date closetime;

    private Date createtime;

    private Date updatetime;

    public Order(Byte id, Integer orderno, Byte userid, Byte shippingid, BigDecimal payment, Byte paymenttype, Byte postage, Byte status, Date paymenttime, Date sendtime, Date endtime, Date closetime, Date createtime, Date updatetime) {
        this.id = id;
        this.orderno = orderno;
        this.userid = userid;
        this.shippingid = shippingid;
        this.payment = payment;
        this.paymenttype = paymenttype;
        this.postage = postage;
        this.status = status;
        this.paymenttime = paymenttime;
        this.sendtime = sendtime;
        this.endtime = endtime;
        this.closetime = closetime;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public Order() {
        super();
    }

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Integer getOrderno() {
        return orderno;
    }

    public void setOrderno(Integer orderno) {
        this.orderno = orderno;
    }

    public Byte getUserid() {
        return userid;
    }

    public void setUserid(Byte userid) {
        this.userid = userid;
    }

    public Byte getShippingid() {
        return shippingid;
    }

    public void setShippingid(Byte shippingid) {
        this.shippingid = shippingid;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public Byte getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(Byte paymenttype) {
        this.paymenttype = paymenttype;
    }

    public Byte getPostage() {
        return postage;
    }

    public void setPostage(Byte postage) {
        this.postage = postage;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(Date paymenttime) {
        this.paymenttime = paymenttime;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
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