package cn.aptech.pojo;

import java.util.ArrayList;
import java.util.List;

public class TOptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOptionExample() {
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

        public Criteria andOptionIdIsNull() {
            addCriterion("OPTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOptionIdIsNotNull() {
            addCriterion("OPTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOptionIdEqualTo(Long value) {
            addCriterion("OPTION_ID =", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotEqualTo(Long value) {
            addCriterion("OPTION_ID <>", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdGreaterThan(Long value) {
            addCriterion("OPTION_ID >", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OPTION_ID >=", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdLessThan(Long value) {
            addCriterion("OPTION_ID <", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdLessThanOrEqualTo(Long value) {
            addCriterion("OPTION_ID <=", value, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdIn(List<Long> values) {
            addCriterion("OPTION_ID in", values, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotIn(List<Long> values) {
            addCriterion("OPTION_ID not in", values, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdBetween(Long value1, Long value2) {
            addCriterion("OPTION_ID between", value1, value2, "optionId");
            return (Criteria) this;
        }

        public Criteria andOptionIdNotBetween(Long value1, Long value2) {
            addCriterion("OPTION_ID not between", value1, value2, "optionId");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Long value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Long value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Long value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Long value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Long value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Long value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Long> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Long> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Long value1, Long value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Long value1, Long value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeIsNull() {
            addCriterion("NEXT_QUESTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeIsNotNull() {
            addCriterion("NEXT_QUESTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeEqualTo(String value) {
            addCriterion("NEXT_QUESTION_CODE =", value, "nextQuestionCode");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeNotEqualTo(String value) {
            addCriterion("NEXT_QUESTION_CODE <>", value, "nextQuestionCode");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeGreaterThan(String value) {
            addCriterion("NEXT_QUESTION_CODE >", value, "nextQuestionCode");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_QUESTION_CODE >=", value, "nextQuestionCode");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeLessThan(String value) {
            addCriterion("NEXT_QUESTION_CODE <", value, "nextQuestionCode");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeLessThanOrEqualTo(String value) {
            addCriterion("NEXT_QUESTION_CODE <=", value, "nextQuestionCode");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeLike(String value) {
            addCriterion("NEXT_QUESTION_CODE like", value, "nextQuestionCode");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeNotLike(String value) {
            addCriterion("NEXT_QUESTION_CODE not like", value, "nextQuestionCode");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeIn(List<String> values) {
            addCriterion("NEXT_QUESTION_CODE in", values, "nextQuestionCode");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeNotIn(List<String> values) {
            addCriterion("NEXT_QUESTION_CODE not in", values, "nextQuestionCode");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeBetween(String value1, String value2) {
            addCriterion("NEXT_QUESTION_CODE between", value1, value2, "nextQuestionCode");
            return (Criteria) this;
        }

        public Criteria andNextQuestionCodeNotBetween(String value1, String value2) {
            addCriterion("NEXT_QUESTION_CODE not between", value1, value2, "nextQuestionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeIsNull() {
            addCriterion("OPTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOptionCodeIsNotNull() {
            addCriterion("OPTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOptionCodeEqualTo(String value) {
            addCriterion("OPTION_CODE =", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeNotEqualTo(String value) {
            addCriterion("OPTION_CODE <>", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeGreaterThan(String value) {
            addCriterion("OPTION_CODE >", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPTION_CODE >=", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeLessThan(String value) {
            addCriterion("OPTION_CODE <", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeLessThanOrEqualTo(String value) {
            addCriterion("OPTION_CODE <=", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeLike(String value) {
            addCriterion("OPTION_CODE like", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeNotLike(String value) {
            addCriterion("OPTION_CODE not like", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeIn(List<String> values) {
            addCriterion("OPTION_CODE in", values, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeNotIn(List<String> values) {
            addCriterion("OPTION_CODE not in", values, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeBetween(String value1, String value2) {
            addCriterion("OPTION_CODE between", value1, value2, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeNotBetween(String value1, String value2) {
            addCriterion("OPTION_CODE not between", value1, value2, "optionCode");
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