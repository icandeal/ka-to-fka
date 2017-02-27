package com.etiantian.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RecommendResourceWeight {
    private BigDecimal ref;

    private BigDecimal resourceId;

    private Integer classId;

    private BigDecimal weight;

    private Date cTime;

    private Date mTime;

    private BigDecimal cUserId;

    private BigDecimal mUserId;

    public BigDecimal getRef() {
        return ref;
    }

    public void setRef(BigDecimal ref) {
        this.ref = ref;
    }

    public BigDecimal getResourceId() {
        return resourceId;
    }

    public void setResourceId(BigDecimal resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }

    public BigDecimal getcUserId() {
        return cUserId;
    }

    public void setcUserId(BigDecimal cUserId) {
        this.cUserId = cUserId;
    }

    public BigDecimal getmUserId() {
        return mUserId;
    }

    public void setmUserId(BigDecimal mUserId) {
        this.mUserId = mUserId;
    }
}