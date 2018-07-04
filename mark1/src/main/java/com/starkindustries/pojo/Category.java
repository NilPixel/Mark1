package com.starkindustries.pojo;

import java.util.Date;

public class Category {
    private Integer id;

    private Integer parentid;

    private String name;

    private byte[] status;

    private Integer sortorder;

    private Date createtime;

    private Date updatetime;

    public Category(Integer id, Integer parentid, String name, byte[] status, Integer sortorder, Date createtime, Date updatetime) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
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

    public Integer getSortorder() {
        return sortorder;
    }

    public void setSortorder(Integer sortorder) {
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