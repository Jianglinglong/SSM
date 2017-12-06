package com.jiang.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class JudgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JudgeExample() {
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

        public Criteria andJudgeIdIsNull() {
            addCriterion("judge_id is null");
            return (Criteria) this;
        }

        public Criteria andJudgeIdIsNotNull() {
            addCriterion("judge_id is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeIdEqualTo(Integer value) {
            addCriterion("judge_id =", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdNotEqualTo(Integer value) {
            addCriterion("judge_id <>", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdGreaterThan(Integer value) {
            addCriterion("judge_id >", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("judge_id >=", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdLessThan(Integer value) {
            addCriterion("judge_id <", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdLessThanOrEqualTo(Integer value) {
            addCriterion("judge_id <=", value, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdIn(List<Integer> values) {
            addCriterion("judge_id in", values, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdNotIn(List<Integer> values) {
            addCriterion("judge_id not in", values, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdBetween(Integer value1, Integer value2) {
            addCriterion("judge_id between", value1, value2, "judgeId");
            return (Criteria) this;
        }

        public Criteria andJudgeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("judge_id not between", value1, value2, "judgeId");
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

        public Criteria andJudgeTitleIsNull() {
            addCriterion("judge_title is null");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleIsNotNull() {
            addCriterion("judge_title is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleEqualTo(String value) {
            addCriterion("judge_title =", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleNotEqualTo(String value) {
            addCriterion("judge_title <>", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleGreaterThan(String value) {
            addCriterion("judge_title >", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("judge_title >=", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleLessThan(String value) {
            addCriterion("judge_title <", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleLessThanOrEqualTo(String value) {
            addCriterion("judge_title <=", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleLike(String value) {
            addCriterion("judge_title like", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleNotLike(String value) {
            addCriterion("judge_title not like", value, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleIn(List<String> values) {
            addCriterion("judge_title in", values, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleNotIn(List<String> values) {
            addCriterion("judge_title not in", values, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleBetween(String value1, String value2) {
            addCriterion("judge_title between", value1, value2, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeTitleNotBetween(String value1, String value2) {
            addCriterion("judge_title not between", value1, value2, "judgeTitle");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerIsNull() {
            addCriterion("judge_answer is null");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerIsNotNull() {
            addCriterion("judge_answer is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerEqualTo(String value) {
            addCriterion("judge_answer =", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerNotEqualTo(String value) {
            addCriterion("judge_answer <>", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerGreaterThan(String value) {
            addCriterion("judge_answer >", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("judge_answer >=", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerLessThan(String value) {
            addCriterion("judge_answer <", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerLessThanOrEqualTo(String value) {
            addCriterion("judge_answer <=", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerLike(String value) {
            addCriterion("judge_answer like", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerNotLike(String value) {
            addCriterion("judge_answer not like", value, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerIn(List<String> values) {
            addCriterion("judge_answer in", values, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerNotIn(List<String> values) {
            addCriterion("judge_answer not in", values, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerBetween(String value1, String value2) {
            addCriterion("judge_answer between", value1, value2, "judgeAnswer");
            return (Criteria) this;
        }

        public Criteria andJudgeAnswerNotBetween(String value1, String value2) {
            addCriterion("judge_answer not between", value1, value2, "judgeAnswer");
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