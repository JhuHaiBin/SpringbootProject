package com.mssoft.smt.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerInfoExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMNumberIsNull() {
            addCriterion("m_number is null");
            return (Criteria) this;
        }

        public Criteria andMNumberIsNotNull() {
            addCriterion("m_number is not null");
            return (Criteria) this;
        }

        public Criteria andMNumberEqualTo(String value) {
            addCriterion("m_number =", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberNotEqualTo(String value) {
            addCriterion("m_number <>", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberGreaterThan(String value) {
            addCriterion("m_number >", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberGreaterThanOrEqualTo(String value) {
            addCriterion("m_number >=", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberLessThan(String value) {
            addCriterion("m_number <", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberLessThanOrEqualTo(String value) {
            addCriterion("m_number <=", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberLike(String value) {
            addCriterion("m_number like", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberNotLike(String value) {
            addCriterion("m_number not like", value, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberIn(List<String> values) {
            addCriterion("m_number in", values, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberNotIn(List<String> values) {
            addCriterion("m_number not in", values, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberBetween(String value1, String value2) {
            addCriterion("m_number between", value1, value2, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMNumberNotBetween(String value1, String value2) {
            addCriterion("m_number not between", value1, value2, "mNumber");
            return (Criteria) this;
        }

        public Criteria andMPasswordIsNull() {
            addCriterion("m_password is null");
            return (Criteria) this;
        }

        public Criteria andMPasswordIsNotNull() {
            addCriterion("m_password is not null");
            return (Criteria) this;
        }

        public Criteria andMPasswordEqualTo(String value) {
            addCriterion("m_password =", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordNotEqualTo(String value) {
            addCriterion("m_password <>", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordGreaterThan(String value) {
            addCriterion("m_password >", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("m_password >=", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordLessThan(String value) {
            addCriterion("m_password <", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordLessThanOrEqualTo(String value) {
            addCriterion("m_password <=", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordLike(String value) {
            addCriterion("m_password like", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordNotLike(String value) {
            addCriterion("m_password not like", value, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordIn(List<String> values) {
            addCriterion("m_password in", values, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordNotIn(List<String> values) {
            addCriterion("m_password not in", values, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordBetween(String value1, String value2) {
            addCriterion("m_password between", value1, value2, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMPasswordNotBetween(String value1, String value2) {
            addCriterion("m_password not between", value1, value2, "mPassword");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeIsNull() {
            addCriterion("m_invitation_code is null");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeIsNotNull() {
            addCriterion("m_invitation_code is not null");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeEqualTo(String value) {
            addCriterion("m_invitation_code =", value, "mInvitationCode");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeNotEqualTo(String value) {
            addCriterion("m_invitation_code <>", value, "mInvitationCode");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeGreaterThan(String value) {
            addCriterion("m_invitation_code >", value, "mInvitationCode");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("m_invitation_code >=", value, "mInvitationCode");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeLessThan(String value) {
            addCriterion("m_invitation_code <", value, "mInvitationCode");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeLessThanOrEqualTo(String value) {
            addCriterion("m_invitation_code <=", value, "mInvitationCode");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeLike(String value) {
            addCriterion("m_invitation_code like", value, "mInvitationCode");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeNotLike(String value) {
            addCriterion("m_invitation_code not like", value, "mInvitationCode");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeIn(List<String> values) {
            addCriterion("m_invitation_code in", values, "mInvitationCode");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeNotIn(List<String> values) {
            addCriterion("m_invitation_code not in", values, "mInvitationCode");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeBetween(String value1, String value2) {
            addCriterion("m_invitation_code between", value1, value2, "mInvitationCode");
            return (Criteria) this;
        }

        public Criteria andMInvitationCodeNotBetween(String value1, String value2) {
            addCriterion("m_invitation_code not between", value1, value2, "mInvitationCode");
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