package com.test.spring.boot.entity;

import java.util.ArrayList;
import java.util.List;

public class SerialConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SerialConfigExample() {
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

        public Criteria andSerialIdIsNull() {
            addCriterion("serial_id is null");
            return (Criteria) this;
        }

        public Criteria andSerialIdIsNotNull() {
            addCriterion("serial_id is not null");
            return (Criteria) this;
        }

        public Criteria andSerialIdEqualTo(Integer value) {
            addCriterion("serial_id =", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotEqualTo(Integer value) {
            addCriterion("serial_id <>", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdGreaterThan(Integer value) {
            addCriterion("serial_id >", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("serial_id >=", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLessThan(Integer value) {
            addCriterion("serial_id <", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdLessThanOrEqualTo(Integer value) {
            addCriterion("serial_id <=", value, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdIn(List<Integer> values) {
            addCriterion("serial_id in", values, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotIn(List<Integer> values) {
            addCriterion("serial_id not in", values, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdBetween(Integer value1, Integer value2) {
            addCriterion("serial_id between", value1, value2, "serialId");
            return (Criteria) this;
        }

        public Criteria andSerialIdNotBetween(Integer value1, Integer value2) {
            addCriterion("serial_id not between", value1, value2, "serialId");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNull() {
            addCriterion("type_code is null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNotNull() {
            addCriterion("type_code is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeEqualTo(String value) {
            addCriterion("type_code =", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotEqualTo(String value) {
            addCriterion("type_code <>", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThan(String value) {
            addCriterion("type_code >", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("type_code >=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThan(String value) {
            addCriterion("type_code <", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("type_code <=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLike(String value) {
            addCriterion("type_code like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotLike(String value) {
            addCriterion("type_code not like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIn(List<String> values) {
            addCriterion("type_code in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotIn(List<String> values) {
            addCriterion("type_code not in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeBetween(String value1, String value2) {
            addCriterion("type_code between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotBetween(String value1, String value2) {
            addCriterion("type_code not between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andLatestNoIsNull() {
            addCriterion("latest_no is null");
            return (Criteria) this;
        }

        public Criteria andLatestNoIsNotNull() {
            addCriterion("latest_no is not null");
            return (Criteria) this;
        }

        public Criteria andLatestNoEqualTo(Integer value) {
            addCriterion("latest_no =", value, "latestNo");
            return (Criteria) this;
        }

        public Criteria andLatestNoNotEqualTo(Integer value) {
            addCriterion("latest_no <>", value, "latestNo");
            return (Criteria) this;
        }

        public Criteria andLatestNoGreaterThan(Integer value) {
            addCriterion("latest_no >", value, "latestNo");
            return (Criteria) this;
        }

        public Criteria andLatestNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("latest_no >=", value, "latestNo");
            return (Criteria) this;
        }

        public Criteria andLatestNoLessThan(Integer value) {
            addCriterion("latest_no <", value, "latestNo");
            return (Criteria) this;
        }

        public Criteria andLatestNoLessThanOrEqualTo(Integer value) {
            addCriterion("latest_no <=", value, "latestNo");
            return (Criteria) this;
        }

        public Criteria andLatestNoIn(List<Integer> values) {
            addCriterion("latest_no in", values, "latestNo");
            return (Criteria) this;
        }

        public Criteria andLatestNoNotIn(List<Integer> values) {
            addCriterion("latest_no not in", values, "latestNo");
            return (Criteria) this;
        }

        public Criteria andLatestNoBetween(Integer value1, Integer value2) {
            addCriterion("latest_no between", value1, value2, "latestNo");
            return (Criteria) this;
        }

        public Criteria andLatestNoNotBetween(Integer value1, Integer value2) {
            addCriterion("latest_no not between", value1, value2, "latestNo");
            return (Criteria) this;
        }

        public Criteria andCodeLengthIsNull() {
            addCriterion("code_length is null");
            return (Criteria) this;
        }

        public Criteria andCodeLengthIsNotNull() {
            addCriterion("code_length is not null");
            return (Criteria) this;
        }

        public Criteria andCodeLengthEqualTo(Integer value) {
            addCriterion("code_length =", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthNotEqualTo(Integer value) {
            addCriterion("code_length <>", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthGreaterThan(Integer value) {
            addCriterion("code_length >", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_length >=", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthLessThan(Integer value) {
            addCriterion("code_length <", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthLessThanOrEqualTo(Integer value) {
            addCriterion("code_length <=", value, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthIn(List<Integer> values) {
            addCriterion("code_length in", values, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthNotIn(List<Integer> values) {
            addCriterion("code_length not in", values, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthBetween(Integer value1, Integer value2) {
            addCriterion("code_length between", value1, value2, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodeLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("code_length not between", value1, value2, "codeLength");
            return (Criteria) this;
        }

        public Criteria andCodePrefixIsNull() {
            addCriterion("code_prefix is null");
            return (Criteria) this;
        }

        public Criteria andCodePrefixIsNotNull() {
            addCriterion("code_prefix is not null");
            return (Criteria) this;
        }

        public Criteria andCodePrefixEqualTo(String value) {
            addCriterion("code_prefix =", value, "codePrefix");
            return (Criteria) this;
        }

        public Criteria andCodePrefixNotEqualTo(String value) {
            addCriterion("code_prefix <>", value, "codePrefix");
            return (Criteria) this;
        }

        public Criteria andCodePrefixGreaterThan(String value) {
            addCriterion("code_prefix >", value, "codePrefix");
            return (Criteria) this;
        }

        public Criteria andCodePrefixGreaterThanOrEqualTo(String value) {
            addCriterion("code_prefix >=", value, "codePrefix");
            return (Criteria) this;
        }

        public Criteria andCodePrefixLessThan(String value) {
            addCriterion("code_prefix <", value, "codePrefix");
            return (Criteria) this;
        }

        public Criteria andCodePrefixLessThanOrEqualTo(String value) {
            addCriterion("code_prefix <=", value, "codePrefix");
            return (Criteria) this;
        }

        public Criteria andCodePrefixLike(String value) {
            addCriterion("code_prefix like", value, "codePrefix");
            return (Criteria) this;
        }

        public Criteria andCodePrefixNotLike(String value) {
            addCriterion("code_prefix not like", value, "codePrefix");
            return (Criteria) this;
        }

        public Criteria andCodePrefixIn(List<String> values) {
            addCriterion("code_prefix in", values, "codePrefix");
            return (Criteria) this;
        }

        public Criteria andCodePrefixNotIn(List<String> values) {
            addCriterion("code_prefix not in", values, "codePrefix");
            return (Criteria) this;
        }

        public Criteria andCodePrefixBetween(String value1, String value2) {
            addCriterion("code_prefix between", value1, value2, "codePrefix");
            return (Criteria) this;
        }

        public Criteria andCodePrefixNotBetween(String value1, String value2) {
            addCriterion("code_prefix not between", value1, value2, "codePrefix");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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