package com.test.spring.boot.entity;

public class SerialConfig {
    private Integer serialId;

    private String typeCode;

    private String typeName;

    private Integer latestNo;

    private Integer codeLength;

    private String codePrefix;

    private String remark;

    public Integer getSerialId() {
        return serialId;
    }

    public void setSerialId(Integer serialId) {
        this.serialId = serialId;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getLatestNo() {
        return latestNo;
    }

    public void setLatestNo(Integer latestNo) {
        this.latestNo = latestNo;
    }

    public Integer getCodeLength() {
        return codeLength;
    }

    public void setCodeLength(Integer codeLength) {
        this.codeLength = codeLength;
    }

    public String getCodePrefix() {
        return codePrefix;
    }

    public void setCodePrefix(String codePrefix) {
        this.codePrefix = codePrefix == null ? null : codePrefix.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}