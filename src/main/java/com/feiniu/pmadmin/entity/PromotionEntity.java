package com.feiniu.pmadmin.entity;

import java.util.Date;

public class PromotionEntity {
    private Short promotionNo;

    private Date beginDate;

    private Date endDate;

    private Date buyBeginDate;

    private Date buyEndDate;

    private String memo;

    private Short spStoreNo;

    public Short getPromotionNo() {
        return promotionNo;
    }

    public void setPromotionNo(Short promotionNo) {
        this.promotionNo = promotionNo;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getBuyBeginDate() {
        return buyBeginDate;
    }

    public void setBuyBeginDate(Date buyBeginDate) {
        this.buyBeginDate = buyBeginDate;
    }

    public Date getBuyEndDate() {
        return buyEndDate;
    }

    public void setBuyEndDate(Date buyEndDate) {
        this.buyEndDate = buyEndDate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Short getSpStoreNo() {
        return spStoreNo;
    }

    public void setSpStoreNo(Short spStoreNo) {
        this.spStoreNo = spStoreNo;
    }
}