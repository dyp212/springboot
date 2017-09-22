package com.pugutang.spring.boot.entity;

import java.math.BigDecimal;

public class GoodsSkuDo {
    private Integer sku_id;

    private String sku_name;

    private String sku_image;

    private Integer goods_id;

    private String spec_ids;

    private String spec_vids;

    private String spec_names;

    private BigDecimal goods_price;

    private BigDecimal mobile_price;

    private BigDecimal market_price;

    private Integer goods_number;

    private String goods_sn;

    private String goods_barcode;

    private Integer warn_number;

    private Boolean is_spu;

    private Boolean is_enable;

    private Integer goods_id_from_erp;

    private Integer sku_id_from_erp;

    public Integer getSku_id() {
        return sku_id;
    }

    public void setSku_id(Integer sku_id) {
        this.sku_id = sku_id;
    }

    public String getSku_name() {
        return sku_name;
    }

    public void setSku_name(String sku_name) {
        this.sku_name = sku_name == null ? null : sku_name.trim();
    }

    public String getSku_image() {
        return sku_image;
    }

    public void setSku_image(String sku_image) {
        this.sku_image = sku_image == null ? null : sku_image.trim();
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getSpec_ids() {
        return spec_ids;
    }

    public void setSpec_ids(String spec_ids) {
        this.spec_ids = spec_ids == null ? null : spec_ids.trim();
    }

    public String getSpec_vids() {
        return spec_vids;
    }

    public void setSpec_vids(String spec_vids) {
        this.spec_vids = spec_vids == null ? null : spec_vids.trim();
    }

    public String getSpec_names() {
        return spec_names;
    }

    public void setSpec_names(String spec_names) {
        this.spec_names = spec_names == null ? null : spec_names.trim();
    }

    public BigDecimal getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(BigDecimal goods_price) {
        this.goods_price = goods_price;
    }

    public BigDecimal getMobile_price() {
        return mobile_price;
    }

    public void setMobile_price(BigDecimal mobile_price) {
        this.mobile_price = mobile_price;
    }

    public BigDecimal getMarket_price() {
        return market_price;
    }

    public void setMarket_price(BigDecimal market_price) {
        this.market_price = market_price;
    }

    public Integer getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(Integer goods_number) {
        this.goods_number = goods_number;
    }

    public String getGoods_sn() {
        return goods_sn;
    }

    public void setGoods_sn(String goods_sn) {
        this.goods_sn = goods_sn == null ? null : goods_sn.trim();
    }

    public String getGoods_barcode() {
        return goods_barcode;
    }

    public void setGoods_barcode(String goods_barcode) {
        this.goods_barcode = goods_barcode == null ? null : goods_barcode.trim();
    }

    public Integer getWarn_number() {
        return warn_number;
    }

    public void setWarn_number(Integer warn_number) {
        this.warn_number = warn_number;
    }

    public Boolean getIs_spu() {
        return is_spu;
    }

    public void setIs_spu(Boolean is_spu) {
        this.is_spu = is_spu;
    }

    public Boolean getIs_enable() {
        return is_enable;
    }

    public void setIs_enable(Boolean is_enable) {
        this.is_enable = is_enable;
    }

    public Integer getGoods_id_from_erp() {
        return goods_id_from_erp;
    }

    public void setGoods_id_from_erp(Integer goods_id_from_erp) {
        this.goods_id_from_erp = goods_id_from_erp;
    }

    public Integer getSku_id_from_erp() {
        return sku_id_from_erp;
    }

    public void setSku_id_from_erp(Integer sku_id_from_erp) {
        this.sku_id_from_erp = sku_id_from_erp;
    }
}