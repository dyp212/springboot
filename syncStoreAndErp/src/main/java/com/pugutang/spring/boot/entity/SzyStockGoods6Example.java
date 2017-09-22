package com.pugutang.spring.boot.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SzyStockGoods6Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SzyStockGoods6Example() {
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

        public Criteria andStockIdIsNull() {
            addCriterion("stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(Integer value) {
            addCriterion("stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(Integer value) {
            addCriterion("stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(Integer value) {
            addCriterion("stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(Integer value) {
            addCriterion("stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<Integer> values) {
            addCriterion("stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<Integer> values) {
            addCriterion("stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_id not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andMinNumberWarnIsNull() {
            addCriterion("min_number_warn is null");
            return (Criteria) this;
        }

        public Criteria andMinNumberWarnIsNotNull() {
            addCriterion("min_number_warn is not null");
            return (Criteria) this;
        }

        public Criteria andMinNumberWarnEqualTo(Double value) {
            addCriterion("min_number_warn =", value, "minNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMinNumberWarnNotEqualTo(Double value) {
            addCriterion("min_number_warn <>", value, "minNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMinNumberWarnGreaterThan(Double value) {
            addCriterion("min_number_warn >", value, "minNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMinNumberWarnGreaterThanOrEqualTo(Double value) {
            addCriterion("min_number_warn >=", value, "minNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMinNumberWarnLessThan(Double value) {
            addCriterion("min_number_warn <", value, "minNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMinNumberWarnLessThanOrEqualTo(Double value) {
            addCriterion("min_number_warn <=", value, "minNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMinNumberWarnIn(List<Double> values) {
            addCriterion("min_number_warn in", values, "minNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMinNumberWarnNotIn(List<Double> values) {
            addCriterion("min_number_warn not in", values, "minNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMinNumberWarnBetween(Double value1, Double value2) {
            addCriterion("min_number_warn between", value1, value2, "minNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMinNumberWarnNotBetween(Double value1, Double value2) {
            addCriterion("min_number_warn not between", value1, value2, "minNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMaxNumberWarnIsNull() {
            addCriterion("max_number_warn is null");
            return (Criteria) this;
        }

        public Criteria andMaxNumberWarnIsNotNull() {
            addCriterion("max_number_warn is not null");
            return (Criteria) this;
        }

        public Criteria andMaxNumberWarnEqualTo(Double value) {
            addCriterion("max_number_warn =", value, "maxNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMaxNumberWarnNotEqualTo(Double value) {
            addCriterion("max_number_warn <>", value, "maxNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMaxNumberWarnGreaterThan(Double value) {
            addCriterion("max_number_warn >", value, "maxNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMaxNumberWarnGreaterThanOrEqualTo(Double value) {
            addCriterion("max_number_warn >=", value, "maxNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMaxNumberWarnLessThan(Double value) {
            addCriterion("max_number_warn <", value, "maxNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMaxNumberWarnLessThanOrEqualTo(Double value) {
            addCriterion("max_number_warn <=", value, "maxNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMaxNumberWarnIn(List<Double> values) {
            addCriterion("max_number_warn in", values, "maxNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMaxNumberWarnNotIn(List<Double> values) {
            addCriterion("max_number_warn not in", values, "maxNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMaxNumberWarnBetween(Double value1, Double value2) {
            addCriterion("max_number_warn between", value1, value2, "maxNumberWarn");
            return (Criteria) this;
        }

        public Criteria andMaxNumberWarnNotBetween(Double value1, Double value2) {
            addCriterion("max_number_warn not between", value1, value2, "maxNumberWarn");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberEqualTo(Double value) {
            addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotEqualTo(Double value) {
            addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThan(Double value) {
            addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThan(Double value) {
            addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberLessThanOrEqualTo(Double value) {
            addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberIn(List<Double> values) {
            addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotIn(List<Double> values) {
            addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberBetween(Double value1, Double value2) {
            addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andGoodsNumberNotBetween(Double value1, Double value2) {
            addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsNumberIsNull() {
            addCriterion("first_goods_number is null");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsNumberIsNotNull() {
            addCriterion("first_goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsNumberEqualTo(Double value) {
            addCriterion("first_goods_number =", value, "firstGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsNumberNotEqualTo(Double value) {
            addCriterion("first_goods_number <>", value, "firstGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsNumberGreaterThan(Double value) {
            addCriterion("first_goods_number >", value, "firstGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("first_goods_number >=", value, "firstGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsNumberLessThan(Double value) {
            addCriterion("first_goods_number <", value, "firstGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsNumberLessThanOrEqualTo(Double value) {
            addCriterion("first_goods_number <=", value, "firstGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsNumberIn(List<Double> values) {
            addCriterion("first_goods_number in", values, "firstGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsNumberNotIn(List<Double> values) {
            addCriterion("first_goods_number not in", values, "firstGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsNumberBetween(Double value1, Double value2) {
            addCriterion("first_goods_number between", value1, value2, "firstGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsNumberNotBetween(Double value1, Double value2) {
            addCriterion("first_goods_number not between", value1, value2, "firstGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andUnitCostIsNull() {
            addCriterion("unit_cost is null");
            return (Criteria) this;
        }

        public Criteria andUnitCostIsNotNull() {
            addCriterion("unit_cost is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCostEqualTo(BigDecimal value) {
            addCriterion("unit_cost =", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotEqualTo(BigDecimal value) {
            addCriterion("unit_cost <>", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThan(BigDecimal value) {
            addCriterion("unit_cost >", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_cost >=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThan(BigDecimal value) {
            addCriterion("unit_cost <", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_cost <=", value, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostIn(List<BigDecimal> values) {
            addCriterion("unit_cost in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotIn(List<BigDecimal> values) {
            addCriterion("unit_cost not in", values, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_cost between", value1, value2, "unitCost");
            return (Criteria) this;
        }

        public Criteria andUnitCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_cost not between", value1, value2, "unitCost");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
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