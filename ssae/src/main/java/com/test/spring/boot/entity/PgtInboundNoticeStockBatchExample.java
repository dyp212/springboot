package com.test.spring.boot.entity;

import java.util.ArrayList;
import java.util.List;

public class PgtInboundNoticeStockBatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PgtInboundNoticeStockBatchExample() {
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

        public Criteria andInboundNoticeStockBatchIdIsNull() {
            addCriterion("inbound_notice_stock_batch_id is null");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeStockBatchIdIsNotNull() {
            addCriterion("inbound_notice_stock_batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeStockBatchIdEqualTo(Integer value) {
            addCriterion("inbound_notice_stock_batch_id =", value, "inboundNoticeStockBatchId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeStockBatchIdNotEqualTo(Integer value) {
            addCriterion("inbound_notice_stock_batch_id <>", value, "inboundNoticeStockBatchId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeStockBatchIdGreaterThan(Integer value) {
            addCriterion("inbound_notice_stock_batch_id >", value, "inboundNoticeStockBatchId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeStockBatchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inbound_notice_stock_batch_id >=", value, "inboundNoticeStockBatchId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeStockBatchIdLessThan(Integer value) {
            addCriterion("inbound_notice_stock_batch_id <", value, "inboundNoticeStockBatchId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeStockBatchIdLessThanOrEqualTo(Integer value) {
            addCriterion("inbound_notice_stock_batch_id <=", value, "inboundNoticeStockBatchId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeStockBatchIdIn(List<Integer> values) {
            addCriterion("inbound_notice_stock_batch_id in", values, "inboundNoticeStockBatchId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeStockBatchIdNotIn(List<Integer> values) {
            addCriterion("inbound_notice_stock_batch_id not in", values, "inboundNoticeStockBatchId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeStockBatchIdBetween(Integer value1, Integer value2) {
            addCriterion("inbound_notice_stock_batch_id between", value1, value2, "inboundNoticeStockBatchId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeStockBatchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inbound_notice_stock_batch_id not between", value1, value2, "inboundNoticeStockBatchId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeIsNull() {
            addCriterion("inbound_notice_code is null");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeIsNotNull() {
            addCriterion("inbound_notice_code is not null");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeEqualTo(String value) {
            addCriterion("inbound_notice_code =", value, "inboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeNotEqualTo(String value) {
            addCriterion("inbound_notice_code <>", value, "inboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeGreaterThan(String value) {
            addCriterion("inbound_notice_code >", value, "inboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("inbound_notice_code >=", value, "inboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeLessThan(String value) {
            addCriterion("inbound_notice_code <", value, "inboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeLessThanOrEqualTo(String value) {
            addCriterion("inbound_notice_code <=", value, "inboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeLike(String value) {
            addCriterion("inbound_notice_code like", value, "inboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeNotLike(String value) {
            addCriterion("inbound_notice_code not like", value, "inboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeIn(List<String> values) {
            addCriterion("inbound_notice_code in", values, "inboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeNotIn(List<String> values) {
            addCriterion("inbound_notice_code not in", values, "inboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeBetween(String value1, String value2) {
            addCriterion("inbound_notice_code between", value1, value2, "inboundNoticeCode");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeCodeNotBetween(String value1, String value2) {
            addCriterion("inbound_notice_code not between", value1, value2, "inboundNoticeCode");
            return (Criteria) this;
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

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Double value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Double value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Double value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Double value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Double value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Double value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Double> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Double> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Double value1, Double value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Double value1, Double value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
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

        public Criteria andUnitNameIsNull() {
            addCriterion("unit_name is null");
            return (Criteria) this;
        }

        public Criteria andUnitNameIsNotNull() {
            addCriterion("unit_name is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNameEqualTo(String value) {
            addCriterion("unit_name =", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotEqualTo(String value) {
            addCriterion("unit_name <>", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThan(String value) {
            addCriterion("unit_name >", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("unit_name >=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThan(String value) {
            addCriterion("unit_name <", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLessThanOrEqualTo(String value) {
            addCriterion("unit_name <=", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameLike(String value) {
            addCriterion("unit_name like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotLike(String value) {
            addCriterion("unit_name not like", value, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameIn(List<String> values) {
            addCriterion("unit_name in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotIn(List<String> values) {
            addCriterion("unit_name not in", values, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameBetween(String value1, String value2) {
            addCriterion("unit_name between", value1, value2, "unitName");
            return (Criteria) this;
        }

        public Criteria andUnitNameNotBetween(String value1, String value2) {
            addCriterion("unit_name not between", value1, value2, "unitName");
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