package cn.aptech.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TTestorRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TTestorRecordExample() {
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

        public Criteria andTrIdIsNull() {
            addCriterion("TR_ID is null");
            return (Criteria) this;
        }

        public Criteria andTrIdIsNotNull() {
            addCriterion("TR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTrIdEqualTo(Integer value) {
            addCriterion("TR_ID =", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdNotEqualTo(Integer value) {
            addCriterion("TR_ID <>", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdGreaterThan(Integer value) {
            addCriterion("TR_ID >", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TR_ID >=", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdLessThan(Integer value) {
            addCriterion("TR_ID <", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdLessThanOrEqualTo(Integer value) {
            addCriterion("TR_ID <=", value, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdIn(List<Integer> values) {
            addCriterion("TR_ID in", values, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdNotIn(List<Integer> values) {
            addCriterion("TR_ID not in", values, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdBetween(Integer value1, Integer value2) {
            addCriterion("TR_ID between", value1, value2, "trId");
            return (Criteria) this;
        }

        public Criteria andTrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TR_ID not between", value1, value2, "trId");
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

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Short value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Short value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Short value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Short value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Short value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Short value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Short> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Short> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Short value1, Short value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Short value1, Short value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
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