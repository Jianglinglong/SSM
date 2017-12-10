package com.jiang.ssm.bean;

import java.util.ArrayList;
import java.util.List;

public class PaperRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperRuleExample() {
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

        public Criteria andRuleIdIsNull() {
            addCriterion("rule_id is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(Integer value) {
            addCriterion("rule_id =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(Integer value) {
            addCriterion("rule_id <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(Integer value) {
            addCriterion("rule_id >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rule_id >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(Integer value) {
            addCriterion("rule_id <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("rule_id <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<Integer> values) {
            addCriterion("rule_id in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<Integer> values) {
            addCriterion("rule_id not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("rule_id between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rule_id not between", value1, value2, "ruleId");
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

        public Criteria andSingleChoiceCheckIsNull() {
            addCriterion("single_choice_check is null");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceCheckIsNotNull() {
            addCriterion("single_choice_check is not null");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceCheckEqualTo(String value) {
            addCriterion("single_choice_check =", value, "singleChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceCheckNotEqualTo(String value) {
            addCriterion("single_choice_check <>", value, "singleChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceCheckGreaterThan(String value) {
            addCriterion("single_choice_check >", value, "singleChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceCheckGreaterThanOrEqualTo(String value) {
            addCriterion("single_choice_check >=", value, "singleChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceCheckLessThan(String value) {
            addCriterion("single_choice_check <", value, "singleChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceCheckLessThanOrEqualTo(String value) {
            addCriterion("single_choice_check <=", value, "singleChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceCheckLike(String value) {
            addCriterion("single_choice_check like", value, "singleChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceCheckNotLike(String value) {
            addCriterion("single_choice_check not like", value, "singleChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceCheckIn(List<String> values) {
            addCriterion("single_choice_check in", values, "singleChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceCheckNotIn(List<String> values) {
            addCriterion("single_choice_check not in", values, "singleChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceCheckBetween(String value1, String value2) {
            addCriterion("single_choice_check between", value1, value2, "singleChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceCheckNotBetween(String value1, String value2) {
            addCriterion("single_choice_check not between", value1, value2, "singleChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceNumIsNull() {
            addCriterion("single_choice_num is null");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceNumIsNotNull() {
            addCriterion("single_choice_num is not null");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceNumEqualTo(Integer value) {
            addCriterion("single_choice_num =", value, "singleChoiceNum");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceNumNotEqualTo(Integer value) {
            addCriterion("single_choice_num <>", value, "singleChoiceNum");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceNumGreaterThan(Integer value) {
            addCriterion("single_choice_num >", value, "singleChoiceNum");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("single_choice_num >=", value, "singleChoiceNum");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceNumLessThan(Integer value) {
            addCriterion("single_choice_num <", value, "singleChoiceNum");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceNumLessThanOrEqualTo(Integer value) {
            addCriterion("single_choice_num <=", value, "singleChoiceNum");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceNumIn(List<Integer> values) {
            addCriterion("single_choice_num in", values, "singleChoiceNum");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceNumNotIn(List<Integer> values) {
            addCriterion("single_choice_num not in", values, "singleChoiceNum");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceNumBetween(Integer value1, Integer value2) {
            addCriterion("single_choice_num between", value1, value2, "singleChoiceNum");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("single_choice_num not between", value1, value2, "singleChoiceNum");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceScoreIsNull() {
            addCriterion("single_choice_score is null");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceScoreIsNotNull() {
            addCriterion("single_choice_score is not null");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceScoreEqualTo(Double value) {
            addCriterion("single_choice_score =", value, "singleChoiceScore");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceScoreNotEqualTo(Double value) {
            addCriterion("single_choice_score <>", value, "singleChoiceScore");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceScoreGreaterThan(Double value) {
            addCriterion("single_choice_score >", value, "singleChoiceScore");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("single_choice_score >=", value, "singleChoiceScore");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceScoreLessThan(Double value) {
            addCriterion("single_choice_score <", value, "singleChoiceScore");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceScoreLessThanOrEqualTo(Double value) {
            addCriterion("single_choice_score <=", value, "singleChoiceScore");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceScoreIn(List<Double> values) {
            addCriterion("single_choice_score in", values, "singleChoiceScore");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceScoreNotIn(List<Double> values) {
            addCriterion("single_choice_score not in", values, "singleChoiceScore");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceScoreBetween(Double value1, Double value2) {
            addCriterion("single_choice_score between", value1, value2, "singleChoiceScore");
            return (Criteria) this;
        }

        public Criteria andSingleChoiceScoreNotBetween(Double value1, Double value2) {
            addCriterion("single_choice_score not between", value1, value2, "singleChoiceScore");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckIsNull() {
            addCriterion("mul_choice_check is null");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckIsNotNull() {
            addCriterion("mul_choice_check is not null");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckEqualTo(String value) {
            addCriterion("mul_choice_check =", value, "mulChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckNotEqualTo(String value) {
            addCriterion("mul_choice_check <>", value, "mulChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckGreaterThan(String value) {
            addCriterion("mul_choice_check >", value, "mulChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckGreaterThanOrEqualTo(String value) {
            addCriterion("mul_choice_check >=", value, "mulChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckLessThan(String value) {
            addCriterion("mul_choice_check <", value, "mulChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckLessThanOrEqualTo(String value) {
            addCriterion("mul_choice_check <=", value, "mulChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckLike(String value) {
            addCriterion("mul_choice_check like", value, "mulChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckNotLike(String value) {
            addCriterion("mul_choice_check not like", value, "mulChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckIn(List<String> values) {
            addCriterion("mul_choice_check in", values, "mulChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckNotIn(List<String> values) {
            addCriterion("mul_choice_check not in", values, "mulChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckBetween(String value1, String value2) {
            addCriterion("mul_choice_check between", value1, value2, "mulChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andMulChoiceCheckNotBetween(String value1, String value2) {
            addCriterion("mul_choice_check not between", value1, value2, "mulChoiceCheck");
            return (Criteria) this;
        }

        public Criteria andMulChoiceNumIsNull() {
            addCriterion("mul_choice_num is null");
            return (Criteria) this;
        }

        public Criteria andMulChoiceNumIsNotNull() {
            addCriterion("mul_choice_num is not null");
            return (Criteria) this;
        }

        public Criteria andMulChoiceNumEqualTo(Integer value) {
            addCriterion("mul_choice_num =", value, "mulChoiceNum");
            return (Criteria) this;
        }

        public Criteria andMulChoiceNumNotEqualTo(Integer value) {
            addCriterion("mul_choice_num <>", value, "mulChoiceNum");
            return (Criteria) this;
        }

        public Criteria andMulChoiceNumGreaterThan(Integer value) {
            addCriterion("mul_choice_num >", value, "mulChoiceNum");
            return (Criteria) this;
        }

        public Criteria andMulChoiceNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mul_choice_num >=", value, "mulChoiceNum");
            return (Criteria) this;
        }

        public Criteria andMulChoiceNumLessThan(Integer value) {
            addCriterion("mul_choice_num <", value, "mulChoiceNum");
            return (Criteria) this;
        }

        public Criteria andMulChoiceNumLessThanOrEqualTo(Integer value) {
            addCriterion("mul_choice_num <=", value, "mulChoiceNum");
            return (Criteria) this;
        }

        public Criteria andMulChoiceNumIn(List<Integer> values) {
            addCriterion("mul_choice_num in", values, "mulChoiceNum");
            return (Criteria) this;
        }

        public Criteria andMulChoiceNumNotIn(List<Integer> values) {
            addCriterion("mul_choice_num not in", values, "mulChoiceNum");
            return (Criteria) this;
        }

        public Criteria andMulChoiceNumBetween(Integer value1, Integer value2) {
            addCriterion("mul_choice_num between", value1, value2, "mulChoiceNum");
            return (Criteria) this;
        }

        public Criteria andMulChoiceNumNotBetween(Integer value1, Integer value2) {
            addCriterion("mul_choice_num not between", value1, value2, "mulChoiceNum");
            return (Criteria) this;
        }

        public Criteria andMulChoiceScoreIsNull() {
            addCriterion("mul_choice_score is null");
            return (Criteria) this;
        }

        public Criteria andMulChoiceScoreIsNotNull() {
            addCriterion("mul_choice_score is not null");
            return (Criteria) this;
        }

        public Criteria andMulChoiceScoreEqualTo(Double value) {
            addCriterion("mul_choice_score =", value, "mulChoiceScore");
            return (Criteria) this;
        }

        public Criteria andMulChoiceScoreNotEqualTo(Double value) {
            addCriterion("mul_choice_score <>", value, "mulChoiceScore");
            return (Criteria) this;
        }

        public Criteria andMulChoiceScoreGreaterThan(Double value) {
            addCriterion("mul_choice_score >", value, "mulChoiceScore");
            return (Criteria) this;
        }

        public Criteria andMulChoiceScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("mul_choice_score >=", value, "mulChoiceScore");
            return (Criteria) this;
        }

        public Criteria andMulChoiceScoreLessThan(Double value) {
            addCriterion("mul_choice_score <", value, "mulChoiceScore");
            return (Criteria) this;
        }

        public Criteria andMulChoiceScoreLessThanOrEqualTo(Double value) {
            addCriterion("mul_choice_score <=", value, "mulChoiceScore");
            return (Criteria) this;
        }

        public Criteria andMulChoiceScoreIn(List<Double> values) {
            addCriterion("mul_choice_score in", values, "mulChoiceScore");
            return (Criteria) this;
        }

        public Criteria andMulChoiceScoreNotIn(List<Double> values) {
            addCriterion("mul_choice_score not in", values, "mulChoiceScore");
            return (Criteria) this;
        }

        public Criteria andMulChoiceScoreBetween(Double value1, Double value2) {
            addCriterion("mul_choice_score between", value1, value2, "mulChoiceScore");
            return (Criteria) this;
        }

        public Criteria andMulChoiceScoreNotBetween(Double value1, Double value2) {
            addCriterion("mul_choice_score not between", value1, value2, "mulChoiceScore");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckIsNull() {
            addCriterion("fill_blank_check is null");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckIsNotNull() {
            addCriterion("fill_blank_check is not null");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckEqualTo(String value) {
            addCriterion("fill_blank_check =", value, "fillBlankCheck");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckNotEqualTo(String value) {
            addCriterion("fill_blank_check <>", value, "fillBlankCheck");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckGreaterThan(String value) {
            addCriterion("fill_blank_check >", value, "fillBlankCheck");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckGreaterThanOrEqualTo(String value) {
            addCriterion("fill_blank_check >=", value, "fillBlankCheck");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckLessThan(String value) {
            addCriterion("fill_blank_check <", value, "fillBlankCheck");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckLessThanOrEqualTo(String value) {
            addCriterion("fill_blank_check <=", value, "fillBlankCheck");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckLike(String value) {
            addCriterion("fill_blank_check like", value, "fillBlankCheck");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckNotLike(String value) {
            addCriterion("fill_blank_check not like", value, "fillBlankCheck");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckIn(List<String> values) {
            addCriterion("fill_blank_check in", values, "fillBlankCheck");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckNotIn(List<String> values) {
            addCriterion("fill_blank_check not in", values, "fillBlankCheck");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckBetween(String value1, String value2) {
            addCriterion("fill_blank_check between", value1, value2, "fillBlankCheck");
            return (Criteria) this;
        }

        public Criteria andFillBlankCheckNotBetween(String value1, String value2) {
            addCriterion("fill_blank_check not between", value1, value2, "fillBlankCheck");
            return (Criteria) this;
        }

        public Criteria andFillBlankNumIsNull() {
            addCriterion("fill_blank_num is null");
            return (Criteria) this;
        }

        public Criteria andFillBlankNumIsNotNull() {
            addCriterion("fill_blank_num is not null");
            return (Criteria) this;
        }

        public Criteria andFillBlankNumEqualTo(Integer value) {
            addCriterion("fill_blank_num =", value, "fillBlankNum");
            return (Criteria) this;
        }

        public Criteria andFillBlankNumNotEqualTo(Integer value) {
            addCriterion("fill_blank_num <>", value, "fillBlankNum");
            return (Criteria) this;
        }

        public Criteria andFillBlankNumGreaterThan(Integer value) {
            addCriterion("fill_blank_num >", value, "fillBlankNum");
            return (Criteria) this;
        }

        public Criteria andFillBlankNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("fill_blank_num >=", value, "fillBlankNum");
            return (Criteria) this;
        }

        public Criteria andFillBlankNumLessThan(Integer value) {
            addCriterion("fill_blank_num <", value, "fillBlankNum");
            return (Criteria) this;
        }

        public Criteria andFillBlankNumLessThanOrEqualTo(Integer value) {
            addCriterion("fill_blank_num <=", value, "fillBlankNum");
            return (Criteria) this;
        }

        public Criteria andFillBlankNumIn(List<Integer> values) {
            addCriterion("fill_blank_num in", values, "fillBlankNum");
            return (Criteria) this;
        }

        public Criteria andFillBlankNumNotIn(List<Integer> values) {
            addCriterion("fill_blank_num not in", values, "fillBlankNum");
            return (Criteria) this;
        }

        public Criteria andFillBlankNumBetween(Integer value1, Integer value2) {
            addCriterion("fill_blank_num between", value1, value2, "fillBlankNum");
            return (Criteria) this;
        }

        public Criteria andFillBlankNumNotBetween(Integer value1, Integer value2) {
            addCriterion("fill_blank_num not between", value1, value2, "fillBlankNum");
            return (Criteria) this;
        }

        public Criteria andFillBlankScoreIsNull() {
            addCriterion("fill_blank_score is null");
            return (Criteria) this;
        }

        public Criteria andFillBlankScoreIsNotNull() {
            addCriterion("fill_blank_score is not null");
            return (Criteria) this;
        }

        public Criteria andFillBlankScoreEqualTo(Double value) {
            addCriterion("fill_blank_score =", value, "fillBlankScore");
            return (Criteria) this;
        }

        public Criteria andFillBlankScoreNotEqualTo(Double value) {
            addCriterion("fill_blank_score <>", value, "fillBlankScore");
            return (Criteria) this;
        }

        public Criteria andFillBlankScoreGreaterThan(Double value) {
            addCriterion("fill_blank_score >", value, "fillBlankScore");
            return (Criteria) this;
        }

        public Criteria andFillBlankScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("fill_blank_score >=", value, "fillBlankScore");
            return (Criteria) this;
        }

        public Criteria andFillBlankScoreLessThan(Double value) {
            addCriterion("fill_blank_score <", value, "fillBlankScore");
            return (Criteria) this;
        }

        public Criteria andFillBlankScoreLessThanOrEqualTo(Double value) {
            addCriterion("fill_blank_score <=", value, "fillBlankScore");
            return (Criteria) this;
        }

        public Criteria andFillBlankScoreIn(List<Double> values) {
            addCriterion("fill_blank_score in", values, "fillBlankScore");
            return (Criteria) this;
        }

        public Criteria andFillBlankScoreNotIn(List<Double> values) {
            addCriterion("fill_blank_score not in", values, "fillBlankScore");
            return (Criteria) this;
        }

        public Criteria andFillBlankScoreBetween(Double value1, Double value2) {
            addCriterion("fill_blank_score between", value1, value2, "fillBlankScore");
            return (Criteria) this;
        }

        public Criteria andFillBlankScoreNotBetween(Double value1, Double value2) {
            addCriterion("fill_blank_score not between", value1, value2, "fillBlankScore");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckIsNull() {
            addCriterion("judge_check is null");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckIsNotNull() {
            addCriterion("judge_check is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckEqualTo(String value) {
            addCriterion("judge_check =", value, "judgeCheck");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckNotEqualTo(String value) {
            addCriterion("judge_check <>", value, "judgeCheck");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckGreaterThan(String value) {
            addCriterion("judge_check >", value, "judgeCheck");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckGreaterThanOrEqualTo(String value) {
            addCriterion("judge_check >=", value, "judgeCheck");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckLessThan(String value) {
            addCriterion("judge_check <", value, "judgeCheck");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckLessThanOrEqualTo(String value) {
            addCriterion("judge_check <=", value, "judgeCheck");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckLike(String value) {
            addCriterion("judge_check like", value, "judgeCheck");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckNotLike(String value) {
            addCriterion("judge_check not like", value, "judgeCheck");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckIn(List<String> values) {
            addCriterion("judge_check in", values, "judgeCheck");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckNotIn(List<String> values) {
            addCriterion("judge_check not in", values, "judgeCheck");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckBetween(String value1, String value2) {
            addCriterion("judge_check between", value1, value2, "judgeCheck");
            return (Criteria) this;
        }

        public Criteria andJudgeCheckNotBetween(String value1, String value2) {
            addCriterion("judge_check not between", value1, value2, "judgeCheck");
            return (Criteria) this;
        }

        public Criteria andJudgeNumIsNull() {
            addCriterion("judge_num is null");
            return (Criteria) this;
        }

        public Criteria andJudgeNumIsNotNull() {
            addCriterion("judge_num is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeNumEqualTo(Integer value) {
            addCriterion("judge_num =", value, "judgeNum");
            return (Criteria) this;
        }

        public Criteria andJudgeNumNotEqualTo(Integer value) {
            addCriterion("judge_num <>", value, "judgeNum");
            return (Criteria) this;
        }

        public Criteria andJudgeNumGreaterThan(Integer value) {
            addCriterion("judge_num >", value, "judgeNum");
            return (Criteria) this;
        }

        public Criteria andJudgeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("judge_num >=", value, "judgeNum");
            return (Criteria) this;
        }

        public Criteria andJudgeNumLessThan(Integer value) {
            addCriterion("judge_num <", value, "judgeNum");
            return (Criteria) this;
        }

        public Criteria andJudgeNumLessThanOrEqualTo(Integer value) {
            addCriterion("judge_num <=", value, "judgeNum");
            return (Criteria) this;
        }

        public Criteria andJudgeNumIn(List<Integer> values) {
            addCriterion("judge_num in", values, "judgeNum");
            return (Criteria) this;
        }

        public Criteria andJudgeNumNotIn(List<Integer> values) {
            addCriterion("judge_num not in", values, "judgeNum");
            return (Criteria) this;
        }

        public Criteria andJudgeNumBetween(Integer value1, Integer value2) {
            addCriterion("judge_num between", value1, value2, "judgeNum");
            return (Criteria) this;
        }

        public Criteria andJudgeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("judge_num not between", value1, value2, "judgeNum");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreIsNull() {
            addCriterion("judge_score is null");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreIsNotNull() {
            addCriterion("judge_score is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreEqualTo(Double value) {
            addCriterion("judge_score =", value, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreNotEqualTo(Double value) {
            addCriterion("judge_score <>", value, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreGreaterThan(Double value) {
            addCriterion("judge_score >", value, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("judge_score >=", value, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreLessThan(Double value) {
            addCriterion("judge_score <", value, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreLessThanOrEqualTo(Double value) {
            addCriterion("judge_score <=", value, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreIn(List<Double> values) {
            addCriterion("judge_score in", values, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreNotIn(List<Double> values) {
            addCriterion("judge_score not in", values, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreBetween(Double value1, Double value2) {
            addCriterion("judge_score between", value1, value2, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andJudgeScoreNotBetween(Double value1, Double value2) {
            addCriterion("judge_score not between", value1, value2, "judgeScore");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckIsNull() {
            addCriterion("sub_question_check is null");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckIsNotNull() {
            addCriterion("sub_question_check is not null");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckEqualTo(String value) {
            addCriterion("sub_question_check =", value, "subQuestionCheck");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckNotEqualTo(String value) {
            addCriterion("sub_question_check <>", value, "subQuestionCheck");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckGreaterThan(String value) {
            addCriterion("sub_question_check >", value, "subQuestionCheck");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckGreaterThanOrEqualTo(String value) {
            addCriterion("sub_question_check >=", value, "subQuestionCheck");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckLessThan(String value) {
            addCriterion("sub_question_check <", value, "subQuestionCheck");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckLessThanOrEqualTo(String value) {
            addCriterion("sub_question_check <=", value, "subQuestionCheck");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckLike(String value) {
            addCriterion("sub_question_check like", value, "subQuestionCheck");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckNotLike(String value) {
            addCriterion("sub_question_check not like", value, "subQuestionCheck");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckIn(List<String> values) {
            addCriterion("sub_question_check in", values, "subQuestionCheck");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckNotIn(List<String> values) {
            addCriterion("sub_question_check not in", values, "subQuestionCheck");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckBetween(String value1, String value2) {
            addCriterion("sub_question_check between", value1, value2, "subQuestionCheck");
            return (Criteria) this;
        }

        public Criteria andSubQuestionCheckNotBetween(String value1, String value2) {
            addCriterion("sub_question_check not between", value1, value2, "subQuestionCheck");
            return (Criteria) this;
        }

        public Criteria andSubQuestionNumIsNull() {
            addCriterion("sub_question_num is null");
            return (Criteria) this;
        }

        public Criteria andSubQuestionNumIsNotNull() {
            addCriterion("sub_question_num is not null");
            return (Criteria) this;
        }

        public Criteria andSubQuestionNumEqualTo(Integer value) {
            addCriterion("sub_question_num =", value, "subQuestionNum");
            return (Criteria) this;
        }

        public Criteria andSubQuestionNumNotEqualTo(Integer value) {
            addCriterion("sub_question_num <>", value, "subQuestionNum");
            return (Criteria) this;
        }

        public Criteria andSubQuestionNumGreaterThan(Integer value) {
            addCriterion("sub_question_num >", value, "subQuestionNum");
            return (Criteria) this;
        }

        public Criteria andSubQuestionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_question_num >=", value, "subQuestionNum");
            return (Criteria) this;
        }

        public Criteria andSubQuestionNumLessThan(Integer value) {
            addCriterion("sub_question_num <", value, "subQuestionNum");
            return (Criteria) this;
        }

        public Criteria andSubQuestionNumLessThanOrEqualTo(Integer value) {
            addCriterion("sub_question_num <=", value, "subQuestionNum");
            return (Criteria) this;
        }

        public Criteria andSubQuestionNumIn(List<Integer> values) {
            addCriterion("sub_question_num in", values, "subQuestionNum");
            return (Criteria) this;
        }

        public Criteria andSubQuestionNumNotIn(List<Integer> values) {
            addCriterion("sub_question_num not in", values, "subQuestionNum");
            return (Criteria) this;
        }

        public Criteria andSubQuestionNumBetween(Integer value1, Integer value2) {
            addCriterion("sub_question_num between", value1, value2, "subQuestionNum");
            return (Criteria) this;
        }

        public Criteria andSubQuestionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_question_num not between", value1, value2, "subQuestionNum");
            return (Criteria) this;
        }

        public Criteria andSubQuestionScoreIsNull() {
            addCriterion("sub_question_score is null");
            return (Criteria) this;
        }

        public Criteria andSubQuestionScoreIsNotNull() {
            addCriterion("sub_question_score is not null");
            return (Criteria) this;
        }

        public Criteria andSubQuestionScoreEqualTo(Double value) {
            addCriterion("sub_question_score =", value, "subQuestionScore");
            return (Criteria) this;
        }

        public Criteria andSubQuestionScoreNotEqualTo(Double value) {
            addCriterion("sub_question_score <>", value, "subQuestionScore");
            return (Criteria) this;
        }

        public Criteria andSubQuestionScoreGreaterThan(Double value) {
            addCriterion("sub_question_score >", value, "subQuestionScore");
            return (Criteria) this;
        }

        public Criteria andSubQuestionScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("sub_question_score >=", value, "subQuestionScore");
            return (Criteria) this;
        }

        public Criteria andSubQuestionScoreLessThan(Double value) {
            addCriterion("sub_question_score <", value, "subQuestionScore");
            return (Criteria) this;
        }

        public Criteria andSubQuestionScoreLessThanOrEqualTo(Double value) {
            addCriterion("sub_question_score <=", value, "subQuestionScore");
            return (Criteria) this;
        }

        public Criteria andSubQuestionScoreIn(List<Double> values) {
            addCriterion("sub_question_score in", values, "subQuestionScore");
            return (Criteria) this;
        }

        public Criteria andSubQuestionScoreNotIn(List<Double> values) {
            addCriterion("sub_question_score not in", values, "subQuestionScore");
            return (Criteria) this;
        }

        public Criteria andSubQuestionScoreBetween(Double value1, Double value2) {
            addCriterion("sub_question_score between", value1, value2, "subQuestionScore");
            return (Criteria) this;
        }

        public Criteria andSubQuestionScoreNotBetween(Double value1, Double value2) {
            addCriterion("sub_question_score not between", value1, value2, "subQuestionScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreIsNull() {
            addCriterion("paper_score is null");
            return (Criteria) this;
        }

        public Criteria andPaperScoreIsNotNull() {
            addCriterion("paper_score is not null");
            return (Criteria) this;
        }

        public Criteria andPaperScoreEqualTo(Integer value) {
            addCriterion("paper_score =", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreNotEqualTo(Integer value) {
            addCriterion("paper_score <>", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreGreaterThan(Integer value) {
            addCriterion("paper_score >", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_score >=", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreLessThan(Integer value) {
            addCriterion("paper_score <", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreLessThanOrEqualTo(Integer value) {
            addCriterion("paper_score <=", value, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreIn(List<Integer> values) {
            addCriterion("paper_score in", values, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreNotIn(List<Integer> values) {
            addCriterion("paper_score not in", values, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreBetween(Integer value1, Integer value2) {
            addCriterion("paper_score between", value1, value2, "paperScore");
            return (Criteria) this;
        }

        public Criteria andPaperScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_score not between", value1, value2, "paperScore");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNull() {
            addCriterion("rule_type is null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNotNull() {
            addCriterion("rule_type is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeEqualTo(Long value) {
            addCriterion("rule_type =", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotEqualTo(Long value) {
            addCriterion("rule_type <>", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThan(Long value) {
            addCriterion("rule_type >", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("rule_type >=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThan(Long value) {
            addCriterion("rule_type <", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThanOrEqualTo(Long value) {
            addCriterion("rule_type <=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIn(List<Long> values) {
            addCriterion("rule_type in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotIn(List<Long> values) {
            addCriterion("rule_type not in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeBetween(Long value1, Long value2) {
            addCriterion("rule_type between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotBetween(Long value1, Long value2) {
            addCriterion("rule_type not between", value1, value2, "ruleType");
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