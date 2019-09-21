package cn.aptech.pojo;

import java.util.ArrayList;
import java.util.List;

public class TResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TResultExample() {
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

        public Criteria andResultIdIsNull() {
            addCriterion("RESULT_ID is null");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNotNull() {
            addCriterion("RESULT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResultIdEqualTo(Integer value) {
            addCriterion("RESULT_ID =", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotEqualTo(Integer value) {
            addCriterion("RESULT_ID <>", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThan(Integer value) {
            addCriterion("RESULT_ID >", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESULT_ID >=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThan(Integer value) {
            addCriterion("RESULT_ID <", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThanOrEqualTo(Integer value) {
            addCriterion("RESULT_ID <=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdIn(List<Integer> values) {
            addCriterion("RESULT_ID in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotIn(List<Integer> values) {
            addCriterion("RESULT_ID not in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdBetween(Integer value1, Integer value2) {
            addCriterion("RESULT_ID between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RESULT_ID not between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andMinScoreIsNull() {
            addCriterion("MIN_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andMinScoreIsNotNull() {
            addCriterion("MIN_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andMinScoreEqualTo(Integer value) {
            addCriterion("MIN_SCORE =", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreNotEqualTo(Integer value) {
            addCriterion("MIN_SCORE <>", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreGreaterThan(Integer value) {
            addCriterion("MIN_SCORE >", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("MIN_SCORE >=", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreLessThan(Integer value) {
            addCriterion("MIN_SCORE <", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreLessThanOrEqualTo(Integer value) {
            addCriterion("MIN_SCORE <=", value, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreIn(List<Integer> values) {
            addCriterion("MIN_SCORE in", values, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreNotIn(List<Integer> values) {
            addCriterion("MIN_SCORE not in", values, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreBetween(Integer value1, Integer value2) {
            addCriterion("MIN_SCORE between", value1, value2, "minScore");
            return (Criteria) this;
        }

        public Criteria andMinScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("MIN_SCORE not between", value1, value2, "minScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreIsNull() {
            addCriterion("MAX_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andMaxScoreIsNotNull() {
            addCriterion("MAX_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxScoreEqualTo(Integer value) {
            addCriterion("MAX_SCORE =", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreNotEqualTo(Integer value) {
            addCriterion("MAX_SCORE <>", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreGreaterThan(Integer value) {
            addCriterion("MAX_SCORE >", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_SCORE >=", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreLessThan(Integer value) {
            addCriterion("MAX_SCORE <", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_SCORE <=", value, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreIn(List<Integer> values) {
            addCriterion("MAX_SCORE in", values, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreNotIn(List<Integer> values) {
            addCriterion("MAX_SCORE not in", values, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreBetween(Integer value1, Integer value2) {
            addCriterion("MAX_SCORE between", value1, value2, "maxScore");
            return (Criteria) this;
        }

        public Criteria andMaxScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_SCORE not between", value1, value2, "maxScore");
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

        public Criteria andResultCodeIsNull() {
            addCriterion("RESULT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andResultCodeIsNotNull() {
            addCriterion("RESULT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andResultCodeEqualTo(String value) {
            addCriterion("RESULT_CODE =", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotEqualTo(String value) {
            addCriterion("RESULT_CODE <>", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeGreaterThan(String value) {
            addCriterion("RESULT_CODE >", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_CODE >=", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLessThan(String value) {
            addCriterion("RESULT_CODE <", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLessThanOrEqualTo(String value) {
            addCriterion("RESULT_CODE <=", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeLike(String value) {
            addCriterion("RESULT_CODE like", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotLike(String value) {
            addCriterion("RESULT_CODE not like", value, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeIn(List<String> values) {
            addCriterion("RESULT_CODE in", values, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotIn(List<String> values) {
            addCriterion("RESULT_CODE not in", values, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeBetween(String value1, String value2) {
            addCriterion("RESULT_CODE between", value1, value2, "resultCode");
            return (Criteria) this;
        }

        public Criteria andResultCodeNotBetween(String value1, String value2) {
            addCriterion("RESULT_CODE not between", value1, value2, "resultCode");
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