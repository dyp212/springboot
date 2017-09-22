package com.test.spring.boot.entity;

import java.util.Date;

public class PgtOutboundNoticeDetail {
    private Long outboundNoticeDetailId;

    private String outboundNoticeCode;

    private String purchaseCode;

    private Long purchaseDetailId;

    private Integer skuId;

    private String skuName;

    private String skuEncode;

    private String spec;

    private Integer preSendQuantity;

    private Integer sendQuantity;

    private Byte status;

    private String createby;

    private Date createTime;

    private String updateby;

    private Date updateTime;

    public Long getOutboundNoticeDetailId() {
        return outboundNoticeDetailId;
    }

    public void setOutboundNoticeDetailId(Long outboundNoticeDetailId) {
        this.outboundNoticeDetailId = outboundNoticeDetailId;
    }

    public String getOutboundNoticeCode() {
        return outboundNoticeCode;
    }

    public void setOutboundNoticeCode(String outboundNoticeCode) {
        this.outboundNoticeCode = outboundNoticeCode == null ? null : outboundNoticeCode.trim();
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

    public Integer getPreSendQuantity() {
        return preSendQuantity;
    }

    public void setPreSendQuantity(Integer preSendQuantity) {
        this.preSendQuantity = preSendQuantity;
    }

    public Integer getSendQuantity() {
        return sendQuantity;
    }

    public void setSendQuantity(Integer sendQuantity) {
        this.sendQuantity = sendQuantity;
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