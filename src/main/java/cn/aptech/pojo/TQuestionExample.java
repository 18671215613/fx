package cn.aptech.pojo;

import java.util.ArrayList;
import java.util.List;

public class TQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TQuestionExample() {
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

        public Criteria andQuestionIdIsNull() {
            addCriterion("QUESTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("QUESTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Long value) {
            addCriterion("QUESTION_ID =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Long value) {
            addCriterion("QUESTION_ID <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Long value) {
            addCriterion("QUESTION_ID >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("QUESTION_ID >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Long value) {
            addCriterion("QUESTION_ID <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Long value) {
            addCriterion("QUESTION_ID <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Long> values) {
            addCriterion("QUESTION_ID in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Long> values) {
            addCriterion("QUESTION_ID not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Long value1, Long value2) {
            addCriterion("QUESTION_ID between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Long value1, Long value2) {
            addCriterion("QUESTION_ID not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Short value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Short value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Short value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Short value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Short> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Short> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Short value1, Short value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeIsNull() {
            addCriterion("SUITE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeIsNotNull() {
            addCriterion("SUITE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeEqualTo(String value) {
            addCriterion("SUITE_CODE =", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeNotEqualTo(String value) {
            addCriterion("SUITE_CODE <>", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeGreaterThan(String value) {
            addCriterion("SUITE_CODE >", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUITE_CODE >=", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeLessThan(String value) {
            addCriterion("SUITE_CODE <", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeLessThanOrEqualTo(String value) {
            addCriterion("SUITE_CODE <=", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeLike(String value) {
            addCriterion("SUITE_CODE like", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeNotLike(String value) {
            addCriterion("SUITE_CODE not like", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeIn(List<String> values) {
            addCriterion("SUITE_CODE in", values, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeNotIn(List<String> values) {
            addCriterion("SUITE_CODE not in", values, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeBetween(String value1, String value2) {
            addCriterion("SUITE_CODE between", value1, value2, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeNotBetween(String value1, String value2) {
            addCriterion("SUITE_CODE not between", value1, value2, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeIsNull() {
            addCriterion("QUESTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeIsNotNull() {
            addCriterion("QUESTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeEqualTo(String value) {
            addCriterion("QUESTION_CODE =", value, "questionCode");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeNotEqualTo(String value) {
            addCriterion("QUESTION_CODE <>", value, "questionCode");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeGreaterThan(String value) {
            addCriterion("QUESTION_CODE >", value, "questionCode");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("QUESTION_CODE >=", value, "questionCode");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeLessThan(String value) {
            addCriterion("QUESTION_CODE <", value, "questionCode");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeLessThanOrEqualTo(String value) {
            addCriterion("QUESTION_CODE <=", value, "questionCode");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeLike(String value) {
            addCriterion("QUESTION_CODE like", value, "questionCode");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeNotLike(String value) {
            addCriterion("QUESTION_CODE not like", value, "questionCode");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeIn(List<String> values) {
            addCriterion("QUESTION_CODE in", values, "questionCode");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeNotIn(List<String> values) {
            addCriterion("QUESTION_CODE not in", values, "questionCode");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeBetween(String value1, String value2) {
            addCriterion("QUESTION_CODE between", value1, value2, "questionCode");
            return (Criteria) this;
        }

        public Criteria andQuestionCodeNotBetween(String value1, String value2) {
            addCriterion("QUESTION_CODE not between", value1, value2, "questionCode");
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