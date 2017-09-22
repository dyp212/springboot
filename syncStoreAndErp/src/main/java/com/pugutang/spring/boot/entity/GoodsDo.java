package com.pugutang.spring.boot.entity;

import java.math.BigDecimal;

public class GoodsDo {
    private Integer goods_id;

    private String goods_name;

    private Integer cat_id;

    private Integer cat_id1;

    private Integer cat_id2;

    private Integer cat_id3;

    private Integer shop_id;

    private Boolean sku_open;

    private Integer sku_id;

    private String goods_subname;

    private BigDecimal goods_price;

    private BigDecimal market_price;

    private BigDecimal cost_price;

    private BigDecimal mobile_price;

    private Integer give_integral;

    private Integer goods_number;

    private Integer warn_number;

    private String goods_sn;

    private String goods_barcode;

    private String goods_image;

    private Integer brand_id;

    private Integer top_layout_id;

    private Integer bottom_layout_id;

    private Integer packing_layout_id;

    private Integer service_layout_id;

    private Integer click_count;

    private String keywords;

    private String goods_info;

    private Boolean invoice_type;

    private Boolean is_repair;

    private Boolean user_discount;

    private Boolean stock_mode;

    private Integer comment_num;

    private Integer sale_num;

    private Integer collect_num;

    private Boolean goods_audit;

    private Boolean goods_status;

    private String goods_reason;

    private Boolean is_delete;

    private Boolean is_virtual;

    private Boolean is_best;

    private Boolean is_new;

    private Boolean is_hot;

    private Boolean is_promote;

    private String contract_ids;

    private Integer supplier_id;

    private Integer freight_id;

    private String goods_volume;

    private String goods_weight;

    private String goods_remark;

    private Integer goods_sort;

    private Integer add_time;

    private Integer last_time;

    private Integer act_id;

    private Integer lib_cat_id;

    private Integer goods_id_from_erp;

