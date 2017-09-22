package com.test.spring.boot.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsSkuDoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsSkuDoExample() {
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

        public Criteria andSku_nameIsNull() {
            addCriterion("sku_name is null");
            return (Criteria) this;
        }

        public Criteria andSku_nameIsNotNull() {
            addCriterion("sku_name is not null");
            return (Criteria) this;
        }

        public Criteria andSku_nameEqualTo(String value) {
            addCriterion("sku_name =", value, "sku_name");
            return (Criteria) this;
        }

        public Criteria andSku_nameNotEqualTo(String value) {
            addCriterion("sku_name <>", value, "sku_name");
            return (Criteria) this;
        }

        public Criteria andSku_nameGreaterThan(String value) {
            addCriterion("sku_name >", value, "sku_name");
            return (Criteria) this;
        }

        public Criteria andSku_nameGreaterThanOrEqualTo(String value) {
            addCriterion("sku_name >=", value, "sku_name");
            return (Criteria) this;
        }

        public Criteria andSku_nameLessThan(String value) {
            addCriterion("sku_name <", value, "sku_name");
            return (Criteria) this;
        }

        public Criteria andSku_nameLessThanOrEqualTo(String value) {
            addCriterion("sku_name <=", value, "sku_name");
            return (Criteria) this;
        }

        public Criteria andSku_nameLike(String value) {
            addCriterion("sku_name like", value, "sku_name");
            return (Criteria) this;
        }

        public Criteria andSku_nameNotLike(String value) {
            addCriterion("sku_name not like", value, "sku_name");
            return (Criteria) this;
        }

        public Criteria andSku_nameIn(List<String> values) {
            addCriterion("sku_name in", values, "sku_name");
            return (Criteria) this;
        }

        public Criteria andSku_nameNotIn(List<String> values) {
            addCriterion("sku_name not in", values, "sku_name");
            return (Criteria) this;
        }

        public Criteria andSku_nameBetween(String value1, String value2) {
            addCriterion("sku_name between", value1, value2, "sku_name");
            return (Criteria) this;
        }

        public Criteria andSku_nameNotBetween(String value1, String value2) {
            addCriterion("sku_name not between", value1, value2, "sku_name");
            return (Criteria) this;
        }

        public Criteria andSku_imageIsNull() {
            addCriterion("sku_image is null");
            return (Criteria) this;
        }

        public Criteria andSku_imageIsNotNull() {
            addCriterion("sku_image is not null");
            return (Criteria) this;
        }

        public Criteria andSku_imageEqualTo(String value) {
            addCriterion("sku_image =", value, "sku_image");
            return (Criteria) this;
        }

        public Criteria andSku_imageNotEqualTo(String value) {
            addCriterion("sku_image <>", value, "sku_image");
            return (Criteria) this;
        }

        public Criteria andSku_imageGreaterThan(String value) {
            addCriterion("sku_image >", value, "sku_image");
            return (Criteria) this;
        }

        public Criteria andSku_imageGreaterThanOrEqualTo(String value) {
            addCriterion("sku_image >=", value, "sku_image");
            return (Criteria) this;
        }

        public Criteria andSku_imageLessThan(String value) {
            addCriterion("sku_image <", value, "sku_image");
            return (Criteria) this;
        }

        public Criteria andSku_imageLessThanOrEqualTo(String value) {
            addCriterion("sku_image <=", value, "sku_image");
            return (Criteria) this;
        }

        public Criteria andSku_imageLike(String value) {
            addCriterion("sku_image like", value, "sku_image");
            return (Criteria) this;
        }

        public Criteria andSku_imageNotLike(String value) {
            addCriterion("sku_image not like", value, "sku_image");
            return (Criteria) this;
        }

        public Criteria andSku_imageIn(List<String> values) {
            addCriterion("sku_image in", values, "sku_image");
            return (Criteria) this;
        }

        public Criteria andSku_imageNotIn(List<String> values) {
            addCriterion("sku_image not in", values, "sku_image");
            return (Criteria) this;
        }

        public Criteria andSku_imageBetween(String value1, String value2) {
            addCriterion("sku_image between", value1, value2, "sku_image");
            return (Criteria) this;
        }

        public Criteria andSku_imageNotBetween(String value1, String value2) {
            addCriterion("sku_image not between", value1, value2, "sku_image");
            return (Criteria) this;
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

        public Criteria andSpec_idsIsNull() {
            addCriterion("spec_ids is null");
            return (Criteria) this;
        }

        public Criteria andSpec_idsIsNotNull() {
            addCriterion("spec_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSpec_idsEqualTo(String value) {
            addCriterion("spec_ids =", value, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsNotEqualTo(String value) {
            addCriterion("spec_ids <>", value, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsGreaterThan(String value) {
            addCriterion("spec_ids >", value, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsGreaterThanOrEqualTo(String value) {
            addCriterion("spec_ids >=", value, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsLessThan(String value) {
            addCriterion("spec_ids <", value, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsLessThanOrEqualTo(String value) {
            addCriterion("spec_ids <=", value, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsLike(String value) {
            addCriterion("spec_ids like", value, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsNotLike(String value) {
            addCriterion("spec_ids not like", value, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsIn(List<String> values) {
            addCriterion("spec_ids in", values, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsNotIn(List<String> values) {
            addCriterion("spec_ids not in", values, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsBetween(String value1, String value2) {
            addCriterion("spec_ids between", value1, value2, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_idsNotBetween(String value1, String value2) {
            addCriterion("spec_ids not between", value1, value2, "spec_ids");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsIsNull() {
            addCriterion("spec_vids is null");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsIsNotNull() {
            addCriterion("spec_vids is not null");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsEqualTo(String value) {
            addCriterion("spec_vids =", value, "spec_vids");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsNotEqualTo(String value) {
            addCriterion("spec_vids <>", value, "spec_vids");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsGreaterThan(String value) {
            addCriterion("spec_vids >", value, "spec_vids");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsGreaterThanOrEqualTo(String value) {
            addCriterion("spec_vids >=", value, "spec_vids");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsLessThan(String value) {
            addCriterion("spec_vids <", value, "spec_vids");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsLessThanOrEqualTo(String value) {
            addCriterion("spec_vids <=", value, "spec_vids");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsLike(String value) {
            addCriterion("spec_vids like", value, "spec_vids");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsNotLike(String value) {
            addCriterion("spec_vids not like", value, "spec_vids");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsIn(List<String> values) {
            addCriterion("spec_vids in", values, "spec_vids");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsNotIn(List<String> values) {
            addCriterion("spec_vids not in", values, "spec_vids");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsBetween(String value1, String value2) {
            addCriterion("spec_vids between", value1, value2, "spec_vids");
            return (Criteria) this;
        }

        public Criteria andSpec_vidsNotBetween(String value1, String value2) {
            addCriterion("spec_vids not between", value1, value2, "spec_vids");
            return (Criteria) this;
        }

        public Criteria andSpec_namesIsNull() {
            addCriterion("spec_names is null");
            return (Criteria) this;
        }

        public Criteria andSpec_namesIsNotNull() {
            addCriterion("spec_names is not null");
            return (Criteria) this;
        }

        public Criteria andSpec_namesEqualTo(String value) {
            addCriterion("spec_names =", value, "spec_names");
            return (Criteria) this;
        }

        public Criteria andSpec_namesNotEqualTo(String value) {
            addCriterion("spec_names <>", value, "spec_names");
            return (Criteria) this;
        }

        public Criteria andSpec_namesGreaterThan(String value) {
            addCriterion("spec_names >", value, "spec_names");
            return (Criteria) this;
        }

        public Criteria andSpec_namesGreaterThanOrEqualTo(String value) {
            addCriterion("spec_names >=", value, "spec_names");
            return (Criteria) this;
        }

        public Criteria andSpec_namesLessThan(String value) {
            addCriterion("spec_names <", value, "spec_names");
            return (Criteria) this;
        }

        public Criteria andSpec_namesLessThanOrEqualTo(String value) {
            addCriterion("spec_names <=", value, "spec_names");
            return (Criteria) this;
        }

        public Criteria andSpec_namesLike(String value) {
            addCriterion("spec_names like", value, "spec_names");
            return (Criteria) this;
        }

        public Criteria andSpec_namesNotLike(String value) {
            addCriterion("spec_names not like", value, "spec_names");
            return (Criteria) this;
        }

        public Criteria andSpec_namesIn(List<String> values) {
            addCriterion("spec_names in", values, "spec_names");
            return (Criteria) this;
        }

        public Criteria andSpec_namesNotIn(List<String> values) {
            addCriterion("spec_names not in", values, "spec_names");
            return (Criteria) this;
        }

        public Criteria andSpec_namesBetween(String value1, String value2) {
            addCriterion("spec_names between", value1, value2, "spec_names");
            return (Criteria) this;
        }

        public Criteria andSpec_namesNotBetween(String value1, String value2) {
            addCriterion("spec_names not between", value1, value2, "spec_names");
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

        public Criteria andIs_spuIsNull() {
            addCriterion("is_spu is null");
            return (Criteria) this;
        }

        public Criteria andIs_spuIsNotNull() {
            addCriterion("is_spu is not null");
            return (Criteria) this;
        }

        public Criteria andIs_spuEqualTo(Boolean value) {
            addCriterion("is_spu =", value, "is_spu");
            return (Criteria) this;
        }

        public Criteria andIs_spuNotEqualTo(Boolean value) {
            addCriterion("is_spu <>", value, "is_spu");
            return (Criteria) this;
        }

        public Criteria andIs_spuGreaterThan(Boolean value) {
            addCriterion("is_spu >", value, "is_spu");
            return (Criteria) this;
        }

        public Criteria andIs_spuGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_spu >=", value, "is_spu");
            return (Criteria) this;
        }

        public Criteria andIs_spuLessThan(Boolean value) {
            addCriterion("is_spu <", value, "is_spu");
            return (Criteria) this;
        }

        public Criteria andIs_spuLessThanOrEqualTo(Boolean value) {
            addCriterion("is_spu <=", value, "is_spu");
            return (Criteria) this;
        }

        public Criteria andIs_spuIn(List<Boolean> values) {
            addCriterion("is_spu in", values, "is_spu");
            return (Criteria) this;
        }

        public Criteria andIs_spuNotIn(List<Boolean> values) {
            addCriterion("is_spu not in", values, "is_spu");
            return (Criteria) this;
        }

        public Criteria andIs_spuBetween(Boolean value1, Boolean value2) {
            addCriterion("is_spu between", value1, value2, "is_spu");
            return (Criteria) this;
        }

        public Criteria andIs_spuNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_spu not between", value1, value2, "is_spu");
            return (Criteria) this;
        }

        public Criteria andIs_enableIsNull() {
            addCriterion("is_enable is null");
            return (Criteria) this;
        }

        public Criteria andIs_enableIsNotNull() {
            addCriterion("is_enable is not null");
            return (Criteria) this;
        }

        public Criteria andIs_enableEqualTo(Boolean value) {
            addCriterion("is_enable =", value, "is_enable");
            return (Criteria) this;
        }

        public Criteria andIs_enableNotEqualTo(Boolean value) {
            addCriterion("is_enable <>", value, "is_enable");
            return (Criteria) this;
        }

        public Criteria andIs_enableGreaterThan(Boolean value) {
            addCriterion("is_enable >", value, "is_enable");
            return (Criteria) this;
        }

        public Criteria andIs_enableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_enable >=", value, "is_enable");
            return (Criteria) this;
        }

        public Criteria andIs_enableLessThan(Boolean value) {
            addCriterion("is_enable <", value, "is_enable");
            return (Criteria) this;
        }

        public Criteria andIs_enableLessThanOrEqualTo(Boolean value) {
            addCriterion("is_enable <=", value, "is_enable");
            return (Criteria) this;
        }

        public Criteria andIs_enableIn(List<Boolean> values) {
            addCriterion("is_enable in", values, "is_enable");
            return (Criteria) this;
        }

        public Criteria andIs_enableNotIn(List<Boolean> values) {
            addCriterion("is_enable not in", values, "is_enable");
            return (Criteria) this;
        }

        public Criteria andIs_enableBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enable between", value1, value2, "is_enable");
            return (Criteria) this;
        }

        public Criteria andIs_enableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enable not between", value1, value2, "is_enable");
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