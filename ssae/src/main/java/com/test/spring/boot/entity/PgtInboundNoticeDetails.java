package com.test.spring.boot.entity;

import java.util.Date;

public class PgtInboundNoticeDetails {
    private Long noticeDetailId;

    private String inboundCode;

    private String purchaseCode;

    private Long purchaseDetailId;

    private Integer skuId;

    private String skuName;

    private String skuEncode;

    private String spec;

    private Integer preArrivalQuantity;

    private Integer goodQuantity;

    private Integer badQuantity;

    private Byte badDealType;

    private Byte qualityStatus;

    private Date qualityTime;

    private Long qualityId;

    private Byte status;

    private String createby;

    private Date createTime;

    private String updateby;

    private Date updateTime;

    private String batchCode;

    public Long getNoticeDetailId() {
        return noticeDetailId;
    }

    public void setNoticeDetailId(Long noticeDetailId) {
        this.noticeDetailId = noticeDetailId;
    }

    public String getInboundCode() {
        return inboundCode;
    }

    public void setInboundCode(String inboundCode) {
        this.inboundCode = inboundCode == null ? null : inboundCode.trim();
    }

    public String getPurchaseCode() {
        return purchaseCode;
    }

    public void setPurchaseCode(String purchaseCode) {
        this.purchaseCode = purchaseCode == null ? null : purchaseCode.trim();
    }

    public Long getPurchaseDetailId() {
        return purchaseDetailId;
    }

    public void setPurchaseDetailId(Long purchaseDetailId) {
        this.purchaseDetailId = purchaseDetailId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    public String getSkuEncode() {
        return skuEncode;
    }

    public void setSkuEncode(String skuEncode) {
        this.skuEncode = skuEncode == null ? null : skuEncode.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public Integer getPreArrivalQuantity() {
        return preArrivalQuantity;
    }

    public void setPreArrivalQuantity(Integer preArrivalQuantity) {
        this.preArrivalQuantity = preArrivalQuantity;
    }

    public Integer getGoodQuantity() {
        return goodQuantity;
    }

    public void setGoodQuantity(Integer goodQuantity) {
        this.goodQuantity = goodQuantity;
    }

    public Integer getBadQuantity() {
        return badQuantity;
    }

    public void setBadQuantity(Integer badQuantity) {
        this.badQuantity = badQuantity;
    }

    public Byte getBadDealType() {
        return badDealType;
    }

    public void setBadDealType(Byte badDealType) {
        this.badDealType = badDealType;
    }

    public Byte getQualityStatus() {
        return qualityStatus;
    }

    public void setQualityStatus(Byte qualityStatus) {
        this.qualityStatus = qualityStatus;
    }

    public Date getQualityTime() {
        return qualityTime;
    }

    public void setQualityTime(Date qualityTime) {
        this.qualityTime = qualityTime;
    }

    public Long getQualityId() {
        return qualityId;
    }

    public void setQualityId(Long qualityId) {
        this.qualityId = qualityId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode == null ? null : batchCode.trim();
    }
}