package com.test.spring.boot.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgtInboundNoticeDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PgtInboundNoticeDetailsExample() {
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

    public void setLimit(Integer limit) {
        this.limit=limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset=offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andNoticeDetailIdIsNull() {
            addCriterion("notice_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdIsNotNull() {
            addCriterion("notice_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdEqualTo(Long value) {
            addCriterion("notice_detail_id =", value, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdNotEqualTo(Long value) {
            addCriterion("notice_detail_id <>", value, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdGreaterThan(Long value) {
            addCriterion("notice_detail_id >", value, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("notice_detail_id >=", value, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdLessThan(Long value) {
            addCriterion("notice_detail_id <", value, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("notice_detail_id <=", value, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdIn(List<Long> values) {
            addCriterion("notice_detail_id in", values, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdNotIn(List<Long> values) {
            addCriterion("notice_detail_id not in", values, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdBetween(Long value1, Long value2) {
            addCriterion("notice_detail_id between", value1, value2, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andNoticeDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("notice_detail_id not between", value1, value2, "noticeDetailId");
            return (Criteria) this;
        }

        public Criteria andInboundCodeIsNull() {
            addCriterion("inbound_code is null");
            return (Criteria) this;
        }

        public Criteria andInboundCodeIsNotNull() {
            addCriterion("inbound_code is not null");
            return (Criteria) this;
        }

        public Criteria andInboundCodeEqualTo(String value) {
            addCriterion("inbound_code =", value, "inboundCode");
            return (Criteria) this;
        }

        public Criteria andInboundCodeNotEqualTo(String value) {
            addCriterion("inbound_code <>", value, "inboundCode");
            return (Criteria) this;
        }

        public Criteria andInboundCodeGreaterThan(String value) {
            addCriterion("inbound_code >", value, "inboundCode");
            return (Criteria) this;
        }

        public Criteria andInboundCodeGreaterThanOrEqualTo(String value) {
            addCriterion("inbound_code >=", value, "inboundCode");
            return (Criteria) this;
        }

        public Criteria andInboundCodeLessThan(String value) {
            addCriterion("inbound_code <", value, "inboundCode");
            return (Criteria) this;
        }

        public Criteria andInboundCodeLessThanOrEqualTo(String value) {
            addCriterion("inbound_code <=", value, "inboundCode");
            return (Criteria) this;
        }

        public Criteria andInboundCodeLike(String value) {
            addCriterion("inbound_code like", value, "inboundCode");
            return (Criteria) this;
        }

        public Criteria andInboundCodeNotLike(String value) {
            addCriterion("inbound_code not like", value, "inboundCode");
            return (Criteria) this;
        }

        public Criteria andInboundCodeIn(List<String> values) {
            addCriterion("inbound_code in", values, "inboundCode");
            return (Criteria) this;
        }

        public Criteria andInboundCodeNotIn(List<String> values) {
            addCriterion("inbound_code not in", values, "inboundCode");
            return (Criteria) this;
        }

        public Criteria andInboundCodeBetween(String value1, String value2) {
            addCriterion("inbound_code between", value1, value2, "inboundCode");
            return (Criteria) this;
        }

        public Criteria andInboundCodeNotBetween(String value1, String value2) {
            addCriterion("inbound_code not between", value1, value2, "inboundCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeIsNull() {
            addCriterion("purchase_code is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeIsNotNull() {
            addCriterion("purchase_code is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeEqualTo(String value) {
            addCriterion("purchase_code =", value, "purchaseCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeNotEqualTo(String value) {
            addCriterion("purchase_code <>", value, "purchaseCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeGreaterThan(String value) {
            addCriterion("purchase_code >", value, "purchaseCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_code >=", value, "purchaseCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeLessThan(String value) {
            addCriterion("purchase_code <", value, "purchaseCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeLessThanOrEqualTo(String value) {
            addCriterion("purchase_code <=", value, "purchaseCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeLike(String value) {
            addCriterion("purchase_code like", value, "purchaseCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeNotLike(String value) {
            addCriterion("purchase_code not like", value, "purchaseCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeIn(List<String> values) {
            addCriterion("purchase_code in", values, "purchaseCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeNotIn(List<String> values) {
            addCriterion("purchase_code not in", values, "purchaseCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeBetween(String value1, String value2) {
            addCriterion("purchase_code between", value1, value2, "purchaseCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseCodeNotBetween(String value1, String value2) {
            addCriterion("purchase_code not between", value1, value2, "purchaseCode");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailIdIsNull() {
            addCriterion("purchase_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailIdIsNotNull() {
            addCriterion("purchase_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailIdEqualTo(Long value) {
            addCriterion("purchase_detail_id =", value, "purchaseDetailId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailIdNotEqualTo(Long value) {
            addCriterion("purchase_detail_id <>", value, "purchaseDetailId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailIdGreaterThan(Long value) {
            addCriterion("purchase_detail_id >", value, "purchaseDetailId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("purchase_detail_id >=", value, "purchaseDetailId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailIdLessThan(Long value) {
            addCriterion("purchase_detail_id <", value, "purchaseDetailId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("purchase_detail_id <=", value, "purchaseDetailId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailIdIn(List<Long> values) {
            addCriterion("purchase_detail_id in", values, "purchaseDetailId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailIdNotIn(List<Long> values) {
            addCriterion("purchase_detail_id not in", values, "purchaseDetailId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailIdBetween(Long value1, Long value2) {
            addCriterion("purchase_detail_id between", value1, value2, "purchaseDetailId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("purchase_detail_id not between", value1, value2, "purchaseDetailId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Integer value) {
            addCriterion("sku_id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Integer value) {
            addCriterion("sku_id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Integer value) {
            addCriterion("sku_id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Integer value) {
            addCriterion("sku_id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("sku_id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Integer> values) {
            addCriterion("sku_id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Integer> values) {
            addCriterion("sku_id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("sku_id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("sku_name is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("sku_name is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("sku_name =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("sku_name >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("sku_name <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("sku_name like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("sku_name not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("sku_name in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("sku_name not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("sku_name between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("sku_name not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeIsNull() {
            addCriterion("sku_encode is null");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeIsNotNull() {
            addCriterion("sku_encode is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeEqualTo(String value) {
            addCriterion("sku_encode =", value, "skuEncode");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeNotEqualTo(String value) {
            addCriterion("sku_encode <>", value, "skuEncode");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeGreaterThan(String value) {
            addCriterion("sku_encode >", value, "skuEncode");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeGreaterThanOrEqualTo(String value) {
            addCriterion("sku_encode >=", value, "skuEncode");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeLessThan(String value) {
            addCriterion("sku_encode <", value, "skuEncode");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeLessThanOrEqualTo(String value) {
            addCriterion("sku_encode <=", value, "skuEncode");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeLike(String value) {
            addCriterion("sku_encode like", value, "skuEncode");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeNotLike(String value) {
            addCriterion("sku_encode not like", value, "skuEncode");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeIn(List<String> values) {
            addCriterion("sku_encode in", values, "skuEncode");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeNotIn(List<String> values) {
            addCriterion("sku_encode not in", values, "skuEncode");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeBetween(String value1, String value2) {
            addCriterion("sku_encode between", value1, value2, "skuEncode");
            return (Criteria) this;
        }

        public Criteria andSkuEncodeNotBetween(String value1, String value2) {
            addCriterion("sku_encode not between", value1, value2, "skuEncode");
            return (Criteria) this;
        }

        public Criteria andSpecIsNull() {
            addCriterion("spec is null");
            return (Criteria) this;
        }

        public Criteria andSpecIsNotNull() {
            addCriterion("spec is not null");
            return (Criteria) this;
        }

        public Criteria andSpecEqualTo(String value) {
            addCriterion("spec =", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotEqualTo(String value) {
            addCriterion("spec <>", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThan(String value) {
            addCriterion("spec >", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecGreaterThanOrEqualTo(String value) {
            addCriterion("spec >=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThan(String value) {
            addCriterion("spec <", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLessThanOrEqualTo(String value) {
            addCriterion("spec <=", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecLike(String value) {
            addCriterion("spec like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotLike(String value) {
            addCriterion("spec not like", value, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecIn(List<String> values) {
            addCriterion("spec in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotIn(List<String> values) {
            addCriterion("spec not in", values, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecBetween(String value1, String value2) {
            addCriterion("spec between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andSpecNotBetween(String value1, String value2) {
            addCriterion("spec not between", value1, value2, "spec");
            return (Criteria) this;
        }

        public Criteria andPreArrivalQuantityIsNull() {
            addCriterion("pre_arrival_quantity is null");
            return (Criteria) this;
        }

        public Criteria andPreArrivalQuantityIsNotNull() {
            addCriterion("pre_arrival_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andPreArrivalQuantityEqualTo(Integer value) {
            addCriterion("pre_arrival_quantity =", value, "preArrivalQuantity");
            return (Criteria) this;
        }

        public Criteria andPreArrivalQuantityNotEqualTo(Integer value) {
            addCriterion("pre_arrival_quantity <>", value, "preArrivalQuantity");
            return (Criteria) this;
        }

        public Criteria andPreArrivalQuantityGreaterThan(Integer value) {
            addCriterion("pre_arrival_quantity >", value, "preArrivalQuantity");
            return (Criteria) this;
        }

        public Criteria andPreArrivalQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_arrival_quantity >=", value, "preArrivalQuantity");
            return (Criteria) this;
        }

        public Criteria andPreArrivalQuantityLessThan(Integer value) {
            addCriterion("pre_arrival_quantity <", value, "preArrivalQuantity");
            return (Criteria) this;
        }

        public Criteria andPreArrivalQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("pre_arrival_quantity <=", value, "preArrivalQuantity");
            return (Criteria) this;
        }

        public Criteria andPreArrivalQuantityIn(List<Integer> values) {
            addCriterion("pre_arrival_quantity in", values, "preArrivalQuantity");
            return (Criteria) this;
        }

        public Criteria andPreArrivalQuantityNotIn(List<Integer> values) {
            addCriterion("pre_arrival_quantity not in", values, "preArrivalQuantity");
            return (Criteria) this;
        }

        public Criteria andPreArrivalQuantityBetween(Integer value1, Integer value2) {
            addCriterion("pre_arrival_quantity between", value1, value2, "preArrivalQuantity");
            return (Criteria) this;
        }

        public Criteria andPreArrivalQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_arrival_quantity not between", value1, value2, "preArrivalQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodQuantityIsNull() {
            addCriterion("good_quantity is null");
            return (Criteria) this;
        }

        public Criteria andGoodQuantityIsNotNull() {
            addCriterion("good_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andGoodQuantityEqualTo(Integer value) {
            addCriterion("good_quantity =", value, "goodQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodQuantityNotEqualTo(Integer value) {
            addCriterion("good_quantity <>", value, "goodQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodQuantityGreaterThan(Integer value) {
            addCriterion("good_quantity >", value, "goodQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_quantity >=", value, "goodQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodQuantityLessThan(Integer value) {
            addCriterion("good_quantity <", value, "goodQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("good_quantity <=", value, "goodQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodQuantityIn(List<Integer> values) {
            addCriterion("good_quantity in", values, "goodQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodQuantityNotIn(List<Integer> values) {
            addCriterion("good_quantity not in", values, "goodQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodQuantityBetween(Integer value1, Integer value2) {
            addCriterion("good_quantity between", value1, value2, "goodQuantity");
            return (Criteria) this;
        }

        public Criteria andGoodQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("good_quantity not between", value1, value2, "goodQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityIsNull() {
            addCriterion("bad_quantity is null");
            return (Criteria) this;
        }

        public Criteria andBadQuantityIsNotNull() {
            addCriterion("bad_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andBadQuantityEqualTo(Integer value) {
            addCriterion("bad_quantity =", value, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityNotEqualTo(Integer value) {
            addCriterion("bad_quantity <>", value, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityGreaterThan(Integer value) {
            addCriterion("bad_quantity >", value, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("bad_quantity >=", value, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityLessThan(Integer value) {
            addCriterion("bad_quantity <", value, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("bad_quantity <=", value, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityIn(List<Integer> values) {
            addCriterion("bad_quantity in", values, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityNotIn(List<Integer> values) {
            addCriterion("bad_quantity not in", values, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityBetween(Integer value1, Integer value2) {
            addCriterion("bad_quantity between", value1, value2, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("bad_quantity not between", value1, value2, "badQuantity");
            return (Criteria) this;
        }

        public Criteria andBadDealTypeIsNull() {
            addCriterion("bad_deal_type is null");
            return (Criteria) this;
        }

        public Criteria andBadDealTypeIsNotNull() {
            addCriterion("bad_deal_type is not null");
            return (Criteria) this;
        }

        public Criteria andBadDealTypeEqualTo(Byte value) {
            addCriterion("bad_deal_type =", value, "badDealType");
            return (Criteria) this;
        }

        public Criteria andBadDealTypeNotEqualTo(Byte value) {
            addCriterion("bad_deal_type <>", value, "badDealType");
            return (Criteria) this;
        }

        public Criteria andBadDealTypeGreaterThan(Byte value) {
            addCriterion("bad_deal_type >", value, "badDealType");
            return (Criteria) this;
        }

        public Criteria andBadDealTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("bad_deal_type >=", value, "badDealType");
            return (Criteria) this;
        }

        public Criteria andBadDealTypeLessThan(Byte value) {
            addCriterion("bad_deal_type <", value, "badDealType");
            return (Criteria) this;
        }

        public Criteria andBadDealTypeLessThanOrEqualTo(Byte value) {
            addCriterion("bad_deal_type <=", value, "badDealType");
            return (Criteria) this;
        }

        public Criteria andBadDealTypeIn(List<Byte> values) {
            addCriterion("bad_deal_type in", values, "badDealType");
            return (Criteria) this;
        }

        public Criteria andBadDealTypeNotIn(List<Byte> values) {
            addCriterion("bad_deal_type not in", values, "badDealType");
            return (Criteria) this;
        }

        public Criteria andBadDealTypeBetween(Byte value1, Byte value2) {
            addCriterion("bad_deal_type between", value1, value2, "badDealType");
            return (Criteria) this;
        }

        public Criteria andBadDealTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("bad_deal_type not between", value1, value2, "badDealType");
            return (Criteria) this;
        }

        public Criteria andQualityStatusIsNull() {
            addCriterion("quality_status is null");
            return (Criteria) this;
        }

        public Criteria andQualityStatusIsNotNull() {
            addCriterion("quality_status is not null");
            return (Criteria) this;
        }

        public Criteria andQualityStatusEqualTo(Byte value) {
            addCriterion("quality_status =", value, "qualityStatus");
            return (Criteria) this;
        }

        public Criteria andQualityStatusNotEqualTo(Byte value) {
            addCriterion("quality_status <>", value, "qualityStatus");
            return (Criteria) this;
        }

        public Criteria andQualityStatusGreaterThan(Byte value) {
            addCriterion("quality_status >", value, "qualityStatus");
            return (Criteria) this;
        }

        public Criteria andQualityStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("quality_status >=", value, "qualityStatus");
            return (Criteria) this;
        }

        public Criteria andQualityStatusLessThan(Byte value) {
            addCriterion("quality_status <", value, "qualityStatus");
            return (Criteria) this;
        }

        public Criteria andQualityStatusLessThanOrEqualTo(Byte value) {
            addCriterion("quality_status <=", value, "qualityStatus");
            return (Criteria) this;
        }

        public Criteria andQualityStatusIn(List<Byte> values) {
            addCriterion("quality_status in", values, "qualityStatus");
            return (Criteria) this;
        }

        public Criteria andQualityStatusNotIn(List<Byte> values) {
            addCriterion("quality_status not in", values, "qualityStatus");
            return (Criteria) this;
        }

        public Criteria andQualityStatusBetween(Byte value1, Byte value2) {
            addCriterion("quality_status between", value1, value2, "qualityStatus");
            return (Criteria) this;
        }

        public Criteria andQualityStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("quality_status not between", value1, value2, "qualityStatus");
            return (Criteria) this;
        }

        public Criteria andQualityTimeIsNull() {
            addCriterion("quality_time is null");
            return (Criteria) this;
        }

        public Criteria andQualityTimeIsNotNull() {
            addCriterion("quality_time is not null");
            return (Criteria) this;
        }

        public Criteria andQualityTimeEqualTo(Date value) {
            addCriterion("quality_time =", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeNotEqualTo(Date value) {
            addCriterion("quality_time <>", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeGreaterThan(Date value) {
            addCriterion("quality_time >", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("quality_time >=", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeLessThan(Date value) {
            addCriterion("quality_time <", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeLessThanOrEqualTo(Date value) {
            addCriterion("quality_time <=", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeIn(List<Date> values) {
            addCriterion("quality_time in", values, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeNotIn(List<Date> values) {
            addCriterion("quality_time not in", values, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeBetween(Date value1, Date value2) {
            addCriterion("quality_time between", value1, value2, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeNotBetween(Date value1, Date value2) {
            addCriterion("quality_time not between", value1, value2, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityIdIsNull() {
            addCriterion("quality_id is null");
            return (Criteria) this;
        }

        public Criteria andQualityIdIsNotNull() {
            addCriterion("quality_id is not null");
            return (Criteria) this;
        }

        public Criteria andQualityIdEqualTo(Long value) {
            addCriterion("quality_id =", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdNotEqualTo(Long value) {
            addCriterion("quality_id <>", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdGreaterThan(Long value) {
            addCriterion("quality_id >", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("quality_id >=", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdLessThan(Long value) {
            addCriterion("quality_id <", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdLessThanOrEqualTo(Long value) {
            addCriterion("quality_id <=", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdIn(List<Long> values) {
            addCriterion("quality_id in", values, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdNotIn(List<Long> values) {
            addCriterion("quality_id not in", values, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdBetween(Long value1, Long value2) {
            addCriterion("quality_id between", value1, value2, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdNotBetween(Long value1, Long value2) {
            addCriterion("quality_id not between", value1, value2, "qualityId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createby is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createby is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("createby =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("createby <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("createby >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("createby >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("createby <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("createby <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("createby like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("createby not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("createby in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("createby not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("createby between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("createby not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("updateby is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("updateby is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(String value) {
            addCriterion("updateby =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(String value) {
            addCriterion("updateby <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(String value) {
            addCriterion("updateby >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
            addCriterion("updateby >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(String value) {
            addCriterion("updateby <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(String value) {
            addCriterion("updateby <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLike(String value) {
            addCriterion("updateby like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotLike(String value) {
            addCriterion("updateby not like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<String> values) {
            addCriterion("updateby in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<String> values) {
            addCriterion("updateby not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(String value1, String value2) {
            addCriterion("updateby between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(String value1, String value2) {
            addCriterion("updateby not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andBatchCodeIsNull() {
            addCriterion("batch_code is null");
            return (Criteria) this;
        }

        public Criteria andBatchCodeIsNotNull() {
            addCriterion("batch_code is not null");
            return (Criteria) this;
        }

        public Criteria andBatchCodeEqualTo(String value) {
            addCriterion("batch_code =", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeNotEqualTo(String value) {
            addCriterion("batch_code <>", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeGreaterThan(String value) {
            addCriterion("batch_code >", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("batch_code >=", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeLessThan(String value) {
            addCriterion("batch_code <", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeLessThanOrEqualTo(String value) {
            addCriterion("batch_code <=", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeLike(String value) {
            addCriterion("batch_code like", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeNotLike(String value) {
            addCriterion("batch_code not like", value, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeIn(List<String> values) {
            addCriterion("batch_code in", values, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeNotIn(List<String> values) {
            addCriterion("batch_code not in", values, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeBetween(String value1, String value2) {
            addCriterion("batch_code between", value1, value2, "batchCode");
            return (Criteria) this;
        }

        public Criteria andBatchCodeNotBetween(String value1, String value2) {
            addCriterion("batch_code not between", value1, value2, "batchCode");
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