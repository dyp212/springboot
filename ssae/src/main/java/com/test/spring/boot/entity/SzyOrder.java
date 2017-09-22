package com.test.spring.boot.entity;

import java.math.BigDecimal;

public class SzyOrder {
	  private Integer order_id;
	  private String order_sn;
	  private String parent_sn;
	  private Integer user_id;
	  private Integer order_status;
	  private Integer shop_id;
	  private Integer site_id;
	  private Integer store_id;
	  private Integer pickup_id;
	  private Integer shipping_status;
	  private Integer pay_status;
	  private String consignee;
	  private String region_code;
	  private String region_namel;
	  private String address;
	  private String address_lng;
	  private String address_lat;
	  private Integer receiving_mode;
	  private String tel;
	  private String email;
	  private String postscript;
	  private String best_time;
	  private Integer pay_id;
	  private String pay_code;
	  private String pay_name;
	  private String pay_sn;
	  private Integer is_cod;
	  private double order_amount;
	  private Integer order_points;
	  private double money_paid;
	  private double goods_amount;
	  private double inv_fee;
	  private double shipping_fee;
	  private double cash_more;
	  private double discount_fee;
	  private double change_amount;
	  private double shipping_change;
	  private double surplus;
	  private double user_surplus;
	  private double user_surplus_limit;
	  private Integer bonus_id;
	  private Integer shop_bonus_id;
	  private String bonus;
	  private String shop_bonus;
	  private Integer store_card_id;
	  private double store_card_price;
	  private Integer integral;
	  private String integral_money;
	  private Integer give_integral;
	  private String order_from;
	  private Integer add_time;
	  private Integer pay_time;
	  private Integer shipping_time;
	  private Integer confirm_time;
	  private Integer delay_days;
	  private Integer order_type;
	  private Integer service_mark;
	  private Integer send_mark;
	  private Integer shipping_mark;
	  private Integer buyer_type;
	  private Integer evaluate_status;
	  private Integer evaluate_time;
	  private Integer end_time;
	  private Integer is_show;
	  private Integer distrib_status;
	  private Integer is_distrib;
	  private String order_data;
	  private String mall_remark;;
	  private String shop_remark;
	  private String store_remark;
	  private String close_reason;
	  private Integer cash_user_id;
	  private Integer order_cancel; 
	  private String refuse_reason; 
	  private Integer sub_order_id; 
	  private Integer is_freebuy; 	  
	  
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
	public String getParent_sn() {
		return parent_sn;
	}
	public void setParent_sn(String parent_sn) {
		this.parent_sn = parent_sn;
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
	public Integer getPickup_id() {
		return pickup_id;
	}
	public void setPickup_id(Integer pickup_id) {
		this.pickup_id = pickup_id;
	}
	public Integer getShipping_status() {
		return shipping_status;
	}
	public void setShipping_status(Integer shipping_status) {
		this.shipping_status = shipping_status;
	}
	public Integer getPay_status() {
		return pay_status;
	}
	public void setPay_status(Integer pay_status) {
		this.pay_status = pay_status;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getRegion_code() {
		return region_code;
	}
	public void setRegion_code(String region_code) {
		this.region_code = region_code;
	}
	public String getRegion_namel() {
		return region_namel;
	}
	public void setRegion_namel(String region_namel) {
		this.region_namel = region_namel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress_lng() {
		return address_lng;
	}
	public void setAddress_lng(String address_lng) {
		this.address_lng = address_lng;
	}
	public String getAddress_lat() {
		return address_lat;
	}
	public void setAddress_lat(String address_lat) {
		this.address_lat = address_lat;
	}
	public Integer getReceiving_mode() {
		return receiving_mode;
	}
	public void setReceiving_mode(Integer receiving_mode) {
		this.receiving_mode = receiving_mode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPostscript() {
		return postscript;
	}
	public void setPostscript(String postscript) {
		this.postscript = postscript;
	}
	public String getBest_time() {
		return best_time;
	}
	public void setBest_time(String best_time) {
		this.best_time = best_time;
	}
	public Integer getPay_id() {
		return pay_id;
	}
	public void setPay_id(Integer pay_id) {
		this.pay_id = pay_id;
	}
	public String getPay_code() {
		return pay_code;
	}
	public void setPay_code(String pay_code) {
		this.pay_code = pay_code;
	}
	public String getPay_name() {
		return pay_name;
	}
	public void setPay_name(String pay_name) {
		this.pay_name = pay_name;
	}
	public String getPay_sn() {
		return pay_sn;
	}
	public void setPay_sn(String pay_sn) {
		this.pay_sn = pay_sn;
	}
	public Integer getIs_cod() {
		return is_cod;
	}
	public void setIs_cod(Integer is_cod) {
		this.is_cod = is_cod;
	}
	public double getOrder_amount() {
		return order_amount;
	}
	public void setOrder_amount(double order_amount) {
		this.order_amount = order_amount;
	}
	public Integer getOrder_points() {
		return order_points;
	}
	public void setOrder_points(Integer order_points) {
		this.order_points = order_points;
	}
	public double getMoney_paid() {
		return money_paid;
	}
	public void setMoney_paid(double money_paid) {
		this.money_paid = money_paid;
	}
	public double getGoods_amount() {
		return goods_amount;
	}
	public void setGoods_amount(double goods_amount) {
		this.goods_amount = goods_amount;
	}
	public double getInv_fee() {
		return inv_fee;
	}
	public void setInv_fee(double inv_fee) {
		this.inv_fee = inv_fee;
	}
	public double getShipping_fee() {
		return shipping_fee;
	}
	public void setShipping_fee(double shipping_fee) {
		this.shipping_fee = shipping_fee;
	}
	public double getCash_more() {
		return cash_more;
	}
	public void setCash_more(double cash_more) {
		this.cash_more = cash_more;
	}
	public double getDiscount_fee() {
		return discount_fee;
	}
	public void setDiscount_fee(double discount_fee) {
		this.discount_fee = discount_fee;
	}
	public double getChange_amount() {
		return change_amount;
	}
	public void setChange_amount(double change_amount) {
		this.change_amount = change_amount;
	}
	public double getShipping_change() {
		return shipping_change;
	}
	public void setShipping_change(double shipping_change) {
		this.shipping_change = shipping_change;
	}
	public double getSurplus() {
		return surplus;
	}
	public void setSurplus(double surplus) {
		this.surplus = surplus;
	}
	public double getUser_surplus() {
		return user_surplus;
	}
	public void setUser_surplus(double user_surplus) {
		this.user_surplus = user_surplus;
	}
	public double getUser_surplus_limit() {
		return user_surplus_limit;
	}
	public void setUser_surplus_limit(double user_surplus_limit) {
		this.user_surplus_limit = user_surplus_limit;
	}
	public Integer getBonus_id() {
		return bonus_id;
	}
	public void setBonus_id(Integer bonus_id) {
		this.bonus_id = bonus_id;
	}
	public Integer getShop_bonus_id() {
		return shop_bonus_id;
	}
	public void setShop_bonus_id(Integer shop_bonus_id) {
		this.shop_bonus_id = shop_bonus_id;
	}
	public String getBonus() {
		return bonus;
	}
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	public String getShop_bonus() {
		return shop_bonus;
	}
	public void setShop_bonus(String shop_bonus) {
		this.shop_bonus = shop_bonus;
	}
	public Integer getStore_card_id() {
		return store_card_id;
	}
	public void setStore_card_id(Integer store_card_id) {
		this.store_card_id = store_card_id;
	}
	public double getStore_card_price() {
		return store_card_price;
	}
	public void setStore_card_price(double store_card_price) {
		this.store_card_price = store_card_price;
	}
	public Integer getIntegral() {
		return integral;
	}
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
	public String getIntegral_money() {
		return integral_money;
	}
	public void setIntegral_money(String integral_money) {
		this.integral_money = integral_money;
	}
	public Integer getGive_integral() {
		return give_integral;
	}
	public void setGive_integral(Integer give_integral) {
		this.give_integral = give_integral;
	}
	public String getOrder_from() {
		return order_from;
	}
	public void setOrder_from(String order_from) {
		this.order_from = order_from;
	}
	public Integer getAdd_time() {
		return add_time;
	}
	public void setAdd_time(Integer add_time) {
		this.add_time = add_time;
	}
	public Integer getPay_time() {
		return pay_time;
	}
	public void setPay_time(Integer pay_time) {
		this.pay_time = pay_time;
	}
	public Integer getShipping_time() {
		return shipping_time;
	}
	public void setShipping_time(Integer shipping_time) {
		this.shipping_time = shipping_time;
	}
	public Integer getConfirm_time() {
		return confirm_time;
	}
	public void setConfirm_time(Integer confirm_time) {
		this.confirm_time = confirm_time;
	}
	public Integer getDelay_days() {
		return delay_days;
	}
	public void setDelay_days(Integer delay_days) {
		this.delay_days = delay_days;
	}
	public Integer getOrder_type() {
		return order_type;
	}
	public void setOrder_type(Integer order_type) {
		this.order_type = order_type;
	}
	public Integer getService_mark() {
		return service_mark;
	}
	public void setService_mark(Integer service_mark) {
		this.service_mark = service_mark;
	}
	public Integer getSend_mark() {
		return send_mark;
	}
	public void setSend_mark(Integer send_mark) {
		this.send_mark = send_mark;
	}
	public Integer getShipping_mark() {
		return shipping_mark;
	}
	public void setShipping_mark(Integer shipping_mark) {
		this.shipping_mark = shipping_mark;
	}
	public Integer getBuyer_type() {
		return buyer_type;
	}
	public void setBuyer_type(Integer buyer_type) {
		this.buyer_type = buyer_type;
	}
	public Integer getEvaluate_status() {
		return evaluate_status;
	}
	public void setEvaluate_status(Integer evaluate_status) {
		this.evaluate_status = evaluate_status;
	}
	public Integer getEvaluate_time() {
		return evaluate_time;
	}
	public void setEvaluate_time(Integer evaluate_time) {
		this.evaluate_time = evaluate_time;
	}
	public Integer getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Integer end_time) {
		this.end_time = end_time;
	}
	public Integer getIs_show() {
		return is_show;
	}
	public void setIs_show(Integer is_show) {
		this.is_show = is_show;
	}
	public Integer getDistrib_status() {
		return distrib_status;
	}
	public void setDistrib_status(Integer distrib_status) {
		this.distrib_status = distrib_status;
	}
	public Integer getIs_distrib() {
		return is_distrib;
	}
	public void setIs_distrib(Integer is_distrib) {
		this.is_distrib = is_distrib;
	}
	public String getOrder_data() {
		return order_data;
	}
	public void setOrder_data(String order_data) {
		this.order_data = order_data;
	}
	public String getMall_remark() {
		return mall_remark;
	}
	public void setMall_remark(String mall_remark) {
		this.mall_remark = mall_remark;
	}
	public String getShop_remark() {
		return shop_remark;
	}
	public void setShop_remark(String shop_remark) {
		this.shop_remark = shop_remark;
	}
	public String getStore_remark() {
		return store_remark;
	}
	public void setStore_remark(String store_remark) {
		this.store_remark = store_remark;
	}
	public String getClose_reason() {
		return close_reason;
	}
	public void setClose_reason(String close_reason) {
		this.close_reason = close_reason;
	}
	public Integer getCash_user_id() {
		return cash_user_id;
	}
	public void setCash_user_id(Integer cash_user_id) {
		this.cash_user_id = cash_user_id;
	}
	public Integer getOrder_cancel() {
		return order_cancel;
	}
	public void setOrder_cancel(Integer order_cancel) {
		this.order_cancel = order_cancel;
	}
	public String getRefuse_reason() {
		return refuse_reason;
	}
	public void setRefuse_reason(String refuse_reason) {
		this.refuse_reason = refuse_reason;
	}
	public Integer getSub_order_id() {
		return sub_order_id;
	}
	public void setSub_order_id(Integer sub_order_id) {
		this.sub_order_id = sub_order_id;
	}
	public Integer getIs_freebuy() {
		return is_freebuy;
	}
	public void setIs_freebuy(Integer is_freebuy) {
		this.is_freebuy = is_freebuy;
	}


}