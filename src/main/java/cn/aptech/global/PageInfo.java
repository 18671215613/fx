package cn.aptech.global;

import java.util.List;

public class PageInfo<T> {
    private Long recordCount;  //总记录数
    private int page;  //当前页号
    private int rows;  //每页记录数
    private int startIndex;  //开始位置
    private int endIndex;  //结束位置
    private int pageCount;  //总页数
    private int prePage;  //上一页
    private int nextPage;  //下一页
    private List<T> pageData; //当前页数据

    public PageInfo(Long recordCount, int page, int rows) {
        this.recordCount = recordCount;
        this.page = page;
        this.rows = rows;
        this.startIndex = (page - 1) * rows;
        this.endIndex = page * rows;
        this.pageCount = new Double(Math.ceil(recordCount / rows)).intValue();
        if (page > 1) {
            this.prePage = page - 1;
        } else {
            this.prePage = 1;
        }
        if (page < this.pageCount) {
            this.nextPage = page + 1;
        } else {
            this.nextPage = this.pageCount;
        }
    }

    public PageInfo() {
    }

    public PageInfo(Long recordCount, int page, int rows, int startIndex, int endIndex, int pageCount, int prePage, int nextPage, List<T> pageData) {
        this.recordCount = recordCount;
        this.page = page;
        this.rows = rows;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.pageCount = pageCount;
        this.prePage = prePage;
        this.nextPage = nextPage;
        this.pageData = pageData;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "recordCount=" + recordCount +
                ", page=" + page +
                ", rows=" + rows +
                ", startIndex=" + startIndex +
                ", endIndex=" + endIndex +
                ", pageCount=" + pageCount +
                ", prePage=" + prePage +
                ", nextPage=" + nextPage +
                ", pageData=" + pageData +
                '}';
    }

    public Long getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(Long recordCount) {
        this.recordCount = recordCount;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public List<T> getPageData() {
        return pageData;
    }

    public void setPageData(List<T> pageData) {
        this.pageData = pageData;
    }
}
