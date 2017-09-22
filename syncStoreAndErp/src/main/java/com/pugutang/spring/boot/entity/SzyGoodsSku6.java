package com.pugutang.spring.boot.entity;

import java.math.BigDecimal;

public class SzyGoodsSku6 {
    private Integer skuId;

    private String skuName;

    private Integer goodsId;

    private String skuBarcode;

    private String skuEncode;

    private BigDecimal goodsPrice;

    private BigDecimal costPrice;

    private BigDecimal memberPrice;

    private BigDecimal wholesalePrice;

    private Boolean isEnable;

    private String skuImage;

    private Double minWarn;

    private String specIds;

    private String specVids;

    private Short discountRate;

    private Double goodsNumber;

    private Double transitNumber;

    private Integer adminId;

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

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getSkuBarcode() {
        return skuBarcode;
    }

    public void setSkuBarcode(String skuBarcode) {
        this.skuBarcode = skuBarcode == null ? null : skuBarcode.trim();
    }

    public String getSkuEncode() {
        return skuEncode;
    }

    public void setSkuEncode(String skuEncode) {
        this.skuEncode = skuEncode == null ? null : skuEncode.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    public BigDecimal getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(BigDecimal wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public String getSkuImage() {
        return skuImage;
    }

    public void setSkuImage(String skuImage) {
        this.skuImage = skuImage == null ? null : skuImage.trim();
    }

    public Double getMinWarn() {
        return minWarn;
    }

    public void setMinWarn(Double minWarn) {
        this.minWarn = minWarn;
    }

    public String getSpecIds() {
        return specIds;
    }

    public void setSpecIds(String specIds) {
        this.specIds = specIds == null ? null : specIds.trim();
    }

    public String getSpecVids() {
        return specVids;
    }

    public void setSpecVids(String specVids) {
        this.specVids = specVids == null ? null : specVids.trim();
    }

    public Short getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Short discountRate) {
        this.discountRate = discountRate;
    }

    public Double getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Double goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Double getTransitNumber() {
        return transitNumber;
    }

    public void setTransitNumber(Double transitNumber) {
        this.transitNumber = transitNumber;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
}