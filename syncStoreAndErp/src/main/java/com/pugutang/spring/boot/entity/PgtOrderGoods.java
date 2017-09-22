package com.pugutang.spring.boot.entity;

import java.io.Serializable;

public class PgtOrderGoods implements Serializable{
	 private Integer pgt_order_goods_id;
	 private Integer record_id;
	 private Integer order_id;
	 private Integer goods_id;
	 private Integer sku_id;
	 private String spec_info;
	 private String goods_name;
	 public Integer getGoods_number() {
		return goods_number;
	}
	public void setGoods_number(Integer goods_number) {
		this.goods_number = goods_number;
	}
	public Integer getGoods_status() {
		return goods_status;
	}
	public void setGoods_status(Integer goods_status) {
		this.goods_status = goods_status;
	}
	private String goods_sn;
	 private String sku_sn;
	 private Integer goods_number;
	 private Integer goods_status;
	public Integer getPgt_order_goods_id() {
		return pgt_order_goods_id;
	}
	public void setPgt_order_goods_id(Integer pgt_order_goods_id) {
		this.pgt_order_goods_id = pgt_order_goods_id;
	}
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

  
}