    private Integer sku_id_from_erp;

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name == null ? null : goods_name.trim();
    }

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public Integer getCat_id1() {
        return cat_id1;
    }

    public void setCat_id1(Integer cat_id1) {
        this.cat_id1 = cat_id1;
    }

    public Integer getCat_id2() {
        return cat_id2;
    }

    public void setCat_id2(Integer cat_id2) {
        this.cat_id2 = cat_id2;
    }

    public Integer getCat_id3() {
        return cat_id3;
    }

    public void setCat_id3(Integer cat_id3) {
        this.cat_id3 = cat_id3;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public Boolean getSku_open() {
        return sku_open;
    }

    public void setSku_open(Boolean sku_open) {
        this.sku_open = sku_open;
    }

    public Integer getSku_id() {
        return sku_id;
    }

    public void setSku_id(Integer sku_id) {
        this.sku_id = sku_id;
    }

    public String getGoods_subname() {
        return goods_subname;
    }

    public void setGoods_subname(String goods_subname) {
        this.goods_subname = goods_subname == null ? null : goods_subname.trim();
    }

    public BigDecimal getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(BigDecimal goods_price) {
        this.goods_price = goods_price;
    }

    public BigDecimal getMarket_price() {
        return market_price;
    }

    public void setMarket_price(BigDecimal market_price) {
        this.market_price = market_price;
    }

    public BigDecimal getCost_price() {
        return cost_price;
    }

    public void setCost_price(BigDecimal cost_price) {
        this.cost_price = cost_price;
    }

    public BigDecimal getMobile_price() {
        return mobile_price;
    }

    public void setMobile_price(BigDecimal mobile_price) {
        this.mobile_price = mobile_price;
    }

    public Integer getGive_integral() {
        return give_integral;
    }

    public void setGive_integral(Integer give_integral) {
        this.give_integral = give_integral;
    }

    public Integer getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(Integer goods_number) {
        this.goods_number = goods_number;
    }

    public Integer getWarn_number() {
        return warn_number;
    }

    public void setWarn_number(Integer warn_number) {
        this.warn_number = warn_number;
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

    public String getGoods_image() {
        return goods_image;
    }

    public void setGoods_image(String goods_image) {
        this.goods_image = goods_image == null ? null : goods_image.trim();
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public Integer getTop_layout_id() {
        return top_layout_id;
    }

    public void setTop_layout_id(Integer top_layout_id) {
        this.top_layout_id = top_layout_id;
    }

    public Integer getBottom_layout_id() {
        return bottom_layout_id;
    }

    public void setBottom_layout_id(Integer bottom_layout_id) {
        this.bottom_layout_id = bottom_layout_id;
    }

    public Integer getPacking_layout_id() {
        return packing_layout_id;
    }

    public void setPacking_layout_id(Integer packing_layout_id) {
        this.packing_layout_id = packing_layout_id;
    }

    public Integer getService_layout_id() {
        return service_layout_id;
    }

    public void setService_layout_id(Integer service_layout_id) {
        this.service_layout_id = service_layout_id;
    }

    public Integer getClick_count() {
        return click_count;
    }

    public void setClick_count(Integer click_count) {
        this.click_count = click_count;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getGoods_info() {
        return goods_info;
    }

    public void setGoods_info(String goods_info) {
        this.goods_info = goods_info == null ? null : goods_info.trim();
    }

    public Boolean getInvoice_type() {
        return invoice_type;
    }

    public void setInvoice_type(Boolean invoice_type) {
        this.invoice_type = invoice_type;
    }

    public Boolean getIs_repair() {
        return is_repair;
    }

    public void setIs_repair(Boolean is_repair) {
        this.is_repair = is_repair;
    }

    public Boolean getUser_discount() {
        return user_discount;
    }

    public void setUser_discount(Boolean user_discount) {
        this.user_discount = user_discount;
    }

    public Boolean getStock_mode() {
        return stock_mode;
    }

    public void setStock_mode(Boolean stock_mode) {
        this.stock_mode = stock_mode;
    }

    public Integer getComment_num() {
        return comment_num;
    }

    public void setComment_num(Integer comment_num) {
        this.comment_num = comment_num;
    }

    public Integer getSale_num() {
        return sale_num;
    }

    public void setSale_num(Integer sale_num) {
        this.sale_num = sale_num;
    }

    public Integer getCollect_num() {
        return collect_num;
    }

    public void setCollect_num(Integer collect_num) {
        this.collect_num = collect_num;
    }

    public Boolean getGoods_audit() {
        return goods_audit;
    }

    public void setGoods_audit(Boolean goods_audit) {
        this.goods_audit = goods_audit;
    }

    public Boolean getGoods_status() {
        return goods_status;
    }

    public void setGoods_status(Boolean goods_status) {
        this.goods_status = goods_status;
    }

    public String getGoods_reason() {
        return goods_reason;
    }

    public void setGoods_reason(String goods_reason) {
        this.goods_reason = goods_reason == null ? null : goods_reason.trim();
    }

    public Boolean getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Boolean is_delete) {
        this.is_delete = is_delete;
    }

    public Boolean getIs_virtual() {
        return is_virtual;
    }

    public void setIs_virtual(Boolean is_virtual) {
        this.is_virtual = is_virtual;
    }

    public Boolean getIs_best() {
        return is_best;
    }

    public void setIs_best(Boolean is_best) {
        this.is_best = is_best;
    }

    public Boolean getIs_new() {
        return is_new;
    }

    public void setIs_new(Boolean is_new) {
        this.is_new = is_new;
    }

    public Boolean getIs_hot() {
        return is_hot;
    }

    public void setIs_hot(Boolean is_hot) {
        this.is_hot = is_hot;
    }

    public Boolean getIs_promote() {
        return is_promote;
    }

    public void setIs_promote(Boolean is_promote) {
        this.is_promote = is_promote;
    }

    public String getContract_ids() {
        return contract_ids;
    }

    public void setContract_ids(String contract_ids) {
        this.contract_ids = contract_ids == null ? null : contract_ids.trim();
    }

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Integer getFreight_id() {
        return freight_id;
    }

    public void setFreight_id(Integer freight_id) {
        this.freight_id = freight_id;
    }

    public String getGoods_volume() {
        return goods_volume;
    }

    public void setGoods_volume(String goods_volume) {
        this.goods_volume = goods_volume == null ? null : goods_volume.trim();
    }

    public String getGoods_weight() {
        return goods_weight;
    }

    public void setGoods_weight(String goods_weight) {
        this.goods_weight = goods_weight == null ? null : goods_weight.trim();
    }

    public String getGoods_remark() {
        return goods_remark;
    }

    public void setGoods_remark(String goods_remark) {
        this.goods_remark = goods_remark == null ? null : goods_remark.trim();
    }

    public Integer getGoods_sort() {
        return goods_sort;
    }

    public void setGoods_sort(Integer goods_sort) {
        this.goods_sort = goods_sort;
    }

    public Integer getAdd_time() {
        return add_time;
    }

    public void setAdd_time(Integer add_time) {
        this.add_time = add_time;
    }

    public Integer getLast_time() {
        return last_time;
    }

    public void setLast_time(Integer last_time) {
        this.last_time = last_time;
    }

    public Integer getAct_id() {
        return act_id;
    }

    public void setAct_id(Integer act_id) {
        this.act_id = act_id;
    }

    public Integer getLib_cat_id() {
        return lib_cat_id;
    }

    public void setLib_cat_id(Integer lib_cat_id) {
        this.lib_cat_id = lib_cat_id;
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