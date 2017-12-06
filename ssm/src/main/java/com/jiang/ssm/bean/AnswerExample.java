package com.jiang.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class AnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("stu_id is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("stu_id is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("stu_id =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("stu_id <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("stu_id >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stu_id >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("stu_id <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("stu_id <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("stu_id in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("stu_id not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("stu_id between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stu_id not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNull() {
            addCriterion("exam_id is null");
            return (Criteria) this;
        }

        public Criteria andExamIdIsNotNull() {
            addCriterion("exam_id is not null");
            return (Criteria) this;
        }

        public Criteria andExamIdEqualTo(Integer value) {
            addCriterion("exam_id =", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotEqualTo(Integer value) {
            addCriterion("exam_id <>", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThan(Integer value) {
            addCriterion("exam_id >", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_id >=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThan(Integer value) {
            addCriterion("exam_id <", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdLessThanOrEqualTo(Integer value) {
            addCriterion("exam_id <=", value, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdIn(List<Integer> values) {
            addCriterion("exam_id in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotIn(List<Integer> values) {
            addCriterion("exam_id not in", values, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdBetween(Integer value1, Integer value2) {
            addCriterion("exam_id between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andExamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_id not between", value1, value2, "examId");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonIsNull() {
            addCriterion("single_choice_json is null");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonIsNotNull() {
            addCriterion("single_choice_json is not null");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonEqualTo(String value) {
            addCriterion("single_choice_json =", value, "singleChoiceJson");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonNotEqualTo(String value) {
            addCriterion("single_choice_json <>", value, "singleChoiceJson");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonGreaterThan(String value) {
            addCriterion("single_choice_json >", value, "singleChoiceJson");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonGreaterThanOrEqualTo(String value) {
            addCriterion("single_choice_json >=", value, "singleChoiceJson");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonLessThan(String value) {
            addCriterion("single_choice_json <", value, "singleChoiceJson");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonLessThanOrEqualTo(String value) {
            addCriterion("single_choice_json <=", value, "singleChoiceJson");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonLike(String value) {
            addCriterion("single_choice_json like", value, "singleChoiceJson");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonNotLike(String value) {
            addCriterion("single_choice_json not like", value, "singleChoiceJson");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonIn(List<String> values) {
            addCriterion("single_choice_json in", values, "singleChoiceJson");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonNotIn(List<String> values) {
            addCriterion("single_choice_json not in", values, "singleChoiceJson");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonBetween(String value1, String value2) {
            addCriterion("single_choice_json between", value1, value2, "singleChoiceJson");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceJsonNotBetween(String value1, String value2) {
            addCriterion("single_choice_json not between", value1, value2, "singleChoiceJson");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonIsNull() {
            addCriterion("mul_choice_json is null");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonIsNotNull() {
            addCriterion("mul_choice_json is not null");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonEqualTo(String value) {
            addCriterion("mul_choice_json =", value, "mulChoiceJson");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonNotEqualTo(String value) {
            addCriterion("mul_choice_json <>", value, "mulChoiceJson");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonGreaterThan(String value) {
            addCriterion("mul_choice_json >", value, "mulChoiceJson");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonGreaterThanOrEqualTo(String value) {
            addCriterion("mul_choice_json >=", value, "mulChoiceJson");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonLessThan(String value) {
            addCriterion("mul_choice_json <", value, "mulChoiceJson");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonLessThanOrEqualTo(String value) {
            addCriterion("mul_choice_json <=", value, "mulChoiceJson");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonLike(String value) {
            addCriterion("mul_choice_json like", value, "mulChoiceJson");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonNotLike(String value) {
            addCriterion("mul_choice_json not like", value, "mulChoiceJson");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonIn(List<String> values) {
            addCriterion("mul_choice_json in", values, "mulChoiceJson");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonNotIn(List<String> values) {
            addCriterion("mul_choice_json not in", values, "mulChoiceJson");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonBetween(String value1, String value2) {
            addCriterion("mul_choice_json between", value1, value2, "mulChoiceJson");
            return (Criteria) this;
        }

        public Criteria andMulChoiceJsonNotBetween(String value1, String value2) {
            addCriterion("mul_choice_json not between", value1, value2, "mulChoiceJson");
            return (Criteria) this;
        }

        public Criteria andBlankJsonIsNull() {
            addCriterion("blank_json is null");
            return (Criteria) this;
        }

        public Criteria andBlankJsonIsNotNull() {
            addCriterion("blank_json is not null");
            return (Criteria) this;
        }

        public Criteria andBlankJsonEqualTo(String value) {
            addCriterion("blank_json =", value, "blankJson");
            return (Criteria) this;
        }

        public Criteria andBlankJsonNotEqualTo(String value) {
            addCriterion("blank_json <>", value, "blankJson");
            return (Criteria) this;
        }

        public Criteria andBlankJsonGreaterThan(String value) {
            addCriterion("blank_json >", value, "blankJson");
            return (Criteria) this;
        }

        public Criteria andBlankJsonGreaterThanOrEqualTo(String value) {
            addCriterion("blank_json >=", value, "blankJson");
            return (Criteria) this;
        }

        public Criteria andBlankJsonLessThan(String value) {
            addCriterion("blank_json <", value, "blankJson");
            return (Criteria) this;
        }

        public Criteria andBlankJsonLessThanOrEqualTo(String value) {
            addCriterion("blank_json <=", value, "blankJson");
            return (Criteria) this;
        }

        public Criteria andBlankJsonLike(String value) {
            addCriterion("blank_json like", value, "blankJson");
            return (Criteria) this;
        }

        public Criteria andBlankJsonNotLike(String value) {
            addCriterion("blank_json not like", value, "blankJson");
            return (Criteria) this;
        }

        public Criteria andBlankJsonIn(List<String> values) {
            addCriterion("blank_json in", values, "blankJson");
            return (Criteria) this;
        }

        public Criteria andBlankJsonNotIn(List<String> values) {
            addCriterion("blank_json not in", values, "blankJson");
            return (Criteria) this;
        }

        public Criteria andBlankJsonBetween(String value1, String value2) {
            addCriterion("blank_json between", value1, value2, "blankJson");
            return (Criteria) this;
        }

        public Criteria andBlankJsonNotBetween(String value1, String value2) {
            addCriterion("blank_json not between", value1, value2, "blankJson");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonIsNull() {
            addCriterion("judge_json is null");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonIsNotNull() {
            addCriterion("judge_json is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonEqualTo(String value) {
            addCriterion("judge_json =", value, "judgeJson");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonNotEqualTo(String value) {
            addCriterion("judge_json <>", value, "judgeJson");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonGreaterThan(String value) {
            addCriterion("judge_json >", value, "judgeJson");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonGreaterThanOrEqualTo(String value) {
            addCriterion("judge_json >=", value, "judgeJson");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonLessThan(String value) {
            addCriterion("judge_json <", value, "judgeJson");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonLessThanOrEqualTo(String value) {
            addCriterion("judge_json <=", value, "judgeJson");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonLike(String value) {
            addCriterion("judge_json like", value, "judgeJson");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonNotLike(String value) {
            addCriterion("judge_json not like", value, "judgeJson");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonIn(List<String> values) {
            addCriterion("judge_json in", values, "judgeJson");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonNotIn(List<String> values) {
            addCriterion("judge_json not in", values, "judgeJson");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonBetween(String value1, String value2) {
            addCriterion("judge_json between", value1, value2, "judgeJson");
            return (Criteria) this;
        }

        public Criteria andJudgeJsonNotBetween(String value1, String value2) {
            addCriterion("judge_json not between", value1, value2, "judgeJson");
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

        public Criteria andSubJsonEqualTo(String value) {
            addCriterion("sub_json =", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonNotEqualTo(String value) {
            addCriterion("sub_json <>", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonGreaterThan(String value) {
            addCriterion("sub_json >", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonGreaterThanOrEqualTo(String value) {
            addCriterion("sub_json >=", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonLessThan(String value) {
            addCriterion("sub_json <", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonLessThanOrEqualTo(String value) {
            addCriterion("sub_json <=", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonLike(String value) {
            addCriterion("sub_json like", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonNotLike(String value) {
            addCriterion("sub_json not like", value, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonIn(List<String> values) {
            addCriterion("sub_json in", values, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonNotIn(List<String> values) {
            addCriterion("sub_json not in", values, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonBetween(String value1, String value2) {
            addCriterion("sub_json between", value1, value2, "subJson");
            return (Criteria) this;
        }

        public Criteria andSubJsonNotBetween(String value1, String value2) {
            addCriterion("sub_json not between", value1, value2, "subJson");
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