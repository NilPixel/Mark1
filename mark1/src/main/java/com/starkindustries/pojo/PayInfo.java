package com.starkindustries.pojo;

import java.util.Date;

public class PayInfo {
    private Byte id;

    private Byte userid;

    private Integer orderno;

    private Byte payplatform;

    private String platformnumber;

    private String platformstatus;

    private Date createtime;

    private Date updatetime;

    public PayInfo(Byte id, Byte userid, Integer orderno, Byte payplatform, String platformnumber, String platformstatus, Date createtime, Date updatetime) {
        this.id = id;
        this.userid = userid;
        this.orderno = orderno;
        this.payplatform = payplatform;
        this.platformnumber = platformnumber;
        this.platformstatus = platformstatus;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public PayInfo() {
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

    public Byte getPayplatform() {
        return payplatform;
    }

    public void setPayplatform(Byte payplatform) {
        this.payplatform = payplatform;
    }

    public String getPlatformnumber() {
        return platformnumber;
    }

    public void setPlatformnumber(String platformnumber) {
        this.platformnumber = platformnumber == null ? null : platformnumber.trim();
    }

    public String getPlatformstatus() {
        return platformstatus;
    }

    public void setPlatformstatus(String platformstatus) {
        this.platformstatus = platformstatus == null ? null : platformstatus.trim();
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