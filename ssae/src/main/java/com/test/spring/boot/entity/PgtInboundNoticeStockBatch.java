package com.test.spring.boot.entity;

public class PgtInboundNoticeStockBatch {
    private Integer inboundNoticeStockBatchId;

    private String inboundNoticeCode;

    private Long noticeDetailId;

    private Integer skuId;

    private String skuName;

    private String skuEncode;

    private String batchCode;

    private Double quantity;

    private String spec;

    private String unitName;

    public Integer getInboundNoticeStockBatchId() {
        return inboundNoticeStockBatchId;
    }

    public void setInboundNoticeStockBatchId(Integer inboundNoticeStockBatchId) {
        this.inboundNoticeStockBatchId = inboundNoticeStockBatchId;
    }

    public String getInboundNoticeCode() {
        return inboundNoticeCode;
    }

    public void setInboundNoticeCode(String inboundNoticeCode) {
        this.inboundNoticeCode = inboundNoticeCode == null ? null : inboundNoticeCode.trim();
    }

    public Long getNoticeDetailId() {
        return noticeDetailId;
    }

    public void setNoticeDetailId(Long noticeDetailId) {
        this.noticeDetailId = noticeDetailId;
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

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode == null ? null : batchCode.trim();
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName == null ? null : unitName.trim();
    }
}