package com.mssoft.smt.model;

import java.util.ArrayList;
import java.util.List;

public class StudentScoreInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentScoreInfoExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSNumberIsNull() {
            addCriterion("s_number is null");
            return (Criteria) this;
        }

        public Criteria andSNumberIsNotNull() {
            addCriterion("s_number is not null");
            return (Criteria) this;
        }

        public Criteria andSNumberEqualTo(Long value) {
            addCriterion("s_number =", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotEqualTo(Long value) {
            addCriterion("s_number <>", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberGreaterThan(Long value) {
            addCriterion("s_number >", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("s_number >=", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLessThan(Long value) {
            addCriterion("s_number <", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberLessThanOrEqualTo(Long value) {
            addCriterion("s_number <=", value, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberIn(List<Long> values) {
            addCriterion("s_number in", values, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotIn(List<Long> values) {
            addCriterion("s_number not in", values, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberBetween(Long value1, Long value2) {
            addCriterion("s_number between", value1, value2, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSNumberNotBetween(Long value1, Long value2) {
            addCriterion("s_number not between", value1, value2, "sNumber");
            return (Criteria) this;
        }

        public Criteria andSChineseScoreIsNull() {
            addCriterion("s_chinese_score is null");
            return (Criteria) this;
        }

        public Criteria andSChineseScoreIsNotNull() {
            addCriterion("s_chinese_score is not null");
            return (Criteria) this;
        }

        public Criteria andSChineseScoreEqualTo(Integer value) {
            addCriterion("s_chinese_score =", value, "sChineseScore");
            return (Criteria) this;
        }

        public Criteria andSChineseScoreNotEqualTo(Integer value) {
            addCriterion("s_chinese_score <>", value, "sChineseScore");
            return (Criteria) this;
        }

        public Criteria andSChineseScoreGreaterThan(Integer value) {
            addCriterion("s_chinese_score >", value, "sChineseScore");
            return (Criteria) this;
        }

        public Criteria andSChineseScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_chinese_score >=", value, "sChineseScore");
            return (Criteria) this;
        }

        public Criteria andSChineseScoreLessThan(Integer value) {
            addCriterion("s_chinese_score <", value, "sChineseScore");
            return (Criteria) this;
        }

        public Criteria andSChineseScoreLessThanOrEqualTo(Integer value) {
            addCriterion("s_chinese_score <=", value, "sChineseScore");
            return (Criteria) this;
        }

        public Criteria andSChineseScoreIn(List<Integer> values) {
            addCriterion("s_chinese_score in", values, "sChineseScore");
            return (Criteria) this;
        }

        public Criteria andSChineseScoreNotIn(List<Integer> values) {
            addCriterion("s_chinese_score not in", values, "sChineseScore");
            return (Criteria) this;
        }

        public Criteria andSChineseScoreBetween(Integer value1, Integer value2) {
            addCriterion("s_chinese_score between", value1, value2, "sChineseScore");
            return (Criteria) this;
        }

        public Criteria andSChineseScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("s_chinese_score not between", value1, value2, "sChineseScore");
            return (Criteria) this;
        }

        public Criteria andSMathScoreIsNull() {
            addCriterion("s_math_score is null");
            return (Criteria) this;
        }

        public Criteria andSMathScoreIsNotNull() {
            addCriterion("s_math_score is not null");
            return (Criteria) this;
        }

        public Criteria andSMathScoreEqualTo(Integer value) {
            addCriterion("s_math_score =", value, "sMathScore");
            return (Criteria) this;
        }

        public Criteria andSMathScoreNotEqualTo(Integer value) {
            addCriterion("s_math_score <>", value, "sMathScore");
            return (Criteria) this;
        }

        public Criteria andSMathScoreGreaterThan(Integer value) {
            addCriterion("s_math_score >", value, "sMathScore");
            return (Criteria) this;
        }

        public Criteria andSMathScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_math_score >=", value, "sMathScore");
            return (Criteria) this;
        }

        public Criteria andSMathScoreLessThan(Integer value) {
            addCriterion("s_math_score <", value, "sMathScore");
            return (Criteria) this;
        }

        public Criteria andSMathScoreLessThanOrEqualTo(Integer value) {
            addCriterion("s_math_score <=", value, "sMathScore");
            return (Criteria) this;
        }

        public Criteria andSMathScoreIn(List<Integer> values) {
            addCriterion("s_math_score in", values, "sMathScore");
            return (Criteria) this;
        }

        public Criteria andSMathScoreNotIn(List<Integer> values) {
            addCriterion("s_math_score not in", values, "sMathScore");
            return (Criteria) this;
        }

        public Criteria andSMathScoreBetween(Integer value1, Integer value2) {
            addCriterion("s_math_score between", value1, value2, "sMathScore");
            return (Criteria) this;
        }

        public Criteria andSMathScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("s_math_score not between", value1, value2, "sMathScore");
            return (Criteria) this;
        }

        public Criteria andSEnglishScoreIsNull() {
            addCriterion("s_english_score is null");
            return (Criteria) this;
        }

        public Criteria andSEnglishScoreIsNotNull() {
            addCriterion("s_english_score is not null");
            return (Criteria) this;
        }

        public Criteria andSEnglishScoreEqualTo(Integer value) {
            addCriterion("s_english_score =", value, "sEnglishScore");
            return (Criteria) this;
        }

        public Criteria andSEnglishScoreNotEqualTo(Integer value) {
            addCriterion("s_english_score <>", value, "sEnglishScore");
            return (Criteria) this;
        }

        public Criteria andSEnglishScoreGreaterThan(Integer value) {
            addCriterion("s_english_score >", value, "sEnglishScore");
            return (Criteria) this;
        }

        public Criteria andSEnglishScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_english_score >=", value, "sEnglishScore");
            return (Criteria) this;
        }

        public Criteria andSEnglishScoreLessThan(Integer value) {
            addCriterion("s_english_score <", value, "sEnglishScore");
            return (Criteria) this;
        }

        public Criteria andSEnglishScoreLessThanOrEqualTo(Integer value) {
            addCriterion("s_english_score <=", value, "sEnglishScore");
            return (Criteria) this;
        }

        public Criteria andSEnglishScoreIn(List<Integer> values) {
            addCriterion("s_english_score in", values, "sEnglishScore");
            return (Criteria) this;
        }

        public Criteria andSEnglishScoreNotIn(List<Integer> values) {
            addCriterion("s_english_score not in", values, "sEnglishScore");
            return (Criteria) this;
        }

        public Criteria andSEnglishScoreBetween(Integer value1, Integer value2) {
            addCriterion("s_english_score between", value1, value2, "sEnglishScore");
            return (Criteria) this;
        }

        public Criteria andSEnglishScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("s_english_score not between", value1, value2, "sEnglishScore");
            return (Criteria) this;
        }

        public Criteria andSClassIsNull() {
            addCriterion("s_class is null");
            return (Criteria) this;
        }

        public Criteria andSClassIsNotNull() {
            addCriterion("s_class is not null");
            return (Criteria) this;
        }

        public Criteria andSClassEqualTo(String value) {
            addCriterion("s_class =", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassNotEqualTo(String value) {
            addCriterion("s_class <>", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassGreaterThan(String value) {
            addCriterion("s_class >", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassGreaterThanOrEqualTo(String value) {
            addCriterion("s_class >=", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassLessThan(String value) {
            addCriterion("s_class <", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassLessThanOrEqualTo(String value) {
            addCriterion("s_class <=", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassLike(String value) {
            addCriterion("s_class like", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassNotLike(String value) {
            addCriterion("s_class not like", value, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassIn(List<String> values) {
            addCriterion("s_class in", values, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassNotIn(List<String> values) {
            addCriterion("s_class not in", values, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassBetween(String value1, String value2) {
            addCriterion("s_class between", value1, value2, "sClass");
            return (Criteria) this;
        }

        public Criteria andSClassNotBetween(String value1, String value2) {
            addCriterion("s_class not between", value1, value2, "sClass");
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