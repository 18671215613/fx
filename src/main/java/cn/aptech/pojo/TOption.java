package cn.aptech.pojo;

public class TOption {
    private Long optionId;

    private Long score;

    private String nextQuestionCode;

    private String optionCode;

    private String questionCode;

    private String title;

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getNextQuestionCode() {
        return nextQuestionCode;
    }

    public void setNextQuestionCode(String nextQuestionCode) {
        this.nextQuestionCode = nextQuestionCode == null ? null : nextQuestionCode.trim();
    }

    public String getOptionCode() {
        return optionCode;
    }

    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode == null ? null : optionCode.trim();
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

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}