package com.jiang.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class ReadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReadExample() {
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

        public Criteria andReadIdIsNull() {
            addCriterion("read_id is null");
            return (Criteria) this;
        }

        public Criteria andReadIdIsNotNull() {
            addCriterion("read_id is not null");
            return (Criteria) this;
        }

        public Criteria andReadIdEqualTo(Integer value) {
            addCriterion("read_id =", value, "readId");
            return (Criteria) this;
        }

        public Criteria andReadIdNotEqualTo(Integer value) {
            addCriterion("read_id <>", value, "readId");
            return (Criteria) this;
        }

        public Criteria andReadIdGreaterThan(Integer value) {
            addCriterion("read_id >", value, "readId");
            return (Criteria) this;
        }

        public Criteria andReadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("read_id >=", value, "readId");
            return (Criteria) this;
        }

        public Criteria andReadIdLessThan(Integer value) {
            addCriterion("read_id <", value, "readId");
            return (Criteria) this;
        }

        public Criteria andReadIdLessThanOrEqualTo(Integer value) {
            addCriterion("read_id <=", value, "readId");
            return (Criteria) this;
        }

        public Criteria andReadIdIn(List<Integer> values) {
            addCriterion("read_id in", values, "readId");
            return (Criteria) this;
        }

        public Criteria andReadIdNotIn(List<Integer> values) {
            addCriterion("read_id not in", values, "readId");
            return (Criteria) this;
        }

        public Criteria andReadIdBetween(Integer value1, Integer value2) {
            addCriterion("read_id between", value1, value2, "readId");
            return (Criteria) this;
        }

        public Criteria andReadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("read_id not between", value1, value2, "readId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNull() {
            addCriterion("answer_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIsNotNull() {
            addCriterion("answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerIdEqualTo(Integer value) {
            addCriterion("answer_id =", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotEqualTo(Integer value) {
            addCriterion("answer_id <>", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThan(Integer value) {
            addCriterion("answer_id >", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("answer_id >=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThan(Integer value) {
            addCriterion("answer_id <", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdLessThanOrEqualTo(Integer value) {
            addCriterion("answer_id <=", value, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdIn(List<Integer> values) {
            addCriterion("answer_id in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotIn(List<Integer> values) {
            addCriterion("answer_id not in", values, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdBetween(Integer value1, Integer value2) {
            addCriterion("answer_id between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andAnswerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("answer_id not between", value1, value2, "answerId");
            return (Criteria) this;
        }

        public Criteria andSubJsonIsNull() {
            addCriterion("sub_json is null");
            return (Criteria) this;
        }

        public Criteria andSubJsonIsNotNull() {
            addCriterion("sub_json is not null");
            return (Criteria) this;
        }

        public Criteria andSubJsonEqualTo(Integer value) {
            addCriterion("sub_json =", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonNotEqualTo(Integer value) {
            addCriterion("sub_json <>", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonGreaterThan(Integer value) {
            addCriterion("sub_json >", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_json >=", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonLessThan(Integer value) {
            addCriterion("sub_json <", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonLessThanOrEqualTo(Integer value) {
            addCriterion("sub_json <=", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonIn(List<Integer> values) {
            addCriterion("sub_json in", values, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonNotIn(List<Integer> values) {
            addCriterion("sub_json not in", values, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonBetween(Integer value1, Integer value2) {
            addCriterion("sub_json between", value1, value2, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_json not between", value1, value2, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubScoreIsNull() {
            addCriterion("sub_score is null");
            return (Criteria) this;
        }

        public Criteria andSubScoreIsNotNull() {
            addCriterion("sub_score is not null");
            return (Criteria) this;
        }

        public Criteria andSubScoreEqualTo(Integer value) {
            addCriterion("sub_score =", value, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreNotEqualTo(Integer value) {
            addCriterion("sub_score <>", value, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreGreaterThan(Integer value) {
            addCriterion("sub_score >", value, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_score >=", value, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreLessThan(Integer value) {
            addCriterion("sub_score <", value, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreLessThanOrEqualTo(Integer value) {
            addCriterion("sub_score <=", value, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreIn(List<Integer> values) {
            addCriterion("sub_score in", values, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreNotIn(List<Integer> values) {
            addCriterion("sub_score not in", values, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreBetween(Integer value1, Integer value2) {
            addCriterion("sub_score between", value1, value2, "subScore");
            return (Criteria) this;
        }

        public Criteria andSubScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_score not between", value1, value2, "subScore");
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