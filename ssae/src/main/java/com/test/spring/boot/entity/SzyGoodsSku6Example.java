package com.test.spring.boot.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SzyGoodsSku6Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SzyGoodsSku6Example() {
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

        public Criteria andSkuBarcodeIsNull() {
            addCriterion("sku_barcode is null");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeIsNotNull() {
            addCriterion("sku_barcode is not null");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeEqualTo(String value) {
            addCriterion("sku_barcode =", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeNotEqualTo(String value) {
            addCriterion("sku_barcode <>", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeGreaterThan(String value) {
            addCriterion("sku_barcode >", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("sku_barcode >=", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeLessThan(String value) {
            addCriterion("sku_barcode <", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeLessThanOrEqualTo(String value) {
            addCriterion("sku_barcode <=", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeLike(String value) {
            addCriterion("sku_barcode like", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeNotLike(String value) {
            addCriterion("sku_barcode not like", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeIn(List<String> values) {
            addCriterion("sku_barcode in", values, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeNotIn(List<String> values) {
            addCriterion("sku_barcode not in", values, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeBetween(String value1, String value2) {
            addCriterion("sku_barcode between", value1, value2, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeNotBetween(String value1, String value2) {
            addCriterion("sku_barcode not between", value1, value2, "skuBarcode");
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

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIsNull() {
            addCriterion("member_price is null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIsNotNull() {
            addCriterion("member_price is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceEqualTo(BigDecimal value) {
            addCriterion("member_price =", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotEqualTo(BigDecimal value) {
            addCriterion("member_price <>", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceGreaterThan(BigDecimal value) {
            addCriterion("member_price >", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("member_price >=", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLessThan(BigDecimal value) {
            addCriterion("member_price <", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("member_price <=", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIn(List<BigDecimal> values) {
            addCriterion("member_price in", values, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotIn(List<BigDecimal> values) {
            addCriterion("member_price not in", values, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_price between", value1, value2, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_price not between", value1, value2, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceIsNull() {
            addCriterion("wholesale_price is null");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceIsNotNull() {
            addCriterion("wholesale_price is not null");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceEqualTo(BigDecimal value) {
            addCriterion("wholesale_price =", value, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceNotEqualTo(BigDecimal value) {
            addCriterion("wholesale_price <>", value, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceGreaterThan(BigDecimal value) {
            addCriterion("wholesale_price >", value, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wholesale_price >=", value, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceLessThan(BigDecimal value) {
            addCriterion("wholesale_price <", value, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wholesale_price <=", value, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceIn(List<BigDecimal> values) {
            addCriterion("wholesale_price in", values, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceNotIn(List<BigDecimal> values) {
            addCriterion("wholesale_price not in", values, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wholesale_price between", value1, value2, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andWholesalePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wholesale_price not between", value1, value2, "wholesalePrice");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("is_enable is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("is_enable is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableEqualTo(Boolean value) {
            addCriterion("is_enable =", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotEqualTo(Boolean value) {
            addCriterion("is_enable <>", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThan(Boolean value) {
            addCriterion("is_enable >", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_enable >=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThan(Boolean value) {
            addCriterion("is_enable <", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(Boolean value) {
            addCriterion("is_enable <=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableIn(List<Boolean> values) {
            addCriterion("is_enable in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotIn(List<Boolean> values) {
            addCriterion("is_enable not in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enable between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enable not between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andSkuImageIsNull() {
            addCriterion("sku_image is null");
            return (Criteria) this;
        }

        public Criteria andSkuImageIsNotNull() {
            addCriterion("sku_image is not null");
            return (Criteria) this;
        }

        public Criteria andSkuImageEqualTo(String value) {
            addCriterion("sku_image =", value, "skuImage");
            return (Criteria) this;
        }

        public Criteria andSkuImageNotEqualTo(String value) {
            addCriterion("sku_image <>", value, "skuImage");
            return (Criteria) this;
        }

        public Criteria andSkuImageGreaterThan(String value) {
            addCriterion("sku_image >", value, "skuImage");
            return (Criteria) this;
        }

        public Criteria andSkuImageGreaterThanOrEqualTo(String value) {
            addCriterion("sku_image >=", value, "skuImage");
            return (Criteria) this;
        }

        public Criteria andSkuImageLessThan(String value) {
            addCriterion("sku_image <", value, "skuImage");
            return (Criteria) this;
        }

        public Criteria andSkuImageLessThanOrEqualTo(String value) {
            addCriterion("sku_image <=", value, "skuImage");
            return (Criteria) this;
        }

        public Criteria andSkuImageLike(String value) {
            addCriterion("sku_image like", value, "skuImage");
            return (Criteria) this;
        }

        public Criteria andSkuImageNotLike(String value) {
            addCriterion("sku_image not like", value, "skuImage");
            return (Criteria) this;
        }

        public Criteria andSkuImageIn(List<String> values) {
            addCriterion("sku_image in", values, "skuImage");
            return (Criteria) this;
        }

        public Criteria andSkuImageNotIn(List<String> values) {
            addCriterion("sku_image not in", values, "skuImage");
            return (Criteria) this;
        }

        public Criteria andSkuImageBetween(String value1, String value2) {
            addCriterion("sku_image between", value1, value2, "skuImage");
            return (Criteria) this;
        }

        public Criteria andSkuImageNotBetween(String value1, String value2) {
            addCriterion("sku_image not between", value1, value2, "skuImage");
            return (Criteria) this;
        }

        public Criteria andMinWarnIsNull() {
            addCriterion("min_warn is null");
            return (Criteria) this;
        }

        public Criteria andMinWarnIsNotNull() {
            addCriterion("min_warn is not null");
            return (Criteria) this;
        }

        public Criteria andMinWarnEqualTo(Double value) {
            addCriterion("min_warn =", value, "minWarn");
            return (Criteria) this;
        }

        public Criteria andMinWarnNotEqualTo(Double value) {
            addCriterion("min_warn <>", value, "minWarn");
            return (Criteria) this;
        }

        public Criteria andMinWarnGreaterThan(Double value) {
            addCriterion("min_warn >", value, "minWarn");
            return (Criteria) this;
        }

        public Criteria andMinWarnGreaterThanOrEqualTo(Double value) {
            addCriterion("min_warn >=", value, "minWarn");
            return (Criteria) this;
        }

        public Criteria andMinWarnLessThan(Double value) {
            addCriterion("min_warn <", value, "minWarn");
            return (Criteria) this;
        }

        public Criteria andMinWarnLessThanOrEqualTo(Double value) {
            addCriterion("min_warn <=", value, "minWarn");
            return (Criteria) this;
        }

        public Criteria andMinWarnIn(List<Double> values) {
            addCriterion("min_warn in", values, "minWarn");
            return (Criteria) this;
        }

        public Criteria andMinWarnNotIn(List<Double> values) {
            addCriterion("min_warn not in", values, "minWarn");
            return (Criteria) this;
        }

        public Criteria andMinWarnBetween(Double value1, Double value2) {
            addCriterion("min_warn between", value1, value2, "minWarn");
            return (Criteria) this;
        }

        public Criteria andMinWarnNotBetween(Double value1, Double value2) {
            addCriterion("min_warn not between", value1, value2, "minWarn");
            return (Criteria) this;
        }

        public Criteria andSpecIdsIsNull() {
            addCriterion("spec_ids is null");
            return (Criteria) this;
        }

        public Criteria andSpecIdsIsNotNull() {
            addCriterion("spec_ids is not null");
            return (Criteria) this;
        }

        public Criteria andSpecIdsEqualTo(String value) {
            addCriterion("spec_ids =", value, "specIds");
            return (Criteria) this;
        }

        public Criteria andSpecIdsNotEqualTo(String value) {
            addCriterion("spec_ids <>", value, "specIds");
            return (Criteria) this;
        }

        public Criteria andSpecIdsGreaterThan(String value) {
            addCriterion("spec_ids >", value, "specIds");
            return (Criteria) this;
        }

        public Criteria andSpecIdsGreaterThanOrEqualTo(String value) {
            addCriterion("spec_ids >=", value, "specIds");
            return (Criteria) this;
        }

        public Criteria andSpecIdsLessThan(String value) {
            addCriterion("spec_ids <", value, "specIds");
            return (Criteria) this;
        }

        public Criteria andSpecIdsLessThanOrEqualTo(String value) {
            addCriterion("spec_ids <=", value, "specIds");
            return (Criteria) this;
        }

        public Criteria andSpecIdsLike(String value) {
            addCriterion("spec_ids like", value, "specIds");
            return (Criteria) this;
        }

        public Criteria andSpecIdsNotLike(String value) {
            addCriterion("spec_ids not like", value, "specIds");
            return (Criteria) this;
        }

        public Criteria andSpecIdsIn(List<String> values) {
            addCriterion("spec_ids in", values, "specIds");
            return (Criteria) this;
        }

        public Criteria andSpecIdsNotIn(List<String> values) {
            addCriterion("spec_ids not in", values, "specIds");
            return (Criteria) this;
        }

        public Criteria andSpecIdsBetween(String value1, String value2) {
            addCriterion("spec_ids between", value1, value2, "specIds");
            return (Criteria) this;
        }

        public Criteria andSpecIdsNotBetween(String value1, String value2) {
            addCriterion("spec_ids not between", value1, value2, "specIds");
            return (Criteria) this;
        }

        public Criteria andSpecVidsIsNull() {
            addCriterion("spec_vids is null");
            return (Criteria) this;
        }

        public Criteria andSpecVidsIsNotNull() {
            addCriterion("spec_vids is not null");
            return (Criteria) this;
        }

        public Criteria andSpecVidsEqualTo(String value) {
            addCriterion("spec_vids =", value, "specVids");
            return (Criteria) this;
        }

        public Criteria andSpecVidsNotEqualTo(String value) {
            addCriterion("spec_vids <>", value, "specVids");
            return (Criteria) this;
        }

        public Criteria andSpecVidsGreaterThan(String value) {
            addCriterion("spec_vids >", value, "specVids");
            return (Criteria) this;
        }

        public Criteria andSpecVidsGreaterThanOrEqualTo(String value) {
            addCriterion("spec_vids >=", value, "specVids");
            return (Criteria) this;
        }

        public Criteria andSpecVidsLessThan(String value) {
            addCriterion("spec_vids <", value, "specVids");
            return (Criteria) this;
        }

        public Criteria andSpecVidsLessThanOrEqualTo(String value) {
            addCriterion("spec_vids <=", value, "specVids");
            return (Criteria) this;
        }

        public Criteria andSpecVidsLike(String value) {
            addCriterion("spec_vids like", value, "specVids");
            return (Criteria) this;
        }

        public Criteria andSpecVidsNotLike(String value) {
            addCriterion("spec_vids not like", value, "specVids");
            return (Criteria) this;
        }

        public Criteria andSpecVidsIn(List<String> values) {
            addCriterion("spec_vids in", values, "specVids");
            return (Criteria) this;
        }

        public Criteria andSpecVidsNotIn(List<String> values) {
            addCriterion("spec_vids not in", values, "specVids");
            return (Criteria) this;
        }

        public Criteria andSpecVidsBetween(String value1, String value2) {
            addCriterion("spec_vids between", value1, value2, "specVids");
            return (Criteria) this;
        }

        public Criteria andSpecVidsNotBetween(String value1, String value2) {
            addCriterion("spec_vids not between", value1, value2, "specVids");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNull() {
            addCriterion("discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNotNull() {
            addCriterion("discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateEqualTo(Short value) {
            addCriterion("discount_rate =", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotEqualTo(Short value) {
            addCriterion("discount_rate <>", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThan(Short value) {
            addCriterion("discount_rate >", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThanOrEqualTo(Short value) {
            addCriterion("discount_rate >=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThan(Short value) {
            addCriterion("discount_rate <", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThanOrEqualTo(Short value) {
            addCriterion("discount_rate <=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIn(List<Short> values) {
            addCriterion("discount_rate in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotIn(List<Short> values) {
            addCriterion("discount_rate not in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateBetween(Short value1, Short value2) {
            addCriterion("discount_rate between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotBetween(Short value1, Short value2) {
            addCriterion("discount_rate not between", value1, value2, "discountRate");
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

        public Criteria andTransitNumberIsNull() {
            addCriterion("transit_number is null");
            return (Criteria) this;
        }

        public Criteria andTransitNumberIsNotNull() {
            addCriterion("transit_number is not null");
            return (Criteria) this;
        }

        public Criteria andTransitNumberEqualTo(Double value) {
            addCriterion("transit_number =", value, "transitNumber");
            return (Criteria) this;
        }

        public Criteria andTransitNumberNotEqualTo(Double value) {
            addCriterion("transit_number <>", value, "transitNumber");
            return (Criteria) this;
        }

        public Criteria andTransitNumberGreaterThan(Double value) {
            addCriterion("transit_number >", value, "transitNumber");
            return (Criteria) this;
        }

        public Criteria andTransitNumberGreaterThanOrEqualTo(Double value) {
            addCriterion("transit_number >=", value, "transitNumber");
            return (Criteria) this;
        }

        public Criteria andTransitNumberLessThan(Double value) {
            addCriterion("transit_number <", value, "transitNumber");
            return (Criteria) this;
        }

        public Criteria andTransitNumberLessThanOrEqualTo(Double value) {
            addCriterion("transit_number <=", value, "transitNumber");
            return (Criteria) this;
        }

        public Criteria andTransitNumberIn(List<Double> values) {
            addCriterion("transit_number in", values, "transitNumber");
            return (Criteria) this;
        }

        public Criteria andTransitNumberNotIn(List<Double> values) {
            addCriterion("transit_number not in", values, "transitNumber");
            return (Criteria) this;
        }

        public Criteria andTransitNumberBetween(Double value1, Double value2) {
            addCriterion("transit_number between", value1, value2, "transitNumber");
            return (Criteria) this;
        }

        public Criteria andTransitNumberNotBetween(Double value1, Double value2) {
            addCriterion("transit_number not between", value1, value2, "transitNumber");
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