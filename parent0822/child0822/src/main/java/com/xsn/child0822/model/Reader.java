package com.xsn.child0822.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Reader {
    private String name;
    private int id;
//    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
