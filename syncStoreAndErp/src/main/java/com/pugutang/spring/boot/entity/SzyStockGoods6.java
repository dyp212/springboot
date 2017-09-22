package com.pugutang.spring.boot.entity;

import java.math.BigDecimal;

public class SzyStockGoods6 {
    private Integer stockId;

    private Integer storeId;

    private Integer goodsId;

    private Integer skuId;

    private Double minNumberWarn;

    private Double maxNumberWarn;

    private Double goodsNumber;

    private Double firstGoodsNumber;

    private BigDecimal unitCost;

    private Boolean isDeleted;

    private Integer adminId;

    private String stockRemark;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Double getMinNumberWarn() {
        return minNumberWarn;
    }

    public void setMinNumberWarn(Double minNumberWarn) {
        this.minNumberWarn = minNumberWarn;
    }

    public Double getMaxNumberWarn() {
        return maxNumberWarn;
    }

    public void setMaxNumberWarn(Double maxNumberWarn) {
        this.maxNumberWarn = maxNumberWarn;
    }

    public Double getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Double goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Double getFirstGoodsNumber() {
        return firstGoodsNumber;
    }

    public void setFirstGoodsNumber(Double firstGoodsNumber) {
        this.firstGoodsNumber = firstGoodsNumber;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getStockRemark() {
        return stockRemark;
    }

    public void setStockRemark(String stockRemark) {
        this.stockRemark = stockRemark == null ? null : stockRemark.trim();
    }
}