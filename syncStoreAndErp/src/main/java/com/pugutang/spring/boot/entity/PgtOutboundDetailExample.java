package com.pugutang.spring.boot.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgtOutboundDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PgtOutboundDetailExample() {
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

        public Criteria andOutboundDetailIdIsNull() {
            addCriterion("outbound_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andOutboundDetailIdIsNotNull() {
            addCriterion("outbound_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutboundDetailIdEqualTo(Long value) {
            addCriterion("outbound_detail_id =", value, "outboundDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundDetailIdNotEqualTo(Long value) {
            addCriterion("outbound_detail_id <>", value, "outboundDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundDetailIdGreaterThan(Long value) {
            addCriterion("outbound_detail_id >", value, "outboundDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("outbound_detail_id >=", value, "outboundDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundDetailIdLessThan(Long value) {
            addCriterion("outbound_detail_id <", value, "outboundDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("outbound_detail_id <=", value, "outboundDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundDetailIdIn(List<Long> values) {
            addCriterion("outbound_detail_id in", values, "outboundDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundDetailIdNotIn(List<Long> values) {
            addCriterion("outbound_detail_id not in", values, "outboundDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundDetailIdBetween(Long value1, Long value2) {
            addCriterion("outbound_detail_id between", value1, value2, "outboundDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("outbound_detail_id not between", value1, value2, "outboundDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeIsNull() {
            addCriterion("outbound_code is null");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeIsNotNull() {
            addCriterion("outbound_code is not null");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeEqualTo(String value) {
            addCriterion("outbound_code =", value, "outboundCode");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeNotEqualTo(String value) {
            addCriterion("outbound_code <>", value, "outboundCode");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeGreaterThan(String value) {
            addCriterion("outbound_code >", value, "outboundCode");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeGreaterThanOrEqualTo(String value) {
            addCriterion("outbound_code >=", value, "outboundCode");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeLessThan(String value) {
            addCriterion("outbound_code <", value, "outboundCode");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeLessThanOrEqualTo(String value) {
            addCriterion("outbound_code <=", value, "outboundCode");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeLike(String value) {
            addCriterion("outbound_code like", value, "outboundCode");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeNotLike(String value) {
            addCriterion("outbound_code not like", value, "outboundCode");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeIn(List<String> values) {
            addCriterion("outbound_code in", values, "outboundCode");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeNotIn(List<String> values) {
            addCriterion("outbound_code not in", values, "outboundCode");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeBetween(String value1, String value2) {
            addCriterion("outbound_code between", value1, value2, "outboundCode");
            return (Criteria) this;
        }

        public Criteria andOutboundCodeNotBetween(String value1, String value2) {
            addCriterion("outbound_code not between", value1, value2, "outboundCode");
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

        public Criteria andOutboundNoticeCodeIsNull() {
            addCriterion("outbound_notice_code is null");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeCodeIsNotNull() {
            addCriterion("outbound_notice_code is not null");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeCodeEqualTo(String value) {
            addCriterion("outbound_notice_code =", value, "outboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeCodeNotEqualTo(String value) {
            addCriterion("outbound_notice_code <>", value, "outboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeCodeGreaterThan(String value) {
            addCriterion("outbound_notice_code >", value, "outboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("outbound_notice_code >=", value, "outboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeCodeLessThan(String value) {
            addCriterion("outbound_notice_code <", value, "outboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeCodeLessThanOrEqualTo(String value) {
            addCriterion("outbound_notice_code <=", value, "outboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeCodeLike(String value) {
            addCriterion("outbound_notice_code like", value, "outboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeCodeNotLike(String value) {
            addCriterion("outbound_notice_code not like", value, "outboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeCodeIn(List<String> values) {
            addCriterion("outbound_notice_code in", values, "outboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeCodeNotIn(List<String> values) {
            addCriterion("outbound_notice_code not in", values, "outboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeCodeBetween(String value1, String value2) {
            addCriterion("outbound_notice_code between", value1, value2, "outboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeCodeNotBetween(String value1, String value2) {
            addCriterion("outbound_notice_code not between", value1, value2, "outboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeDetailIdIsNull() {
            addCriterion("outbound_notice_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeDetailIdIsNotNull() {
            addCriterion("outbound_notice_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeDetailIdEqualTo(Long value) {
            addCriterion("outbound_notice_detail_id =", value, "outboundNoticeDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeDetailIdNotEqualTo(Long value) {
            addCriterion("outbound_notice_detail_id <>", value, "outboundNoticeDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeDetailIdGreaterThan(Long value) {
            addCriterion("outbound_notice_detail_id >", value, "outboundNoticeDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("outbound_notice_detail_id >=", value, "outboundNoticeDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeDetailIdLessThan(Long value) {
            addCriterion("outbound_notice_detail_id <", value, "outboundNoticeDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("outbound_notice_detail_id <=", value, "outboundNoticeDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeDetailIdIn(List<Long> values) {
            addCriterion("outbound_notice_detail_id in", values, "outboundNoticeDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeDetailIdNotIn(List<Long> values) {
            addCriterion("outbound_notice_detail_id not in", values, "outboundNoticeDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeDetailIdBetween(Long value1, Long value2) {
            addCriterion("outbound_notice_detail_id between", value1, value2, "outboundNoticeDetailId");
            return (Criteria) this;
        }

        public Criteria andOutboundNoticeDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("outbound_notice_detail_id not between", value1, value2, "outboundNoticeDetailId");
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

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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