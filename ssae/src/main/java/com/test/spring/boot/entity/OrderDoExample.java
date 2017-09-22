package com.test.spring.boot.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrder_idIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_idEqualTo(Integer value) {
            addCriterion("order_id =", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThan(Integer value) {
            addCriterion("order_id >", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThan(Integer value) {
            addCriterion("order_id <", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIn(List<Integer> values) {
            addCriterion("order_id in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_snIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrder_snIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_snEqualTo(String value) {
            addCriterion("order_sn =", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snGreaterThan(String value) {
            addCriterion("order_sn >", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snLessThan(String value) {
            addCriterion("order_sn <", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snLike(String value) {
            addCriterion("order_sn like", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snNotLike(String value) {
            addCriterion("order_sn not like", value, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snIn(List<String> values) {
            addCriterion("order_sn in", values, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "order_sn");
            return (Criteria) this;
        }

        public Criteria andOrder_snNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "order_sn");
            return (Criteria) this;
        }

        public Criteria andParent_snIsNull() {
            addCriterion("parent_sn is null");
            return (Criteria) this;
        }

        public Criteria andParent_snIsNotNull() {
            addCriterion("parent_sn is not null");
            return (Criteria) this;
        }

        public Criteria andParent_snEqualTo(String value) {
            addCriterion("parent_sn =", value, "parent_sn");
            return (Criteria) this;
        }

        public Criteria andParent_snNotEqualTo(String value) {
            addCriterion("parent_sn <>", value, "parent_sn");
            return (Criteria) this;
        }

        public Criteria andParent_snGreaterThan(String value) {
            addCriterion("parent_sn >", value, "parent_sn");
            return (Criteria) this;
        }

        public Criteria andParent_snGreaterThanOrEqualTo(String value) {
            addCriterion("parent_sn >=", value, "parent_sn");
            return (Criteria) this;
        }

        public Criteria andParent_snLessThan(String value) {
            addCriterion("parent_sn <", value, "parent_sn");
            return (Criteria) this;
        }

        public Criteria andParent_snLessThanOrEqualTo(String value) {
            addCriterion("parent_sn <=", value, "parent_sn");
            return (Criteria) this;
        }

        public Criteria andParent_snLike(String value) {
            addCriterion("parent_sn like", value, "parent_sn");
            return (Criteria) this;
        }

        public Criteria andParent_snNotLike(String value) {
            addCriterion("parent_sn not like", value, "parent_sn");
            return (Criteria) this;
        }

        public Criteria andParent_snIn(List<String> values) {
            addCriterion("parent_sn in", values, "parent_sn");
            return (Criteria) this;
        }

        public Criteria andParent_snNotIn(List<String> values) {
            addCriterion("parent_sn not in", values, "parent_sn");
            return (Criteria) this;
        }

        public Criteria andParent_snBetween(String value1, String value2) {
            addCriterion("parent_sn between", value1, value2, "parent_sn");
            return (Criteria) this;
        }

        public Criteria andParent_snNotBetween(String value1, String value2) {
            addCriterion("parent_sn not between", value1, value2, "parent_sn");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andOrder_statusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrder_statusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_statusEqualTo(Boolean value) {
            addCriterion("order_status =", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusNotEqualTo(Boolean value) {
            addCriterion("order_status <>", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusGreaterThan(Boolean value) {
            addCriterion("order_status >", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_status >=", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusLessThan(Boolean value) {
            addCriterion("order_status <", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("order_status <=", value, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusIn(List<Boolean> values) {
            addCriterion("order_status in", values, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusNotIn(List<Boolean> values) {
            addCriterion("order_status not in", values, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("order_status between", value1, value2, "order_status");
            return (Criteria) this;
        }

        public Criteria andOrder_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_status not between", value1, value2, "order_status");
            return (Criteria) this;
        }

        public Criteria andShop_idIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShop_idIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShop_idEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idLessThan(Integer value) {
            addCriterion("shop_id <", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shop_id");
            return (Criteria) this;
        }

        public Criteria andShop_idNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shop_id");
            return (Criteria) this;
        }

        public Criteria andSite_idIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSite_idIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSite_idEqualTo(Integer value) {
            addCriterion("site_id =", value, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idNotEqualTo(Integer value) {
            addCriterion("site_id <>", value, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idGreaterThan(Integer value) {
            addCriterion("site_id >", value, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_id >=", value, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idLessThan(Integer value) {
            addCriterion("site_id <", value, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idLessThanOrEqualTo(Integer value) {
            addCriterion("site_id <=", value, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idIn(List<Integer> values) {
            addCriterion("site_id in", values, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idNotIn(List<Integer> values) {
            addCriterion("site_id not in", values, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idBetween(Integer value1, Integer value2) {
            addCriterion("site_id between", value1, value2, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idNotBetween(Integer value1, Integer value2) {
            addCriterion("site_id not between", value1, value2, "site_id");
            return (Criteria) this;
        }

        public Criteria andStore_idIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStore_idIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStore_idEqualTo(Integer value) {
            addCriterion("store_id =", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idGreaterThan(Integer value) {
            addCriterion("store_id >", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idLessThan(Integer value) {
            addCriterion("store_id <", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idIn(List<Integer> values) {
            addCriterion("store_id in", values, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "store_id");
            return (Criteria) this;
        }

        public Criteria andPickup_idIsNull() {
            addCriterion("pickup_id is null");
            return (Criteria) this;
        }

        public Criteria andPickup_idIsNotNull() {
            addCriterion("pickup_id is not null");
            return (Criteria) this;
        }

        public Criteria andPickup_idEqualTo(Integer value) {
            addCriterion("pickup_id =", value, "pickup_id");
            return (Criteria) this;
        }

        public Criteria andPickup_idNotEqualTo(Integer value) {
            addCriterion("pickup_id <>", value, "pickup_id");
            return (Criteria) this;
        }

        public Criteria andPickup_idGreaterThan(Integer value) {
            addCriterion("pickup_id >", value, "pickup_id");
            return (Criteria) this;
        }

        public Criteria andPickup_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("pickup_id >=", value, "pickup_id");
            return (Criteria) this;
        }

        public Criteria andPickup_idLessThan(Integer value) {
            addCriterion("pickup_id <", value, "pickup_id");
            return (Criteria) this;
        }

        public Criteria andPickup_idLessThanOrEqualTo(Integer value) {
            addCriterion("pickup_id <=", value, "pickup_id");
            return (Criteria) this;
        }

        public Criteria andPickup_idIn(List<Integer> values) {
            addCriterion("pickup_id in", values, "pickup_id");
            return (Criteria) this;
        }

        public Criteria andPickup_idNotIn(List<Integer> values) {
            addCriterion("pickup_id not in", values, "pickup_id");
            return (Criteria) this;
        }

        public Criteria andPickup_idBetween(Integer value1, Integer value2) {
            addCriterion("pickup_id between", value1, value2, "pickup_id");
            return (Criteria) this;
        }

        public Criteria andPickup_idNotBetween(Integer value1, Integer value2) {
            addCriterion("pickup_id not between", value1, value2, "pickup_id");
            return (Criteria) this;
        }

        public Criteria andShipping_statusIsNull() {
            addCriterion("shipping_status is null");
            return (Criteria) this;
        }

        public Criteria andShipping_statusIsNotNull() {
            addCriterion("shipping_status is not null");
            return (Criteria) this;
        }

        public Criteria andShipping_statusEqualTo(Boolean value) {
            addCriterion("shipping_status =", value, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusNotEqualTo(Boolean value) {
            addCriterion("shipping_status <>", value, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusGreaterThan(Boolean value) {
            addCriterion("shipping_status >", value, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shipping_status >=", value, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusLessThan(Boolean value) {
            addCriterion("shipping_status <", value, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("shipping_status <=", value, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusIn(List<Boolean> values) {
            addCriterion("shipping_status in", values, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusNotIn(List<Boolean> values) {
            addCriterion("shipping_status not in", values, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("shipping_status between", value1, value2, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andShipping_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shipping_status not between", value1, value2, "shipping_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPay_statusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPay_statusEqualTo(Boolean value) {
            addCriterion("pay_status =", value, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusNotEqualTo(Boolean value) {
            addCriterion("pay_status <>", value, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusGreaterThan(Boolean value) {
            addCriterion("pay_status >", value, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pay_status >=", value, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusLessThan(Boolean value) {
            addCriterion("pay_status <", value, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("pay_status <=", value, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusIn(List<Boolean> values) {
            addCriterion("pay_status in", values, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusNotIn(List<Boolean> values) {
            addCriterion("pay_status not in", values, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_status between", value1, value2, "pay_status");
            return (Criteria) this;
        }

        public Criteria andPay_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pay_status not between", value1, value2, "pay_status");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andRegion_codeIsNull() {
            addCriterion("region_code is null");
            return (Criteria) this;
        }

        public Criteria andRegion_codeIsNotNull() {
            addCriterion("region_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegion_codeEqualTo(String value) {
            addCriterion("region_code =", value, "region_code");
            return (Criteria) this;
        }

        public Criteria andRegion_codeNotEqualTo(String value) {
            addCriterion("region_code <>", value, "region_code");
            return (Criteria) this;
        }

        public Criteria andRegion_codeGreaterThan(String value) {
            addCriterion("region_code >", value, "region_code");
            return (Criteria) this;
        }

        public Criteria andRegion_codeGreaterThanOrEqualTo(String value) {
            addCriterion("region_code >=", value, "region_code");
            return (Criteria) this;
        }

        public Criteria andRegion_codeLessThan(String value) {
            addCriterion("region_code <", value, "region_code");
            return (Criteria) this;
        }

        public Criteria andRegion_codeLessThanOrEqualTo(String value) {
            addCriterion("region_code <=", value, "region_code");
            return (Criteria) this;
        }

        public Criteria andRegion_codeLike(String value) {
            addCriterion("region_code like", value, "region_code");
            return (Criteria) this;
        }

        public Criteria andRegion_codeNotLike(String value) {
            addCriterion("region_code not like", value, "region_code");
            return (Criteria) this;
        }

        public Criteria andRegion_codeIn(List<String> values) {
            addCriterion("region_code in", values, "region_code");
            return (Criteria) this;
        }

        public Criteria andRegion_codeNotIn(List<String> values) {
            addCriterion("region_code not in", values, "region_code");
            return (Criteria) this;
        }

        public Criteria andRegion_codeBetween(String value1, String value2) {
            addCriterion("region_code between", value1, value2, "region_code");
            return (Criteria) this;
        }

        public Criteria andRegion_codeNotBetween(String value1, String value2) {
            addCriterion("region_code not between", value1, value2, "region_code");
            return (Criteria) this;
        }

        public Criteria andRegion_nameIsNull() {
            addCriterion("region_name is null");
            return (Criteria) this;
        }

        public Criteria andRegion_nameIsNotNull() {
            addCriterion("region_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegion_nameEqualTo(String value) {
            addCriterion("region_name =", value, "region_name");
            return (Criteria) this;
        }

        public Criteria andRegion_nameNotEqualTo(String value) {
            addCriterion("region_name <>", value, "region_name");
            return (Criteria) this;
        }

        public Criteria andRegion_nameGreaterThan(String value) {
            addCriterion("region_name >", value, "region_name");
            return (Criteria) this;
        }

        public Criteria andRegion_nameGreaterThanOrEqualTo(String value) {
            addCriterion("region_name >=", value, "region_name");
            return (Criteria) this;
        }

        public Criteria andRegion_nameLessThan(String value) {
            addCriterion("region_name <", value, "region_name");
            return (Criteria) this;
        }

        public Criteria andRegion_nameLessThanOrEqualTo(String value) {
            addCriterion("region_name <=", value, "region_name");
            return (Criteria) this;
        }

        public Criteria andRegion_nameLike(String value) {
            addCriterion("region_name like", value, "region_name");
            return (Criteria) this;
        }

        public Criteria andRegion_nameNotLike(String value) {
            addCriterion("region_name not like", value, "region_name");
            return (Criteria) this;
        }

        public Criteria andRegion_nameIn(List<String> values) {
            addCriterion("region_name in", values, "region_name");
            return (Criteria) this;
        }

        public Criteria andRegion_nameNotIn(List<String> values) {
            addCriterion("region_name not in", values, "region_name");
            return (Criteria) this;
        }

        public Criteria andRegion_nameBetween(String value1, String value2) {
            addCriterion("region_name between", value1, value2, "region_name");
            return (Criteria) this;
        }

        public Criteria andRegion_nameNotBetween(String value1, String value2) {
            addCriterion("region_name not between", value1, value2, "region_name");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddress_lngIsNull() {
            addCriterion("address_lng is null");
            return (Criteria) this;
        }

        public Criteria andAddress_lngIsNotNull() {
            addCriterion("address_lng is not null");
            return (Criteria) this;
        }

        public Criteria andAddress_lngEqualTo(String value) {
            addCriterion("address_lng =", value, "address_lng");
            return (Criteria) this;
        }

        public Criteria andAddress_lngNotEqualTo(String value) {
            addCriterion("address_lng <>", value, "address_lng");
            return (Criteria) this;
        }

        public Criteria andAddress_lngGreaterThan(String value) {
            addCriterion("address_lng >", value, "address_lng");
            return (Criteria) this;
        }

        public Criteria andAddress_lngGreaterThanOrEqualTo(String value) {
            addCriterion("address_lng >=", value, "address_lng");
            return (Criteria) this;
        }

        public Criteria andAddress_lngLessThan(String value) {
            addCriterion("address_lng <", value, "address_lng");
            return (Criteria) this;
        }

        public Criteria andAddress_lngLessThanOrEqualTo(String value) {
            addCriterion("address_lng <=", value, "address_lng");
            return (Criteria) this;
        }

        public Criteria andAddress_lngLike(String value) {
            addCriterion("address_lng like", value, "address_lng");
            return (Criteria) this;
        }

        public Criteria andAddress_lngNotLike(String value) {
            addCriterion("address_lng not like", value, "address_lng");
            return (Criteria) this;
        }

        public Criteria andAddress_lngIn(List<String> values) {
            addCriterion("address_lng in", values, "address_lng");
            return (Criteria) this;
        }

        public Criteria andAddress_lngNotIn(List<String> values) {
            addCriterion("address_lng not in", values, "address_lng");
            return (Criteria) this;
        }

        public Criteria andAddress_lngBetween(String value1, String value2) {
            addCriterion("address_lng between", value1, value2, "address_lng");
            return (Criteria) this;
        }

        public Criteria andAddress_lngNotBetween(String value1, String value2) {
            addCriterion("address_lng not between", value1, value2, "address_lng");
            return (Criteria) this;
        }

        public Criteria andAddress_latIsNull() {
            addCriterion("address_lat is null");
            return (Criteria) this;
        }

        public Criteria andAddress_latIsNotNull() {
            addCriterion("address_lat is not null");
            return (Criteria) this;
        }

        public Criteria andAddress_latEqualTo(String value) {
            addCriterion("address_lat =", value, "address_lat");
            return (Criteria) this;
        }

        public Criteria andAddress_latNotEqualTo(String value) {
            addCriterion("address_lat <>", value, "address_lat");
            return (Criteria) this;
        }

        public Criteria andAddress_latGreaterThan(String value) {
            addCriterion("address_lat >", value, "address_lat");
            return (Criteria) this;
        }

        public Criteria andAddress_latGreaterThanOrEqualTo(String value) {
            addCriterion("address_lat >=", value, "address_lat");
            return (Criteria) this;
        }

        public Criteria andAddress_latLessThan(String value) {
            addCriterion("address_lat <", value, "address_lat");
            return (Criteria) this;
        }

        public Criteria andAddress_latLessThanOrEqualTo(String value) {
            addCriterion("address_lat <=", value, "address_lat");
            return (Criteria) this;
        }

        public Criteria andAddress_latLike(String value) {
            addCriterion("address_lat like", value, "address_lat");
            return (Criteria) this;
        }

        public Criteria andAddress_latNotLike(String value) {
            addCriterion("address_lat not like", value, "address_lat");
            return (Criteria) this;
        }

        public Criteria andAddress_latIn(List<String> values) {
            addCriterion("address_lat in", values, "address_lat");
            return (Criteria) this;
        }

        public Criteria andAddress_latNotIn(List<String> values) {
            addCriterion("address_lat not in", values, "address_lat");
            return (Criteria) this;
        }

        public Criteria andAddress_latBetween(String value1, String value2) {
            addCriterion("address_lat between", value1, value2, "address_lat");
            return (Criteria) this;
        }

        public Criteria andAddress_latNotBetween(String value1, String value2) {
            addCriterion("address_lat not between", value1, value2, "address_lat");
            return (Criteria) this;
        }

        public Criteria andReceiving_modeIsNull() {
            addCriterion("receiving_mode is null");
            return (Criteria) this;
        }

        public Criteria andReceiving_modeIsNotNull() {
            addCriterion("receiving_mode is not null");
            return (Criteria) this;
        }

        public Criteria andReceiving_modeEqualTo(Boolean value) {
            addCriterion("receiving_mode =", value, "receiving_mode");
            return (Criteria) this;
        }

        public Criteria andReceiving_modeNotEqualTo(Boolean value) {
            addCriterion("receiving_mode <>", value, "receiving_mode");
            return (Criteria) this;
        }

        public Criteria andReceiving_modeGreaterThan(Boolean value) {
            addCriterion("receiving_mode >", value, "receiving_mode");
            return (Criteria) this;
        }

        public Criteria andReceiving_modeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("receiving_mode >=", value, "receiving_mode");
            return (Criteria) this;
        }

        public Criteria andReceiving_modeLessThan(Boolean value) {
            addCriterion("receiving_mode <", value, "receiving_mode");
            return (Criteria) this;
        }

        public Criteria andReceiving_modeLessThanOrEqualTo(Boolean value) {
            addCriterion("receiving_mode <=", value, "receiving_mode");
            return (Criteria) this;
        }

        public Criteria andReceiving_modeIn(List<Boolean> values) {
            addCriterion("receiving_mode in", values, "receiving_mode");
            return (Criteria) this;
        }

        public Criteria andReceiving_modeNotIn(List<Boolean> values) {
            addCriterion("receiving_mode not in", values, "receiving_mode");
            return (Criteria) this;
        }

        public Criteria andReceiving_modeBetween(Boolean value1, Boolean value2) {
            addCriterion("receiving_mode between", value1, value2, "receiving_mode");
            return (Criteria) this;
        }

        public Criteria andReceiving_modeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("receiving_mode not between", value1, value2, "receiving_mode");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPostscriptIsNull() {
            addCriterion("postscript is null");
            return (Criteria) this;
        }

        public Criteria andPostscriptIsNotNull() {
            addCriterion("postscript is not null");
            return (Criteria) this;
        }

        public Criteria andPostscriptEqualTo(String value) {
            addCriterion("postscript =", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotEqualTo(String value) {
            addCriterion("postscript <>", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptGreaterThan(String value) {
            addCriterion("postscript >", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptGreaterThanOrEqualTo(String value) {
            addCriterion("postscript >=", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLessThan(String value) {
            addCriterion("postscript <", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLessThanOrEqualTo(String value) {
            addCriterion("postscript <=", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptLike(String value) {
            addCriterion("postscript like", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotLike(String value) {
            addCriterion("postscript not like", value, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptIn(List<String> values) {
            addCriterion("postscript in", values, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotIn(List<String> values) {
            addCriterion("postscript not in", values, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptBetween(String value1, String value2) {
            addCriterion("postscript between", value1, value2, "postscript");
            return (Criteria) this;
        }

        public Criteria andPostscriptNotBetween(String value1, String value2) {
            addCriterion("postscript not between", value1, value2, "postscript");
            return (Criteria) this;
        }

        public Criteria andBest_timeIsNull() {
            addCriterion("best_time is null");
            return (Criteria) this;
        }

        public Criteria andBest_timeIsNotNull() {
            addCriterion("best_time is not null");
            return (Criteria) this;
        }

        public Criteria andBest_timeEqualTo(String value) {
            addCriterion("best_time =", value, "best_time");
            return (Criteria) this;
        }

        public Criteria andBest_timeNotEqualTo(String value) {
            addCriterion("best_time <>", value, "best_time");
            return (Criteria) this;
        }

        public Criteria andBest_timeGreaterThan(String value) {
            addCriterion("best_time >", value, "best_time");
            return (Criteria) this;
        }

        public Criteria andBest_timeGreaterThanOrEqualTo(String value) {
            addCriterion("best_time >=", value, "best_time");
            return (Criteria) this;
        }

        public Criteria andBest_timeLessThan(String value) {
            addCriterion("best_time <", value, "best_time");
            return (Criteria) this;
        }

        public Criteria andBest_timeLessThanOrEqualTo(String value) {
            addCriterion("best_time <=", value, "best_time");
            return (Criteria) this;
        }

        public Criteria andBest_timeLike(String value) {
            addCriterion("best_time like", value, "best_time");
            return (Criteria) this;
        }

        public Criteria andBest_timeNotLike(String value) {
            addCriterion("best_time not like", value, "best_time");
            return (Criteria) this;
        }

        public Criteria andBest_timeIn(List<String> values) {
            addCriterion("best_time in", values, "best_time");
            return (Criteria) this;
        }

        public Criteria andBest_timeNotIn(List<String> values) {
            addCriterion("best_time not in", values, "best_time");
            return (Criteria) this;
        }

        public Criteria andBest_timeBetween(String value1, String value2) {
            addCriterion("best_time between", value1, value2, "best_time");
            return (Criteria) this;
        }

        public Criteria andBest_timeNotBetween(String value1, String value2) {
            addCriterion("best_time not between", value1, value2, "best_time");
            return (Criteria) this;
        }

        public Criteria andPay_idIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPay_idIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPay_idEqualTo(Integer value) {
            addCriterion("pay_id =", value, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idNotEqualTo(Integer value) {
            addCriterion("pay_id <>", value, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idGreaterThan(Integer value) {
            addCriterion("pay_id >", value, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_id >=", value, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idLessThan(Integer value) {
            addCriterion("pay_id <", value, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idLessThanOrEqualTo(Integer value) {
            addCriterion("pay_id <=", value, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idIn(List<Integer> values) {
            addCriterion("pay_id in", values, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idNotIn(List<Integer> values) {
            addCriterion("pay_id not in", values, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idBetween(Integer value1, Integer value2) {
            addCriterion("pay_id between", value1, value2, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_idNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_id not between", value1, value2, "pay_id");
            return (Criteria) this;
        }

        public Criteria andPay_codeIsNull() {
            addCriterion("pay_code is null");
            return (Criteria) this;
        }

        public Criteria andPay_codeIsNotNull() {
            addCriterion("pay_code is not null");
            return (Criteria) this;
        }

        public Criteria andPay_codeEqualTo(String value) {
            addCriterion("pay_code =", value, "pay_code");
            return (Criteria) this;
        }

        public Criteria andPay_codeNotEqualTo(String value) {
            addCriterion("pay_code <>", value, "pay_code");
            return (Criteria) this;
        }

        public Criteria andPay_codeGreaterThan(String value) {
            addCriterion("pay_code >", value, "pay_code");
            return (Criteria) this;
        }

        public Criteria andPay_codeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_code >=", value, "pay_code");
            return (Criteria) this;
        }

        public Criteria andPay_codeLessThan(String value) {
            addCriterion("pay_code <", value, "pay_code");
            return (Criteria) this;
        }

        public Criteria andPay_codeLessThanOrEqualTo(String value) {
            addCriterion("pay_code <=", value, "pay_code");
            return (Criteria) this;
        }

        public Criteria andPay_codeLike(String value) {
            addCriterion("pay_code like", value, "pay_code");
            return (Criteria) this;
        }

        public Criteria andPay_codeNotLike(String value) {
            addCriterion("pay_code not like", value, "pay_code");
            return (Criteria) this;
        }

        public Criteria andPay_codeIn(List<String> values) {
            addCriterion("pay_code in", values, "pay_code");
            return (Criteria) this;
        }

        public Criteria andPay_codeNotIn(List<String> values) {
            addCriterion("pay_code not in", values, "pay_code");
            return (Criteria) this;
        }

        public Criteria andPay_codeBetween(String value1, String value2) {
            addCriterion("pay_code between", value1, value2, "pay_code");
            return (Criteria) this;
        }

        public Criteria andPay_codeNotBetween(String value1, String value2) {
            addCriterion("pay_code not between", value1, value2, "pay_code");
            return (Criteria) this;
        }

        public Criteria andPay_nameIsNull() {
            addCriterion("pay_name is null");
            return (Criteria) this;
        }

        public Criteria andPay_nameIsNotNull() {
            addCriterion("pay_name is not null");
            return (Criteria) this;
        }

        public Criteria andPay_nameEqualTo(String value) {
            addCriterion("pay_name =", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameNotEqualTo(String value) {
            addCriterion("pay_name <>", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameGreaterThan(String value) {
            addCriterion("pay_name >", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameGreaterThanOrEqualTo(String value) {
            addCriterion("pay_name >=", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameLessThan(String value) {
            addCriterion("pay_name <", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameLessThanOrEqualTo(String value) {
            addCriterion("pay_name <=", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameLike(String value) {
            addCriterion("pay_name like", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameNotLike(String value) {
            addCriterion("pay_name not like", value, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameIn(List<String> values) {
            addCriterion("pay_name in", values, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameNotIn(List<String> values) {
            addCriterion("pay_name not in", values, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameBetween(String value1, String value2) {
            addCriterion("pay_name between", value1, value2, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_nameNotBetween(String value1, String value2) {
            addCriterion("pay_name not between", value1, value2, "pay_name");
            return (Criteria) this;
        }

        public Criteria andPay_snIsNull() {
            addCriterion("pay_sn is null");
            return (Criteria) this;
        }

        public Criteria andPay_snIsNotNull() {
            addCriterion("pay_sn is not null");
            return (Criteria) this;
        }

        public Criteria andPay_snEqualTo(String value) {
            addCriterion("pay_sn =", value, "pay_sn");
            return (Criteria) this;
        }

        public Criteria andPay_snNotEqualTo(String value) {
            addCriterion("pay_sn <>", value, "pay_sn");
            return (Criteria) this;
        }

        public Criteria andPay_snGreaterThan(String value) {
            addCriterion("pay_sn >", value, "pay_sn");
            return (Criteria) this;
        }

        public Criteria andPay_snGreaterThanOrEqualTo(String value) {
            addCriterion("pay_sn >=", value, "pay_sn");
            return (Criteria) this;
        }

        public Criteria andPay_snLessThan(String value) {
            addCriterion("pay_sn <", value, "pay_sn");
            return (Criteria) this;
        }

        public Criteria andPay_snLessThanOrEqualTo(String value) {
            addCriterion("pay_sn <=", value, "pay_sn");
            return (Criteria) this;
        }

        public Criteria andPay_snLike(String value) {
            addCriterion("pay_sn like", value, "pay_sn");
            return (Criteria) this;
        }

        public Criteria andPay_snNotLike(String value) {
            addCriterion("pay_sn not like", value, "pay_sn");
            return (Criteria) this;
        }

        public Criteria andPay_snIn(List<String> values) {
            addCriterion("pay_sn in", values, "pay_sn");
            return (Criteria) this;
        }

        public Criteria andPay_snNotIn(List<String> values) {
            addCriterion("pay_sn not in", values, "pay_sn");
            return (Criteria) this;
        }

        public Criteria andPay_snBetween(String value1, String value2) {
            addCriterion("pay_sn between", value1, value2, "pay_sn");
            return (Criteria) this;
        }

        public Criteria andPay_snNotBetween(String value1, String value2) {
            addCriterion("pay_sn not between", value1, value2, "pay_sn");
            return (Criteria) this;
        }

        public Criteria andIs_codIsNull() {
            addCriterion("is_cod is null");
            return (Criteria) this;
        }

        public Criteria andIs_codIsNotNull() {
            addCriterion("is_cod is not null");
            return (Criteria) this;
        }

        public Criteria andIs_codEqualTo(Boolean value) {
            addCriterion("is_cod =", value, "is_cod");
            return (Criteria) this;
        }

        public Criteria andIs_codNotEqualTo(Boolean value) {
            addCriterion("is_cod <>", value, "is_cod");
            return (Criteria) this;
        }

        public Criteria andIs_codGreaterThan(Boolean value) {
            addCriterion("is_cod >", value, "is_cod");
            return (Criteria) this;
        }

        public Criteria andIs_codGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_cod >=", value, "is_cod");
            return (Criteria) this;
        }

        public Criteria andIs_codLessThan(Boolean value) {
            addCriterion("is_cod <", value, "is_cod");
            return (Criteria) this;
        }

        public Criteria andIs_codLessThanOrEqualTo(Boolean value) {
            addCriterion("is_cod <=", value, "is_cod");
            return (Criteria) this;
        }

        public Criteria andIs_codIn(List<Boolean> values) {
            addCriterion("is_cod in", values, "is_cod");
            return (Criteria) this;
        }

        public Criteria andIs_codNotIn(List<Boolean> values) {
            addCriterion("is_cod not in", values, "is_cod");
            return (Criteria) this;
        }

        public Criteria andIs_codBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cod between", value1, value2, "is_cod");
            return (Criteria) this;
        }

        public Criteria andIs_codNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cod not between", value1, value2, "is_cod");
            return (Criteria) this;
        }

        public Criteria andOrder_amountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrder_amountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_amountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "order_amount");
            return (Criteria) this;
        }

        public Criteria andOrder_pointsIsNull() {
            addCriterion("order_points is null");
            return (Criteria) this;
        }

        public Criteria andOrder_pointsIsNotNull() {
            addCriterion("order_points is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_pointsEqualTo(Integer value) {
            addCriterion("order_points =", value, "order_points");
            return (Criteria) this;
        }

        public Criteria andOrder_pointsNotEqualTo(Integer value) {
            addCriterion("order_points <>", value, "order_points");
            return (Criteria) this;
        }

        public Criteria andOrder_pointsGreaterThan(Integer value) {
            addCriterion("order_points >", value, "order_points");
            return (Criteria) this;
        }

        public Criteria andOrder_pointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_points >=", value, "order_points");
            return (Criteria) this;
        }

        public Criteria andOrder_pointsLessThan(Integer value) {
            addCriterion("order_points <", value, "order_points");
            return (Criteria) this;
        }

        public Criteria andOrder_pointsLessThanOrEqualTo(Integer value) {
            addCriterion("order_points <=", value, "order_points");
            return (Criteria) this;
        }

        public Criteria andOrder_pointsIn(List<Integer> values) {
            addCriterion("order_points in", values, "order_points");
            return (Criteria) this;
        }

        public Criteria andOrder_pointsNotIn(List<Integer> values) {
            addCriterion("order_points not in", values, "order_points");
            return (Criteria) this;
        }

        public Criteria andOrder_pointsBetween(Integer value1, Integer value2) {
            addCriterion("order_points between", value1, value2, "order_points");
            return (Criteria) this;
        }

        public Criteria andOrder_pointsNotBetween(Integer value1, Integer value2) {
            addCriterion("order_points not between", value1, value2, "order_points");
            return (Criteria) this;
        }

        public Criteria andMoney_paidIsNull() {
            addCriterion("money_paid is null");
            return (Criteria) this;
        }

        public Criteria andMoney_paidIsNotNull() {
            addCriterion("money_paid is not null");
            return (Criteria) this;
        }

        public Criteria andMoney_paidEqualTo(BigDecimal value) {
            addCriterion("money_paid =", value, "money_paid");
            return (Criteria) this;
        }

        public Criteria andMoney_paidNotEqualTo(BigDecimal value) {
            addCriterion("money_paid <>", value, "money_paid");
            return (Criteria) this;
        }

        public Criteria andMoney_paidGreaterThan(BigDecimal value) {
            addCriterion("money_paid >", value, "money_paid");
            return (Criteria) this;
        }

        public Criteria andMoney_paidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money_paid >=", value, "money_paid");
            return (Criteria) this;
        }

        public Criteria andMoney_paidLessThan(BigDecimal value) {
            addCriterion("money_paid <", value, "money_paid");
            return (Criteria) this;
        }

        public Criteria andMoney_paidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money_paid <=", value, "money_paid");
            return (Criteria) this;
        }

        public Criteria andMoney_paidIn(List<BigDecimal> values) {
            addCriterion("money_paid in", values, "money_paid");
            return (Criteria) this;
        }

        public Criteria andMoney_paidNotIn(List<BigDecimal> values) {
            addCriterion("money_paid not in", values, "money_paid");
            return (Criteria) this;
        }

        public Criteria andMoney_paidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_paid between", value1, value2, "money_paid");
            return (Criteria) this;
        }

        public Criteria andMoney_paidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money_paid not between", value1, value2, "money_paid");
            return (Criteria) this;
        }

        public Criteria andGoods_amountIsNull() {
            addCriterion("goods_amount is null");
            return (Criteria) this;
        }

        public Criteria andGoods_amountIsNotNull() {
            addCriterion("goods_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_amountEqualTo(BigDecimal value) {
            addCriterion("goods_amount =", value, "goods_amount");
            return (Criteria) this;
        }

        public Criteria andGoods_amountNotEqualTo(BigDecimal value) {
            addCriterion("goods_amount <>", value, "goods_amount");
            return (Criteria) this;
        }

        public Criteria andGoods_amountGreaterThan(BigDecimal value) {
            addCriterion("goods_amount >", value, "goods_amount");
            return (Criteria) this;
        }

        public Criteria andGoods_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount >=", value, "goods_amount");
            return (Criteria) this;
        }

        public Criteria andGoods_amountLessThan(BigDecimal value) {
            addCriterion("goods_amount <", value, "goods_amount");
            return (Criteria) this;
        }

        public Criteria andGoods_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_amount <=", value, "goods_amount");
            return (Criteria) this;
        }

        public Criteria andGoods_amountIn(List<BigDecimal> values) {
            addCriterion("goods_amount in", values, "goods_amount");
            return (Criteria) this;
        }

        public Criteria andGoods_amountNotIn(List<BigDecimal> values) {
            addCriterion("goods_amount not in", values, "goods_amount");
            return (Criteria) this;
        }

        public Criteria andGoods_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount between", value1, value2, "goods_amount");
            return (Criteria) this;
        }

        public Criteria andGoods_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_amount not between", value1, value2, "goods_amount");
            return (Criteria) this;
        }

        public Criteria andInv_feeIsNull() {
            addCriterion("inv_fee is null");
            return (Criteria) this;
        }

        public Criteria andInv_feeIsNotNull() {
            addCriterion("inv_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInv_feeEqualTo(BigDecimal value) {
            addCriterion("inv_fee =", value, "inv_fee");
            return (Criteria) this;
        }

        public Criteria andInv_feeNotEqualTo(BigDecimal value) {
            addCriterion("inv_fee <>", value, "inv_fee");
            return (Criteria) this;
        }

        public Criteria andInv_feeGreaterThan(BigDecimal value) {
            addCriterion("inv_fee >", value, "inv_fee");
            return (Criteria) this;
        }

        public Criteria andInv_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("inv_fee >=", value, "inv_fee");
            return (Criteria) this;
        }

        public Criteria andInv_feeLessThan(BigDecimal value) {
            addCriterion("inv_fee <", value, "inv_fee");
            return (Criteria) this;
        }

        public Criteria andInv_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("inv_fee <=", value, "inv_fee");
            return (Criteria) this;
        }

        public Criteria andInv_feeIn(List<BigDecimal> values) {
            addCriterion("inv_fee in", values, "inv_fee");
            return (Criteria) this;
        }

        public Criteria andInv_feeNotIn(List<BigDecimal> values) {
            addCriterion("inv_fee not in", values, "inv_fee");
            return (Criteria) this;
        }

        public Criteria andInv_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inv_fee between", value1, value2, "inv_fee");
            return (Criteria) this;
        }

        public Criteria andInv_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inv_fee not between", value1, value2, "inv_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeIsNull() {
            addCriterion("shipping_fee is null");
            return (Criteria) this;
        }

        public Criteria andShipping_feeIsNotNull() {
            addCriterion("shipping_fee is not null");
            return (Criteria) this;
        }

        public Criteria andShipping_feeEqualTo(BigDecimal value) {
            addCriterion("shipping_fee =", value, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeNotEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <>", value, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeGreaterThan(BigDecimal value) {
            addCriterion("shipping_fee >", value, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee >=", value, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeLessThan(BigDecimal value) {
            addCriterion("shipping_fee <", value, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_fee <=", value, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeIn(List<BigDecimal> values) {
            addCriterion("shipping_fee in", values, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeNotIn(List<BigDecimal> values) {
            addCriterion("shipping_fee not in", values, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee between", value1, value2, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andShipping_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_fee not between", value1, value2, "shipping_fee");
            return (Criteria) this;
        }

        public Criteria andCash_moreIsNull() {
            addCriterion("cash_more is null");
            return (Criteria) this;
        }

        public Criteria andCash_moreIsNotNull() {
            addCriterion("cash_more is not null");
            return (Criteria) this;
        }

        public Criteria andCash_moreEqualTo(BigDecimal value) {
            addCriterion("cash_more =", value, "cash_more");
            return (Criteria) this;
        }

        public Criteria andCash_moreNotEqualTo(BigDecimal value) {
            addCriterion("cash_more <>", value, "cash_more");
            return (Criteria) this;
        }

        public Criteria andCash_moreGreaterThan(BigDecimal value) {
            addCriterion("cash_more >", value, "cash_more");
            return (Criteria) this;
        }

        public Criteria andCash_moreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_more >=", value, "cash_more");
            return (Criteria) this;
        }

        public Criteria andCash_moreLessThan(BigDecimal value) {
            addCriterion("cash_more <", value, "cash_more");
            return (Criteria) this;
        }

        public Criteria andCash_moreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_more <=", value, "cash_more");
            return (Criteria) this;
        }

        public Criteria andCash_moreIn(List<BigDecimal> values) {
            addCriterion("cash_more in", values, "cash_more");
            return (Criteria) this;
        }

        public Criteria andCash_moreNotIn(List<BigDecimal> values) {
            addCriterion("cash_more not in", values, "cash_more");
            return (Criteria) this;
        }

        public Criteria andCash_moreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_more between", value1, value2, "cash_more");
            return (Criteria) this;
        }

        public Criteria andCash_moreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_more not between", value1, value2, "cash_more");
            return (Criteria) this;
        }

        public Criteria andDiscount_feeIsNull() {
            addCriterion("discount_fee is null");
            return (Criteria) this;
        }

        public Criteria andDiscount_feeIsNotNull() {
            addCriterion("discount_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDiscount_feeEqualTo(BigDecimal value) {
            addCriterion("discount_fee =", value, "discount_fee");
            return (Criteria) this;
        }

        public Criteria andDiscount_feeNotEqualTo(BigDecimal value) {
            addCriterion("discount_fee <>", value, "discount_fee");
            return (Criteria) this;
        }

        public Criteria andDiscount_feeGreaterThan(BigDecimal value) {
            addCriterion("discount_fee >", value, "discount_fee");
            return (Criteria) this;
        }

        public Criteria andDiscount_feeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_fee >=", value, "discount_fee");
            return (Criteria) this;
        }

        public Criteria andDiscount_feeLessThan(BigDecimal value) {
            addCriterion("discount_fee <", value, "discount_fee");
            return (Criteria) this;
        }

        public Criteria andDiscount_feeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_fee <=", value, "discount_fee");
            return (Criteria) this;
        }

        public Criteria andDiscount_feeIn(List<BigDecimal> values) {
            addCriterion("discount_fee in", values, "discount_fee");
            return (Criteria) this;
        }

        public Criteria andDiscount_feeNotIn(List<BigDecimal> values) {
            addCriterion("discount_fee not in", values, "discount_fee");
            return (Criteria) this;
        }

        public Criteria andDiscount_feeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_fee between", value1, value2, "discount_fee");
            return (Criteria) this;
        }

        public Criteria andDiscount_feeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_fee not between", value1, value2, "discount_fee");
            return (Criteria) this;
        }

        public Criteria andChange_amountIsNull() {
            addCriterion("change_amount is null");
            return (Criteria) this;
        }

        public Criteria andChange_amountIsNotNull() {
            addCriterion("change_amount is not null");
            return (Criteria) this;
        }

        public Criteria andChange_amountEqualTo(BigDecimal value) {
            addCriterion("change_amount =", value, "change_amount");
            return (Criteria) this;
        }

        public Criteria andChange_amountNotEqualTo(BigDecimal value) {
            addCriterion("change_amount <>", value, "change_amount");
            return (Criteria) this;
        }

        public Criteria andChange_amountGreaterThan(BigDecimal value) {
            addCriterion("change_amount >", value, "change_amount");
            return (Criteria) this;
        }

        public Criteria andChange_amountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("change_amount >=", value, "change_amount");
            return (Criteria) this;
        }

        public Criteria andChange_amountLessThan(BigDecimal value) {
            addCriterion("change_amount <", value, "change_amount");
            return (Criteria) this;
        }

        public Criteria andChange_amountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("change_amount <=", value, "change_amount");
            return (Criteria) this;
        }

        public Criteria andChange_amountIn(List<BigDecimal> values) {
            addCriterion("change_amount in", values, "change_amount");
            return (Criteria) this;
        }

        public Criteria andChange_amountNotIn(List<BigDecimal> values) {
            addCriterion("change_amount not in", values, "change_amount");
            return (Criteria) this;
        }

        public Criteria andChange_amountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_amount between", value1, value2, "change_amount");
            return (Criteria) this;
        }

        public Criteria andChange_amountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_amount not between", value1, value2, "change_amount");
            return (Criteria) this;
        }

        public Criteria andShipping_changeIsNull() {
            addCriterion("shipping_change is null");
            return (Criteria) this;
        }

        public Criteria andShipping_changeIsNotNull() {
            addCriterion("shipping_change is not null");
            return (Criteria) this;
        }

        public Criteria andShipping_changeEqualTo(BigDecimal value) {
            addCriterion("shipping_change =", value, "shipping_change");
            return (Criteria) this;
        }

        public Criteria andShipping_changeNotEqualTo(BigDecimal value) {
            addCriterion("shipping_change <>", value, "shipping_change");
            return (Criteria) this;
        }

        public Criteria andShipping_changeGreaterThan(BigDecimal value) {
            addCriterion("shipping_change >", value, "shipping_change");
            return (Criteria) this;
        }

        public Criteria andShipping_changeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_change >=", value, "shipping_change");
            return (Criteria) this;
        }

        public Criteria andShipping_changeLessThan(BigDecimal value) {
            addCriterion("shipping_change <", value, "shipping_change");
            return (Criteria) this;
        }

        public Criteria andShipping_changeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_change <=", value, "shipping_change");
            return (Criteria) this;
        }

        public Criteria andShipping_changeIn(List<BigDecimal> values) {
            addCriterion("shipping_change in", values, "shipping_change");
            return (Criteria) this;
        }

        public Criteria andShipping_changeNotIn(List<BigDecimal> values) {
            addCriterion("shipping_change not in", values, "shipping_change");
            return (Criteria) this;
        }

        public Criteria andShipping_changeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_change between", value1, value2, "shipping_change");
            return (Criteria) this;
        }

        public Criteria andShipping_changeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_change not between", value1, value2, "shipping_change");
            return (Criteria) this;
        }

        public Criteria andSurplusIsNull() {
            addCriterion("surplus is null");
            return (Criteria) this;
        }

        public Criteria andSurplusIsNotNull() {
            addCriterion("surplus is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusEqualTo(BigDecimal value) {
            addCriterion("surplus =", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotEqualTo(BigDecimal value) {
            addCriterion("surplus <>", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusGreaterThan(BigDecimal value) {
            addCriterion("surplus >", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("surplus >=", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusLessThan(BigDecimal value) {
            addCriterion("surplus <", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("surplus <=", value, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusIn(List<BigDecimal> values) {
            addCriterion("surplus in", values, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotIn(List<BigDecimal> values) {
            addCriterion("surplus not in", values, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("surplus between", value1, value2, "surplus");
            return (Criteria) this;
        }

        public Criteria andSurplusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("surplus not between", value1, value2, "surplus");
            return (Criteria) this;
        }

        public Criteria andUser_surplusIsNull() {
            addCriterion("user_surplus is null");
            return (Criteria) this;
        }

        public Criteria andUser_surplusIsNotNull() {
            addCriterion("user_surplus is not null");
            return (Criteria) this;
        }

        public Criteria andUser_surplusEqualTo(BigDecimal value) {
            addCriterion("user_surplus =", value, "user_surplus");
            return (Criteria) this;
        }

        public Criteria andUser_surplusNotEqualTo(BigDecimal value) {
            addCriterion("user_surplus <>", value, "user_surplus");
            return (Criteria) this;
        }

        public Criteria andUser_surplusGreaterThan(BigDecimal value) {
            addCriterion("user_surplus >", value, "user_surplus");
            return (Criteria) this;
        }

        public Criteria andUser_surplusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_surplus >=", value, "user_surplus");
            return (Criteria) this;
        }

        public Criteria andUser_surplusLessThan(BigDecimal value) {
            addCriterion("user_surplus <", value, "user_surplus");
            return (Criteria) this;
        }

        public Criteria andUser_surplusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_surplus <=", value, "user_surplus");
            return (Criteria) this;
        }

        public Criteria andUser_surplusIn(List<BigDecimal> values) {
            addCriterion("user_surplus in", values, "user_surplus");
            return (Criteria) this;
        }

        public Criteria andUser_surplusNotIn(List<BigDecimal> values) {
            addCriterion("user_surplus not in", values, "user_surplus");
            return (Criteria) this;
        }

        public Criteria andUser_surplusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_surplus between", value1, value2, "user_surplus");
            return (Criteria) this;
        }

        public Criteria andUser_surplusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_surplus not between", value1, value2, "user_surplus");
            return (Criteria) this;
        }

        public Criteria andUser_surplus_limitIsNull() {
            addCriterion("user_surplus_limit is null");
            return (Criteria) this;
        }

        public Criteria andUser_surplus_limitIsNotNull() {
            addCriterion("user_surplus_limit is not null");
            return (Criteria) this;
        }

        public Criteria andUser_surplus_limitEqualTo(BigDecimal value) {
            addCriterion("user_surplus_limit =", value, "user_surplus_limit");
            return (Criteria) this;
        }

        public Criteria andUser_surplus_limitNotEqualTo(BigDecimal value) {
            addCriterion("user_surplus_limit <>", value, "user_surplus_limit");
            return (Criteria) this;
        }

        public Criteria andUser_surplus_limitGreaterThan(BigDecimal value) {
            addCriterion("user_surplus_limit >", value, "user_surplus_limit");
            return (Criteria) this;
        }

        public Criteria andUser_surplus_limitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_surplus_limit >=", value, "user_surplus_limit");
            return (Criteria) this;
        }

        public Criteria andUser_surplus_limitLessThan(BigDecimal value) {
            addCriterion("user_surplus_limit <", value, "user_surplus_limit");
            return (Criteria) this;
        }

        public Criteria andUser_surplus_limitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_surplus_limit <=", value, "user_surplus_limit");
            return (Criteria) this;
        }

        public Criteria andUser_surplus_limitIn(List<BigDecimal> values) {
            addCriterion("user_surplus_limit in", values, "user_surplus_limit");
            return (Criteria) this;
        }

        public Criteria andUser_surplus_limitNotIn(List<BigDecimal> values) {
            addCriterion("user_surplus_limit not in", values, "user_surplus_limit");
            return (Criteria) this;
        }

        public Criteria andUser_surplus_limitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_surplus_limit between", value1, value2, "user_surplus_limit");
            return (Criteria) this;
        }

        public Criteria andUser_surplus_limitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_surplus_limit not between", value1, value2, "user_surplus_limit");
            return (Criteria) this;
        }

        public Criteria andBonus_idIsNull() {
            addCriterion("bonus_id is null");
            return (Criteria) this;
        }

        public Criteria andBonus_idIsNotNull() {
            addCriterion("bonus_id is not null");
            return (Criteria) this;
        }

        public Criteria andBonus_idEqualTo(Integer value) {
            addCriterion("bonus_id =", value, "bonus_id");
            return (Criteria) this;
        }

        public Criteria andBonus_idNotEqualTo(Integer value) {
            addCriterion("bonus_id <>", value, "bonus_id");
            return (Criteria) this;
        }

        public Criteria andBonus_idGreaterThan(Integer value) {
            addCriterion("bonus_id >", value, "bonus_id");
            return (Criteria) this;
        }

        public Criteria andBonus_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("bonus_id >=", value, "bonus_id");
            return (Criteria) this;
        }

        public Criteria andBonus_idLessThan(Integer value) {
            addCriterion("bonus_id <", value, "bonus_id");
            return (Criteria) this;
        }

        public Criteria andBonus_idLessThanOrEqualTo(Integer value) {
            addCriterion("bonus_id <=", value, "bonus_id");
            return (Criteria) this;
        }

        public Criteria andBonus_idIn(List<Integer> values) {
            addCriterion("bonus_id in", values, "bonus_id");
            return (Criteria) this;
        }

        public Criteria andBonus_idNotIn(List<Integer> values) {
            addCriterion("bonus_id not in", values, "bonus_id");
            return (Criteria) this;
        }

        public Criteria andBonus_idBetween(Integer value1, Integer value2) {
            addCriterion("bonus_id between", value1, value2, "bonus_id");
            return (Criteria) this;
        }

        public Criteria andBonus_idNotBetween(Integer value1, Integer value2) {
            addCriterion("bonus_id not between", value1, value2, "bonus_id");
            return (Criteria) this;
        }

        public Criteria andShop_bonus_idIsNull() {
            addCriterion("shop_bonus_id is null");
            return (Criteria) this;
        }

        public Criteria andShop_bonus_idIsNotNull() {
            addCriterion("shop_bonus_id is not null");
            return (Criteria) this;
        }

        public Criteria andShop_bonus_idEqualTo(Integer value) {
            addCriterion("shop_bonus_id =", value, "shop_bonus_id");
            return (Criteria) this;
        }

        public Criteria andShop_bonus_idNotEqualTo(Integer value) {
            addCriterion("shop_bonus_id <>", value, "shop_bonus_id");
            return (Criteria) this;
        }

        public Criteria andShop_bonus_idGreaterThan(Integer value) {
            addCriterion("shop_bonus_id >", value, "shop_bonus_id");
            return (Criteria) this;
        }

        public Criteria andShop_bonus_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_bonus_id >=", value, "shop_bonus_id");
            return (Criteria) this;
        }

        public Criteria andShop_bonus_idLessThan(Integer value) {
            addCriterion("shop_bonus_id <", value, "shop_bonus_id");
            return (Criteria) this;
        }

        public Criteria andShop_bonus_idLessThanOrEqualTo(Integer value) {
            addCriterion("shop_bonus_id <=", value, "shop_bonus_id");
            return (Criteria) this;
        }

        public Criteria andShop_bonus_idIn(List<Integer> values) {
            addCriterion("shop_bonus_id in", values, "shop_bonus_id");
            return (Criteria) this;
        }

        public Criteria andShop_bonus_idNotIn(List<Integer> values) {
            addCriterion("shop_bonus_id not in", values, "shop_bonus_id");
            return (Criteria) this;
        }

        public Criteria andShop_bonus_idBetween(Integer value1, Integer value2) {
            addCriterion("shop_bonus_id between", value1, value2, "shop_bonus_id");
            return (Criteria) this;
        }

        public Criteria andShop_bonus_idNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_bonus_id not between", value1, value2, "shop_bonus_id");
            return (Criteria) this;
        }

        public Criteria andBonusIsNull() {
            addCriterion("bonus is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("bonus is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(BigDecimal value) {
            addCriterion("bonus =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(BigDecimal value) {
            addCriterion("bonus <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(BigDecimal value) {
            addCriterion("bonus >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(BigDecimal value) {
            addCriterion("bonus <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<BigDecimal> values) {
            addCriterion("bonus in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<BigDecimal> values) {
            addCriterion("bonus not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus not between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andShop_bonusIsNull() {
            addCriterion("shop_bonus is null");
            return (Criteria) this;
        }

        public Criteria andShop_bonusIsNotNull() {
            addCriterion("shop_bonus is not null");
            return (Criteria) this;
        }

        public Criteria andShop_bonusEqualTo(BigDecimal value) {
            addCriterion("shop_bonus =", value, "shop_bonus");
            return (Criteria) this;
        }

        public Criteria andShop_bonusNotEqualTo(BigDecimal value) {
            addCriterion("shop_bonus <>", value, "shop_bonus");
            return (Criteria) this;
        }

        public Criteria andShop_bonusGreaterThan(BigDecimal value) {
            addCriterion("shop_bonus >", value, "shop_bonus");
            return (Criteria) this;
        }

        public Criteria andShop_bonusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_bonus >=", value, "shop_bonus");
            return (Criteria) this;
        }

        public Criteria andShop_bonusLessThan(BigDecimal value) {
            addCriterion("shop_bonus <", value, "shop_bonus");
            return (Criteria) this;
        }

        public Criteria andShop_bonusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shop_bonus <=", value, "shop_bonus");
            return (Criteria) this;
        }

        public Criteria andShop_bonusIn(List<BigDecimal> values) {
            addCriterion("shop_bonus in", values, "shop_bonus");
            return (Criteria) this;
        }

        public Criteria andShop_bonusNotIn(List<BigDecimal> values) {
            addCriterion("shop_bonus not in", values, "shop_bonus");
            return (Criteria) this;
        }

        public Criteria andShop_bonusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_bonus between", value1, value2, "shop_bonus");
            return (Criteria) this;
        }

        public Criteria andShop_bonusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shop_bonus not between", value1, value2, "shop_bonus");
            return (Criteria) this;
        }

        public Criteria andStore_card_idIsNull() {
            addCriterion("store_card_id is null");
            return (Criteria) this;
        }

        public Criteria andStore_card_idIsNotNull() {
            addCriterion("store_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andStore_card_idEqualTo(Integer value) {
            addCriterion("store_card_id =", value, "store_card_id");
            return (Criteria) this;
        }

        public Criteria andStore_card_idNotEqualTo(Integer value) {
            addCriterion("store_card_id <>", value, "store_card_id");
            return (Criteria) this;
        }

        public Criteria andStore_card_idGreaterThan(Integer value) {
            addCriterion("store_card_id >", value, "store_card_id");
            return (Criteria) this;
        }

        public Criteria andStore_card_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_card_id >=", value, "store_card_id");
            return (Criteria) this;
        }

        public Criteria andStore_card_idLessThan(Integer value) {
            addCriterion("store_card_id <", value, "store_card_id");
            return (Criteria) this;
        }

        public Criteria andStore_card_idLessThanOrEqualTo(Integer value) {
            addCriterion("store_card_id <=", value, "store_card_id");
            return (Criteria) this;
        }

        public Criteria andStore_card_idIn(List<Integer> values) {
            addCriterion("store_card_id in", values, "store_card_id");
            return (Criteria) this;
        }

        public Criteria andStore_card_idNotIn(List<Integer> values) {
            addCriterion("store_card_id not in", values, "store_card_id");
            return (Criteria) this;
        }

        public Criteria andStore_card_idBetween(Integer value1, Integer value2) {
            addCriterion("store_card_id between", value1, value2, "store_card_id");
            return (Criteria) this;
        }

        public Criteria andStore_card_idNotBetween(Integer value1, Integer value2) {
            addCriterion("store_card_id not between", value1, value2, "store_card_id");
            return (Criteria) this;
        }

        public Criteria andStore_card_priceIsNull() {
            addCriterion("store_card_price is null");
            return (Criteria) this;
        }

        public Criteria andStore_card_priceIsNotNull() {
            addCriterion("store_card_price is not null");
            return (Criteria) this;
        }

        public Criteria andStore_card_priceEqualTo(BigDecimal value) {
            addCriterion("store_card_price =", value, "store_card_price");
            return (Criteria) this;
        }

        public Criteria andStore_card_priceNotEqualTo(BigDecimal value) {
            addCriterion("store_card_price <>", value, "store_card_price");
            return (Criteria) this;
        }

        public Criteria andStore_card_priceGreaterThan(BigDecimal value) {
            addCriterion("store_card_price >", value, "store_card_price");
            return (Criteria) this;
        }

        public Criteria andStore_card_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_card_price >=", value, "store_card_price");
            return (Criteria) this;
        }

        public Criteria andStore_card_priceLessThan(BigDecimal value) {
            addCriterion("store_card_price <", value, "store_card_price");
            return (Criteria) this;
        }

        public Criteria andStore_card_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_card_price <=", value, "store_card_price");
            return (Criteria) this;
        }

        public Criteria andStore_card_priceIn(List<BigDecimal> values) {
            addCriterion("store_card_price in", values, "store_card_price");
            return (Criteria) this;
        }

        public Criteria andStore_card_priceNotIn(List<BigDecimal> values) {
            addCriterion("store_card_price not in", values, "store_card_price");
            return (Criteria) this;
        }

        public Criteria andStore_card_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_card_price between", value1, value2, "store_card_price");
            return (Criteria) this;
        }

        public Criteria andStore_card_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_card_price not between", value1, value2, "store_card_price");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyIsNull() {
            addCriterion("integral_money is null");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyIsNotNull() {
            addCriterion("integral_money is not null");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyEqualTo(BigDecimal value) {
            addCriterion("integral_money =", value, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyNotEqualTo(BigDecimal value) {
            addCriterion("integral_money <>", value, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyGreaterThan(BigDecimal value) {
            addCriterion("integral_money >", value, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("integral_money >=", value, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyLessThan(BigDecimal value) {
            addCriterion("integral_money <", value, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("integral_money <=", value, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyIn(List<BigDecimal> values) {
            addCriterion("integral_money in", values, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyNotIn(List<BigDecimal> values) {
            addCriterion("integral_money not in", values, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integral_money between", value1, value2, "integral_money");
            return (Criteria) this;
        }

        public Criteria andIntegral_moneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integral_money not between", value1, value2, "integral_money");
            return (Criteria) this;
        }

        public Criteria andGive_integralIsNull() {
            addCriterion("give_integral is null");
            return (Criteria) this;
        }

        public Criteria andGive_integralIsNotNull() {
            addCriterion("give_integral is not null");
            return (Criteria) this;
        }

        public Criteria andGive_integralEqualTo(Integer value) {
            addCriterion("give_integral =", value, "give_integral");
            return (Criteria) this;
        }

        public Criteria andGive_integralNotEqualTo(Integer value) {
            addCriterion("give_integral <>", value, "give_integral");
            return (Criteria) this;
        }

        public Criteria andGive_integralGreaterThan(Integer value) {
            addCriterion("give_integral >", value, "give_integral");
            return (Criteria) this;
        }

        public Criteria andGive_integralGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_integral >=", value, "give_integral");
            return (Criteria) this;
        }

        public Criteria andGive_integralLessThan(Integer value) {
            addCriterion("give_integral <", value, "give_integral");
            return (Criteria) this;
        }

        public Criteria andGive_integralLessThanOrEqualTo(Integer value) {
            addCriterion("give_integral <=", value, "give_integral");
            return (Criteria) this;
        }

        public Criteria andGive_integralIn(List<Integer> values) {
            addCriterion("give_integral in", values, "give_integral");
            return (Criteria) this;
        }

        public Criteria andGive_integralNotIn(List<Integer> values) {
            addCriterion("give_integral not in", values, "give_integral");
            return (Criteria) this;
        }

        public Criteria andGive_integralBetween(Integer value1, Integer value2) {
            addCriterion("give_integral between", value1, value2, "give_integral");
            return (Criteria) this;
        }

        public Criteria andGive_integralNotBetween(Integer value1, Integer value2) {
            addCriterion("give_integral not between", value1, value2, "give_integral");
            return (Criteria) this;
        }

        public Criteria andOrder_fromIsNull() {
            addCriterion("order_from is null");
            return (Criteria) this;
        }

        public Criteria andOrder_fromIsNotNull() {
            addCriterion("order_from is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_fromEqualTo(String value) {
            addCriterion("order_from =", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromNotEqualTo(String value) {
            addCriterion("order_from <>", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromGreaterThan(String value) {
            addCriterion("order_from >", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromGreaterThanOrEqualTo(String value) {
            addCriterion("order_from >=", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromLessThan(String value) {
            addCriterion("order_from <", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromLessThanOrEqualTo(String value) {
            addCriterion("order_from <=", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromLike(String value) {
            addCriterion("order_from like", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromNotLike(String value) {
            addCriterion("order_from not like", value, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromIn(List<String> values) {
            addCriterion("order_from in", values, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromNotIn(List<String> values) {
            addCriterion("order_from not in", values, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromBetween(String value1, String value2) {
            addCriterion("order_from between", value1, value2, "order_from");
            return (Criteria) this;
        }

        public Criteria andOrder_fromNotBetween(String value1, String value2) {
            addCriterion("order_from not between", value1, value2, "order_from");
            return (Criteria) this;
        }

        public Criteria andAdd_timeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAdd_timeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdd_timeEqualTo(Integer value) {
            addCriterion("add_time =", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeLessThan(Integer value) {
            addCriterion("add_time <", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeIn(List<Integer> values) {
            addCriterion("add_time in", values, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "add_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPay_timeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPay_timeEqualTo(Integer value) {
            addCriterion("pay_time =", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotEqualTo(Integer value) {
            addCriterion("pay_time <>", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeGreaterThan(Integer value) {
            addCriterion("pay_time >", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_time >=", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeLessThan(Integer value) {
            addCriterion("pay_time <", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_time <=", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeIn(List<Integer> values) {
            addCriterion("pay_time in", values, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotIn(List<Integer> values) {
            addCriterion("pay_time not in", values, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeBetween(Integer value1, Integer value2) {
            addCriterion("pay_time between", value1, value2, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_time not between", value1, value2, "pay_time");
            return (Criteria) this;
        }

        public Criteria andShipping_timeIsNull() {
            addCriterion("shipping_time is null");
            return (Criteria) this;
        }

        public Criteria andShipping_timeIsNotNull() {
            addCriterion("shipping_time is not null");
            return (Criteria) this;
        }

        public Criteria andShipping_timeEqualTo(Integer value) {
            addCriterion("shipping_time =", value, "shipping_time");
            return (Criteria) this;
        }

        public Criteria andShipping_timeNotEqualTo(Integer value) {
            addCriterion("shipping_time <>", value, "shipping_time");
            return (Criteria) this;
        }

        public Criteria andShipping_timeGreaterThan(Integer value) {
            addCriterion("shipping_time >", value, "shipping_time");
            return (Criteria) this;
        }

        public Criteria andShipping_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_time >=", value, "shipping_time");
            return (Criteria) this;
        }

        public Criteria andShipping_timeLessThan(Integer value) {
            addCriterion("shipping_time <", value, "shipping_time");
            return (Criteria) this;
        }

        public Criteria andShipping_timeLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_time <=", value, "shipping_time");
            return (Criteria) this;
        }

        public Criteria andShipping_timeIn(List<Integer> values) {
            addCriterion("shipping_time in", values, "shipping_time");
            return (Criteria) this;
        }

        public Criteria andShipping_timeNotIn(List<Integer> values) {
            addCriterion("shipping_time not in", values, "shipping_time");
            return (Criteria) this;
        }

        public Criteria andShipping_timeBetween(Integer value1, Integer value2) {
            addCriterion("shipping_time between", value1, value2, "shipping_time");
            return (Criteria) this;
        }

        public Criteria andShipping_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_time not between", value1, value2, "shipping_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeEqualTo(Integer value) {
            addCriterion("confirm_time =", value, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeNotEqualTo(Integer value) {
            addCriterion("confirm_time <>", value, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeGreaterThan(Integer value) {
            addCriterion("confirm_time >", value, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_time >=", value, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeLessThan(Integer value) {
            addCriterion("confirm_time <", value, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_time <=", value, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeIn(List<Integer> values) {
            addCriterion("confirm_time in", values, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeNotIn(List<Integer> values) {
            addCriterion("confirm_time not in", values, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeBetween(Integer value1, Integer value2) {
            addCriterion("confirm_time between", value1, value2, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andConfirm_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_time not between", value1, value2, "confirm_time");
            return (Criteria) this;
        }

        public Criteria andDelay_daysIsNull() {
            addCriterion("delay_days is null");
            return (Criteria) this;
        }

        public Criteria andDelay_daysIsNotNull() {
            addCriterion("delay_days is not null");
            return (Criteria) this;
        }

        public Criteria andDelay_daysEqualTo(Boolean value) {
            addCriterion("delay_days =", value, "delay_days");
            return (Criteria) this;
        }

        public Criteria andDelay_daysNotEqualTo(Boolean value) {
            addCriterion("delay_days <>", value, "delay_days");
            return (Criteria) this;
        }

        public Criteria andDelay_daysGreaterThan(Boolean value) {
            addCriterion("delay_days >", value, "delay_days");
            return (Criteria) this;
        }

        public Criteria andDelay_daysGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delay_days >=", value, "delay_days");
            return (Criteria) this;
        }

        public Criteria andDelay_daysLessThan(Boolean value) {
            addCriterion("delay_days <", value, "delay_days");
            return (Criteria) this;
        }

        public Criteria andDelay_daysLessThanOrEqualTo(Boolean value) {
            addCriterion("delay_days <=", value, "delay_days");
            return (Criteria) this;
        }

        public Criteria andDelay_daysIn(List<Boolean> values) {
            addCriterion("delay_days in", values, "delay_days");
            return (Criteria) this;
        }

        public Criteria andDelay_daysNotIn(List<Boolean> values) {
            addCriterion("delay_days not in", values, "delay_days");
            return (Criteria) this;
        }

        public Criteria andDelay_daysBetween(Boolean value1, Boolean value2) {
            addCriterion("delay_days between", value1, value2, "delay_days");
            return (Criteria) this;
        }

        public Criteria andDelay_daysNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delay_days not between", value1, value2, "delay_days");
            return (Criteria) this;
        }

        public Criteria andOrder_typeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrder_typeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_typeEqualTo(Boolean value) {
            addCriterion("order_type =", value, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeNotEqualTo(Boolean value) {
            addCriterion("order_type <>", value, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeGreaterThan(Boolean value) {
            addCriterion("order_type >", value, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_type >=", value, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeLessThan(Boolean value) {
            addCriterion("order_type <", value, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeLessThanOrEqualTo(Boolean value) {
            addCriterion("order_type <=", value, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeIn(List<Boolean> values) {
            addCriterion("order_type in", values, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeNotIn(List<Boolean> values) {
            addCriterion("order_type not in", values, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeBetween(Boolean value1, Boolean value2) {
            addCriterion("order_type between", value1, value2, "order_type");
            return (Criteria) this;
        }

        public Criteria andOrder_typeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_type not between", value1, value2, "order_type");
            return (Criteria) this;
        }

        public Criteria andService_markIsNull() {
            addCriterion("service_mark is null");
            return (Criteria) this;
        }

        public Criteria andService_markIsNotNull() {
            addCriterion("service_mark is not null");
            return (Criteria) this;
        }

        public Criteria andService_markEqualTo(Boolean value) {
            addCriterion("service_mark =", value, "service_mark");
            return (Criteria) this;
        }

        public Criteria andService_markNotEqualTo(Boolean value) {
            addCriterion("service_mark <>", value, "service_mark");
            return (Criteria) this;
        }

        public Criteria andService_markGreaterThan(Boolean value) {
            addCriterion("service_mark >", value, "service_mark");
            return (Criteria) this;
        }

        public Criteria andService_markGreaterThanOrEqualTo(Boolean value) {
            addCriterion("service_mark >=", value, "service_mark");
            return (Criteria) this;
        }

        public Criteria andService_markLessThan(Boolean value) {
            addCriterion("service_mark <", value, "service_mark");
            return (Criteria) this;
        }

        public Criteria andService_markLessThanOrEqualTo(Boolean value) {
            addCriterion("service_mark <=", value, "service_mark");
            return (Criteria) this;
        }

        public Criteria andService_markIn(List<Boolean> values) {
            addCriterion("service_mark in", values, "service_mark");
            return (Criteria) this;
        }

        public Criteria andService_markNotIn(List<Boolean> values) {
            addCriterion("service_mark not in", values, "service_mark");
            return (Criteria) this;
        }

        public Criteria andService_markBetween(Boolean value1, Boolean value2) {
            addCriterion("service_mark between", value1, value2, "service_mark");
            return (Criteria) this;
        }

        public Criteria andService_markNotBetween(Boolean value1, Boolean value2) {
            addCriterion("service_mark not between", value1, value2, "service_mark");
            return (Criteria) this;
        }

        public Criteria andSend_markIsNull() {
            addCriterion("send_mark is null");
            return (Criteria) this;
        }

        public Criteria andSend_markIsNotNull() {
            addCriterion("send_mark is not null");
            return (Criteria) this;
        }

        public Criteria andSend_markEqualTo(Boolean value) {
            addCriterion("send_mark =", value, "send_mark");
            return (Criteria) this;
        }

        public Criteria andSend_markNotEqualTo(Boolean value) {
            addCriterion("send_mark <>", value, "send_mark");
            return (Criteria) this;
        }

        public Criteria andSend_markGreaterThan(Boolean value) {
            addCriterion("send_mark >", value, "send_mark");
            return (Criteria) this;
        }

        public Criteria andSend_markGreaterThanOrEqualTo(Boolean value) {
            addCriterion("send_mark >=", value, "send_mark");
            return (Criteria) this;
        }

        public Criteria andSend_markLessThan(Boolean value) {
            addCriterion("send_mark <", value, "send_mark");
            return (Criteria) this;
        }

        public Criteria andSend_markLessThanOrEqualTo(Boolean value) {
            addCriterion("send_mark <=", value, "send_mark");
            return (Criteria) this;
        }

        public Criteria andSend_markIn(List<Boolean> values) {
            addCriterion("send_mark in", values, "send_mark");
            return (Criteria) this;
        }

        public Criteria andSend_markNotIn(List<Boolean> values) {
            addCriterion("send_mark not in", values, "send_mark");
            return (Criteria) this;
        }

        public Criteria andSend_markBetween(Boolean value1, Boolean value2) {
            addCriterion("send_mark between", value1, value2, "send_mark");
            return (Criteria) this;
        }

        public Criteria andSend_markNotBetween(Boolean value1, Boolean value2) {
            addCriterion("send_mark not between", value1, value2, "send_mark");
            return (Criteria) this;
        }

        public Criteria andShipping_markIsNull() {
            addCriterion("shipping_mark is null");
            return (Criteria) this;
        }

        public Criteria andShipping_markIsNotNull() {
            addCriterion("shipping_mark is not null");
            return (Criteria) this;
        }

        public Criteria andShipping_markEqualTo(Boolean value) {
            addCriterion("shipping_mark =", value, "shipping_mark");
            return (Criteria) this;
        }

        public Criteria andShipping_markNotEqualTo(Boolean value) {
            addCriterion("shipping_mark <>", value, "shipping_mark");
            return (Criteria) this;
        }

        public Criteria andShipping_markGreaterThan(Boolean value) {
            addCriterion("shipping_mark >", value, "shipping_mark");
            return (Criteria) this;
        }

        public Criteria andShipping_markGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shipping_mark >=", value, "shipping_mark");
            return (Criteria) this;
        }

        public Criteria andShipping_markLessThan(Boolean value) {
            addCriterion("shipping_mark <", value, "shipping_mark");
            return (Criteria) this;
        }

        public Criteria andShipping_markLessThanOrEqualTo(Boolean value) {
            addCriterion("shipping_mark <=", value, "shipping_mark");
            return (Criteria) this;
        }

        public Criteria andShipping_markIn(List<Boolean> values) {
            addCriterion("shipping_mark in", values, "shipping_mark");
            return (Criteria) this;
        }

        public Criteria andShipping_markNotIn(List<Boolean> values) {
            addCriterion("shipping_mark not in", values, "shipping_mark");
            return (Criteria) this;
        }

        public Criteria andShipping_markBetween(Boolean value1, Boolean value2) {
            addCriterion("shipping_mark between", value1, value2, "shipping_mark");
            return (Criteria) this;
        }

        public Criteria andShipping_markNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shipping_mark not between", value1, value2, "shipping_mark");
            return (Criteria) this;
        }

        public Criteria andBuyer_typeIsNull() {
            addCriterion("buyer_type is null");
            return (Criteria) this;
        }

        public Criteria andBuyer_typeIsNotNull() {
            addCriterion("buyer_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuyer_typeEqualTo(Boolean value) {
            addCriterion("buyer_type =", value, "buyer_type");
            return (Criteria) this;
        }

        public Criteria andBuyer_typeNotEqualTo(Boolean value) {
            addCriterion("buyer_type <>", value, "buyer_type");
            return (Criteria) this;
        }

        public Criteria andBuyer_typeGreaterThan(Boolean value) {
            addCriterion("buyer_type >", value, "buyer_type");
            return (Criteria) this;
        }

        public Criteria andBuyer_typeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("buyer_type >=", value, "buyer_type");
            return (Criteria) this;
        }

        public Criteria andBuyer_typeLessThan(Boolean value) {
            addCriterion("buyer_type <", value, "buyer_type");
            return (Criteria) this;
        }

        public Criteria andBuyer_typeLessThanOrEqualTo(Boolean value) {
            addCriterion("buyer_type <=", value, "buyer_type");
            return (Criteria) this;
        }

        public Criteria andBuyer_typeIn(List<Boolean> values) {
            addCriterion("buyer_type in", values, "buyer_type");
            return (Criteria) this;
        }

        public Criteria andBuyer_typeNotIn(List<Boolean> values) {
            addCriterion("buyer_type not in", values, "buyer_type");
            return (Criteria) this;
        }

        public Criteria andBuyer_typeBetween(Boolean value1, Boolean value2) {
            addCriterion("buyer_type between", value1, value2, "buyer_type");
            return (Criteria) this;
        }

        public Criteria andBuyer_typeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("buyer_type not between", value1, value2, "buyer_type");
            return (Criteria) this;
        }

        public Criteria andEvaluate_statusIsNull() {
            addCriterion("evaluate_status is null");
            return (Criteria) this;
        }

        public Criteria andEvaluate_statusIsNotNull() {
            addCriterion("evaluate_status is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluate_statusEqualTo(Boolean value) {
            addCriterion("evaluate_status =", value, "evaluate_status");
            return (Criteria) this;
        }

        public Criteria andEvaluate_statusNotEqualTo(Boolean value) {
            addCriterion("evaluate_status <>", value, "evaluate_status");
            return (Criteria) this;
        }

        public Criteria andEvaluate_statusGreaterThan(Boolean value) {
            addCriterion("evaluate_status >", value, "evaluate_status");
            return (Criteria) this;
        }

        public Criteria andEvaluate_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("evaluate_status >=", value, "evaluate_status");
            return (Criteria) this;
        }

        public Criteria andEvaluate_statusLessThan(Boolean value) {
            addCriterion("evaluate_status <", value, "evaluate_status");
            return (Criteria) this;
        }

        public Criteria andEvaluate_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("evaluate_status <=", value, "evaluate_status");
            return (Criteria) this;
        }

        public Criteria andEvaluate_statusIn(List<Boolean> values) {
            addCriterion("evaluate_status in", values, "evaluate_status");
            return (Criteria) this;
        }

        public Criteria andEvaluate_statusNotIn(List<Boolean> values) {
            addCriterion("evaluate_status not in", values, "evaluate_status");
            return (Criteria) this;
        }

        public Criteria andEvaluate_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("evaluate_status between", value1, value2, "evaluate_status");
            return (Criteria) this;
        }

        public Criteria andEvaluate_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("evaluate_status not between", value1, value2, "evaluate_status");
            return (Criteria) this;
        }

        public Criteria andEvaluate_timeIsNull() {
            addCriterion("evaluate_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluate_timeIsNotNull() {
            addCriterion("evaluate_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluate_timeEqualTo(Integer value) {
            addCriterion("evaluate_time =", value, "evaluate_time");
            return (Criteria) this;
        }

        public Criteria andEvaluate_timeNotEqualTo(Integer value) {
            addCriterion("evaluate_time <>", value, "evaluate_time");
            return (Criteria) this;
        }

        public Criteria andEvaluate_timeGreaterThan(Integer value) {
            addCriterion("evaluate_time >", value, "evaluate_time");
            return (Criteria) this;
        }

        public Criteria andEvaluate_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("evaluate_time >=", value, "evaluate_time");
            return (Criteria) this;
        }

        public Criteria andEvaluate_timeLessThan(Integer value) {
            addCriterion("evaluate_time <", value, "evaluate_time");
            return (Criteria) this;
        }

        public Criteria andEvaluate_timeLessThanOrEqualTo(Integer value) {
            addCriterion("evaluate_time <=", value, "evaluate_time");
            return (Criteria) this;
        }

        public Criteria andEvaluate_timeIn(List<Integer> values) {
            addCriterion("evaluate_time in", values, "evaluate_time");
            return (Criteria) this;
        }

        public Criteria andEvaluate_timeNotIn(List<Integer> values) {
            addCriterion("evaluate_time not in", values, "evaluate_time");
            return (Criteria) this;
        }

        public Criteria andEvaluate_timeBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_time between", value1, value2, "evaluate_time");
            return (Criteria) this;
        }

        public Criteria andEvaluate_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("evaluate_time not between", value1, value2, "evaluate_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeEqualTo(Integer value) {
            addCriterion("end_time =", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotEqualTo(Integer value) {
            addCriterion("end_time <>", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThan(Integer value) {
            addCriterion("end_time >", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_time >=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThan(Integer value) {
            addCriterion("end_time <", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThanOrEqualTo(Integer value) {
            addCriterion("end_time <=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIn(List<Integer> values) {
            addCriterion("end_time in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotIn(List<Integer> values) {
            addCriterion("end_time not in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeBetween(Integer value1, Integer value2) {
            addCriterion("end_time between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_time not between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andIs_distribIsNull() {
            addCriterion("is_distrib is null");
            return (Criteria) this;
        }

        public Criteria andIs_distribIsNotNull() {
            addCriterion("is_distrib is not null");
            return (Criteria) this;
        }

        public Criteria andIs_distribEqualTo(Boolean value) {
            addCriterion("is_distrib =", value, "is_distrib");
            return (Criteria) this;
        }

        public Criteria andIs_distribNotEqualTo(Boolean value) {
            addCriterion("is_distrib <>", value, "is_distrib");
            return (Criteria) this;
        }

        public Criteria andIs_distribGreaterThan(Boolean value) {
            addCriterion("is_distrib >", value, "is_distrib");
            return (Criteria) this;
        }

        public Criteria andIs_distribGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_distrib >=", value, "is_distrib");
            return (Criteria) this;
        }

        public Criteria andIs_distribLessThan(Boolean value) {
            addCriterion("is_distrib <", value, "is_distrib");
            return (Criteria) this;
        }

        public Criteria andIs_distribLessThanOrEqualTo(Boolean value) {
            addCriterion("is_distrib <=", value, "is_distrib");
            return (Criteria) this;
        }

        public Criteria andIs_distribIn(List<Boolean> values) {
            addCriterion("is_distrib in", values, "is_distrib");
            return (Criteria) this;
        }

        public Criteria andIs_distribNotIn(List<Boolean> values) {
            addCriterion("is_distrib not in", values, "is_distrib");
            return (Criteria) this;
        }

        public Criteria andIs_distribBetween(Boolean value1, Boolean value2) {
            addCriterion("is_distrib between", value1, value2, "is_distrib");
            return (Criteria) this;
        }

        public Criteria andIs_distribNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_distrib not between", value1, value2, "is_distrib");
            return (Criteria) this;
        }

        public Criteria andDistrib_statusIsNull() {
            addCriterion("distrib_status is null");
            return (Criteria) this;
        }

        public Criteria andDistrib_statusIsNotNull() {
            addCriterion("distrib_status is not null");
            return (Criteria) this;
        }

        public Criteria andDistrib_statusEqualTo(Boolean value) {
            addCriterion("distrib_status =", value, "distrib_status");
            return (Criteria) this;
        }

        public Criteria andDistrib_statusNotEqualTo(Boolean value) {
            addCriterion("distrib_status <>", value, "distrib_status");
            return (Criteria) this;
        }

        public Criteria andDistrib_statusGreaterThan(Boolean value) {
            addCriterion("distrib_status >", value, "distrib_status");
            return (Criteria) this;
        }

        public Criteria andDistrib_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("distrib_status >=", value, "distrib_status");
            return (Criteria) this;
        }

        public Criteria andDistrib_statusLessThan(Boolean value) {
            addCriterion("distrib_status <", value, "distrib_status");
            return (Criteria) this;
        }

        public Criteria andDistrib_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("distrib_status <=", value, "distrib_status");
            return (Criteria) this;
        }

        public Criteria andDistrib_statusIn(List<Boolean> values) {
            addCriterion("distrib_status in", values, "distrib_status");
            return (Criteria) this;
        }

        public Criteria andDistrib_statusNotIn(List<Boolean> values) {
            addCriterion("distrib_status not in", values, "distrib_status");
            return (Criteria) this;
        }

        public Criteria andDistrib_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("distrib_status between", value1, value2, "distrib_status");
            return (Criteria) this;
        }

        public Criteria andDistrib_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("distrib_status not between", value1, value2, "distrib_status");
            return (Criteria) this;
        }

        public Criteria andIs_showIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIs_showIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIs_showEqualTo(String value) {
            addCriterion("is_show =", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showNotEqualTo(String value) {
            addCriterion("is_show <>", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showGreaterThan(String value) {
            addCriterion("is_show >", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showGreaterThanOrEqualTo(String value) {
            addCriterion("is_show >=", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showLessThan(String value) {
            addCriterion("is_show <", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showLessThanOrEqualTo(String value) {
            addCriterion("is_show <=", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showLike(String value) {
            addCriterion("is_show like", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showNotLike(String value) {
            addCriterion("is_show not like", value, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showIn(List<String> values) {
            addCriterion("is_show in", values, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showNotIn(List<String> values) {
            addCriterion("is_show not in", values, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showBetween(String value1, String value2) {
            addCriterion("is_show between", value1, value2, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_showNotBetween(String value1, String value2) {
            addCriterion("is_show not between", value1, value2, "is_show");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andClose_reasonIsNull() {
            addCriterion("close_reason is null");
            return (Criteria) this;
        }

        public Criteria andClose_reasonIsNotNull() {
            addCriterion("close_reason is not null");
            return (Criteria) this;
        }

        public Criteria andClose_reasonEqualTo(String value) {
            addCriterion("close_reason =", value, "close_reason");
            return (Criteria) this;
        }

        public Criteria andClose_reasonNotEqualTo(String value) {
            addCriterion("close_reason <>", value, "close_reason");
            return (Criteria) this;
        }

        public Criteria andClose_reasonGreaterThan(String value) {
            addCriterion("close_reason >", value, "close_reason");
            return (Criteria) this;
        }

        public Criteria andClose_reasonGreaterThanOrEqualTo(String value) {
            addCriterion("close_reason >=", value, "close_reason");
            return (Criteria) this;
        }

        public Criteria andClose_reasonLessThan(String value) {
            addCriterion("close_reason <", value, "close_reason");
            return (Criteria) this;
        }

        public Criteria andClose_reasonLessThanOrEqualTo(String value) {
            addCriterion("close_reason <=", value, "close_reason");
            return (Criteria) this;
        }

        public Criteria andClose_reasonLike(String value) {
            addCriterion("close_reason like", value, "close_reason");
            return (Criteria) this;
        }

        public Criteria andClose_reasonNotLike(String value) {
            addCriterion("close_reason not like", value, "close_reason");
            return (Criteria) this;
        }

        public Criteria andClose_reasonIn(List<String> values) {
            addCriterion("close_reason in", values, "close_reason");
            return (Criteria) this;
        }

        public Criteria andClose_reasonNotIn(List<String> values) {
            addCriterion("close_reason not in", values, "close_reason");
            return (Criteria) this;
        }

        public Criteria andClose_reasonBetween(String value1, String value2) {
            addCriterion("close_reason between", value1, value2, "close_reason");
            return (Criteria) this;
        }

        public Criteria andClose_reasonNotBetween(String value1, String value2) {
            addCriterion("close_reason not between", value1, value2, "close_reason");
            return (Criteria) this;
        }

        public Criteria andCash_user_idIsNull() {
            addCriterion("cash_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCash_user_idIsNotNull() {
            addCriterion("cash_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCash_user_idEqualTo(Integer value) {
            addCriterion("cash_user_id =", value, "cash_user_id");
            return (Criteria) this;
        }

        public Criteria andCash_user_idNotEqualTo(Integer value) {
            addCriterion("cash_user_id <>", value, "cash_user_id");
            return (Criteria) this;
        }

        public Criteria andCash_user_idGreaterThan(Integer value) {
            addCriterion("cash_user_id >", value, "cash_user_id");
            return (Criteria) this;
        }

        public Criteria andCash_user_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("cash_user_id >=", value, "cash_user_id");
            return (Criteria) this;
        }

        public Criteria andCash_user_idLessThan(Integer value) {
            addCriterion("cash_user_id <", value, "cash_user_id");
            return (Criteria) this;
        }

        public Criteria andCash_user_idLessThanOrEqualTo(Integer value) {
            addCriterion("cash_user_id <=", value, "cash_user_id");
            return (Criteria) this;
        }

        public Criteria andCash_user_idIn(List<Integer> values) {
            addCriterion("cash_user_id in", values, "cash_user_id");
            return (Criteria) this;
        }

        public Criteria andCash_user_idNotIn(List<Integer> values) {
            addCriterion("cash_user_id not in", values, "cash_user_id");
            return (Criteria) this;
        }

        public Criteria andCash_user_idBetween(Integer value1, Integer value2) {
            addCriterion("cash_user_id between", value1, value2, "cash_user_id");
            return (Criteria) this;
        }

        public Criteria andCash_user_idNotBetween(Integer value1, Integer value2) {
            addCriterion("cash_user_id not between", value1, value2, "cash_user_id");
            return (Criteria) this;
        }

        public Criteria andLast_timeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLast_timeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLast_timeEqualTo(Integer value) {
            addCriterion("last_time =", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeNotEqualTo(Integer value) {
            addCriterion("last_time <>", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeGreaterThan(Integer value) {
            addCriterion("last_time >", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_time >=", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeLessThan(Integer value) {
            addCriterion("last_time <", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeLessThanOrEqualTo(Integer value) {
            addCriterion("last_time <=", value, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeIn(List<Integer> values) {
            addCriterion("last_time in", values, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeNotIn(List<Integer> values) {
            addCriterion("last_time not in", values, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeBetween(Integer value1, Integer value2) {
            addCriterion("last_time between", value1, value2, "last_time");
            return (Criteria) this;
        }

        public Criteria andLast_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_time not between", value1, value2, "last_time");
            return (Criteria) this;
        }

        public Criteria andOrder_cancelIsNull() {
            addCriterion("order_cancel is null");
            return (Criteria) this;
        }

        public Criteria andOrder_cancelIsNotNull() {
            addCriterion("order_cancel is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_cancelEqualTo(Boolean value) {
            addCriterion("order_cancel =", value, "order_cancel");
            return (Criteria) this;
        }

        public Criteria andOrder_cancelNotEqualTo(Boolean value) {
            addCriterion("order_cancel <>", value, "order_cancel");
            return (Criteria) this;
        }

        public Criteria andOrder_cancelGreaterThan(Boolean value) {
            addCriterion("order_cancel >", value, "order_cancel");
            return (Criteria) this;
        }

        public Criteria andOrder_cancelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_cancel >=", value, "order_cancel");
            return (Criteria) this;
        }

        public Criteria andOrder_cancelLessThan(Boolean value) {
            addCriterion("order_cancel <", value, "order_cancel");
            return (Criteria) this;
        }

        public Criteria andOrder_cancelLessThanOrEqualTo(Boolean value) {
            addCriterion("order_cancel <=", value, "order_cancel");
            return (Criteria) this;
        }

        public Criteria andOrder_cancelIn(List<Boolean> values) {
            addCriterion("order_cancel in", values, "order_cancel");
            return (Criteria) this;
        }

        public Criteria andOrder_cancelNotIn(List<Boolean> values) {
            addCriterion("order_cancel not in", values, "order_cancel");
            return (Criteria) this;
        }

        public Criteria andOrder_cancelBetween(Boolean value1, Boolean value2) {
            addCriterion("order_cancel between", value1, value2, "order_cancel");
            return (Criteria) this;
        }

        public Criteria andOrder_cancelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_cancel not between", value1, value2, "order_cancel");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonIsNull() {
            addCriterion("refuse_reason is null");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonIsNotNull() {
            addCriterion("refuse_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonEqualTo(String value) {
            addCriterion("refuse_reason =", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonNotEqualTo(String value) {
            addCriterion("refuse_reason <>", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonGreaterThan(String value) {
            addCriterion("refuse_reason >", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonGreaterThanOrEqualTo(String value) {
            addCriterion("refuse_reason >=", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonLessThan(String value) {
            addCriterion("refuse_reason <", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonLessThanOrEqualTo(String value) {
            addCriterion("refuse_reason <=", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonLike(String value) {
            addCriterion("refuse_reason like", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonNotLike(String value) {
            addCriterion("refuse_reason not like", value, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonIn(List<String> values) {
            addCriterion("refuse_reason in", values, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonNotIn(List<String> values) {
            addCriterion("refuse_reason not in", values, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonBetween(String value1, String value2) {
            addCriterion("refuse_reason between", value1, value2, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andRefuse_reasonNotBetween(String value1, String value2) {
            addCriterion("refuse_reason not between", value1, value2, "refuse_reason");
            return (Criteria) this;
        }

        public Criteria andSub_order_idIsNull() {
            addCriterion("sub_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSub_order_idIsNotNull() {
            addCriterion("sub_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSub_order_idEqualTo(Integer value) {
            addCriterion("sub_order_id =", value, "sub_order_id");
            return (Criteria) this;
        }

        public Criteria andSub_order_idNotEqualTo(Integer value) {
            addCriterion("sub_order_id <>", value, "sub_order_id");
            return (Criteria) this;
        }

        public Criteria andSub_order_idGreaterThan(Integer value) {
            addCriterion("sub_order_id >", value, "sub_order_id");
            return (Criteria) this;
        }

        public Criteria andSub_order_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_order_id >=", value, "sub_order_id");
            return (Criteria) this;
        }

        public Criteria andSub_order_idLessThan(Integer value) {
            addCriterion("sub_order_id <", value, "sub_order_id");
            return (Criteria) this;
        }

        public Criteria andSub_order_idLessThanOrEqualTo(Integer value) {
            addCriterion("sub_order_id <=", value, "sub_order_id");
            return (Criteria) this;
        }

        public Criteria andSub_order_idIn(List<Integer> values) {
            addCriterion("sub_order_id in", values, "sub_order_id");
            return (Criteria) this;
        }

        public Criteria andSub_order_idNotIn(List<Integer> values) {
            addCriterion("sub_order_id not in", values, "sub_order_id");
            return (Criteria) this;
        }

        public Criteria andSub_order_idBetween(Integer value1, Integer value2) {
            addCriterion("sub_order_id between", value1, value2, "sub_order_id");
            return (Criteria) this;
        }

        public Criteria andSub_order_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_order_id not between", value1, value2, "sub_order_id");
            return (Criteria) this;
        }

        public Criteria andIs_freebuyIsNull() {
            addCriterion("is_freebuy is null");
            return (Criteria) this;
        }

        public Criteria andIs_freebuyIsNotNull() {
            addCriterion("is_freebuy is not null");
            return (Criteria) this;
        }

        public Criteria andIs_freebuyEqualTo(Boolean value) {
            addCriterion("is_freebuy =", value, "is_freebuy");
            return (Criteria) this;
        }

        public Criteria andIs_freebuyNotEqualTo(Boolean value) {
            addCriterion("is_freebuy <>", value, "is_freebuy");
            return (Criteria) this;
        }

        public Criteria andIs_freebuyGreaterThan(Boolean value) {
            addCriterion("is_freebuy >", value, "is_freebuy");
            return (Criteria) this;
        }

        public Criteria andIs_freebuyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_freebuy >=", value, "is_freebuy");
            return (Criteria) this;
        }

        public Criteria andIs_freebuyLessThan(Boolean value) {
            addCriterion("is_freebuy <", value, "is_freebuy");
            return (Criteria) this;
        }

        public Criteria andIs_freebuyLessThanOrEqualTo(Boolean value) {
            addCriterion("is_freebuy <=", value, "is_freebuy");
            return (Criteria) this;
        }

        public Criteria andIs_freebuyIn(List<Boolean> values) {
            addCriterion("is_freebuy in", values, "is_freebuy");
            return (Criteria) this;
        }

        public Criteria andIs_freebuyNotIn(List<Boolean> values) {
            addCriterion("is_freebuy not in", values, "is_freebuy");
            return (Criteria) this;
        }

        public Criteria andIs_freebuyBetween(Boolean value1, Boolean value2) {
            addCriterion("is_freebuy between", value1, value2, "is_freebuy");
            return (Criteria) this;
        }

        public Criteria andIs_freebuyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_freebuy not between", value1, value2, "is_freebuy");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}