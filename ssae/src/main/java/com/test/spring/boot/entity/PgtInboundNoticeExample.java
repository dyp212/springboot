package com.test.spring.boot.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PgtInboundNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PgtInboundNoticeExample() {
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

        public Criteria andInboundNoticeIdIsNull() {
            addCriterion("inbound_notice_id is null");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeIdIsNotNull() {
            addCriterion("inbound_notice_id is not null");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeIdEqualTo(Long value) {
            addCriterion("inbound_notice_id =", value, "inboundNoticeId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeIdNotEqualTo(Long value) {
            addCriterion("inbound_notice_id <>", value, "inboundNoticeId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeIdGreaterThan(Long value) {
            addCriterion("inbound_notice_id >", value, "inboundNoticeId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("inbound_notice_id >=", value, "inboundNoticeId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeIdLessThan(Long value) {
            addCriterion("inbound_notice_id <", value, "inboundNoticeId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeIdLessThanOrEqualTo(Long value) {
            addCriterion("inbound_notice_id <=", value, "inboundNoticeId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeIdIn(List<Long> values) {
            addCriterion("inbound_notice_id in", values, "inboundNoticeId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeIdNotIn(List<Long> values) {
            addCriterion("inbound_notice_id not in", values, "inboundNoticeId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeIdBetween(Long value1, Long value2) {
            addCriterion("inbound_notice_id between", value1, value2, "inboundNoticeId");
            return (Criteria) this;
        }

        public Criteria andInboundNoticeIdNotBetween(Long value1, Long value2) {
            addCriterion("inbound_notice_id not between", value1, value2, "inboundNoticeId");
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

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(Integer value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(Integer value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(Integer value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(Integer value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(Integer value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<Integer> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<Integer> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(Integer value1, Integer value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
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

        public Criteria andPreArrivalTimeIsNull() {
            addCriterion("pre_arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andPreArrivalTimeIsNotNull() {
            addCriterion("pre_arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andPreArrivalTimeEqualTo(Date value) {
            addCriterion("pre_arrival_time =", value, "preArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPreArrivalTimeNotEqualTo(Date value) {
            addCriterion("pre_arrival_time <>", value, "preArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPreArrivalTimeGreaterThan(Date value) {
            addCriterion("pre_arrival_time >", value, "preArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPreArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pre_arrival_time >=", value, "preArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPreArrivalTimeLessThan(Date value) {
            addCriterion("pre_arrival_time <", value, "preArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPreArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("pre_arrival_time <=", value, "preArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPreArrivalTimeIn(List<Date> values) {
            addCriterion("pre_arrival_time in", values, "preArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPreArrivalTimeNotIn(List<Date> values) {
            addCriterion("pre_arrival_time not in", values, "preArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPreArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("pre_arrival_time between", value1, value2, "preArrivalTime");
            return (Criteria) this;
        }

        public Criteria andPreArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("pre_arrival_time not between", value1, value2, "preArrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNull() {
            addCriterion("arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNotNull() {
            addCriterion("arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeEqualTo(Date value) {
            addCriterion("arrival_time =", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotEqualTo(Date value) {
            addCriterion("arrival_time <>", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThan(Date value) {
            addCriterion("arrival_time >", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrival_time >=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThan(Date value) {
            addCriterion("arrival_time <", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrival_time <=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIn(List<Date> values) {
            addCriterion("arrival_time in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotIn(List<Date> values) {
            addCriterion("arrival_time not in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("arrival_time between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrival_time not between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andStoreSnIsNull() {
            addCriterion("store_sn is null");
            return (Criteria) this;
        }

        public Criteria andStoreSnIsNotNull() {
            addCriterion("store_sn is not null");
            return (Criteria) this;
        }

        public Criteria andStoreSnEqualTo(String value) {
            addCriterion("store_sn =", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnNotEqualTo(String value) {
            addCriterion("store_sn <>", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnGreaterThan(String value) {
            addCriterion("store_sn >", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnGreaterThanOrEqualTo(String value) {
            addCriterion("store_sn >=", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnLessThan(String value) {
            addCriterion("store_sn <", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnLessThanOrEqualTo(String value) {
            addCriterion("store_sn <=", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnLike(String value) {
            addCriterion("store_sn like", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnNotLike(String value) {
            addCriterion("store_sn not like", value, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnIn(List<String> values) {
            addCriterion("store_sn in", values, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnNotIn(List<String> values) {
            addCriterion("store_sn not in", values, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnBetween(String value1, String value2) {
            addCriterion("store_sn between", value1, value2, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreSnNotBetween(String value1, String value2) {
            addCriterion("store_sn not between", value1, value2, "storeSn");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
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