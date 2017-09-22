package com.pugutang.spring.boot.entity;

import java.math.BigDecimal;

public class OrderDo {
    private Integer order_id;

    private String order_sn;

    private String parent_sn;

    private Integer user_id;

    private Boolean order_status;

    private Integer shop_id;

    private Integer site_id;

    private Integer store_id;

    private Integer pickup_id;

    private Boolean shipping_status;

    private Boolean pay_status;

    private String consignee;

    private String region_code;

    private String region_name;

    private String address;

    private String address_lng;

    private String address_lat;

    private Boolean receiving_mode;

    private String tel;

    private String email;

    private String postscript;

    private String best_time;

    private Integer pay_id;

    private String pay_code;

    private String pay_name;

    private String pay_sn;

    private Boolean is_cod;

    private BigDecimal order_amount;

    private Integer order_points;

    private BigDecimal money_paid;

    private BigDecimal goods_amount;

    private BigDecimal inv_fee;

    private BigDecimal shipping_fee;

    private BigDecimal cash_more;

    private BigDecimal discount_fee;

    private BigDecimal change_amount;

    private BigDecimal shipping_change;

    private BigDecimal surplus;

    private BigDecimal user_surplus;

    private BigDecimal user_surplus_limit;

    private Integer bonus_id;

    private Integer shop_bonus_id;

    private BigDecimal bonus;

    private BigDecimal shop_bonus;

    private Integer store_card_id;

    private BigDecimal store_card_price;

    private Integer integral;

    private BigDecimal integral_money;

    private Integer give_integral;

    private String order_from;

    private Integer add_time;

    private Integer pay_time;

    private Integer shipping_time;

    private Integer confirm_time;

    private Boolean delay_days;

    private Boolean order_type;

    private Boolean service_mark;

    private Boolean send_mark;

    private Boolean shipping_mark;

    private Boolean buyer_type;

    private Boolean evaluate_status;

    private Integer evaluate_time;

    private Integer end_time;

    private Boolean is_distrib;

    private Boolean distrib_status;

    private String is_show;

    private Boolean is_delete;

    private String close_reason;

    private Integer cash_user_id;

    private Integer last_time;

    private Boolean order_cancel;

    private String refuse_reason;

    private Integer sub_order_id;

