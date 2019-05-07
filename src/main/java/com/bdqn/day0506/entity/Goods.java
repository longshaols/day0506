package com.bdqn.day0506.entity;

import java.util.Date;

public class Goods {
    /**
    * 
    */
    private int id;

    /**
    * 
    */
    private String goodsname;

    /**
    * 0-待处理1-处理中2-已处理
    */
    private Integer billstatus;

    /**
    * 
    */
    private Integer goodsdistrict;

    /**
    * 
    */
    private Double goodsprice;

    /**
    * 
    */
    private Long goodscount;

    /**
    * 
    */
    private String creationtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Integer getBillstatus() {
        return billstatus;
    }

    public void setBillstatus(Integer billstatus) {
        this.billstatus = billstatus;
    }

    public Integer getGoodsdistrict() {
        return goodsdistrict;
    }

    public void setGoodsdistrict(Integer goodsdistrict) {
        this.goodsdistrict = goodsdistrict;
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Long getGoodscount() {
        return goodscount;
    }

    public void setGoodscount(Long goodscount) {
        this.goodscount = goodscount;
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime;
    }
}