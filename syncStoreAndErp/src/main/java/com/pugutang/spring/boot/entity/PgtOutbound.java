package com.pugutang.spring.boot.entity;

import java.util.Date;

public class PgtOutbound {
    private Long outBoundId;

    private String outBoundCode;

    private Byte type;

    private String purchaseCode;

    private Long purchaseDetailId;

    private String outboundNoticeCode;

    private Long outboundNoticeDetailId;

    private Date businessTime;

    private String storeSn;

    private String storeName;

    private Byte status;

    private String createby;

    private Date createTime;

    private String updateby;

    private Date updateTime;

    public Long getOutBoundId() {
        return outBoundId;
    }

    public void setOutBoundId(Long outBoundId) {
        this.outBoundId = outBoundId;
    }

    public String getOutBoundCode() {
        return outBoundCode;
    }

    public void setOutBoundCode(String outBoundCode) {
        this.outBoundCode = outBoundCode == null ? null : outBoundCode.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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

    public String getOutboundNoticeCode() {
        return outboundNoticeCode;
    }

    public void setOutboundNoticeCode(String outboundNoticeCode) {
        this.outboundNoticeCode = outboundNoticeCode == null ? null : outboundNoticeCode.trim();
    }

    public Long getOutboundNoticeDetailId() {
        return outboundNoticeDetailId;
    }

    public void setOutboundNoticeDetailId(Long outboundNoticeDetailId) {
        this.outboundNoticeDetailId = outboundNoticeDetailId;
    }

    public Date getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(Date businessTime) {
        this.businessTime = businessTime;
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