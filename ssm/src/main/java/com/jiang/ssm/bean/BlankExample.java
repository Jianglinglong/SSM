package com.jiang.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class BlankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlankExample() {
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

        public Criteria andBlankIdIsNull() {
            addCriterion("blank_id is null");
            return (Criteria) this;
        }

        public Criteria andBlankIdIsNotNull() {
            addCriterion("blank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlankIdEqualTo(Integer value) {
            addCriterion("blank_id =", value, "blankId");
            return (Criteria) this;
        }

        public Criteria andBlankIdNotEqualTo(Integer value) {
            addCriterion("blank_id <>", value, "blankId");
            return (Criteria) this;
        }

        public Criteria andBlankIdGreaterThan(Integer value) {
            addCriterion("blank_id >", value, "blankId");
            return (Criteria) this;
        }

        public Criteria andBlankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blank_id >=", value, "blankId");
            return (Criteria) this;
        }

        public Criteria andBlankIdLessThan(Integer value) {
            addCriterion("blank_id <", value, "blankId");
            return (Criteria) this;
        }

        public Criteria andBlankIdLessThanOrEqualTo(Integer value) {
            addCriterion("blank_id <=", value, "blankId");
            return (Criteria) this;
        }

        public Criteria andBlankIdIn(List<Integer> values) {
            addCriterion("blank_id in", values, "blankId");
            return (Criteria) this;
        }

        public Criteria andBlankIdNotIn(List<Integer> values) {
            addCriterion("blank_id not in", values, "blankId");
            return (Criteria) this;
        }

        public Criteria andBlankIdBetween(Integer value1, Integer value2) {
            addCriterion("blank_id between", value1, value2, "blankId");
            return (Criteria) this;
        }

        public Criteria andBlankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blank_id not between", value1, value2, "blankId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andBlankTitleIsNull() {
            addCriterion("blank_title is null");
            return (Criteria) this;
        }

        public Criteria andBlankTitleIsNotNull() {
            addCriterion("blank_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlankTitleEqualTo(String value) {
            addCriterion("blank_title =", value, "blankTitle");
            return (Criteria) this;
        }

        public Criteria andBlankTitleNotEqualTo(String value) {
            addCriterion("blank_title <>", value, "blankTitle");
            return (Criteria) this;
        }

        public Criteria andBlankTitleGreaterThan(String value) {
            addCriterion("blank_title >", value, "blankTitle");
            return (Criteria) this;
        }

        public Criteria andBlankTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blank_title >=", value, "blankTitle");
            return (Criteria) this;
        }

        public Criteria andBlankTitleLessThan(String value) {
            addCriterion("blank_title <", value, "blankTitle");
            return (Criteria) this;
        }

        public Criteria andBlankTitleLessThanOrEqualTo(String value) {
            addCriterion("blank_title <=", value, "blankTitle");
            return (Criteria) this;
        }

        public Criteria andBlankTitleLike(String value) {
            addCriterion("blank_title like", value, "blankTitle");
            return (Criteria) this;
        }

        public Criteria andBlankTitleNotLike(String value) {
            addCriterion("blank_title not like", value, "blankTitle");
            return (Criteria) this;
        }

        public Criteria andBlankTitleIn(List<String> values) {
            addCriterion("blank_title in", values, "blankTitle");
            return (Criteria) this;
        }

        public Criteria andBlankTitleNotIn(List<String> values) {
            addCriterion("blank_title not in", values, "blankTitle");
            return (Criteria) this;
        }

        public Criteria andBlankTitleBetween(String value1, String value2) {
            addCriterion("blank_title between", value1, value2, "blankTitle");
            return (Criteria) this;
        }

        public Criteria andBlankTitleNotBetween(String value1, String value2) {
            addCriterion("blank_title not between", value1, value2, "blankTitle");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerIsNull() {
            addCriterion("blank_answer is null");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerIsNotNull() {
            addCriterion("blank_answer is not null");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerEqualTo(String value) {
            addCriterion("blank_answer =", value, "blankAnswer");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerNotEqualTo(String value) {
            addCriterion("blank_answer <>", value, "blankAnswer");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerGreaterThan(String value) {
            addCriterion("blank_answer >", value, "blankAnswer");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("blank_answer >=", value, "blankAnswer");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerLessThan(String value) {
            addCriterion("blank_answer <", value, "blankAnswer");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerLessThanOrEqualTo(String value) {
            addCriterion("blank_answer <=", value, "blankAnswer");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerLike(String value) {
            addCriterion("blank_answer like", value, "blankAnswer");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerNotLike(String value) {
            addCriterion("blank_answer not like", value, "blankAnswer");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerIn(List<String> values) {
            addCriterion("blank_answer in", values, "blankAnswer");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerNotIn(List<String> values) {
            addCriterion("blank_answer not in", values, "blankAnswer");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerBetween(String value1, String value2) {
            addCriterion("blank_answer between", value1, value2, "blankAnswer");
            return (Criteria) this;
        }

        public Criteria andBlankAnswerNotBetween(String value1, String value2) {
            addCriterion("blank_answer not between", value1, value2, "blankAnswer");
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