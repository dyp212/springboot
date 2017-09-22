package com.test.spring.boot.entity;

import java.util.Date;

public class PgtOutboundDetail {
    private Long outboundDetailId;

    private String outboundCode;

    private String purchaseCode;

    private Long purchaseDetailId;

    private String outboundNoticeCode;

    private Long outboundNoticeDetailId;

    private Integer skuId;

    private String skuName;

    private String skuEncode;

    private String spec;

    private Integer quantity;

    private Byte status;

    private String createby;

    private Date createTime;

    private String updateby;

    private Date updateTime;

    public Long getOutboundDetailId() {
        return outboundDetailId;
    }

    public void setOutboundDetailId(Long outboundDetailId) {
        this.outboundDetailId = outboundDetailId;
    }

    public String getOutboundCode() {
        return outboundCode;
    }

    public void setOutboundCode(String outboundCode) {
        this.outboundCode = outboundCode == null ? null : outboundCode.trim();
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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