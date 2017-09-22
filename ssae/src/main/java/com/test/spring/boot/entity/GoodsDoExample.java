package com.test.spring.boot.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsDoExample() {
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

        public Criteria andGoods_idIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoods_idIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_idEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idLessThan(Integer value) {
            addCriterion("goods_id <", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_nameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoods_nameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_nameEqualTo(String value) {
            addCriterion("goods_name =", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameLessThan(String value) {
            addCriterion("goods_name <", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameLike(String value) {
            addCriterion("goods_name like", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotLike(String value) {
            addCriterion("goods_name not like", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameIn(List<String> values) {
            addCriterion("goods_name in", values, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goods_name");
            return (Criteria) this;
        }

        public Criteria andCat_idIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCat_idIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCat_idEqualTo(Integer value) {
            addCriterion("cat_id =", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idNotEqualTo(Integer value) {
            addCriterion("cat_id <>", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idGreaterThan(Integer value) {
            addCriterion("cat_id >", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_id >=", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idLessThan(Integer value) {
            addCriterion("cat_id <", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idLessThanOrEqualTo(Integer value) {
            addCriterion("cat_id <=", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idIn(List<Integer> values) {
            addCriterion("cat_id in", values, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idNotIn(List<Integer> values) {
            addCriterion("cat_id not in", values, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idBetween(Integer value1, Integer value2) {
            addCriterion("cat_id between", value1, value2, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idNotBetween(Integer value1, Integer value2) {
            addCriterion("cat_id not between", value1, value2, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_id1IsNull() {
            addCriterion("cat_id1 is null");
            return (Criteria) this;
        }

        public Criteria andCat_id1IsNotNull() {
            addCriterion("cat_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andCat_id1EqualTo(Integer value) {
            addCriterion("cat_id1 =", value, "cat_id1");
            return (Criteria) this;
        }

        public Criteria andCat_id1NotEqualTo(Integer value) {
            addCriterion("cat_id1 <>", value, "cat_id1");
            return (Criteria) this;
        }

        public Criteria andCat_id1GreaterThan(Integer value) {
            addCriterion("cat_id1 >", value, "cat_id1");
            return (Criteria) this;
        }

        public Criteria andCat_id1GreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_id1 >=", value, "cat_id1");
            return (Criteria) this;
        }

        public Criteria andCat_id1LessThan(Integer value) {
            addCriterion("cat_id1 <", value, "cat_id1");
            return (Criteria) this;
        }

        public Criteria andCat_id1LessThanOrEqualTo(Integer value) {
            addCriterion("cat_id1 <=", value, "cat_id1");
            return (Criteria) this;
        }

        public Criteria andCat_id1In(List<Integer> values) {
            addCriterion("cat_id1 in", values, "cat_id1");
            return (Criteria) this;
        }

        public Criteria andCat_id1NotIn(List<Integer> values) {
            addCriterion("cat_id1 not in", values, "cat_id1");
            return (Criteria) this;
        }

        public Criteria andCat_id1Between(Integer value1, Integer value2) {
            addCriterion("cat_id1 between", value1, value2, "cat_id1");
            return (Criteria) this;
        }

        public Criteria andCat_id1NotBetween(Integer value1, Integer value2) {
            addCriterion("cat_id1 not between", value1, value2, "cat_id1");
            return (Criteria) this;
        }

        public Criteria andCat_id2IsNull() {
            addCriterion("cat_id2 is null");
            return (Criteria) this;
        }

        public Criteria andCat_id2IsNotNull() {
            addCriterion("cat_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andCat_id2EqualTo(Integer value) {
            addCriterion("cat_id2 =", value, "cat_id2");
            return (Criteria) this;
        }

        public Criteria andCat_id2NotEqualTo(Integer value) {
            addCriterion("cat_id2 <>", value, "cat_id2");
            return (Criteria) this;
        }

        public Criteria andCat_id2GreaterThan(Integer value) {
            addCriterion("cat_id2 >", value, "cat_id2");
            return (Criteria) this;
        }

        public Criteria andCat_id2GreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_id2 >=", value, "cat_id2");
            return (Criteria) this;
        }

        public Criteria andCat_id2LessThan(Integer value) {
            addCriterion("cat_id2 <", value, "cat_id2");
            return (Criteria) this;
        }

        public Criteria andCat_id2LessThanOrEqualTo(Integer value) {
            addCriterion("cat_id2 <=", value, "cat_id2");
            return (Criteria) this;
        }

        public Criteria andCat_id2In(List<Integer> values) {
            addCriterion("cat_id2 in", values, "cat_id2");
            return (Criteria) this;
        }

        public Criteria andCat_id2NotIn(List<Integer> values) {
            addCriterion("cat_id2 not in", values, "cat_id2");
            return (Criteria) this;
        }

        public Criteria andCat_id2Between(Integer value1, Integer value2) {
            addCriterion("cat_id2 between", value1, value2, "cat_id2");
            return (Criteria) this;
        }

        public Criteria andCat_id2NotBetween(Integer value1, Integer value2) {
            addCriterion("cat_id2 not between", value1, value2, "cat_id2");
            return (Criteria) this;
        }

        public Criteria andCat_id3IsNull() {
            addCriterion("cat_id3 is null");
            return (Criteria) this;
        }

        public Criteria andCat_id3IsNotNull() {
            addCriterion("cat_id3 is not null");
            return (Criteria) this;
        }

        public Criteria andCat_id3EqualTo(Integer value) {
            addCriterion("cat_id3 =", value, "cat_id3");
            return (Criteria) this;
        }

        public Criteria andCat_id3NotEqualTo(Integer value) {
            addCriterion("cat_id3 <>", value, "cat_id3");
            return (Criteria) this;
        }

        public Criteria andCat_id3GreaterThan(Integer value) {
            addCriterion("cat_id3 >", value, "cat_id3");
            return (Criteria) this;
        }

        public Criteria andCat_id3GreaterThanOrEqualTo(Integer value) {
            addCriterion("cat_id3 >=", value, "cat_id3");
            return (Criteria) this;
        }

        public Criteria andCat_id3LessThan(Integer value) {
            addCriterion("cat_id3 <", value, "cat_id3");
            return (Criteria) this;
        }

        public Criteria andCat_id3LessThanOrEqualTo(Integer value) {
            addCriterion("cat_id3 <=", value, "cat_id3");
            return (Criteria) this;
        }

        public Criteria andCat_id3In(List<Integer> values) {
            addCriterion("cat_id3 in", values, "cat_id3");
            return (Criteria) this;
        }

        public Criteria andCat_id3NotIn(List<Integer> values) {
            addCriterion("cat_id3 not in", values, "cat_id3");
            return (Criteria) this;
        }

        public Criteria andCat_id3Between(Integer value1, Integer value2) {
            addCriterion("cat_id3 between", value1, value2, "cat_id3");
            return (Criteria) this;
        }

        public Criteria andCat_id3NotBetween(Integer value1, Integer value2) {
            addCriterion("cat_id3 not between", value1, value2, "cat_id3");
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

        public Criteria andSku_openIsNull() {
            addCriterion("sku_open is null");
            return (Criteria) this;
        }

        public Criteria andSku_openIsNotNull() {
            addCriterion("sku_open is not null");
            return (Criteria) this;
        }

        public Criteria andSku_openEqualTo(Boolean value) {
            addCriterion("sku_open =", value, "sku_open");
            return (Criteria) this;
        }

        public Criteria andSku_openNotEqualTo(Boolean value) {
            addCriterion("sku_open <>", value, "sku_open");
            return (Criteria) this;
        }

        public Criteria andSku_openGreaterThan(Boolean value) {
            addCriterion("sku_open >", value, "sku_open");
            return (Criteria) this;
        }

        public Criteria andSku_openGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sku_open >=", value, "sku_open");
            return (Criteria) this;
        }

        public Criteria andSku_openLessThan(Boolean value) {
            addCriterion("sku_open <", value, "sku_open");
            return (Criteria) this;
        }

        public Criteria andSku_openLessThanOrEqualTo(Boolean value) {
            addCriterion("sku_open <=", value, "sku_open");
            return (Criteria) this;
        }

        public Criteria andSku_openIn(List<Boolean> values) {
            addCriterion("sku_open in", values, "sku_open");
            return (Criteria) this;
        }

        public Criteria andSku_openNotIn(List<Boolean> values) {
            addCriterion("sku_open not in", values, "sku_open");
            return (Criteria) this;
        }

        public Criteria andSku_openBetween(Boolean value1, Boolean value2) {
            addCriterion("sku_open between", value1, value2, "sku_open");
            return (Criteria) this;
        }

        public Criteria andSku_openNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sku_open not between", value1, value2, "sku_open");
            return (Criteria) this;
        }

        public Criteria andSku_idIsNull() {
            addCriterion("sku_id is null");
            return (Criteria) this;
        }

        public Criteria andSku_idIsNotNull() {
            addCriterion("sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andSku_idEqualTo(Integer value) {
            addCriterion("sku_id =", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idNotEqualTo(Integer value) {
            addCriterion("sku_id <>", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idGreaterThan(Integer value) {
            addCriterion("sku_id >", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_id >=", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idLessThan(Integer value) {
            addCriterion("sku_id <", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idLessThanOrEqualTo(Integer value) {
            addCriterion("sku_id <=", value, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idIn(List<Integer> values) {
            addCriterion("sku_id in", values, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idNotIn(List<Integer> values) {
            addCriterion("sku_id not in", values, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idBetween(Integer value1, Integer value2) {
            addCriterion("sku_id between", value1, value2, "sku_id");
            return (Criteria) this;
        }

        public Criteria andSku_idNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_id not between", value1, value2, "sku_id");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameIsNull() {
            addCriterion("goods_subname is null");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameIsNotNull() {
            addCriterion("goods_subname is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameEqualTo(String value) {
            addCriterion("goods_subname =", value, "goods_subname");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameNotEqualTo(String value) {
            addCriterion("goods_subname <>", value, "goods_subname");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameGreaterThan(String value) {
            addCriterion("goods_subname >", value, "goods_subname");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_subname >=", value, "goods_subname");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameLessThan(String value) {
            addCriterion("goods_subname <", value, "goods_subname");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameLessThanOrEqualTo(String value) {
            addCriterion("goods_subname <=", value, "goods_subname");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameLike(String value) {
            addCriterion("goods_subname like", value, "goods_subname");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameNotLike(String value) {
            addCriterion("goods_subname not like", value, "goods_subname");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameIn(List<String> values) {
            addCriterion("goods_subname in", values, "goods_subname");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameNotIn(List<String> values) {
            addCriterion("goods_subname not in", values, "goods_subname");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameBetween(String value1, String value2) {
            addCriterion("goods_subname between", value1, value2, "goods_subname");
            return (Criteria) this;
        }

        public Criteria andGoods_subnameNotBetween(String value1, String value2) {
            addCriterion("goods_subname not between", value1, value2, "goods_subname");
            return (Criteria) this;
        }

        public Criteria andGoods_priceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoods_priceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_priceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goods_price");
            return (Criteria) this;
        }

        public Criteria andGoods_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goods_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarket_priceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarket_priceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "market_price");
            return (Criteria) this;
        }

        public Criteria andMarket_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "market_price");
            return (Criteria) this;
        }

        public Criteria andCost_priceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCost_priceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCost_priceEqualTo(BigDecimal value) {
            addCriterion("cost_price =", value, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCost_priceNotEqualTo(BigDecimal value) {
            addCriterion("cost_price <>", value, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCost_priceGreaterThan(BigDecimal value) {
            addCriterion("cost_price >", value, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCost_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price >=", value, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCost_priceLessThan(BigDecimal value) {
            addCriterion("cost_price <", value, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCost_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price <=", value, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCost_priceIn(List<BigDecimal> values) {
            addCriterion("cost_price in", values, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCost_priceNotIn(List<BigDecimal> values) {
            addCriterion("cost_price not in", values, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCost_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price between", value1, value2, "cost_price");
            return (Criteria) this;
        }

        public Criteria andCost_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price not between", value1, value2, "cost_price");
            return (Criteria) this;
        }

        public Criteria andMobile_priceIsNull() {
            addCriterion("mobile_price is null");
            return (Criteria) this;
        }

        public Criteria andMobile_priceIsNotNull() {
            addCriterion("mobile_price is not null");
            return (Criteria) this;
        }

        public Criteria andMobile_priceEqualTo(BigDecimal value) {
            addCriterion("mobile_price =", value, "mobile_price");
            return (Criteria) this;
        }

        public Criteria andMobile_priceNotEqualTo(BigDecimal value) {
            addCriterion("mobile_price <>", value, "mobile_price");
            return (Criteria) this;
        }

        public Criteria andMobile_priceGreaterThan(BigDecimal value) {
            addCriterion("mobile_price >", value, "mobile_price");
            return (Criteria) this;
        }

        public Criteria andMobile_priceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mobile_price >=", value, "mobile_price");
            return (Criteria) this;
        }

        public Criteria andMobile_priceLessThan(BigDecimal value) {
            addCriterion("mobile_price <", value, "mobile_price");
            return (Criteria) this;
        }

        public Criteria andMobile_priceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mobile_price <=", value, "mobile_price");
            return (Criteria) this;
        }

        public Criteria andMobile_priceIn(List<BigDecimal> values) {
            addCriterion("mobile_price in", values, "mobile_price");
            return (Criteria) this;
        }

        public Criteria andMobile_priceNotIn(List<BigDecimal> values) {
            addCriterion("mobile_price not in", values, "mobile_price");
            return (Criteria) this;
        }

        public Criteria andMobile_priceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mobile_price between", value1, value2, "mobile_price");
            return (Criteria) this;
        }

        public Criteria andMobile_priceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mobile_price not between", value1, value2, "mobile_price");
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

        public Criteria andGoods_numberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoods_numberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_numberEqualTo(Integer value) {
            addCriterion("goods_number =", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberNotEqualTo(Integer value) {
            addCriterion("goods_number <>", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberGreaterThan(Integer value) {
            addCriterion("goods_number >", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_number >=", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberLessThan(Integer value) {
            addCriterion("goods_number <", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberLessThanOrEqualTo(Integer value) {
            addCriterion("goods_number <=", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberIn(List<Integer> values) {
            addCriterion("goods_number in", values, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberNotIn(List<Integer> values) {
            addCriterion("goods_number not in", values, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberBetween(Integer value1, Integer value2) {
            addCriterion("goods_number between", value1, value2, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_number not between", value1, value2, "goods_number");
            return (Criteria) this;
        }

        public Criteria andWarn_numberIsNull() {
            addCriterion("warn_number is null");
            return (Criteria) this;
        }

        public Criteria andWarn_numberIsNotNull() {
            addCriterion("warn_number is not null");
            return (Criteria) this;
        }

        public Criteria andWarn_numberEqualTo(Integer value) {
            addCriterion("warn_number =", value, "warn_number");
            return (Criteria) this;
        }

        public Criteria andWarn_numberNotEqualTo(Integer value) {
            addCriterion("warn_number <>", value, "warn_number");
            return (Criteria) this;
        }

        public Criteria andWarn_numberGreaterThan(Integer value) {
            addCriterion("warn_number >", value, "warn_number");
            return (Criteria) this;
        }

        public Criteria andWarn_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("warn_number >=", value, "warn_number");
            return (Criteria) this;
        }

        public Criteria andWarn_numberLessThan(Integer value) {
            addCriterion("warn_number <", value, "warn_number");
            return (Criteria) this;
        }

        public Criteria andWarn_numberLessThanOrEqualTo(Integer value) {
            addCriterion("warn_number <=", value, "warn_number");
            return (Criteria) this;
        }

        public Criteria andWarn_numberIn(List<Integer> values) {
            addCriterion("warn_number in", values, "warn_number");
            return (Criteria) this;
        }

        public Criteria andWarn_numberNotIn(List<Integer> values) {
            addCriterion("warn_number not in", values, "warn_number");
            return (Criteria) this;
        }

        public Criteria andWarn_numberBetween(Integer value1, Integer value2) {
            addCriterion("warn_number between", value1, value2, "warn_number");
            return (Criteria) this;
        }

        public Criteria andWarn_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("warn_number not between", value1, value2, "warn_number");
            return (Criteria) this;
        }

        public Criteria andGoods_snIsNull() {
            addCriterion("goods_sn is null");
            return (Criteria) this;
        }

        public Criteria andGoods_snIsNotNull() {
            addCriterion("goods_sn is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_snEqualTo(String value) {
            addCriterion("goods_sn =", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snNotEqualTo(String value) {
            addCriterion("goods_sn <>", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snGreaterThan(String value) {
            addCriterion("goods_sn >", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sn >=", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snLessThan(String value) {
            addCriterion("goods_sn <", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snLessThanOrEqualTo(String value) {
            addCriterion("goods_sn <=", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snLike(String value) {
            addCriterion("goods_sn like", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snNotLike(String value) {
            addCriterion("goods_sn not like", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snIn(List<String> values) {
            addCriterion("goods_sn in", values, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snNotIn(List<String> values) {
            addCriterion("goods_sn not in", values, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snBetween(String value1, String value2) {
            addCriterion("goods_sn between", value1, value2, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snNotBetween(String value1, String value2) {
            addCriterion("goods_sn not between", value1, value2, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeIsNull() {
            addCriterion("goods_barcode is null");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeIsNotNull() {
            addCriterion("goods_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeEqualTo(String value) {
            addCriterion("goods_barcode =", value, "goods_barcode");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeNotEqualTo(String value) {
            addCriterion("goods_barcode <>", value, "goods_barcode");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeGreaterThan(String value) {
            addCriterion("goods_barcode >", value, "goods_barcode");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_barcode >=", value, "goods_barcode");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeLessThan(String value) {
            addCriterion("goods_barcode <", value, "goods_barcode");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeLessThanOrEqualTo(String value) {
            addCriterion("goods_barcode <=", value, "goods_barcode");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeLike(String value) {
            addCriterion("goods_barcode like", value, "goods_barcode");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeNotLike(String value) {
            addCriterion("goods_barcode not like", value, "goods_barcode");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeIn(List<String> values) {
            addCriterion("goods_barcode in", values, "goods_barcode");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeNotIn(List<String> values) {
            addCriterion("goods_barcode not in", values, "goods_barcode");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeBetween(String value1, String value2) {
            addCriterion("goods_barcode between", value1, value2, "goods_barcode");
            return (Criteria) this;
        }

        public Criteria andGoods_barcodeNotBetween(String value1, String value2) {
            addCriterion("goods_barcode not between", value1, value2, "goods_barcode");
            return (Criteria) this;
        }

        public Criteria andGoods_imageIsNull() {
            addCriterion("goods_image is null");
            return (Criteria) this;
        }

        public Criteria andGoods_imageIsNotNull() {
            addCriterion("goods_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_imageEqualTo(String value) {
            addCriterion("goods_image =", value, "goods_image");
            return (Criteria) this;
        }

        public Criteria andGoods_imageNotEqualTo(String value) {
            addCriterion("goods_image <>", value, "goods_image");
            return (Criteria) this;
        }

        public Criteria andGoods_imageGreaterThan(String value) {
            addCriterion("goods_image >", value, "goods_image");
            return (Criteria) this;
        }

        public Criteria andGoods_imageGreaterThanOrEqualTo(String value) {
            addCriterion("goods_image >=", value, "goods_image");
            return (Criteria) this;
        }

        public Criteria andGoods_imageLessThan(String value) {
            addCriterion("goods_image <", value, "goods_image");
            return (Criteria) this;
        }

        public Criteria andGoods_imageLessThanOrEqualTo(String value) {
            addCriterion("goods_image <=", value, "goods_image");
            return (Criteria) this;
        }

        public Criteria andGoods_imageLike(String value) {
            addCriterion("goods_image like", value, "goods_image");
            return (Criteria) this;
        }

        public Criteria andGoods_imageNotLike(String value) {
            addCriterion("goods_image not like", value, "goods_image");
            return (Criteria) this;
        }

        public Criteria andGoods_imageIn(List<String> values) {
            addCriterion("goods_image in", values, "goods_image");
            return (Criteria) this;
        }

        public Criteria andGoods_imageNotIn(List<String> values) {
            addCriterion("goods_image not in", values, "goods_image");
            return (Criteria) this;
        }

        public Criteria andGoods_imageBetween(String value1, String value2) {
            addCriterion("goods_image between", value1, value2, "goods_image");
            return (Criteria) this;
        }

        public Criteria andGoods_imageNotBetween(String value1, String value2) {
            addCriterion("goods_image not between", value1, value2, "goods_image");
            return (Criteria) this;
        }

        public Criteria andBrand_idIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrand_idIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrand_idEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idLessThan(Integer value) {
            addCriterion("brand_id <", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brand_id");
            return (Criteria) this;
        }

        public Criteria andBrand_idNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brand_id");
            return (Criteria) this;
        }

        public Criteria andTop_layout_idIsNull() {
            addCriterion("top_layout_id is null");
            return (Criteria) this;
        }

        public Criteria andTop_layout_idIsNotNull() {
            addCriterion("top_layout_id is not null");
            return (Criteria) this;
        }

        public Criteria andTop_layout_idEqualTo(Integer value) {
            addCriterion("top_layout_id =", value, "top_layout_id");
            return (Criteria) this;
        }

        public Criteria andTop_layout_idNotEqualTo(Integer value) {
            addCriterion("top_layout_id <>", value, "top_layout_id");
            return (Criteria) this;
        }

        public Criteria andTop_layout_idGreaterThan(Integer value) {
            addCriterion("top_layout_id >", value, "top_layout_id");
            return (Criteria) this;
        }

        public Criteria andTop_layout_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("top_layout_id >=", value, "top_layout_id");
            return (Criteria) this;
        }

        public Criteria andTop_layout_idLessThan(Integer value) {
            addCriterion("top_layout_id <", value, "top_layout_id");
            return (Criteria) this;
        }

        public Criteria andTop_layout_idLessThanOrEqualTo(Integer value) {
            addCriterion("top_layout_id <=", value, "top_layout_id");
            return (Criteria) this;
        }

        public Criteria andTop_layout_idIn(List<Integer> values) {
            addCriterion("top_layout_id in", values, "top_layout_id");
            return (Criteria) this;
        }

        public Criteria andTop_layout_idNotIn(List<Integer> values) {
            addCriterion("top_layout_id not in", values, "top_layout_id");
            return (Criteria) this;
        }

        public Criteria andTop_layout_idBetween(Integer value1, Integer value2) {
            addCriterion("top_layout_id between", value1, value2, "top_layout_id");
            return (Criteria) this;
        }

        public Criteria andTop_layout_idNotBetween(Integer value1, Integer value2) {
            addCriterion("top_layout_id not between", value1, value2, "top_layout_id");
            return (Criteria) this;
        }

        public Criteria andBottom_layout_idIsNull() {
            addCriterion("bottom_layout_id is null");
            return (Criteria) this;
        }

        public Criteria andBottom_layout_idIsNotNull() {
            addCriterion("bottom_layout_id is not null");
            return (Criteria) this;
        }

        public Criteria andBottom_layout_idEqualTo(Integer value) {
            addCriterion("bottom_layout_id =", value, "bottom_layout_id");
            return (Criteria) this;
        }

        public Criteria andBottom_layout_idNotEqualTo(Integer value) {
            addCriterion("bottom_layout_id <>", value, "bottom_layout_id");
            return (Criteria) this;
        }

        public Criteria andBottom_layout_idGreaterThan(Integer value) {
            addCriterion("bottom_layout_id >", value, "bottom_layout_id");
            return (Criteria) this;
        }

        public Criteria andBottom_layout_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("bottom_layout_id >=", value, "bottom_layout_id");
            return (Criteria) this;
        }

        public Criteria andBottom_layout_idLessThan(Integer value) {
            addCriterion("bottom_layout_id <", value, "bottom_layout_id");
            return (Criteria) this;
        }

        public Criteria andBottom_layout_idLessThanOrEqualTo(Integer value) {
            addCriterion("bottom_layout_id <=", value, "bottom_layout_id");
            return (Criteria) this;
        }

        public Criteria andBottom_layout_idIn(List<Integer> values) {
            addCriterion("bottom_layout_id in", values, "bottom_layout_id");
            return (Criteria) this;
        }

        public Criteria andBottom_layout_idNotIn(List<Integer> values) {
            addCriterion("bottom_layout_id not in", values, "bottom_layout_id");
            return (Criteria) this;
        }

        public Criteria andBottom_layout_idBetween(Integer value1, Integer value2) {
            addCriterion("bottom_layout_id between", value1, value2, "bottom_layout_id");
            return (Criteria) this;
        }

        public Criteria andBottom_layout_idNotBetween(Integer value1, Integer value2) {
            addCriterion("bottom_layout_id not between", value1, value2, "bottom_layout_id");
            return (Criteria) this;
        }

        public Criteria andPacking_layout_idIsNull() {
            addCriterion("packing_layout_id is null");
            return (Criteria) this;
        }

        public Criteria andPacking_layout_idIsNotNull() {
            addCriterion("packing_layout_id is not null");
            return (Criteria) this;
        }

        public Criteria andPacking_layout_idEqualTo(Integer value) {
            addCriterion("packing_layout_id =", value, "packing_layout_id");
            return (Criteria) this;
        }

        public Criteria andPacking_layout_idNotEqualTo(Integer value) {
            addCriterion("packing_layout_id <>", value, "packing_layout_id");
            return (Criteria) this;
        }

        public Criteria andPacking_layout_idGreaterThan(Integer value) {
            addCriterion("packing_layout_id >", value, "packing_layout_id");
            return (Criteria) this;
        }

        public Criteria andPacking_layout_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("packing_layout_id >=", value, "packing_layout_id");
            return (Criteria) this;
        }

        public Criteria andPacking_layout_idLessThan(Integer value) {
            addCriterion("packing_layout_id <", value, "packing_layout_id");
            return (Criteria) this;
        }

        public Criteria andPacking_layout_idLessThanOrEqualTo(Integer value) {
            addCriterion("packing_layout_id <=", value, "packing_layout_id");
            return (Criteria) this;
        }

        public Criteria andPacking_layout_idIn(List<Integer> values) {
            addCriterion("packing_layout_id in", values, "packing_layout_id");
            return (Criteria) this;
        }

        public Criteria andPacking_layout_idNotIn(List<Integer> values) {
            addCriterion("packing_layout_id not in", values, "packing_layout_id");
            return (Criteria) this;
        }

        public Criteria andPacking_layout_idBetween(Integer value1, Integer value2) {
            addCriterion("packing_layout_id between", value1, value2, "packing_layout_id");
            return (Criteria) this;
        }

        public Criteria andPacking_layout_idNotBetween(Integer value1, Integer value2) {
            addCriterion("packing_layout_id not between", value1, value2, "packing_layout_id");
            return (Criteria) this;
        }

        public Criteria andService_layout_idIsNull() {
            addCriterion("service_layout_id is null");
            return (Criteria) this;
        }

        public Criteria andService_layout_idIsNotNull() {
            addCriterion("service_layout_id is not null");
            return (Criteria) this;
        }

        public Criteria andService_layout_idEqualTo(Integer value) {
            addCriterion("service_layout_id =", value, "service_layout_id");
            return (Criteria) this;
        }

        public Criteria andService_layout_idNotEqualTo(Integer value) {
            addCriterion("service_layout_id <>", value, "service_layout_id");
            return (Criteria) this;
        }

        public Criteria andService_layout_idGreaterThan(Integer value) {
            addCriterion("service_layout_id >", value, "service_layout_id");
            return (Criteria) this;
        }

        public Criteria andService_layout_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_layout_id >=", value, "service_layout_id");
            return (Criteria) this;
        }

        public Criteria andService_layout_idLessThan(Integer value) {
            addCriterion("service_layout_id <", value, "service_layout_id");
            return (Criteria) this;
        }

        public Criteria andService_layout_idLessThanOrEqualTo(Integer value) {
            addCriterion("service_layout_id <=", value, "service_layout_id");
            return (Criteria) this;
        }

        public Criteria andService_layout_idIn(List<Integer> values) {
            addCriterion("service_layout_id in", values, "service_layout_id");
            return (Criteria) this;
        }

        public Criteria andService_layout_idNotIn(List<Integer> values) {
            addCriterion("service_layout_id not in", values, "service_layout_id");
            return (Criteria) this;
        }

        public Criteria andService_layout_idBetween(Integer value1, Integer value2) {
            addCriterion("service_layout_id between", value1, value2, "service_layout_id");
            return (Criteria) this;
        }

        public Criteria andService_layout_idNotBetween(Integer value1, Integer value2) {
            addCriterion("service_layout_id not between", value1, value2, "service_layout_id");
            return (Criteria) this;
        }

        public Criteria andClick_countIsNull() {
            addCriterion("click_count is null");
            return (Criteria) this;
        }

        public Criteria andClick_countIsNotNull() {
            addCriterion("click_count is not null");
            return (Criteria) this;
        }

        public Criteria andClick_countEqualTo(Integer value) {
            addCriterion("click_count =", value, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countNotEqualTo(Integer value) {
            addCriterion("click_count <>", value, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countGreaterThan(Integer value) {
            addCriterion("click_count >", value, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("click_count >=", value, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countLessThan(Integer value) {
            addCriterion("click_count <", value, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countLessThanOrEqualTo(Integer value) {
            addCriterion("click_count <=", value, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countIn(List<Integer> values) {
            addCriterion("click_count in", values, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countNotIn(List<Integer> values) {
            addCriterion("click_count not in", values, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countBetween(Integer value1, Integer value2) {
            addCriterion("click_count between", value1, value2, "click_count");
            return (Criteria) this;
        }

        public Criteria andClick_countNotBetween(Integer value1, Integer value2) {
            addCriterion("click_count not between", value1, value2, "click_count");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andGoods_infoIsNull() {
            addCriterion("goods_info is null");
            return (Criteria) this;
        }

        public Criteria andGoods_infoIsNotNull() {
            addCriterion("goods_info is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_infoEqualTo(String value) {
            addCriterion("goods_info =", value, "goods_info");
            return (Criteria) this;
        }

        public Criteria andGoods_infoNotEqualTo(String value) {
            addCriterion("goods_info <>", value, "goods_info");
            return (Criteria) this;
        }

        public Criteria andGoods_infoGreaterThan(String value) {
            addCriterion("goods_info >", value, "goods_info");
            return (Criteria) this;
        }

        public Criteria andGoods_infoGreaterThanOrEqualTo(String value) {
            addCriterion("goods_info >=", value, "goods_info");
            return (Criteria) this;
        }

        public Criteria andGoods_infoLessThan(String value) {
            addCriterion("goods_info <", value, "goods_info");
            return (Criteria) this;
        }

        public Criteria andGoods_infoLessThanOrEqualTo(String value) {
            addCriterion("goods_info <=", value, "goods_info");
            return (Criteria) this;
        }

        public Criteria andGoods_infoLike(String value) {
            addCriterion("goods_info like", value, "goods_info");
            return (Criteria) this;
        }

        public Criteria andGoods_infoNotLike(String value) {
            addCriterion("goods_info not like", value, "goods_info");
            return (Criteria) this;
        }

        public Criteria andGoods_infoIn(List<String> values) {
            addCriterion("goods_info in", values, "goods_info");
            return (Criteria) this;
        }

        public Criteria andGoods_infoNotIn(List<String> values) {
            addCriterion("goods_info not in", values, "goods_info");
            return (Criteria) this;
        }

        public Criteria andGoods_infoBetween(String value1, String value2) {
            addCriterion("goods_info between", value1, value2, "goods_info");
            return (Criteria) this;
        }

        public Criteria andGoods_infoNotBetween(String value1, String value2) {
            addCriterion("goods_info not between", value1, value2, "goods_info");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeEqualTo(Boolean value) {
            addCriterion("invoice_type =", value, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeNotEqualTo(Boolean value) {
            addCriterion("invoice_type <>", value, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeGreaterThan(Boolean value) {
            addCriterion("invoice_type >", value, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("invoice_type >=", value, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeLessThan(Boolean value) {
            addCriterion("invoice_type <", value, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeLessThanOrEqualTo(Boolean value) {
            addCriterion("invoice_type <=", value, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeIn(List<Boolean> values) {
            addCriterion("invoice_type in", values, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeNotIn(List<Boolean> values) {
            addCriterion("invoice_type not in", values, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeBetween(Boolean value1, Boolean value2) {
            addCriterion("invoice_type between", value1, value2, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andInvoice_typeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("invoice_type not between", value1, value2, "invoice_type");
            return (Criteria) this;
        }

        public Criteria andIs_repairIsNull() {
            addCriterion("is_repair is null");
            return (Criteria) this;
        }

        public Criteria andIs_repairIsNotNull() {
            addCriterion("is_repair is not null");
            return (Criteria) this;
        }

        public Criteria andIs_repairEqualTo(Boolean value) {
            addCriterion("is_repair =", value, "is_repair");
            return (Criteria) this;
        }

        public Criteria andIs_repairNotEqualTo(Boolean value) {
            addCriterion("is_repair <>", value, "is_repair");
            return (Criteria) this;
        }

        public Criteria andIs_repairGreaterThan(Boolean value) {
            addCriterion("is_repair >", value, "is_repair");
            return (Criteria) this;
        }

        public Criteria andIs_repairGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_repair >=", value, "is_repair");
            return (Criteria) this;
        }

        public Criteria andIs_repairLessThan(Boolean value) {
            addCriterion("is_repair <", value, "is_repair");
            return (Criteria) this;
        }

        public Criteria andIs_repairLessThanOrEqualTo(Boolean value) {
            addCriterion("is_repair <=", value, "is_repair");
            return (Criteria) this;
        }

        public Criteria andIs_repairIn(List<Boolean> values) {
            addCriterion("is_repair in", values, "is_repair");
            return (Criteria) this;
        }

        public Criteria andIs_repairNotIn(List<Boolean> values) {
            addCriterion("is_repair not in", values, "is_repair");
            return (Criteria) this;
        }

        public Criteria andIs_repairBetween(Boolean value1, Boolean value2) {
            addCriterion("is_repair between", value1, value2, "is_repair");
            return (Criteria) this;
        }

        public Criteria andIs_repairNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_repair not between", value1, value2, "is_repair");
            return (Criteria) this;
        }

        public Criteria andUser_discountIsNull() {
            addCriterion("user_discount is null");
            return (Criteria) this;
        }

        public Criteria andUser_discountIsNotNull() {
            addCriterion("user_discount is not null");
            return (Criteria) this;
        }

        public Criteria andUser_discountEqualTo(Boolean value) {
            addCriterion("user_discount =", value, "user_discount");
            return (Criteria) this;
        }

        public Criteria andUser_discountNotEqualTo(Boolean value) {
            addCriterion("user_discount <>", value, "user_discount");
            return (Criteria) this;
        }

        public Criteria andUser_discountGreaterThan(Boolean value) {
            addCriterion("user_discount >", value, "user_discount");
            return (Criteria) this;
        }

        public Criteria andUser_discountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_discount >=", value, "user_discount");
            return (Criteria) this;
        }

        public Criteria andUser_discountLessThan(Boolean value) {
            addCriterion("user_discount <", value, "user_discount");
            return (Criteria) this;
        }

        public Criteria andUser_discountLessThanOrEqualTo(Boolean value) {
            addCriterion("user_discount <=", value, "user_discount");
            return (Criteria) this;
        }

        public Criteria andUser_discountIn(List<Boolean> values) {
            addCriterion("user_discount in", values, "user_discount");
            return (Criteria) this;
        }

        public Criteria andUser_discountNotIn(List<Boolean> values) {
            addCriterion("user_discount not in", values, "user_discount");
            return (Criteria) this;
        }

        public Criteria andUser_discountBetween(Boolean value1, Boolean value2) {
            addCriterion("user_discount between", value1, value2, "user_discount");
            return (Criteria) this;
        }

        public Criteria andUser_discountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_discount not between", value1, value2, "user_discount");
            return (Criteria) this;
        }

        public Criteria andStock_modeIsNull() {
            addCriterion("stock_mode is null");
            return (Criteria) this;
        }

        public Criteria andStock_modeIsNotNull() {
            addCriterion("stock_mode is not null");
            return (Criteria) this;
        }

        public Criteria andStock_modeEqualTo(Boolean value) {
            addCriterion("stock_mode =", value, "stock_mode");
            return (Criteria) this;
        }

        public Criteria andStock_modeNotEqualTo(Boolean value) {
            addCriterion("stock_mode <>", value, "stock_mode");
            return (Criteria) this;
        }

        public Criteria andStock_modeGreaterThan(Boolean value) {
            addCriterion("stock_mode >", value, "stock_mode");
            return (Criteria) this;
        }

        public Criteria andStock_modeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("stock_mode >=", value, "stock_mode");
            return (Criteria) this;
        }

        public Criteria andStock_modeLessThan(Boolean value) {
            addCriterion("stock_mode <", value, "stock_mode");
            return (Criteria) this;
        }

        public Criteria andStock_modeLessThanOrEqualTo(Boolean value) {
            addCriterion("stock_mode <=", value, "stock_mode");
            return (Criteria) this;
        }

        public Criteria andStock_modeIn(List<Boolean> values) {
            addCriterion("stock_mode in", values, "stock_mode");
            return (Criteria) this;
        }

        public Criteria andStock_modeNotIn(List<Boolean> values) {
            addCriterion("stock_mode not in", values, "stock_mode");
            return (Criteria) this;
        }

        public Criteria andStock_modeBetween(Boolean value1, Boolean value2) {
            addCriterion("stock_mode between", value1, value2, "stock_mode");
            return (Criteria) this;
        }

        public Criteria andStock_modeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("stock_mode not between", value1, value2, "stock_mode");
            return (Criteria) this;
        }

        public Criteria andComment_numIsNull() {
            addCriterion("comment_num is null");
            return (Criteria) this;
        }

        public Criteria andComment_numIsNotNull() {
            addCriterion("comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andComment_numEqualTo(Integer value) {
            addCriterion("comment_num =", value, "comment_num");
            return (Criteria) this;
        }

        public Criteria andComment_numNotEqualTo(Integer value) {
            addCriterion("comment_num <>", value, "comment_num");
            return (Criteria) this;
        }

        public Criteria andComment_numGreaterThan(Integer value) {
            addCriterion("comment_num >", value, "comment_num");
            return (Criteria) this;
        }

        public Criteria andComment_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_num >=", value, "comment_num");
            return (Criteria) this;
        }

        public Criteria andComment_numLessThan(Integer value) {
            addCriterion("comment_num <", value, "comment_num");
            return (Criteria) this;
        }

        public Criteria andComment_numLessThanOrEqualTo(Integer value) {
            addCriterion("comment_num <=", value, "comment_num");
            return (Criteria) this;
        }

        public Criteria andComment_numIn(List<Integer> values) {
            addCriterion("comment_num in", values, "comment_num");
            return (Criteria) this;
        }

        public Criteria andComment_numNotIn(List<Integer> values) {
            addCriterion("comment_num not in", values, "comment_num");
            return (Criteria) this;
        }

        public Criteria andComment_numBetween(Integer value1, Integer value2) {
            addCriterion("comment_num between", value1, value2, "comment_num");
            return (Criteria) this;
        }

        public Criteria andComment_numNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_num not between", value1, value2, "comment_num");
            return (Criteria) this;
        }

        public Criteria andSale_numIsNull() {
            addCriterion("sale_num is null");
            return (Criteria) this;
        }

        public Criteria andSale_numIsNotNull() {
            addCriterion("sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andSale_numEqualTo(Integer value) {
            addCriterion("sale_num =", value, "sale_num");
            return (Criteria) this;
        }

        public Criteria andSale_numNotEqualTo(Integer value) {
            addCriterion("sale_num <>", value, "sale_num");
            return (Criteria) this;
        }

        public Criteria andSale_numGreaterThan(Integer value) {
            addCriterion("sale_num >", value, "sale_num");
            return (Criteria) this;
        }

        public Criteria andSale_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_num >=", value, "sale_num");
            return (Criteria) this;
        }

        public Criteria andSale_numLessThan(Integer value) {
            addCriterion("sale_num <", value, "sale_num");
            return (Criteria) this;
        }

        public Criteria andSale_numLessThanOrEqualTo(Integer value) {
            addCriterion("sale_num <=", value, "sale_num");
            return (Criteria) this;
        }

        public Criteria andSale_numIn(List<Integer> values) {
            addCriterion("sale_num in", values, "sale_num");
            return (Criteria) this;
        }

        public Criteria andSale_numNotIn(List<Integer> values) {
            addCriterion("sale_num not in", values, "sale_num");
            return (Criteria) this;
        }

        public Criteria andSale_numBetween(Integer value1, Integer value2) {
            addCriterion("sale_num between", value1, value2, "sale_num");
            return (Criteria) this;
        }

        public Criteria andSale_numNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_num not between", value1, value2, "sale_num");
            return (Criteria) this;
        }

        public Criteria andCollect_numIsNull() {
            addCriterion("collect_num is null");
            return (Criteria) this;
        }

        public Criteria andCollect_numIsNotNull() {
            addCriterion("collect_num is not null");
            return (Criteria) this;
        }

        public Criteria andCollect_numEqualTo(Integer value) {
            addCriterion("collect_num =", value, "collect_num");
            return (Criteria) this;
        }

        public Criteria andCollect_numNotEqualTo(Integer value) {
            addCriterion("collect_num <>", value, "collect_num");
            return (Criteria) this;
        }

        public Criteria andCollect_numGreaterThan(Integer value) {
            addCriterion("collect_num >", value, "collect_num");
            return (Criteria) this;
        }

        public Criteria andCollect_numGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_num >=", value, "collect_num");
            return (Criteria) this;
        }

        public Criteria andCollect_numLessThan(Integer value) {
            addCriterion("collect_num <", value, "collect_num");
            return (Criteria) this;
        }

        public Criteria andCollect_numLessThanOrEqualTo(Integer value) {
            addCriterion("collect_num <=", value, "collect_num");
            return (Criteria) this;
        }

        public Criteria andCollect_numIn(List<Integer> values) {
            addCriterion("collect_num in", values, "collect_num");
            return (Criteria) this;
        }

        public Criteria andCollect_numNotIn(List<Integer> values) {
            addCriterion("collect_num not in", values, "collect_num");
            return (Criteria) this;
        }

        public Criteria andCollect_numBetween(Integer value1, Integer value2) {
            addCriterion("collect_num between", value1, value2, "collect_num");
            return (Criteria) this;
        }

        public Criteria andCollect_numNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_num not between", value1, value2, "collect_num");
            return (Criteria) this;
        }

        public Criteria andGoods_auditIsNull() {
            addCriterion("goods_audit is null");
            return (Criteria) this;
        }

        public Criteria andGoods_auditIsNotNull() {
            addCriterion("goods_audit is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_auditEqualTo(Boolean value) {
            addCriterion("goods_audit =", value, "goods_audit");
            return (Criteria) this;
        }

        public Criteria andGoods_auditNotEqualTo(Boolean value) {
            addCriterion("goods_audit <>", value, "goods_audit");
            return (Criteria) this;
        }

        public Criteria andGoods_auditGreaterThan(Boolean value) {
            addCriterion("goods_audit >", value, "goods_audit");
            return (Criteria) this;
        }

        public Criteria andGoods_auditGreaterThanOrEqualTo(Boolean value) {
            addCriterion("goods_audit >=", value, "goods_audit");
            return (Criteria) this;
        }

        public Criteria andGoods_auditLessThan(Boolean value) {
            addCriterion("goods_audit <", value, "goods_audit");
            return (Criteria) this;
        }

        public Criteria andGoods_auditLessThanOrEqualTo(Boolean value) {
            addCriterion("goods_audit <=", value, "goods_audit");
            return (Criteria) this;
        }

        public Criteria andGoods_auditIn(List<Boolean> values) {
            addCriterion("goods_audit in", values, "goods_audit");
            return (Criteria) this;
        }

        public Criteria andGoods_auditNotIn(List<Boolean> values) {
            addCriterion("goods_audit not in", values, "goods_audit");
            return (Criteria) this;
        }

        public Criteria andGoods_auditBetween(Boolean value1, Boolean value2) {
            addCriterion("goods_audit between", value1, value2, "goods_audit");
            return (Criteria) this;
        }

        public Criteria andGoods_auditNotBetween(Boolean value1, Boolean value2) {
            addCriterion("goods_audit not between", value1, value2, "goods_audit");
            return (Criteria) this;
        }

        public Criteria andGoods_statusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoods_statusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_statusEqualTo(Boolean value) {
            addCriterion("goods_status =", value, "goods_status");
            return (Criteria) this;
        }

        public Criteria andGoods_statusNotEqualTo(Boolean value) {
            addCriterion("goods_status <>", value, "goods_status");
            return (Criteria) this;
        }

        public Criteria andGoods_statusGreaterThan(Boolean value) {
            addCriterion("goods_status >", value, "goods_status");
            return (Criteria) this;
        }

        public Criteria andGoods_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("goods_status >=", value, "goods_status");
            return (Criteria) this;
        }

        public Criteria andGoods_statusLessThan(Boolean value) {
            addCriterion("goods_status <", value, "goods_status");
            return (Criteria) this;
        }

        public Criteria andGoods_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("goods_status <=", value, "goods_status");
            return (Criteria) this;
        }

        public Criteria andGoods_statusIn(List<Boolean> values) {
            addCriterion("goods_status in", values, "goods_status");
            return (Criteria) this;
        }

        public Criteria andGoods_statusNotIn(List<Boolean> values) {
            addCriterion("goods_status not in", values, "goods_status");
            return (Criteria) this;
        }

        public Criteria andGoods_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("goods_status between", value1, value2, "goods_status");
            return (Criteria) this;
        }

        public Criteria andGoods_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("goods_status not between", value1, value2, "goods_status");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonIsNull() {
            addCriterion("goods_reason is null");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonIsNotNull() {
            addCriterion("goods_reason is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonEqualTo(String value) {
            addCriterion("goods_reason =", value, "goods_reason");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonNotEqualTo(String value) {
            addCriterion("goods_reason <>", value, "goods_reason");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonGreaterThan(String value) {
            addCriterion("goods_reason >", value, "goods_reason");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonGreaterThanOrEqualTo(String value) {
            addCriterion("goods_reason >=", value, "goods_reason");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonLessThan(String value) {
            addCriterion("goods_reason <", value, "goods_reason");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonLessThanOrEqualTo(String value) {
            addCriterion("goods_reason <=", value, "goods_reason");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonLike(String value) {
            addCriterion("goods_reason like", value, "goods_reason");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonNotLike(String value) {
            addCriterion("goods_reason not like", value, "goods_reason");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonIn(List<String> values) {
            addCriterion("goods_reason in", values, "goods_reason");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonNotIn(List<String> values) {
            addCriterion("goods_reason not in", values, "goods_reason");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonBetween(String value1, String value2) {
            addCriterion("goods_reason between", value1, value2, "goods_reason");
            return (Criteria) this;
        }

        public Criteria andGoods_reasonNotBetween(String value1, String value2) {
            addCriterion("goods_reason not between", value1, value2, "goods_reason");
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

        public Criteria andIs_virtualIsNull() {
            addCriterion("is_virtual is null");
            return (Criteria) this;
        }

        public Criteria andIs_virtualIsNotNull() {
            addCriterion("is_virtual is not null");
            return (Criteria) this;
        }

        public Criteria andIs_virtualEqualTo(Boolean value) {
            addCriterion("is_virtual =", value, "is_virtual");
            return (Criteria) this;
        }

        public Criteria andIs_virtualNotEqualTo(Boolean value) {
            addCriterion("is_virtual <>", value, "is_virtual");
            return (Criteria) this;
        }

        public Criteria andIs_virtualGreaterThan(Boolean value) {
            addCriterion("is_virtual >", value, "is_virtual");
            return (Criteria) this;
        }

        public Criteria andIs_virtualGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_virtual >=", value, "is_virtual");
            return (Criteria) this;
        }

        public Criteria andIs_virtualLessThan(Boolean value) {
            addCriterion("is_virtual <", value, "is_virtual");
            return (Criteria) this;
        }

        public Criteria andIs_virtualLessThanOrEqualTo(Boolean value) {
            addCriterion("is_virtual <=", value, "is_virtual");
            return (Criteria) this;
        }

        public Criteria andIs_virtualIn(List<Boolean> values) {
            addCriterion("is_virtual in", values, "is_virtual");
            return (Criteria) this;
        }

        public Criteria andIs_virtualNotIn(List<Boolean> values) {
            addCriterion("is_virtual not in", values, "is_virtual");
            return (Criteria) this;
        }

        public Criteria andIs_virtualBetween(Boolean value1, Boolean value2) {
            addCriterion("is_virtual between", value1, value2, "is_virtual");
            return (Criteria) this;
        }

        public Criteria andIs_virtualNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_virtual not between", value1, value2, "is_virtual");
            return (Criteria) this;
        }

        public Criteria andIs_bestIsNull() {
            addCriterion("is_best is null");
            return (Criteria) this;
        }

        public Criteria andIs_bestIsNotNull() {
            addCriterion("is_best is not null");
            return (Criteria) this;
        }

        public Criteria andIs_bestEqualTo(Boolean value) {
            addCriterion("is_best =", value, "is_best");
            return (Criteria) this;
        }

        public Criteria andIs_bestNotEqualTo(Boolean value) {
            addCriterion("is_best <>", value, "is_best");
            return (Criteria) this;
        }

        public Criteria andIs_bestGreaterThan(Boolean value) {
            addCriterion("is_best >", value, "is_best");
            return (Criteria) this;
        }

        public Criteria andIs_bestGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_best >=", value, "is_best");
            return (Criteria) this;
        }

        public Criteria andIs_bestLessThan(Boolean value) {
            addCriterion("is_best <", value, "is_best");
            return (Criteria) this;
        }

        public Criteria andIs_bestLessThanOrEqualTo(Boolean value) {
            addCriterion("is_best <=", value, "is_best");
            return (Criteria) this;
        }

        public Criteria andIs_bestIn(List<Boolean> values) {
            addCriterion("is_best in", values, "is_best");
            return (Criteria) this;
        }

        public Criteria andIs_bestNotIn(List<Boolean> values) {
            addCriterion("is_best not in", values, "is_best");
            return (Criteria) this;
        }

        public Criteria andIs_bestBetween(Boolean value1, Boolean value2) {
            addCriterion("is_best between", value1, value2, "is_best");
            return (Criteria) this;
        }

        public Criteria andIs_bestNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_best not between", value1, value2, "is_best");
            return (Criteria) this;
        }

        public Criteria andIs_newIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIs_newIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIs_newEqualTo(Boolean value) {
            addCriterion("is_new =", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newNotEqualTo(Boolean value) {
            addCriterion("is_new <>", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newGreaterThan(Boolean value) {
            addCriterion("is_new >", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_new >=", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newLessThan(Boolean value) {
            addCriterion("is_new <", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newLessThanOrEqualTo(Boolean value) {
            addCriterion("is_new <=", value, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newIn(List<Boolean> values) {
            addCriterion("is_new in", values, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newNotIn(List<Boolean> values) {
            addCriterion("is_new not in", values, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new between", value1, value2, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_newNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_new not between", value1, value2, "is_new");
            return (Criteria) this;
        }

        public Criteria andIs_hotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIs_hotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIs_hotEqualTo(Boolean value) {
            addCriterion("is_hot =", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotNotEqualTo(Boolean value) {
            addCriterion("is_hot <>", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotGreaterThan(Boolean value) {
            addCriterion("is_hot >", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_hot >=", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotLessThan(Boolean value) {
            addCriterion("is_hot <", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotLessThanOrEqualTo(Boolean value) {
            addCriterion("is_hot <=", value, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotIn(List<Boolean> values) {
            addCriterion("is_hot in", values, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotNotIn(List<Boolean> values) {
            addCriterion("is_hot not in", values, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot between", value1, value2, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_hotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot not between", value1, value2, "is_hot");
            return (Criteria) this;
        }

        public Criteria andIs_promoteIsNull() {
            addCriterion("is_promote is null");
            return (Criteria) this;
        }

        public Criteria andIs_promoteIsNotNull() {
            addCriterion("is_promote is not null");
            return (Criteria) this;
        }

        public Criteria andIs_promoteEqualTo(Boolean value) {
            addCriterion("is_promote =", value, "is_promote");
            return (Criteria) this;
        }

        public Criteria andIs_promoteNotEqualTo(Boolean value) {
            addCriterion("is_promote <>", value, "is_promote");
            return (Criteria) this;
        }

        public Criteria andIs_promoteGreaterThan(Boolean value) {
            addCriterion("is_promote >", value, "is_promote");
            return (Criteria) this;
        }

        public Criteria andIs_promoteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_promote >=", value, "is_promote");
            return (Criteria) this;
        }

        public Criteria andIs_promoteLessThan(Boolean value) {
            addCriterion("is_promote <", value, "is_promote");
            return (Criteria) this;
        }

        public Criteria andIs_promoteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_promote <=", value, "is_promote");
            return (Criteria) this;
        }

        public Criteria andIs_promoteIn(List<Boolean> values) {
            addCriterion("is_promote in", values, "is_promote");
            return (Criteria) this;
        }

        public Criteria andIs_promoteNotIn(List<Boolean> values) {
            addCriterion("is_promote not in", values, "is_promote");
            return (Criteria) this;
        }

        public Criteria andIs_promoteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_promote between", value1, value2, "is_promote");
            return (Criteria) this;
        }

        public Criteria andIs_promoteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_promote not between", value1, value2, "is_promote");
            return (Criteria) this;
        }

        public Criteria andContract_idsIsNull() {
            addCriterion("contract_ids is null");
            return (Criteria) this;
        }

        public Criteria andContract_idsIsNotNull() {
            addCriterion("contract_ids is not null");
            return (Criteria) this;
        }

        public Criteria andContract_idsEqualTo(String value) {
            addCriterion("contract_ids =", value, "contract_ids");
            return (Criteria) this;
        }

        public Criteria andContract_idsNotEqualTo(String value) {
            addCriterion("contract_ids <>", value, "contract_ids");
            return (Criteria) this;
        }

        public Criteria andContract_idsGreaterThan(String value) {
            addCriterion("contract_ids >", value, "contract_ids");
            return (Criteria) this;
        }

        public Criteria andContract_idsGreaterThanOrEqualTo(String value) {
            addCriterion("contract_ids >=", value, "contract_ids");
            return (Criteria) this;
        }

        public Criteria andContract_idsLessThan(String value) {
            addCriterion("contract_ids <", value, "contract_ids");
            return (Criteria) this;
        }

        public Criteria andContract_idsLessThanOrEqualTo(String value) {
            addCriterion("contract_ids <=", value, "contract_ids");
            return (Criteria) this;
        }

        public Criteria andContract_idsLike(String value) {
            addCriterion("contract_ids like", value, "contract_ids");
            return (Criteria) this;
        }

        public Criteria andContract_idsNotLike(String value) {
            addCriterion("contract_ids not like", value, "contract_ids");
            return (Criteria) this;
        }

        public Criteria andContract_idsIn(List<String> values) {
            addCriterion("contract_ids in", values, "contract_ids");
            return (Criteria) this;
        }

        public Criteria andContract_idsNotIn(List<String> values) {
            addCriterion("contract_ids not in", values, "contract_ids");
            return (Criteria) this;
        }

        public Criteria andContract_idsBetween(String value1, String value2) {
            addCriterion("contract_ids between", value1, value2, "contract_ids");
            return (Criteria) this;
        }

        public Criteria andContract_idsNotBetween(String value1, String value2) {
            addCriterion("contract_ids not between", value1, value2, "contract_ids");
            return (Criteria) this;
        }

        public Criteria andSupplier_idIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplier_idIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplier_idEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andFreight_idIsNull() {
            addCriterion("freight_id is null");
            return (Criteria) this;
        }

        public Criteria andFreight_idIsNotNull() {
            addCriterion("freight_id is not null");
            return (Criteria) this;
        }

        public Criteria andFreight_idEqualTo(Integer value) {
            addCriterion("freight_id =", value, "freight_id");
            return (Criteria) this;
        }

        public Criteria andFreight_idNotEqualTo(Integer value) {
            addCriterion("freight_id <>", value, "freight_id");
            return (Criteria) this;
        }

        public Criteria andFreight_idGreaterThan(Integer value) {
            addCriterion("freight_id >", value, "freight_id");
            return (Criteria) this;
        }

        public Criteria andFreight_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("freight_id >=", value, "freight_id");
            return (Criteria) this;
        }

        public Criteria andFreight_idLessThan(Integer value) {
            addCriterion("freight_id <", value, "freight_id");
            return (Criteria) this;
        }

        public Criteria andFreight_idLessThanOrEqualTo(Integer value) {
            addCriterion("freight_id <=", value, "freight_id");
            return (Criteria) this;
        }

        public Criteria andFreight_idIn(List<Integer> values) {
            addCriterion("freight_id in", values, "freight_id");
            return (Criteria) this;
        }

        public Criteria andFreight_idNotIn(List<Integer> values) {
            addCriterion("freight_id not in", values, "freight_id");
            return (Criteria) this;
        }

        public Criteria andFreight_idBetween(Integer value1, Integer value2) {
            addCriterion("freight_id between", value1, value2, "freight_id");
            return (Criteria) this;
        }

        public Criteria andFreight_idNotBetween(Integer value1, Integer value2) {
            addCriterion("freight_id not between", value1, value2, "freight_id");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeIsNull() {
            addCriterion("goods_volume is null");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeIsNotNull() {
            addCriterion("goods_volume is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeEqualTo(String value) {
            addCriterion("goods_volume =", value, "goods_volume");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeNotEqualTo(String value) {
            addCriterion("goods_volume <>", value, "goods_volume");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeGreaterThan(String value) {
            addCriterion("goods_volume >", value, "goods_volume");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_volume >=", value, "goods_volume");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeLessThan(String value) {
            addCriterion("goods_volume <", value, "goods_volume");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeLessThanOrEqualTo(String value) {
            addCriterion("goods_volume <=", value, "goods_volume");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeLike(String value) {
            addCriterion("goods_volume like", value, "goods_volume");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeNotLike(String value) {
            addCriterion("goods_volume not like", value, "goods_volume");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeIn(List<String> values) {
            addCriterion("goods_volume in", values, "goods_volume");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeNotIn(List<String> values) {
            addCriterion("goods_volume not in", values, "goods_volume");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeBetween(String value1, String value2) {
            addCriterion("goods_volume between", value1, value2, "goods_volume");
            return (Criteria) this;
        }

        public Criteria andGoods_volumeNotBetween(String value1, String value2) {
            addCriterion("goods_volume not between", value1, value2, "goods_volume");
            return (Criteria) this;
        }

        public Criteria andGoods_weightIsNull() {
            addCriterion("goods_weight is null");
            return (Criteria) this;
        }

        public Criteria andGoods_weightIsNotNull() {
            addCriterion("goods_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_weightEqualTo(String value) {
            addCriterion("goods_weight =", value, "goods_weight");
            return (Criteria) this;
        }

        public Criteria andGoods_weightNotEqualTo(String value) {
            addCriterion("goods_weight <>", value, "goods_weight");
            return (Criteria) this;
        }

        public Criteria andGoods_weightGreaterThan(String value) {
            addCriterion("goods_weight >", value, "goods_weight");
            return (Criteria) this;
        }

        public Criteria andGoods_weightGreaterThanOrEqualTo(String value) {
            addCriterion("goods_weight >=", value, "goods_weight");
            return (Criteria) this;
        }

        public Criteria andGoods_weightLessThan(String value) {
            addCriterion("goods_weight <", value, "goods_weight");
            return (Criteria) this;
        }

        public Criteria andGoods_weightLessThanOrEqualTo(String value) {
            addCriterion("goods_weight <=", value, "goods_weight");
            return (Criteria) this;
        }

        public Criteria andGoods_weightLike(String value) {
            addCriterion("goods_weight like", value, "goods_weight");
            return (Criteria) this;
        }

        public Criteria andGoods_weightNotLike(String value) {
            addCriterion("goods_weight not like", value, "goods_weight");
            return (Criteria) this;
        }

        public Criteria andGoods_weightIn(List<String> values) {
            addCriterion("goods_weight in", values, "goods_weight");
            return (Criteria) this;
        }

        public Criteria andGoods_weightNotIn(List<String> values) {
            addCriterion("goods_weight not in", values, "goods_weight");
            return (Criteria) this;
        }

        public Criteria andGoods_weightBetween(String value1, String value2) {
            addCriterion("goods_weight between", value1, value2, "goods_weight");
            return (Criteria) this;
        }

        public Criteria andGoods_weightNotBetween(String value1, String value2) {
            addCriterion("goods_weight not between", value1, value2, "goods_weight");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkIsNull() {
            addCriterion("goods_remark is null");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkIsNotNull() {
            addCriterion("goods_remark is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkEqualTo(String value) {
            addCriterion("goods_remark =", value, "goods_remark");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkNotEqualTo(String value) {
            addCriterion("goods_remark <>", value, "goods_remark");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkGreaterThan(String value) {
            addCriterion("goods_remark >", value, "goods_remark");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("goods_remark >=", value, "goods_remark");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkLessThan(String value) {
            addCriterion("goods_remark <", value, "goods_remark");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkLessThanOrEqualTo(String value) {
            addCriterion("goods_remark <=", value, "goods_remark");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkLike(String value) {
            addCriterion("goods_remark like", value, "goods_remark");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkNotLike(String value) {
            addCriterion("goods_remark not like", value, "goods_remark");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkIn(List<String> values) {
            addCriterion("goods_remark in", values, "goods_remark");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkNotIn(List<String> values) {
            addCriterion("goods_remark not in", values, "goods_remark");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkBetween(String value1, String value2) {
            addCriterion("goods_remark between", value1, value2, "goods_remark");
            return (Criteria) this;
        }

        public Criteria andGoods_remarkNotBetween(String value1, String value2) {
            addCriterion("goods_remark not between", value1, value2, "goods_remark");
            return (Criteria) this;
        }

        public Criteria andGoods_sortIsNull() {
            addCriterion("goods_sort is null");
            return (Criteria) this;
        }

        public Criteria andGoods_sortIsNotNull() {
            addCriterion("goods_sort is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_sortEqualTo(Integer value) {
            addCriterion("goods_sort =", value, "goods_sort");
            return (Criteria) this;
        }

        public Criteria andGoods_sortNotEqualTo(Integer value) {
            addCriterion("goods_sort <>", value, "goods_sort");
            return (Criteria) this;
        }

        public Criteria andGoods_sortGreaterThan(Integer value) {
            addCriterion("goods_sort >", value, "goods_sort");
            return (Criteria) this;
        }

        public Criteria andGoods_sortGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sort >=", value, "goods_sort");
            return (Criteria) this;
        }

        public Criteria andGoods_sortLessThan(Integer value) {
            addCriterion("goods_sort <", value, "goods_sort");
            return (Criteria) this;
        }

        public Criteria andGoods_sortLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sort <=", value, "goods_sort");
            return (Criteria) this;
        }

        public Criteria andGoods_sortIn(List<Integer> values) {
            addCriterion("goods_sort in", values, "goods_sort");
            return (Criteria) this;
        }

        public Criteria andGoods_sortNotIn(List<Integer> values) {
            addCriterion("goods_sort not in", values, "goods_sort");
            return (Criteria) this;
        }

        public Criteria andGoods_sortBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort between", value1, value2, "goods_sort");
            return (Criteria) this;
        }

        public Criteria andGoods_sortNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort not between", value1, value2, "goods_sort");
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

        public Criteria andAct_idIsNull() {
            addCriterion("act_id is null");
            return (Criteria) this;
        }

        public Criteria andAct_idIsNotNull() {
            addCriterion("act_id is not null");
            return (Criteria) this;
        }

        public Criteria andAct_idEqualTo(Integer value) {
            addCriterion("act_id =", value, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idNotEqualTo(Integer value) {
            addCriterion("act_id <>", value, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idGreaterThan(Integer value) {
            addCriterion("act_id >", value, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_id >=", value, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idLessThan(Integer value) {
            addCriterion("act_id <", value, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idLessThanOrEqualTo(Integer value) {
            addCriterion("act_id <=", value, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idIn(List<Integer> values) {
            addCriterion("act_id in", values, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idNotIn(List<Integer> values) {
            addCriterion("act_id not in", values, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idBetween(Integer value1, Integer value2) {
            addCriterion("act_id between", value1, value2, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idNotBetween(Integer value1, Integer value2) {
            addCriterion("act_id not between", value1, value2, "act_id");
            return (Criteria) this;
        }

        public Criteria andLib_cat_idIsNull() {
            addCriterion("lib_cat_id is null");
            return (Criteria) this;
        }

        public Criteria andLib_cat_idIsNotNull() {
            addCriterion("lib_cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andLib_cat_idEqualTo(Integer value) {
            addCriterion("lib_cat_id =", value, "lib_cat_id");
            return (Criteria) this;
        }

        public Criteria andLib_cat_idNotEqualTo(Integer value) {
            addCriterion("lib_cat_id <>", value, "lib_cat_id");
            return (Criteria) this;
        }

        public Criteria andLib_cat_idGreaterThan(Integer value) {
            addCriterion("lib_cat_id >", value, "lib_cat_id");
            return (Criteria) this;
        }

        public Criteria andLib_cat_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("lib_cat_id >=", value, "lib_cat_id");
            return (Criteria) this;
        }

        public Criteria andLib_cat_idLessThan(Integer value) {
            addCriterion("lib_cat_id <", value, "lib_cat_id");
            return (Criteria) this;
        }

        public Criteria andLib_cat_idLessThanOrEqualTo(Integer value) {
            addCriterion("lib_cat_id <=", value, "lib_cat_id");
            return (Criteria) this;
        }

        public Criteria andLib_cat_idIn(List<Integer> values) {
            addCriterion("lib_cat_id in", values, "lib_cat_id");
            return (Criteria) this;
        }

        public Criteria andLib_cat_idNotIn(List<Integer> values) {
            addCriterion("lib_cat_id not in", values, "lib_cat_id");
            return (Criteria) this;
        }

        public Criteria andLib_cat_idBetween(Integer value1, Integer value2) {
            addCriterion("lib_cat_id between", value1, value2, "lib_cat_id");
            return (Criteria) this;
        }

        public Criteria andLib_cat_idNotBetween(Integer value1, Integer value2) {
            addCriterion("lib_cat_id not between", value1, value2, "lib_cat_id");
            return (Criteria) this;
        }

        public Criteria andGoods_id_from_erpIsNull() {
            addCriterion("goods_id_from_erp is null");
            return (Criteria) this;
        }

        public Criteria andGoods_id_from_erpIsNotNull() {
            addCriterion("goods_id_from_erp is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_id_from_erpEqualTo(Integer value) {
            addCriterion("goods_id_from_erp =", value, "goods_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andGoods_id_from_erpNotEqualTo(Integer value) {
            addCriterion("goods_id_from_erp <>", value, "goods_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andGoods_id_from_erpGreaterThan(Integer value) {
            addCriterion("goods_id_from_erp >", value, "goods_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andGoods_id_from_erpGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id_from_erp >=", value, "goods_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andGoods_id_from_erpLessThan(Integer value) {
            addCriterion("goods_id_from_erp <", value, "goods_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andGoods_id_from_erpLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id_from_erp <=", value, "goods_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andGoods_id_from_erpIn(List<Integer> values) {
            addCriterion("goods_id_from_erp in", values, "goods_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andGoods_id_from_erpNotIn(List<Integer> values) {
            addCriterion("goods_id_from_erp not in", values, "goods_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andGoods_id_from_erpBetween(Integer value1, Integer value2) {
            addCriterion("goods_id_from_erp between", value1, value2, "goods_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andGoods_id_from_erpNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id_from_erp not between", value1, value2, "goods_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andSku_id_from_erpIsNull() {
            addCriterion("sku_id_from_erp is null");
            return (Criteria) this;
        }

        public Criteria andSku_id_from_erpIsNotNull() {
            addCriterion("sku_id_from_erp is not null");
            return (Criteria) this;
        }

        public Criteria andSku_id_from_erpEqualTo(Integer value) {
            addCriterion("sku_id_from_erp =", value, "sku_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andSku_id_from_erpNotEqualTo(Integer value) {
            addCriterion("sku_id_from_erp <>", value, "sku_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andSku_id_from_erpGreaterThan(Integer value) {
            addCriterion("sku_id_from_erp >", value, "sku_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andSku_id_from_erpGreaterThanOrEqualTo(Integer value) {
            addCriterion("sku_id_from_erp >=", value, "sku_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andSku_id_from_erpLessThan(Integer value) {
            addCriterion("sku_id_from_erp <", value, "sku_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andSku_id_from_erpLessThanOrEqualTo(Integer value) {
            addCriterion("sku_id_from_erp <=", value, "sku_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andSku_id_from_erpIn(List<Integer> values) {
            addCriterion("sku_id_from_erp in", values, "sku_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andSku_id_from_erpNotIn(List<Integer> values) {
            addCriterion("sku_id_from_erp not in", values, "sku_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andSku_id_from_erpBetween(Integer value1, Integer value2) {
            addCriterion("sku_id_from_erp between", value1, value2, "sku_id_from_erp");
            return (Criteria) this;
        }

        public Criteria andSku_id_from_erpNotBetween(Integer value1, Integer value2) {
            addCriterion("sku_id_from_erp not between", value1, value2, "sku_id_from_erp");
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