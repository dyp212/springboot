package com.test.spring.boot.entity;

import java.math.BigDecimal;

public class SzyOrderGoods {
	private Integer record_id;
	 private Integer order_id;
	 private Integer goods_id;
	 private Integer sku_id;
	 private String spec_info;
	 private String goods_name;
	 private String goods_sn;
	 private String sku_sn;
	 private String goods_image;
	 private String goods_price;
	 private String goods_points;
	 private Integer goods_number;
	 private String other_price;
	 private double pay_change;
	 private Integer parent_id;
	 private Integer is_gift;
	 private Integer is_evaluate;
	 private Integer goods_status;
	 private Integer give_integral;
	 private Integer stock_mode;
	 private Integer stock_dropped; //0-未减库存 1-已减库存
	 private Integer act_type; //0-普通商品 1-团购商品 2-预售商品
	 private Integer distrib_money; //分销金额
	 private Integer is_distrib; //是否分销商品
	 private String goods_contracts; //商品服务保障 格式为JSON字符串，内容为[{id,name,image,desc},{id,name,image,desc}]
	 public Integer getRecord_id() {
		return record_id;
	}
	public void setRecord_id(Integer record_id) {
		this.record_id = record_id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Integer getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}
	public Integer getSku_id() {
		return sku_id;
	}
	public void setSku_id(Integer sku_id) {
		this.sku_id = sku_id;
	}
	public String getSpec_info() {
		return spec_info;
	}
	public void setSpec_info(String spec_info) {
		this.spec_info = spec_info;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getGoods_sn() {
		return goods_sn;
	}
	public void setGoods_sn(String goods_sn) {
		this.goods_sn = goods_sn;
	}
	public String getSku_sn() {
		return sku_sn;
	}
	public void setSku_sn(String sku_sn) {
		this.sku_sn = sku_sn;
	}
	public String getGoods_image() {
		return goods_image;
	}
	public void setGoods_image(String goods_image) {
		this.goods_image = goods_image;
	}
	public String getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(String goods_price) {
		this.goods_price = goods_price;
	}
	public String getGoods_points() {
		return goods_points;
	}
	public void setGoods_points(String goods_points) {
		this.goods_points = goods_points;
	}
	public Integer getGoods_number() {
		return goods_number;
	}
	public void setGoods_number(Integer goods_number) {
		this.goods_number = goods_number;
	}
	public String getOther_price() {
		return other_price;
	}
	public void setOther_price(String other_price) {
		this.other_price = other_price;
	}
	public double getPay_change() {
		return pay_change;
	}
	public void setPay_change(double pay_change) {
		this.pay_change = pay_change;
	}
	public Integer getParent_id() {
		return parent_id;
	}
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
	public Integer getIs_gift() {
		return is_gift;
	}
	public void setIs_gift(Integer is_gift) {
		this.is_gift = is_gift;
	}
	public Integer getIs_evaluate() {
		return is_evaluate;
	}
	public void setIs_evaluate(Integer is_evaluate) {
		this.is_evaluate = is_evaluate;
	}
	public Integer getGoods_status() {
		return goods_status;
	}
	public void setGoods_status(Integer goods_status) {
		this.goods_status = goods_status;
	}
	public Integer getGive_integral() {
		return give_integral;
	}
	public void setGive_integral(Integer give_integral) {
		this.give_integral = give_integral;
	}
	public Integer getStock_mode() {
		return stock_mode;
	}
	public void setStock_mode(Integer stock_mode) {
		this.stock_mode = stock_mode;
	}
	public Integer getStock_dropped() {
		return stock_dropped;
	}
	public void setStock_dropped(Integer stock_dropped) {
		this.stock_dropped = stock_dropped;
	}
	public Integer getAct_type() {
		return act_type;
	}
	public void setAct_type(Integer act_type) {
		this.act_type = act_type;
	}
	public Integer getDistrib_money() {
		return distrib_money;
	}
	public void setDistrib_money(Integer distrib_money) {
		this.distrib_money = distrib_money;
	}
	public Integer getIs_distrib() {
		return is_distrib;
	}
	public void setIs_distrib(Integer is_distrib) {
		this.is_distrib = is_distrib;
	}
	public String getGoods_contracts() {
		return goods_contracts;
	}
	public void setGoods_contracts(String goods_contracts) {
		this.goods_contracts = goods_contracts;
	}
}