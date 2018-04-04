package com.feiniu.pmadmin.entity;

import java.util.Date;

public class StoreItemSuspendSellLogEntity {
    private Integer id;

    private String seqNo;

    private String skuCode;

    private String storeId;

    private String lifeStatus;

    private String suspendSell;

    private String workDate;

    private Byte status;

    private String msg;

    private String insUsrSeq;

    private Date insDt;

    private String modUsrSeq;

    private Date modDt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getLifeStatus() {
        return lifeStatus;
    }

    public void setLifeStatus(String lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    public String getSuspendSell() {
        return suspendSell;
    }

    public void setSuspendSell(String suspendSell) {
        this.suspendSell = suspendSell;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getInsUsrSeq() {
        return insUsrSeq;
    }

    public void setInsUsrSeq(String insUsrSeq) {
        this.insUsrSeq = insUsrSeq;
    }

    public Date getInsDt() {
        return insDt;
    }

    public void setInsDt(Date insDt) {
        this.insDt = insDt;
    }

    public String getModUsrSeq() {
        return modUsrSeq;
    }

    public void setModUsrSeq(String modUsrSeq) {
        this.modUsrSeq = modUsrSeq;
    }

    public Date getModDt() {
        return modDt;
    }

    public void setModDt(Date modDt) {
        this.modDt = modDt;
    }
}