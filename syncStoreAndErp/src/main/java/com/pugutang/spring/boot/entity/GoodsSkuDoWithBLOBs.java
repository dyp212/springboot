package com.pugutang.spring.boot.entity;

public class GoodsSkuDoWithBLOBs extends GoodsSkuDo {
    private String sku_images;

    private String pc_desc;

    private String mobile_desc;

    private String pc_testing;

    private String mobile_testing;

    public String getSku_images() {
        return sku_images;
    }

    public void setSku_images(String sku_images) {
        this.sku_images = sku_images == null ? null : sku_images.trim();
    }

    public String getPc_desc() {
        return pc_desc;
    }

    public void setPc_desc(String pc_desc) {
        this.pc_desc = pc_desc == null ? null : pc_desc.trim();
    }

    public String getMobile_desc() {
        return mobile_desc;
    }

    public void setMobile_desc(String mobile_desc) {
        this.mobile_desc = mobile_desc == null ? null : mobile_desc.trim();
    }

    public String getPc_testing() {
        return pc_testing;
    }

    public void setPc_testing(String pc_testing) {
        this.pc_testing = pc_testing == null ? null : pc_testing.trim();
    }

    public String getMobile_testing() {
        return mobile_testing;
    }

    public void setMobile_testing(String mobile_testing) {
        this.mobile_testing = mobile_testing == null ? null : mobile_testing.trim();
    }
}