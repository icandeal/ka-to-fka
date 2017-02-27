package com.etiantian.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RecommendResourceWeightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecommendResourceWeightExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRefIsNull() {
            addCriterion("REF is null");
            return (Criteria) this;
        }

        public Criteria andRefIsNotNull() {
            addCriterion("REF is not null");
            return (Criteria) this;
        }

        public Criteria andRefEqualTo(BigDecimal value) {
            addCriterion("REF =", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefNotEqualTo(BigDecimal value) {
            addCriterion("REF <>", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefGreaterThan(BigDecimal value) {
            addCriterion("REF >", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REF >=", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefLessThan(BigDecimal value) {
            addCriterion("REF <", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REF <=", value, "ref");
            return (Criteria) this;
        }

        public Criteria andRefIn(List<BigDecimal> values) {
            addCriterion("REF in", values, "ref");
            return (Criteria) this;
        }

        public Criteria andRefNotIn(List<BigDecimal> values) {
            addCriterion("REF not in", values, "ref");
            return (Criteria) this;
        }

        public Criteria andRefBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REF between", value1, value2, "ref");
            return (Criteria) this;
        }

        public Criteria andRefNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REF not between", value1, value2, "ref");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("RESOURCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("RESOURCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(BigDecimal value) {
            addCriterion("RESOURCE_ID =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(BigDecimal value) {
            addCriterion("RESOURCE_ID <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(BigDecimal value) {
            addCriterion("RESOURCE_ID >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RESOURCE_ID >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(BigDecimal value) {
            addCriterion("RESOURCE_ID <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RESOURCE_ID <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<BigDecimal> values) {
            addCriterion("RESOURCE_ID in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<BigDecimal> values) {
            addCriterion("RESOURCE_ID not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESOURCE_ID between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RESOURCE_ID not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("CLASS_ID =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("CLASS_ID <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("CLASS_ID >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLASS_ID >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("CLASS_ID <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("CLASS_ID <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("CLASS_ID in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("CLASS_ID not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_ID between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_ID not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNull() {
            addCriterion("C_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNotNull() {
            addCriterion("C_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCTimeEqualTo(Date value) {
            addCriterionForJDBCDate("C_TIME =", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("C_TIME <>", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("C_TIME >", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_TIME >=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThan(Date value) {
            addCriterionForJDBCDate("C_TIME <", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("C_TIME <=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeIn(List<Date> values) {
            addCriterionForJDBCDate("C_TIME in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("C_TIME not in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_TIME between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("C_TIME not between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNull() {
            addCriterion("M_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNotNull() {
            addCriterion("M_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMTimeEqualTo(Date value) {
            addCriterionForJDBCDate("M_TIME =", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("M_TIME <>", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("M_TIME >", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("M_TIME >=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThan(Date value) {
            addCriterionForJDBCDate("M_TIME <", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("M_TIME <=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIn(List<Date> values) {
            addCriterionForJDBCDate("M_TIME in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("M_TIME not in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("M_TIME between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("M_TIME not between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNull() {
            addCriterion("C_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCUserIdIsNotNull() {
            addCriterion("C_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCUserIdEqualTo(BigDecimal value) {
            addCriterion("C_USER_ID =", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotEqualTo(BigDecimal value) {
            addCriterion("C_USER_ID <>", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThan(BigDecimal value) {
            addCriterion("C_USER_ID >", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("C_USER_ID >=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThan(BigDecimal value) {
            addCriterion("C_USER_ID <", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("C_USER_ID <=", value, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdIn(List<BigDecimal> values) {
            addCriterion("C_USER_ID in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotIn(List<BigDecimal> values) {
            addCriterion("C_USER_ID not in", values, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("C_USER_ID between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andCUserIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("C_USER_ID not between", value1, value2, "cUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdIsNull() {
            addCriterion("M_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMUserIdIsNotNull() {
            addCriterion("M_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMUserIdEqualTo(BigDecimal value) {
            addCriterion("M_USER_ID =", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdNotEqualTo(BigDecimal value) {
            addCriterion("M_USER_ID <>", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdGreaterThan(BigDecimal value) {
            addCriterion("M_USER_ID >", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("M_USER_ID >=", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdLessThan(BigDecimal value) {
            addCriterion("M_USER_ID <", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("M_USER_ID <=", value, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdIn(List<BigDecimal> values) {
            addCriterion("M_USER_ID in", values, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdNotIn(List<BigDecimal> values) {
            addCriterion("M_USER_ID not in", values, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("M_USER_ID between", value1, value2, "mUserId");
            return (Criteria) this;
        }

        public Criteria andMUserIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("M_USER_ID not between", value1, value2, "mUserId");
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