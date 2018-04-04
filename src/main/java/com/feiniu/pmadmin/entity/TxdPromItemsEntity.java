package com.feiniu.pmadmin.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TxdPromItemsEntity {
    private Integer id;

    private Integer zcId;

    private String skuCode;

    private String promotNo;

    private Boolean promotClass;

    private Boolean promotLevel;

    private Boolean status;

    private String storeId;

    private BigDecimal promotPurchasePrice;

    private BigDecimal promotPrice;

    private BigDecimal promotSuggestPrice;

    private Date promotStartTime;

    private Date promotEndTime;

    private Date promotSuggestStartTime;

    private Date promotSuggestEndTime;

    private String memo;

    private Boolean payBalanceType;

    private BigDecimal payBalance;

    private Date insDt;

    private Date modDt;

    private String insUsrSeq;

    private String insUsrName;

    private String modUsrSeq;

    private String modUsrName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getZcId() {
        return zcId;
    }

    public void setZcId(Integer zcId) {
        this.zcId = zcId;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getPromotNo() {
        return promotNo;
    }

    public void setPromotNo(String promotNo) {
        this.promotNo = promotNo;
    }

    public Boolean getPromotClass() {
        return promotClass;
    }

    public void setPromotClass(Boolean promotClass) {
        this.promotClass = promotClass;
    }

    public Boolean getPromotLevel() {
        return promotLevel;
    }

    public void setPromotLevel(Boolean promotLevel) {
        this.promotLevel = promotLevel;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public BigDecimal getPromotPurchasePrice() {
        return promotPurchasePrice;
    }

    public void setPromotPurchasePrice(BigDecimal promotPurchasePrice) {
        this.promotPurchasePrice = promotPurchasePrice;
    }

    public BigDecimal getPromotPrice() {
        return promotPrice;
    }

    public void setPromotPrice(BigDecimal promotPrice) {
        this.promotPrice = promotPrice;
    }

    public BigDecimal getPromotSuggestPrice() {
        return promotSuggestPrice;
    }

    public void setPromotSuggestPrice(BigDecimal promotSuggestPrice) {
        this.promotSuggestPrice = promotSuggestPrice;
    }

    public Date getPromotStartTime() {
        return promotStartTime;
    }

    public void setPromotStartTime(Date promotStartTime) {
        this.promotStartTime = promotStartTime;
    }

    public Date getPromotEndTime() {
        return promotEndTime;
    }

    public void setPromotEndTime(Date promotEndTime) {
        this.promotEndTime = promotEndTime;
    }

    public Date getPromotSuggestStartTime() {
        return promotSuggestStartTime;
    }

    public void setPromotSuggestStartTime(Date promotSuggestStartTime) {
        this.promotSuggestStartTime = promotSuggestStartTime;
    }

    public Date getPromotSuggestEndTime() {
        return promotSuggestEndTime;
    }

    public void setPromotSuggestEndTime(Date promotSuggestEndTime) {
        this.promotSuggestEndTime = promotSuggestEndTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Boolean getPayBalanceType() {
        return payBalanceType;
    }

    public void setPayBalanceType(Boolean payBalanceType) {
        this.payBalanceType = payBalanceType;
    }

    public BigDecimal getPayBalance() {
        return payBalance;
    }

    public void setPayBalance(BigDecimal payBalance) {
        this.payBalance = payBalance;
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

    public String getInsUsrName() {
        return insUsrName;
    }

    public void setInsUsrName(String insUsrName) {
        this.insUsrName = insUsrName;
    }

    public String getModUsrSeq() {
        return modUsrSeq;
    }

    public void setModUsrSeq(String modUsrSeq) {
        this.modUsrSeq = modUsrSeq;
    }

    public String getModUsrName() {
        return modUsrName;
    }

    public void setModUsrName(String modUsrName) {
        this.modUsrName = modUsrName;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table txd_prom_items
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        zcId("zc_id"),
        skuCode("sku_code"),
        promotNo("promot_no"),
        promotClass("promot_class"),
        promotLevel("promot_level"),
        status("status"),
        storeId("store_id"),
        promotPurchasePrice("promot_purchase_price"),
        promotPrice("promot_price"),
        promotSuggestPrice("promot_suggest_price"),
        promotStartTime("promot_start_time"),
        promotEndTime("promot_end_time"),
        promotSuggestStartTime("promot_suggest_start_time"),
        promotSuggestEndTime("promot_suggest_end_time"),
        memo("memo"),
        payBalanceType("pay_balance_type"),
        payBalance("pay_balance"),
        insDt("ins_dt"),
        modDt("mod_dt"),
        insUsrSeq("ins_usr_seq"),
        insUsrName("ins_usr_name"),
        modUsrSeq("mod_usr_seq"),
        modUsrName("mod_usr_name");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table txd_prom_items
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table txd_prom_items
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table txd_prom_items
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table txd_prom_items
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table txd_prom_items
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table txd_prom_items
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}