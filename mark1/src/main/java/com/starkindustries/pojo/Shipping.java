package com.starkindustries.pojo;

import java.util.Date;

public class Shipping {
    private Byte id;

    private Byte userid;

    private String receivername;

    private String receiverphone;

    private String receivermobile;

    private String receiverprovince;

    private String receivercity;

    private String receiverdistrict;

    private String receiveraddress;

    private String receiverzip;

    private Date createtime;

    private Date updatetime;

    public Shipping(Byte id, Byte userid, String receivername, String receiverphone, String receivermobile, String receiverprovince, String receivercity, String receiverdistrict, String receiveraddress, String receiverzip, Date createtime, Date updatetime) {
        this.id = id;
        this.userid = userid;
        this.receivername = receivername;
        this.receiverphone = receiverphone;
        this.receivermobile = receivermobile;
        this.receiverprovince = receiverprovince;
        this.receivercity = receivercity;
        this.receiverdistrict = receiverdistrict;
        this.receiveraddress = receiveraddress;
        this.receiverzip = receiverzip;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public Shipping() {
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

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername == null ? null : receivername.trim();
    }

    public String getReceiverphone() {
        return receiverphone;
    }

    public void setReceiverphone(String receiverphone) {
        this.receiverphone = receiverphone == null ? null : receiverphone.trim();
    }

    public String getReceivermobile() {
        return receivermobile;
    }

    public void setReceivermobile(String receivermobile) {
        this.receivermobile = receivermobile == null ? null : receivermobile.trim();
    }

    public String getReceiverprovince() {
        return receiverprovince;
    }

    public void setReceiverprovince(String receiverprovince) {
        this.receiverprovince = receiverprovince == null ? null : receiverprovince.trim();
    }

    public String getReceivercity() {
        return receivercity;
    }

    public void setReceivercity(String receivercity) {
        this.receivercity = receivercity == null ? null : receivercity.trim();
    }

    public String getReceiverdistrict() {
        return receiverdistrict;
    }

    public void setReceiverdistrict(String receiverdistrict) {
        this.receiverdistrict = receiverdistrict == null ? null : receiverdistrict.trim();
    }

    public String getReceiveraddress() {
        return receiveraddress;
    }

    public void setReceiveraddress(String receiveraddress) {
        this.receiveraddress = receiveraddress == null ? null : receiveraddress.trim();
    }

    public String getReceiverzip() {
        return receiverzip;
    }

    public void setReceiverzip(String receiverzip) {
        this.receiverzip = receiverzip == null ? null : receiverzip.trim();
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