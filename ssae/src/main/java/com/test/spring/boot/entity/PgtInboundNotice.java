package com.test.spring.boot.entity;

import java.util.Date;

public class PgtInboundNotice {
    private Long inboundNoticeId;

    private String inboundNoticeCode;

    private Integer billType;

    private String purchaseCode;

    private Long purchaseDetailId;

    private Date preArrivalTime;

    private Date arrivalTime;

    private String storeSn;

    private String storeName;

    private Byte status;

    private String createby;

    private Date createTime;

    private String updateby;

    private Date updateTime;

    public Long getInboundNoticeId() {
        return inboundNoticeId;
    }

    public void setInboundNoticeId(Long inboundNoticeId) {
        this.inboundNoticeId = inboundNoticeId;
    }

    public String getInboundNoticeCode() {
        return inboundNoticeCode;
    }

    public void setInboundNoticeCode(String inboundNoticeCode) {
        this.inboundNoticeCode = inboundNoticeCode == null ? null : inboundNoticeCode.trim();
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
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

    public Date getPreArrivalTime() {
        return preArrivalTime;
    }

    public void setPreArrivalTime(Date preArrivalTime) {
        this.preArrivalTime = preArrivalTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getStoreSn() {
        return storeSn;
    }

    public void setStoreSn(String storeSn) {
        this.storeSn = storeSn == null ? null : storeSn.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
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
}