    private Boolean is_freebuy;

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
        this.order_sn = order_sn == null ? null : order_sn.trim();
    }

    public String getParent_sn() {
        return parent_sn;
    }

    public void setParent_sn(String parent_sn) {
        this.parent_sn = parent_sn == null ? null : parent_sn.trim();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Boolean getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Boolean order_status) {
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

    public Boolean getShipping_status() {
        return shipping_status;
    }

    public void setShipping_status(Boolean shipping_status) {
        this.shipping_status = shipping_status;
    }

    public Boolean getPay_status() {
        return pay_status;
    }

    public void setPay_status(Boolean pay_status) {
        this.pay_status = pay_status;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getRegion_code() {
        return region_code;
    }

    public void setRegion_code(String region_code) {
        this.region_code = region_code == null ? null : region_code.trim();
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name == null ? null : region_name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getAddress_lng() {
        return address_lng;
    }

    public void setAddress_lng(String address_lng) {
        this.address_lng = address_lng == null ? null : address_lng.trim();
    }

    public String getAddress_lat() {
        return address_lat;
    }

    public void setAddress_lat(String address_lat) {
        this.address_lat = address_lat == null ? null : address_lat.trim();
    }

    public Boolean getReceiving_mode() {
        return receiving_mode;
    }

    public void setReceiving_mode(Boolean receiving_mode) {
        this.receiving_mode = receiving_mode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript == null ? null : postscript.trim();
    }

    public String getBest_time() {
        return best_time;
    }

    public void setBest_time(String best_time) {
        this.best_time = best_time == null ? null : best_time.trim();
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
        this.pay_code = pay_code == null ? null : pay_code.trim();
    }

    public String getPay_name() {
        return pay_name;
    }

    public void setPay_name(String pay_name) {
        this.pay_name = pay_name == null ? null : pay_name.trim();
    }

    public String getPay_sn() {
        return pay_sn;
    }

    public void setPay_sn(String pay_sn) {
        this.pay_sn = pay_sn == null ? null : pay_sn.trim();
    }

    public Boolean getIs_cod() {
        return is_cod;
    }

    public void setIs_cod(Boolean is_cod) {
        this.is_cod = is_cod;
    }

    public BigDecimal getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(BigDecimal order_amount) {
        this.order_amount = order_amount;
    }

    public Integer getOrder_points() {
        return order_points;
    }

    public void setOrder_points(Integer order_points) {
        this.order_points = order_points;
    }

    public BigDecimal getMoney_paid() {
        return money_paid;
    }

    public void setMoney_paid(BigDecimal money_paid) {
        this.money_paid = money_paid;
    }

    public BigDecimal getGoods_amount() {
        return goods_amount;
    }

    public void setGoods_amount(BigDecimal goods_amount) {
        this.goods_amount = goods_amount;
    }

    public BigDecimal getInv_fee() {
        return inv_fee;
    }

    public void setInv_fee(BigDecimal inv_fee) {
        this.inv_fee = inv_fee;
    }

    public BigDecimal getShipping_fee() {
        return shipping_fee;
    }

    public void setShipping_fee(BigDecimal shipping_fee) {
        this.shipping_fee = shipping_fee;
    }

    public BigDecimal getCash_more() {
        return cash_more;
    }

    public void setCash_more(BigDecimal cash_more) {
        this.cash_more = cash_more;
    }

    public BigDecimal getDiscount_fee() {
        return discount_fee;
    }

    public void setDiscount_fee(BigDecimal discount_fee) {
        this.discount_fee = discount_fee;
    }

    public BigDecimal getChange_amount() {
        return change_amount;
    }

    public void setChange_amount(BigDecimal change_amount) {
        this.change_amount = change_amount;
    }

    public BigDecimal getShipping_change() {
        return shipping_change;
    }

    public void setShipping_change(BigDecimal shipping_change) {
        this.shipping_change = shipping_change;
    }

    public BigDecimal getSurplus() {
        return surplus;
    }

    public void setSurplus(BigDecimal surplus) {
        this.surplus = surplus;
    }

    public BigDecimal getUser_surplus() {
        return user_surplus;
    }

    public void setUser_surplus(BigDecimal user_surplus) {
        this.user_surplus = user_surplus;
    }

    public BigDecimal getUser_surplus_limit() {
        return user_surplus_limit;
    }

    public void setUser_surplus_limit(BigDecimal user_surplus_limit) {
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

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getShop_bonus() {
        return shop_bonus;
    }

    public void setShop_bonus(BigDecimal shop_bonus) {
        this.shop_bonus = shop_bonus;
    }

    public Integer getStore_card_id() {
        return store_card_id;
    }

    public void setStore_card_id(Integer store_card_id) {
        this.store_card_id = store_card_id;
    }

    public BigDecimal getStore_card_price() {
        return store_card_price;
    }

    public void setStore_card_price(BigDecimal store_card_price) {
        this.store_card_price = store_card_price;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public BigDecimal getIntegral_money() {
        return integral_money;
    }

    public void setIntegral_money(BigDecimal integral_money) {
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
        this.order_from = order_from == null ? null : order_from.trim();
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

    public Boolean getDelay_days() {
        return delay_days;
    }

    public void setDelay_days(Boolean delay_days) {
        this.delay_days = delay_days;
    }

    public Boolean getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Boolean order_type) {
        this.order_type = order_type;
    }

    public Boolean getService_mark() {
        return service_mark;
    }

    public void setService_mark(Boolean service_mark) {
        this.service_mark = service_mark;
    }

    public Boolean getSend_mark() {
        return send_mark;
    }

    public void setSend_mark(Boolean send_mark) {
        this.send_mark = send_mark;
    }

    public Boolean getShipping_mark() {
        return shipping_mark;
    }

    public void setShipping_mark(Boolean shipping_mark) {
        this.shipping_mark = shipping_mark;
    }

    public Boolean getBuyer_type() {
        return buyer_type;
    }

    public void setBuyer_type(Boolean buyer_type) {
        this.buyer_type = buyer_type;
    }

    public Boolean getEvaluate_status() {
        return evaluate_status;
    }

    public void setEvaluate_status(Boolean evaluate_status) {
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

    public Boolean getIs_distrib() {
        return is_distrib;
    }

    public void setIs_distrib(Boolean is_distrib) {
        this.is_distrib = is_distrib;
    }

    public Boolean getDistrib_status() {
        return distrib_status;
    }

    public void setDistrib_status(Boolean distrib_status) {
        this.distrib_status = distrib_status;
    }

    public String getIs_show() {
        return is_show;
    }

    public void setIs_show(String is_show) {
        this.is_show = is_show == null ? null : is_show.trim();
    }

    public Boolean getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Boolean is_delete) {
        this.is_delete = is_delete;
    }

    public String getClose_reason() {
        return close_reason;
    }

    public void setClose_reason(String close_reason) {
        this.close_reason = close_reason == null ? null : close_reason.trim();
    }

    public Integer getCash_user_id() {
        return cash_user_id;
    }

    public void setCash_user_id(Integer cash_user_id) {
        this.cash_user_id = cash_user_id;
    }

    public Integer getLast_time() {
        return last_time;
    }

    public void setLast_time(Integer last_time) {
        this.last_time = last_time;
    }

    public Boolean getOrder_cancel() {
        return order_cancel;
    }

    public void setOrder_cancel(Boolean order_cancel) {
        this.order_cancel = order_cancel;
    }

    public String getRefuse_reason() {
        return refuse_reason;
    }

    public void setRefuse_reason(String refuse_reason) {
        this.refuse_reason = refuse_reason == null ? null : refuse_reason.trim();
    }

    public Integer getSub_order_id() {
        return sub_order_id;
    }

    public void setSub_order_id(Integer sub_order_id) {
        this.sub_order_id = sub_order_id;
    }

    public Boolean getIs_freebuy() {
        return is_freebuy;
    }

    public void setIs_freebuy(Boolean is_freebuy) {
        this.is_freebuy = is_freebuy;
    }
}