package com.pugutang.spring.boot.entity;

import java.io.Serializable;

public class PgtOrder implements Serializable{
    
    
	  private Integer pgt_order_id;
	  private Integer order_id;
	  private String order_sn;
	  private Integer user_id;
	  private Integer order_status;
	  private Integer shop_id;
	  private Integer site_id;
	  private Integer store_id;
	  
	public Integer getPgt_order_id() {
		return pgt_order_id;
	}
	public void setPgt_order_id(Integer pgt_order_id) {
		this.pgt_order_id = pgt_order_id;
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public String getOrder_sn() {
		return order_sn;
	}
	public void setOrder_sn(String order_sn) {
		this.order_sn = order_sn;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getOrder_status() {
		return order_status;
	}
	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}
	public Integer getShop_id() {
		return shop_id;
	}
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	public Integer getSite_id() {
		return site_id;
	}
	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}
	public Integer getStore_id() {
		return store_id;
	}
	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}
    


}