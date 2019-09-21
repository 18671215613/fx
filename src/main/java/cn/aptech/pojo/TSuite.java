package cn.aptech.pojo;

public class TSuite {
    private Integer suiteId;

    private String suiteCode;

    private String title;

    private Integer testnum;

    private Integer favnum;

    private String createTime;

    private Integer replyNum;

    private Integer questionNum;

    private String picture;

    private String description;

    private Integer issuggest;

    private String moduleCode;

    private Integer stiueId;

    private String stuiteCode;

    public Integer getSuiteId() {
        return suiteId;
    }

    public void setSuiteId(Integer suiteId) {
        this.suiteId = suiteId;
    }

    public String getSuiteCode() {
        return suiteCode;
    }

    public void setSuiteCode(String suiteCode) {
        this.suiteCode = suiteCode == null ? null : suiteCode.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getTestnum() {
        return testnum;
    }

    public void setTestnum(Integer testnum) {
        this.testnum = testnum;
    }

    public Integer getFavnum() {
        return favnum;
    }

    public void setFavnum(Integer favnum) {
        this.favnum = favnum;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Integer getReplyNum() {
        return replyNum;
    }

    public void setReplyNum(Integer replyNum) {
        this.replyNum = replyNum;
    }

    public Integer getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(Integer questionNum) {
        this.questionNum = questionNum;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getIssuggest() {
        return issuggest;
    }

    public void setIssuggest(Integer issuggest) {
        this.issuggest = issuggest;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode == null ? null : moduleCode.trim();
    }

    public Integer getStiueId() {
        return stiueId;
    }

    public void setStiueId(Integer stiueId) {
        this.stiueId = stiueId;
    }

    public String getStuiteCode() {
        return stuiteCode;
    }

    public void setStuiteCode(String stuiteCode) {
        this.stuiteCode = stuiteCode == null ? null : stuiteCode.trim();
    }
}