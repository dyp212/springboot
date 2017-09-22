package com.test.spring.boot.entity;

import java.util.Date;

public class PgtOutboundNotice {
    private Long outboundNoticeId;

    private String outboundNoticeCode;

    private String storeSn;

    private String storeName;

    private Byte billType;

    private String purchaseCode;

    private Long purchaseDetailId;

    private Date preSendTime;

    private Date sendTime;

    private Byte status;

    private String createby;

    private Date createTime;

    private String updateby;

    private Date updateTime;

    public Long getOutboundNoticeId() {
        return outboundNoticeId;
    }

    public void setOutboundNoticeId(Long outboundNoticeId) {
        this.outboundNoticeId = outboundNoticeId;
    }

    public String getOutboundNoticeCode() {
        return outboundNoticeCode;
    }

    public void setOutboundNoticeCode(String outboundNoticeCode) {
        this.outboundNoticeCode = outboundNoticeCode == null ? null : outboundNoticeCode.trim();
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

    public Byte getBillType() {
        return billType;
    }

    public void setBillType(Byte billType) {
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

    public Date getPreSendTime() {
        return preSendTime;
    }

    public void setPreSendTime(Date preSendTime) {
        this.preSendTime = preSendTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
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