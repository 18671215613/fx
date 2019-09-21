package cn.aptech.pojo;

public class TQuestion {
    private Long questionId;

    private Short orderNo;

    private String suiteCode;

    private String questionCode;

    private String title;

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Short getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Short orderNo) {
        this.orderNo = orderNo;
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

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "TQuestion{" +
                "questionId=" + questionId +
                ", orderNo=" + orderNo +
                ", suiteCode='" + suiteCode + '\'' +
                ", questionCode='" + questionCode + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}