package com.starkindustries.pojo;

import java.util.Date;

public class Category {
    private Byte id;

    private Byte parentid;

    private String name;

    private byte[] status;

    private Byte sortorder;

    private Date createtime;

    private Date updatetime;

    public Category(Byte id, Byte parentid, String name, byte[] status, Byte sortorder, Date createtime, Date updatetime) {
        this.id = id;
        this.parentid = parentid;
        this.name = name;
        this.status = status;
        this.sortorder = sortorder;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public Category() {
        super();
    }

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public Byte getParentid() {
        return parentid;
    }

    public void setParentid(Byte parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public byte[] getStatus() {
        return status;
    }

    public void setStatus(byte[] status) {
        this.status = status;
    }

    public Byte getSortorder() {
        return sortorder;
    }

    public void setSortorder(Byte sortorder) {
        this.sortorder = sortorder;
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