package cn.aptech.service;

import cn.aptech.pojo.TTestorRecord;

public interface TTestorRecordService {
    void setTTestorRecord(TTestorRecord tTestorRecord);

    String getPrevQuestion();

    void insertTOptions();

    Long getCountScore();
}
