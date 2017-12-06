package com.jiang.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeaIdIsNull() {
            addCriterion("tea_id is null");
            return (Criteria) this;
        }

        public Criteria andTeaIdIsNotNull() {
            addCriterion("tea_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeaIdEqualTo(Integer value) {
            addCriterion("tea_id =", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotEqualTo(Integer value) {
            addCriterion("tea_id <>", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThan(Integer value) {
            addCriterion("tea_id >", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tea_id >=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThan(Integer value) {
            addCriterion("tea_id <", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdLessThanOrEqualTo(Integer value) {
            addCriterion("tea_id <=", value, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdIn(List<Integer> values) {
            addCriterion("tea_id in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotIn(List<Integer> values) {
            addCriterion("tea_id not in", values, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdBetween(Integer value1, Integer value2) {
            addCriterion("tea_id between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tea_id not between", value1, value2, "teaId");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNull() {
            addCriterion("tea_name is null");
            return (Criteria) this;
        }

        public Criteria andTeaNameIsNotNull() {
            addCriterion("tea_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeaNameEqualTo(String value) {
            addCriterion("tea_name =", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotEqualTo(String value) {
            addCriterion("tea_name <>", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThan(String value) {
            addCriterion("tea_name >", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameGreaterThanOrEqualTo(String value) {
            addCriterion("tea_name >=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThan(String value) {
            addCriterion("tea_name <", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLessThanOrEqualTo(String value) {
            addCriterion("tea_name <=", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameLike(String value) {
            addCriterion("tea_name like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotLike(String value) {
            addCriterion("tea_name not like", value, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameIn(List<String> values) {
            addCriterion("tea_name in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotIn(List<String> values) {
            addCriterion("tea_name not in", values, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameBetween(String value1, String value2) {
            addCriterion("tea_name between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaNameNotBetween(String value1, String value2) {
            addCriterion("tea_name not between", value1, value2, "teaName");
            return (Criteria) this;
        }

        public Criteria andTeaAccountIsNull() {
            addCriterion("tea_account is null");
            return (Criteria) this;
        }

        public Criteria andTeaAccountIsNotNull() {
            addCriterion("tea_account is not null");
            return (Criteria) this;
        }

        public Criteria andTeaAccountEqualTo(String value) {
            addCriterion("tea_account =", value, "teaAccount");
            return (Criteria) this;
        }

        public Criteria andTeaAccountNotEqualTo(String value) {
            addCriterion("tea_account <>", value, "teaAccount");
            return (Criteria) this;
        }

        public Criteria andTeaAccountGreaterThan(String value) {
            addCriterion("tea_account >", value, "teaAccount");
            return (Criteria) this;
        }

        public Criteria andTeaAccountGreaterThanOrEqualTo(String value) {
            addCriterion("tea_account >=", value, "teaAccount");
            return (Criteria) this;
        }

        public Criteria andTeaAccountLessThan(String value) {
            addCriterion("tea_account <", value, "teaAccount");
            return (Criteria) this;
        }

        public Criteria andTeaAccountLessThanOrEqualTo(String value) {
            addCriterion("tea_account <=", value, "teaAccount");
            return (Criteria) this;
        }

        public Criteria andTeaAccountLike(String value) {
            addCriterion("tea_account like", value, "teaAccount");
            return (Criteria) this;
        }

        public Criteria andTeaAccountNotLike(String value) {
            addCriterion("tea_account not like", value, "teaAccount");
            return (Criteria) this;
        }

        public Criteria andTeaAccountIn(List<String> values) {
            addCriterion("tea_account in", values, "teaAccount");
            return (Criteria) this;
        }

        public Criteria andTeaAccountNotIn(List<String> values) {
            addCriterion("tea_account not in", values, "teaAccount");
            return (Criteria) this;
        }

        public Criteria andTeaAccountBetween(String value1, String value2) {
            addCriterion("tea_account between", value1, value2, "teaAccount");
            return (Criteria) this;
        }

        public Criteria andTeaAccountNotBetween(String value1, String value2) {
            addCriterion("tea_account not between", value1, value2, "teaAccount");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordIsNull() {
            addCriterion("tea_password is null");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordIsNotNull() {
            addCriterion("tea_password is not null");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordEqualTo(String value) {
            addCriterion("tea_password =", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordNotEqualTo(String value) {
            addCriterion("tea_password <>", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordGreaterThan(String value) {
            addCriterion("tea_password >", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("tea_password >=", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordLessThan(String value) {
            addCriterion("tea_password <", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordLessThanOrEqualTo(String value) {
            addCriterion("tea_password <=", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordLike(String value) {
            addCriterion("tea_password like", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordNotLike(String value) {
            addCriterion("tea_password not like", value, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordIn(List<String> values) {
            addCriterion("tea_password in", values, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordNotIn(List<String> values) {
            addCriterion("tea_password not in", values, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordBetween(String value1, String value2) {
            addCriterion("tea_password between", value1, value2, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaPasswordNotBetween(String value1, String value2) {
            addCriterion("tea_password not between", value1, value2, "teaPassword");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkIsNull() {
            addCriterion("tea_remark is null");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkIsNotNull() {
            addCriterion("tea_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkEqualTo(String value) {
            addCriterion("tea_remark =", value, "teaRemark");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkNotEqualTo(String value) {
            addCriterion("tea_remark <>", value, "teaRemark");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkGreaterThan(String value) {
            addCriterion("tea_remark >", value, "teaRemark");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("tea_remark >=", value, "teaRemark");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkLessThan(String value) {
            addCriterion("tea_remark <", value, "teaRemark");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkLessThanOrEqualTo(String value) {
            addCriterion("tea_remark <=", value, "teaRemark");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkLike(String value) {
            addCriterion("tea_remark like", value, "teaRemark");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkNotLike(String value) {
            addCriterion("tea_remark not like", value, "teaRemark");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkIn(List<String> values) {
            addCriterion("tea_remark in", values, "teaRemark");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkNotIn(List<String> values) {
            addCriterion("tea_remark not in", values, "teaRemark");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkBetween(String value1, String value2) {
            addCriterion("tea_remark between", value1, value2, "teaRemark");
            return (Criteria) this;
        }

        public Criteria andTeaRemarkNotBetween(String value1, String value2) {
            addCriterion("tea_remark not between", value1, value2, "teaRemark");
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