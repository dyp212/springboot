package com.pugutang.spring.boot.entity;

public class SzyStore {
    private Integer storeId;

    private String storeSn;

    private String storeName;

    private Integer storeTypeId;

    private String contact;

    private String tel;

    private String regionCode;

    private String address;

    private Boolean storeStatus;

    private Boolean isDeleted;

    private Integer adminId;

    private Byte storeTypeSort;

    private Integer badStoreId;

    private String badStoreName;

    private Integer logisticStoreId;

    private String logisticStoreName;

    private Integer parentStoreId;

    private String parentStoreName;

    private String storeRemark;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreSn() {
        return storeSn;
    }

    public void setStoreSn(String storeSn) {
        this.storeSn = storeSn == null ? null : storeSn.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getStoreTypeId() {
        return storeTypeId;
    }

    public void setStoreTypeId(Integer storeTypeId) {
        this.storeTypeId = storeTypeId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(Boolean storeStatus) {
        this.storeStatus = storeStatus;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Byte getStoreTypeSort() {
        return storeTypeSort;
    }

    public void setStoreTypeSort(Byte storeTypeSort) {
        this.storeTypeSort = storeTypeSort;
    }

    public Integer getBadStoreId() {
        return badStoreId;
    }

    public void setBadStoreId(Integer badStoreId) {
        this.badStoreId = badStoreId;
    }

    public String getBadStoreName() {
        return badStoreName;
    }

    public void setBadStoreName(String badStoreName) {
        this.badStoreName = badStoreName == null ? null : badStoreName.trim();
    }

    public Integer getLogisticStoreId() {
        return logisticStoreId;
    }

    public void setLogisticStoreId(Integer logisticStoreId) {
        this.logisticStoreId = logisticStoreId;
    }

    public String getLogisticStoreName() {
        return logisticStoreName;
    }

    public void setLogisticStoreName(String logisticStoreName) {
        this.logisticStoreName = logisticStoreName == null ? null : logisticStoreName.trim();
    }

    public Integer getParentStoreId() {
        return parentStoreId;
    }

    public void setParentStoreId(Integer parentStoreId) {
        this.parentStoreId = parentStoreId;
    }

    public String getParentStoreName() {
        return parentStoreName;
    }

    public void setParentStoreName(String parentStoreName) {
        this.parentStoreName = parentStoreName == null ? null : parentStoreName.trim();
    }

    public String getStoreRemark() {
        return storeRemark;
    }

    public void setStoreRemark(String storeRemark) {
        this.storeRemark = storeRemark == null ? null : storeRemark.trim();
    }
}