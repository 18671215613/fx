package cn.aptech.pojo;

import java.util.ArrayList;
import java.util.List;

public class TSuiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSuiteExample() {
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

        public Criteria andSuiteIdIsNull() {
            addCriterion("suite_id is null");
            return (Criteria) this;
        }

        public Criteria andSuiteIdIsNotNull() {
            addCriterion("suite_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuiteIdEqualTo(Integer value) {
            addCriterion("suite_id =", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdNotEqualTo(Integer value) {
            addCriterion("suite_id <>", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdGreaterThan(Integer value) {
            addCriterion("suite_id >", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("suite_id >=", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdLessThan(Integer value) {
            addCriterion("suite_id <", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("suite_id <=", value, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdIn(List<Integer> values) {
            addCriterion("suite_id in", values, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdNotIn(List<Integer> values) {
            addCriterion("suite_id not in", values, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdBetween(Integer value1, Integer value2) {
            addCriterion("suite_id between", value1, value2, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("suite_id not between", value1, value2, "suiteId");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeIsNull() {
            addCriterion("suite_code is null");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeIsNotNull() {
            addCriterion("suite_code is not null");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeEqualTo(String value) {
            addCriterion("suite_code =", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeNotEqualTo(String value) {
            addCriterion("suite_code <>", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeGreaterThan(String value) {
            addCriterion("suite_code >", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("suite_code >=", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeLessThan(String value) {
            addCriterion("suite_code <", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeLessThanOrEqualTo(String value) {
            addCriterion("suite_code <=", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeLike(String value) {
            addCriterion("suite_code like", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeNotLike(String value) {
            addCriterion("suite_code not like", value, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeIn(List<String> values) {
            addCriterion("suite_code in", values, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeNotIn(List<String> values) {
            addCriterion("suite_code not in", values, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeBetween(String value1, String value2) {
            addCriterion("suite_code between", value1, value2, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andSuiteCodeNotBetween(String value1, String value2) {
            addCriterion("suite_code not between", value1, value2, "suiteCode");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTestnumIsNull() {
            addCriterion("testnum is null");
            return (Criteria) this;
        }

        public Criteria andTestnumIsNotNull() {
            addCriterion("testnum is not null");
            return (Criteria) this;
        }

        public Criteria andTestnumEqualTo(Integer value) {
            addCriterion("testnum =", value, "testnum");
            return (Criteria) this;
        }

        public Criteria andTestnumNotEqualTo(Integer value) {
            addCriterion("testnum <>", value, "testnum");
            return (Criteria) this;
        }

        public Criteria andTestnumGreaterThan(Integer value) {
            addCriterion("testnum >", value, "testnum");
            return (Criteria) this;
        }

        public Criteria andTestnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("testnum >=", value, "testnum");
            return (Criteria) this;
        }

        public Criteria andTestnumLessThan(Integer value) {
            addCriterion("testnum <", value, "testnum");
            return (Criteria) this;
        }

        public Criteria andTestnumLessThanOrEqualTo(Integer value) {
            addCriterion("testnum <=", value, "testnum");
            return (Criteria) this;
        }

        public Criteria andTestnumIn(List<Integer> values) {
            addCriterion("testnum in", values, "testnum");
            return (Criteria) this;
        }

        public Criteria andTestnumNotIn(List<Integer> values) {
            addCriterion("testnum not in", values, "testnum");
            return (Criteria) this;
        }

        public Criteria andTestnumBetween(Integer value1, Integer value2) {
            addCriterion("testnum between", value1, value2, "testnum");
            return (Criteria) this;
        }

        public Criteria andTestnumNotBetween(Integer value1, Integer value2) {
            addCriterion("testnum not between", value1, value2, "testnum");
            return (Criteria) this;
        }

        public Criteria andFavnumIsNull() {
            addCriterion("favnum is null");
            return (Criteria) this;
        }

        public Criteria andFavnumIsNotNull() {
            addCriterion("favnum is not null");
            return (Criteria) this;
        }

        public Criteria andFavnumEqualTo(Integer value) {
            addCriterion("favnum =", value, "favnum");
            return (Criteria) this;
        }

        public Criteria andFavnumNotEqualTo(Integer value) {
            addCriterion("favnum <>", value, "favnum");
            return (Criteria) this;
        }

        public Criteria andFavnumGreaterThan(Integer value) {
            addCriterion("favnum >", value, "favnum");
            return (Criteria) this;
        }

        public Criteria andFavnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("favnum >=", value, "favnum");
            return (Criteria) this;
        }

        public Criteria andFavnumLessThan(Integer value) {
            addCriterion("favnum <", value, "favnum");
            return (Criteria) this;
        }

        public Criteria andFavnumLessThanOrEqualTo(Integer value) {
            addCriterion("favnum <=", value, "favnum");
            return (Criteria) this;
        }

        public Criteria andFavnumIn(List<Integer> values) {
            addCriterion("favnum in", values, "favnum");
            return (Criteria) this;
        }

        public Criteria andFavnumNotIn(List<Integer> values) {
            addCriterion("favnum not in", values, "favnum");
            return (Criteria) this;
        }

        public Criteria andFavnumBetween(Integer value1, Integer value2) {
            addCriterion("favnum between", value1, value2, "favnum");
            return (Criteria) this;
        }

        public Criteria andFavnumNotBetween(Integer value1, Integer value2) {
            addCriterion("favnum not between", value1, value2, "favnum");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andReplyNumIsNull() {
            addCriterion("reply_num is null");
            return (Criteria) this;
        }

        public Criteria andReplyNumIsNotNull() {
            addCriterion("reply_num is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNumEqualTo(Integer value) {
            addCriterion("reply_num =", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotEqualTo(Integer value) {
            addCriterion("reply_num <>", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThan(Integer value) {
            addCriterion("reply_num >", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_num >=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThan(Integer value) {
            addCriterion("reply_num <", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThanOrEqualTo(Integer value) {
            addCriterion("reply_num <=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumIn(List<Integer> values) {
            addCriterion("reply_num in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotIn(List<Integer> values) {
            addCriterion("reply_num not in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumBetween(Integer value1, Integer value2) {
            addCriterion("reply_num between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_num not between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumIsNull() {
            addCriterion("question_num is null");
            return (Criteria) this;
        }

        public Criteria andQuestionNumIsNotNull() {
            addCriterion("question_num is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionNumEqualTo(Integer value) {
            addCriterion("question_num =", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumNotEqualTo(Integer value) {
            addCriterion("question_num <>", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumGreaterThan(Integer value) {
            addCriterion("question_num >", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_num >=", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumLessThan(Integer value) {
            addCriterion("question_num <", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumLessThanOrEqualTo(Integer value) {
            addCriterion("question_num <=", value, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumIn(List<Integer> values) {
            addCriterion("question_num in", values, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumNotIn(List<Integer> values) {
            addCriterion("question_num not in", values, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumBetween(Integer value1, Integer value2) {
            addCriterion("question_num between", value1, value2, "questionNum");
            return (Criteria) this;
        }

        public Criteria andQuestionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("question_num not between", value1, value2, "questionNum");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andIssuggestIsNull() {
            addCriterion("issuggest is null");
            return (Criteria) this;
        }

        public Criteria andIssuggestIsNotNull() {
            addCriterion("issuggest is not null");
            return (Criteria) this;
        }

        public Criteria andIssuggestEqualTo(Integer value) {
            addCriterion("issuggest =", value, "issuggest");
            return (Criteria) this;
        }

        public Criteria andIssuggestNotEqualTo(Integer value) {
            addCriterion("issuggest <>", value, "issuggest");
            return (Criteria) this;
        }

        public Criteria andIssuggestGreaterThan(Integer value) {
            addCriterion("issuggest >", value, "issuggest");
            return (Criteria) this;
        }

        public Criteria andIssuggestGreaterThanOrEqualTo(Integer value) {
            addCriterion("issuggest >=", value, "issuggest");
            return (Criteria) this;
        }

        public Criteria andIssuggestLessThan(Integer value) {
            addCriterion("issuggest <", value, "issuggest");
            return (Criteria) this;
        }

        public Criteria andIssuggestLessThanOrEqualTo(Integer value) {
            addCriterion("issuggest <=", value, "issuggest");
            return (Criteria) this;
        }

        public Criteria andIssuggestIn(List<Integer> values) {
            addCriterion("issuggest in", values, "issuggest");
            return (Criteria) this;
        }

        public Criteria andIssuggestNotIn(List<Integer> values) {
            addCriterion("issuggest not in", values, "issuggest");
            return (Criteria) this;
        }

        public Criteria andIssuggestBetween(Integer value1, Integer value2) {
            addCriterion("issuggest between", value1, value2, "issuggest");
            return (Criteria) this;
        }

        public Criteria andIssuggestNotBetween(Integer value1, Integer value2) {
            addCriterion("issuggest not between", value1, value2, "issuggest");
            return (Criteria) this;
        }

        public Criteria andModuleCodeIsNull() {
            addCriterion("module_code is null");
            return (Criteria) this;
        }

        public Criteria andModuleCodeIsNotNull() {
            addCriterion("module_code is not null");
            return (Criteria) this;
        }

        public Criteria andModuleCodeEqualTo(String value) {
            addCriterion("module_code =", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotEqualTo(String value) {
            addCriterion("module_code <>", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeGreaterThan(String value) {
            addCriterion("module_code >", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("module_code >=", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeLessThan(String value) {
            addCriterion("module_code <", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeLessThanOrEqualTo(String value) {
            addCriterion("module_code <=", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeLike(String value) {
            addCriterion("module_code like", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotLike(String value) {
            addCriterion("module_code not like", value, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeIn(List<String> values) {
            addCriterion("module_code in", values, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotIn(List<String> values) {
            addCriterion("module_code not in", values, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeBetween(String value1, String value2) {
            addCriterion("module_code between", value1, value2, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andModuleCodeNotBetween(String value1, String value2) {
            addCriterion("module_code not between", value1, value2, "moduleCode");
            return (Criteria) this;
        }

        public Criteria andStiueIdIsNull() {
            addCriterion("stiue_id is null");
            return (Criteria) this;
        }

        public Criteria andStiueIdIsNotNull() {
            addCriterion("stiue_id is not null");
            return (Criteria) this;
        }

        public Criteria andStiueIdEqualTo(Integer value) {
            addCriterion("stiue_id =", value, "stiueId");
            return (Criteria) this;
        }

        public Criteria andStiueIdNotEqualTo(Integer value) {
            addCriterion("stiue_id <>", value, "stiueId");
            return (Criteria) this;
        }

        public Criteria andStiueIdGreaterThan(Integer value) {
            addCriterion("stiue_id >", value, "stiueId");
            return (Criteria) this;
        }

        public Criteria andStiueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stiue_id >=", value, "stiueId");
            return (Criteria) this;
        }

        public Criteria andStiueIdLessThan(Integer value) {
            addCriterion("stiue_id <", value, "stiueId");
            return (Criteria) this;
        }

        public Criteria andStiueIdLessThanOrEqualTo(Integer value) {
            addCriterion("stiue_id <=", value, "stiueId");
            return (Criteria) this;
        }

        public Criteria andStiueIdIn(List<Integer> values) {
            addCriterion("stiue_id in", values, "stiueId");
            return (Criteria) this;
        }

        public Criteria andStiueIdNotIn(List<Integer> values) {
            addCriterion("stiue_id not in", values, "stiueId");
            return (Criteria) this;
        }

        public Criteria andStiueIdBetween(Integer value1, Integer value2) {
            addCriterion("stiue_id between", value1, value2, "stiueId");
            return (Criteria) this;
        }

        public Criteria andStiueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stiue_id not between", value1, value2, "stiueId");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeIsNull() {
            addCriterion("stuite_code is null");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeIsNotNull() {
            addCriterion("stuite_code is not null");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeEqualTo(String value) {
            addCriterion("stuite_code =", value, "stuiteCode");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeNotEqualTo(String value) {
            addCriterion("stuite_code <>", value, "stuiteCode");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeGreaterThan(String value) {
            addCriterion("stuite_code >", value, "stuiteCode");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stuite_code >=", value, "stuiteCode");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeLessThan(String value) {
            addCriterion("stuite_code <", value, "stuiteCode");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeLessThanOrEqualTo(String value) {
            addCriterion("stuite_code <=", value, "stuiteCode");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeLike(String value) {
            addCriterion("stuite_code like", value, "stuiteCode");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeNotLike(String value) {
            addCriterion("stuite_code not like", value, "stuiteCode");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeIn(List<String> values) {
            addCriterion("stuite_code in", values, "stuiteCode");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeNotIn(List<String> values) {
            addCriterion("stuite_code not in", values, "stuiteCode");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeBetween(String value1, String value2) {
            addCriterion("stuite_code between", value1, value2, "stuiteCode");
            return (Criteria) this;
        }

        public Criteria andStuiteCodeNotBetween(String value1, String value2) {
            addCriterion("stuite_code not between", value1, value2, "stuiteCode");
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