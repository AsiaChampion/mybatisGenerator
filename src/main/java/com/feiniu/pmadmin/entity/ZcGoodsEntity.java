package com.feiniu.pmadmin.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ZcGoodsEntity {

    private Integer id;

    private String skuCode;

    private String skuName;

    private String storeId;

    private BigDecimal skuPrice;

    private BigDecimal memberPrice;

    private BigDecimal cost;

    private Date insDt;

    private Date modDt;

    private String insUsrSeq;

    private String modUsrSeq;

    private BigDecimal flag;

    private BigDecimal buyVat;

    private BigDecimal isConsistent;

    private String errorMsg;

    private BigDecimal isFresh;

    private Short sellVat;

    private BigDecimal suspendSell;

    private Short rtStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Date getInsDt() {
        return insDt;
    }

    public void setInsDt(Date insDt) {
        this.insDt = insDt;
    }

    public Date getModDt() {
        return modDt;
    }

    public void setModDt(Date modDt) {
        this.modDt = modDt;
    }

    public String getInsUsrSeq() {
        return insUsrSeq;
    }

    public void setInsUsrSeq(String insUsrSeq) {
        this.insUsrSeq = insUsrSeq;
    }

    public String getModUsrSeq() {
        return modUsrSeq;
    }

    public void setModUsrSeq(String modUsrSeq) {
        this.modUsrSeq = modUsrSeq;
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
    }

    public BigDecimal getBuyVat() {
        return buyVat;
    }

    public void setBuyVat(BigDecimal buyVat) {
        this.buyVat = buyVat;
    }

    public BigDecimal getIsConsistent() {
        return isConsistent;
    }

    public void setIsConsistent(BigDecimal isConsistent) {
        this.isConsistent = isConsistent;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public BigDecimal getIsFresh() {
        return isFresh;
    }

    public void setIsFresh(BigDecimal isFresh) {
        this.isFresh = isFresh;
    }

    public Short getSellVat() {
        return sellVat;
    }

    public void setSellVat(Short sellVat) {
        this.sellVat = sellVat;
    }

    public BigDecimal getSuspendSell() {
        return suspendSell;
    }

    public void setSuspendSell(BigDecimal suspendSell) {
        this.suspendSell = suspendSell;
    }

    public Short getRtStatus() {
        return rtStatus;
    }

    public void setRtStatus(Short rtStatus) {
        this.rtStatus = rtStatus;
    }
}