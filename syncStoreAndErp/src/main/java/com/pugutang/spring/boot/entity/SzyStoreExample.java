package com.pugutang.spring.boot.entity;

import java.util.ArrayList;
import java.util.List;

public class SzyStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SzyStoreExample() {
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

        public Criteria andStoreTypeIdIsNull() {
            addCriterion("store_type_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIdIsNotNull() {
            addCriterion("store_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIdEqualTo(Integer value) {
            addCriterion("store_type_id =", value, "storeTypeId");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIdNotEqualTo(Integer value) {
            addCriterion("store_type_id <>", value, "storeTypeId");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIdGreaterThan(Integer value) {
            addCriterion("store_type_id >", value, "storeTypeId");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_type_id >=", value, "storeTypeId");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIdLessThan(Integer value) {
            addCriterion("store_type_id <", value, "storeTypeId");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("store_type_id <=", value, "storeTypeId");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIdIn(List<Integer> values) {
            addCriterion("store_type_id in", values, "storeTypeId");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIdNotIn(List<Integer> values) {
            addCriterion("store_type_id not in", values, "storeTypeId");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("store_type_id between", value1, value2, "storeTypeId");
            return (Criteria) this;
        }

        public Criteria andStoreTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("store_type_id not between", value1, value2, "storeTypeId");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
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

        public Criteria andRegionCodeIsNull() {
            addCriterion("region_code is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("region_code is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("region_code =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("region_code <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("region_code >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("region_code >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("region_code <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("region_code <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("region_code like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("region_code not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("region_code in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("region_code not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("region_code between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("region_code not between", value1, value2, "regionCode");
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

        public Criteria andStoreStatusIsNull() {
            addCriterion("store_status is null");
            return (Criteria) this;
        }

        public Criteria andStoreStatusIsNotNull() {
            addCriterion("store_status is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStatusEqualTo(Boolean value) {
            addCriterion("store_status =", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusNotEqualTo(Boolean value) {
            addCriterion("store_status <>", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusGreaterThan(Boolean value) {
            addCriterion("store_status >", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("store_status >=", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusLessThan(Boolean value) {
            addCriterion("store_status <", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("store_status <=", value, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusIn(List<Boolean> values) {
            addCriterion("store_status in", values, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusNotIn(List<Boolean> values) {
            addCriterion("store_status not in", values, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("store_status between", value1, value2, "storeStatus");
            return (Criteria) this;
        }

        public Criteria andStoreStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("store_status not between", value1, value2, "storeStatus");
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

        public Criteria andStoreTypeSortIsNull() {
            addCriterion("store_type_sort is null");
            return (Criteria) this;
        }

        public Criteria andStoreTypeSortIsNotNull() {
            addCriterion("store_type_sort is not null");
            return (Criteria) this;
        }

        public Criteria andStoreTypeSortEqualTo(Byte value) {
            addCriterion("store_type_sort =", value, "storeTypeSort");
            return (Criteria) this;
        }

        public Criteria andStoreTypeSortNotEqualTo(Byte value) {
            addCriterion("store_type_sort <>", value, "storeTypeSort");
            return (Criteria) this;
        }

        public Criteria andStoreTypeSortGreaterThan(Byte value) {
            addCriterion("store_type_sort >", value, "storeTypeSort");
            return (Criteria) this;
        }

        public Criteria andStoreTypeSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("store_type_sort >=", value, "storeTypeSort");
            return (Criteria) this;
        }

        public Criteria andStoreTypeSortLessThan(Byte value) {
            addCriterion("store_type_sort <", value, "storeTypeSort");
            return (Criteria) this;
        }

        public Criteria andStoreTypeSortLessThanOrEqualTo(Byte value) {
            addCriterion("store_type_sort <=", value, "storeTypeSort");
            return (Criteria) this;
        }

        public Criteria andStoreTypeSortIn(List<Byte> values) {
            addCriterion("store_type_sort in", values, "storeTypeSort");
            return (Criteria) this;
        }

        public Criteria andStoreTypeSortNotIn(List<Byte> values) {
            addCriterion("store_type_sort not in", values, "storeTypeSort");
            return (Criteria) this;
        }

        public Criteria andStoreTypeSortBetween(Byte value1, Byte value2) {
            addCriterion("store_type_sort between", value1, value2, "storeTypeSort");
            return (Criteria) this;
        }

        public Criteria andStoreTypeSortNotBetween(Byte value1, Byte value2) {
            addCriterion("store_type_sort not between", value1, value2, "storeTypeSort");
            return (Criteria) this;
        }

        public Criteria andBadStoreIdIsNull() {
            addCriterion("bad_store_id is null");
            return (Criteria) this;
        }

        public Criteria andBadStoreIdIsNotNull() {
            addCriterion("bad_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andBadStoreIdEqualTo(Integer value) {
            addCriterion("bad_store_id =", value, "badStoreId");
            return (Criteria) this;
        }

        public Criteria andBadStoreIdNotEqualTo(Integer value) {
            addCriterion("bad_store_id <>", value, "badStoreId");
            return (Criteria) this;
        }

        public Criteria andBadStoreIdGreaterThan(Integer value) {
            addCriterion("bad_store_id >", value, "badStoreId");
            return (Criteria) this;
        }

        public Criteria andBadStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bad_store_id >=", value, "badStoreId");
            return (Criteria) this;
        }

        public Criteria andBadStoreIdLessThan(Integer value) {
            addCriterion("bad_store_id <", value, "badStoreId");
            return (Criteria) this;
        }

        public Criteria andBadStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("bad_store_id <=", value, "badStoreId");
            return (Criteria) this;
        }

        public Criteria andBadStoreIdIn(List<Integer> values) {
            addCriterion("bad_store_id in", values, "badStoreId");
            return (Criteria) this;
        }

        public Criteria andBadStoreIdNotIn(List<Integer> values) {
            addCriterion("bad_store_id not in", values, "badStoreId");
            return (Criteria) this;
        }

        public Criteria andBadStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("bad_store_id between", value1, value2, "badStoreId");
            return (Criteria) this;
        }

        public Criteria andBadStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bad_store_id not between", value1, value2, "badStoreId");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameIsNull() {
            addCriterion("bad_store_name is null");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameIsNotNull() {
            addCriterion("bad_store_name is not null");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameEqualTo(String value) {
            addCriterion("bad_store_name =", value, "badStoreName");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameNotEqualTo(String value) {
            addCriterion("bad_store_name <>", value, "badStoreName");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameGreaterThan(String value) {
            addCriterion("bad_store_name >", value, "badStoreName");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("bad_store_name >=", value, "badStoreName");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameLessThan(String value) {
            addCriterion("bad_store_name <", value, "badStoreName");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameLessThanOrEqualTo(String value) {
            addCriterion("bad_store_name <=", value, "badStoreName");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameLike(String value) {
            addCriterion("bad_store_name like", value, "badStoreName");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameNotLike(String value) {
            addCriterion("bad_store_name not like", value, "badStoreName");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameIn(List<String> values) {
            addCriterion("bad_store_name in", values, "badStoreName");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameNotIn(List<String> values) {
            addCriterion("bad_store_name not in", values, "badStoreName");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameBetween(String value1, String value2) {
            addCriterion("bad_store_name between", value1, value2, "badStoreName");
            return (Criteria) this;
        }

        public Criteria andBadStoreNameNotBetween(String value1, String value2) {
            addCriterion("bad_store_name not between", value1, value2, "badStoreName");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreIdIsNull() {
            addCriterion("logistic_store_id is null");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreIdIsNotNull() {
            addCriterion("logistic_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreIdEqualTo(Integer value) {
            addCriterion("logistic_store_id =", value, "logisticStoreId");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreIdNotEqualTo(Integer value) {
            addCriterion("logistic_store_id <>", value, "logisticStoreId");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreIdGreaterThan(Integer value) {
            addCriterion("logistic_store_id >", value, "logisticStoreId");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("logistic_store_id >=", value, "logisticStoreId");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreIdLessThan(Integer value) {
            addCriterion("logistic_store_id <", value, "logisticStoreId");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("logistic_store_id <=", value, "logisticStoreId");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreIdIn(List<Integer> values) {
            addCriterion("logistic_store_id in", values, "logisticStoreId");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreIdNotIn(List<Integer> values) {
            addCriterion("logistic_store_id not in", values, "logisticStoreId");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("logistic_store_id between", value1, value2, "logisticStoreId");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("logistic_store_id not between", value1, value2, "logisticStoreId");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameIsNull() {
            addCriterion("logistic_store_name is null");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameIsNotNull() {
            addCriterion("logistic_store_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameEqualTo(String value) {
            addCriterion("logistic_store_name =", value, "logisticStoreName");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameNotEqualTo(String value) {
            addCriterion("logistic_store_name <>", value, "logisticStoreName");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameGreaterThan(String value) {
            addCriterion("logistic_store_name >", value, "logisticStoreName");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("logistic_store_name >=", value, "logisticStoreName");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameLessThan(String value) {
            addCriterion("logistic_store_name <", value, "logisticStoreName");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameLessThanOrEqualTo(String value) {
            addCriterion("logistic_store_name <=", value, "logisticStoreName");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameLike(String value) {
            addCriterion("logistic_store_name like", value, "logisticStoreName");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameNotLike(String value) {
            addCriterion("logistic_store_name not like", value, "logisticStoreName");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameIn(List<String> values) {
            addCriterion("logistic_store_name in", values, "logisticStoreName");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameNotIn(List<String> values) {
            addCriterion("logistic_store_name not in", values, "logisticStoreName");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameBetween(String value1, String value2) {
            addCriterion("logistic_store_name between", value1, value2, "logisticStoreName");
            return (Criteria) this;
        }

        public Criteria andLogisticStoreNameNotBetween(String value1, String value2) {
            addCriterion("logistic_store_name not between", value1, value2, "logisticStoreName");
            return (Criteria) this;
        }

        public Criteria andParentStoreIdIsNull() {
            addCriterion("parent_store_id is null");
            return (Criteria) this;
        }

        public Criteria andParentStoreIdIsNotNull() {
            addCriterion("parent_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentStoreIdEqualTo(Integer value) {
            addCriterion("parent_store_id =", value, "parentStoreId");
            return (Criteria) this;
        }

        public Criteria andParentStoreIdNotEqualTo(Integer value) {
            addCriterion("parent_store_id <>", value, "parentStoreId");
            return (Criteria) this;
        }

        public Criteria andParentStoreIdGreaterThan(Integer value) {
            addCriterion("parent_store_id >", value, "parentStoreId");
            return (Criteria) this;
        }

        public Criteria andParentStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_store_id >=", value, "parentStoreId");
            return (Criteria) this;
        }

        public Criteria andParentStoreIdLessThan(Integer value) {
            addCriterion("parent_store_id <", value, "parentStoreId");
            return (Criteria) this;
        }

        public Criteria andParentStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_store_id <=", value, "parentStoreId");
            return (Criteria) this;
        }

        public Criteria andParentStoreIdIn(List<Integer> values) {
            addCriterion("parent_store_id in", values, "parentStoreId");
            return (Criteria) this;
        }

        public Criteria andParentStoreIdNotIn(List<Integer> values) {
            addCriterion("parent_store_id not in", values, "parentStoreId");
            return (Criteria) this;
        }

        public Criteria andParentStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_store_id between", value1, value2, "parentStoreId");
            return (Criteria) this;
        }

        public Criteria andParentStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_store_id not between", value1, value2, "parentStoreId");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameIsNull() {
            addCriterion("parent_store_name is null");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameIsNotNull() {
            addCriterion("parent_store_name is not null");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameEqualTo(String value) {
            addCriterion("parent_store_name =", value, "parentStoreName");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameNotEqualTo(String value) {
            addCriterion("parent_store_name <>", value, "parentStoreName");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameGreaterThan(String value) {
            addCriterion("parent_store_name >", value, "parentStoreName");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("parent_store_name >=", value, "parentStoreName");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameLessThan(String value) {
            addCriterion("parent_store_name <", value, "parentStoreName");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameLessThanOrEqualTo(String value) {
            addCriterion("parent_store_name <=", value, "parentStoreName");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameLike(String value) {
            addCriterion("parent_store_name like", value, "parentStoreName");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameNotLike(String value) {
            addCriterion("parent_store_name not like", value, "parentStoreName");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameIn(List<String> values) {
            addCriterion("parent_store_name in", values, "parentStoreName");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameNotIn(List<String> values) {
            addCriterion("parent_store_name not in", values, "parentStoreName");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameBetween(String value1, String value2) {
            addCriterion("parent_store_name between", value1, value2, "parentStoreName");
            return (Criteria) this;
        }

        public Criteria andParentStoreNameNotBetween(String value1, String value2) {
            addCriterion("parent_store_name not between", value1, value2, "parentStoreName");
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