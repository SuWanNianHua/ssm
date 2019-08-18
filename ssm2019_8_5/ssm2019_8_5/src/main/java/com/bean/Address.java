package com.bean;

import javax.persistence.Id;

public class Address {
	@Id
    private Integer id;

    private String city;

    private Integer myorderid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getMyorderid() {
        return myorderid;
    }

    public void setMyorderid(Integer myorderid) {
        this.myorderid = myorderid;
    }
}