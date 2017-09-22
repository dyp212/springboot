package com.pugutang.spring.boot.entity;

public class OrderDoWithBLOBs extends OrderDo {
    private String order_data;

    private String mall_remark;

    private String shop_remark;

    private String store_remark;

    public String getOrder_data() {
        return order_data;
    }

    public void setOrder_data(String order_data) {
        this.order_data = order_data == null ? null : order_data.trim();
    }

    public String getMall_remark() {
        return mall_remark;
    }

    public void setMall_remark(String mall_remark) {
        this.mall_remark = mall_remark == null ? null : mall_remark.trim();
    }

    public String getShop_remark() {
        return shop_remark;
    }

    public void setShop_remark(String shop_remark) {
        this.shop_remark = shop_remark == null ? null : shop_remark.trim();
    }

    public String getStore_remark() {
        return store_remark;
    }

    public void setStore_remark(String store_remark) {
        this.store_remark = store_remark == null ? null : store_remark.trim();
    }
}