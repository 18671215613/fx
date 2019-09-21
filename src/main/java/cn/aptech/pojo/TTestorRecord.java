package cn.aptech.pojo;

import java.util.Date;

public class TTestorRecord {
    private Integer trId;

    private String suiteCode;

    private String questionCode;

    private String optionCode;

    private Short score;

    private Date createTime;

    private String userId;

    public Integer getTrId() {
        return trId;
    }

    public void setTrId(Integer trId) {
        this.trId = trId;
    }

    public String getSuiteCode() {
        return suiteCode;
    }

    public void setSuiteCode(String suiteCode) {
        this.suiteCode = suiteCode == null ? null : suiteCode.trim();
    }

    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode == null ? null : questionCode.trim();
    }

    public String getOptionCode() {
        return optionCode;
    }

    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode == null ? null : optionCode.trim();
    }

    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    @Override
    public String toString() {
        return "TTestorRecord{" +
                "trId=" + trId +
                ", suiteCode='" + suiteCode + '\'' +
                ", questionCode='" + questionCode + '\'' +
                ", optionCode='" + optionCode + '\'' +
                ", score=" + score +
                ", createTime=" + createTime +
                ", userId='" + userId + '\'' +
                '}';
    }
}