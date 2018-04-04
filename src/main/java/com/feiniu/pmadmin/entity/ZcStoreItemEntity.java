package com.feiniu.pmadmin.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ZcStoreItemEntity {
    private Integer id;

    private String skuCode;

    private String skuName;

    private String rtCategory;

    private String supplierNo;

    private String dcSupplierNo;

    private Boolean returnFlag;

    private Boolean isArtificalQuotation;

    private Boolean isDcItem;

    private Byte dcAttrValue;

    private Byte dspAttrValue;

    private Boolean isDcDelivery;

    private Boolean isSupplierDelivery;

    private Boolean lifeStatus;

    private Boolean dcLifeStatus;

    private BigDecimal suggestedPrice;

    private Integer minimum;

    private BigDecimal csRate;

    private BigDecimal purchasePrice;

    private BigDecimal normalPrice;

    private String promotNo;

    private Boolean promotLevel;

    private Boolean promotClass;

    private Boolean status;

    private Date insDt;

    private Date modDt;

    private String insUsrSeq;

    private String modUsrSeq;

    private String insUsrName;

    private String modUsrName;

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

    public String getRtCategory() {
        return rtCategory;
    }

    public void setRtCategory(String rtCategory) {
        this.rtCategory = rtCategory;
    }

    public String getSupplierNo() {
        return supplierNo;
    }

    public void setSupplierNo(String supplierNo) {
        this.supplierNo = supplierNo;
    }

    public String getDcSupplierNo() {
        return dcSupplierNo;
    }

    public void setDcSupplierNo(String dcSupplierNo) {
        this.dcSupplierNo = dcSupplierNo;
    }

    public Boolean getReturnFlag() {
        return returnFlag;
    }

    public void setReturnFlag(Boolean returnFlag) {
        this.returnFlag = returnFlag;
    }

    public Boolean getIsArtificalQuotation() {
        return isArtificalQuotation;
    }

    public void setIsArtificalQuotation(Boolean isArtificalQuotation) {
        this.isArtificalQuotation = isArtificalQuotation;
    }

    public Boolean getIsDcItem() {
        return isDcItem;
    }

    public void setIsDcItem(Boolean isDcItem) {
        this.isDcItem = isDcItem;
    }

    public Byte getDcAttrValue() {
        return dcAttrValue;
    }

    public void setDcAttrValue(Byte dcAttrValue) {
        this.dcAttrValue = dcAttrValue;
    }

    public Byte getDspAttrValue() {
        return dspAttrValue;
    }

    public void setDspAttrValue(Byte dspAttrValue) {
        this.dspAttrValue = dspAttrValue;
    }

    public Boolean getIsDcDelivery() {
        return isDcDelivery;
    }

    public void setIsDcDelivery(Boolean isDcDelivery) {
        this.isDcDelivery = isDcDelivery;
    }

    public Boolean getIsSupplierDelivery() {
        return isSupplierDelivery;
    }

    public void setIsSupplierDelivery(Boolean isSupplierDelivery) {
        this.isSupplierDelivery = isSupplierDelivery;
    }

    public Boolean getLifeStatus() {
        return lifeStatus;
    }

    public void setLifeStatus(Boolean lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    public Boolean getDcLifeStatus() {
        return dcLifeStatus;
    }

    public void setDcLifeStatus(Boolean dcLifeStatus) {
        this.dcLifeStatus = dcLifeStatus;
    }

    public BigDecimal getSuggestedPrice() {
        return suggestedPrice;
    }

    public void setSuggestedPrice(BigDecimal suggestedPrice) {
        this.suggestedPrice = suggestedPrice;
    }

    public Integer getMinimum() {
        return minimum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    public BigDecimal getCsRate() {
        return csRate;
    }

    public void setCsRate(BigDecimal csRate) {
        this.csRate = csRate;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(BigDecimal normalPrice) {
        this.normalPrice = normalPrice;
    }

    public String getPromotNo() {
        return promotNo;
    }

    public void setPromotNo(String promotNo) {
        this.promotNo = promotNo;
    }

    public Boolean getPromotLevel() {
        return promotLevel;
    }

    public void setPromotLevel(Boolean promotLevel) {
        this.promotLevel = promotLevel;
    }

    public Boolean getPromotClass() {
        return promotClass;
    }

    public void setPromotClass(Boolean promotClass) {
        this.promotClass = promotClass;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
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

    public String getInsUsrName() {
        return insUsrName;
    }

    public void setInsUsrName(String insUsrName) {
        this.insUsrName = insUsrName;
    }

    public String getModUsrName() {
        return modUsrName;
    }

    public void setModUsrName(String modUsrName) {
        this.modUsrName = modUsrName;
    }
}