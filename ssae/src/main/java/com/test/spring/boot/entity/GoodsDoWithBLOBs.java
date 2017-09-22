package com.test.spring.boot.entity;

public class GoodsDoWithBLOBs extends GoodsDo {
    private String goods_images;

    private String pc_desc;

    private String mobile_desc;

    private String pc_testing;

    private String mobile_testing;

    private String other_attrs;

    public String getGoods_images() {
        return goods_images;
    }

    public void setGoods_images(String goods_images) {
        this.goods_images = goods_images == null ? null : goods_images.trim();
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

    public String getOther_attrs() {
        return other_attrs;
    }

    public void setOther_attrs(String other_attrs) {
        this.other_attrs = other_attrs == null ? null : other_attrs.trim();
    }
}