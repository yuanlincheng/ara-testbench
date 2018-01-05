package com.aratek.model;

import javax.persistence.*;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/6 0:08
 * @description: xxx
 * own: Aratek
 */
@Entity
@Table(name = "TAS_REPORT_HOME", schema = "TRUSTAFIS_U")
public class TasReportHomeEntity {
    private long homeId;
    private Long fpNum;
    private Long userNum;
    private Long serverNum;
    private Long busNum;
    private Long busFailNum;
    private String fpAddData;
    private String busTypeData;
    private String serverStatuData;
    private String taskStatuData;

    @Id
    @Column(name = "HOME_ID", nullable = false, precision = 0)
    public long getHomeId() {
        return homeId;
    }

    public void setHomeId(long homeId) {
        this.homeId = homeId;
    }

    @Basic
    @Column(name = "FP_NUM", nullable = true, precision = 0)
    public Long getFpNum() {
        return fpNum;
    }

    public void setFpNum(Long fpNum) {
        this.fpNum = fpNum;
    }

    @Basic
    @Column(name = "USER_NUM", nullable = true, precision = 0)
    public Long getUserNum() {
        return userNum;
    }

    public void setUserNum(Long userNum) {
        this.userNum = userNum;
    }

    @Basic
    @Column(name = "SERVER_NUM", nullable = true, precision = 0)
    public Long getServerNum() {
        return serverNum;
    }

    public void setServerNum(Long serverNum) {
        this.serverNum = serverNum;
    }

    @Basic
    @Column(name = "BUS_NUM", nullable = true, precision = 0)
    public Long getBusNum() {
        return busNum;
    }

    public void setBusNum(Long busNum) {
        this.busNum = busNum;
    }

    @Basic
    @Column(name = "BUS_FAIL_NUM", nullable = true, precision = 0)
    public Long getBusFailNum() {
        return busFailNum;
    }

    public void setBusFailNum(Long busFailNum) {
        this.busFailNum = busFailNum;
    }

    @Basic
    @Column(name = "FP_ADD_DATA", nullable = true, length = 500)
    public String getFpAddData() {
        return fpAddData;
    }

    public void setFpAddData(String fpAddData) {
        this.fpAddData = fpAddData;
    }

    @Basic
    @Column(name = "BUS_TYPE_DATA", nullable = true, length = 500)
    public String getBusTypeData() {
        return busTypeData;
    }

    public void setBusTypeData(String busTypeData) {
        this.busTypeData = busTypeData;
    }

    @Basic
    @Column(name = "SERVER_STATU_DATA", nullable = true, length = 50)
    public String getServerStatuData() {
        return serverStatuData;
    }

    public void setServerStatuData(String serverStatuData) {
        this.serverStatuData = serverStatuData;
    }

    @Basic
    @Column(name = "TASK_STATU_DATA", nullable = true, length = 50)
    public String getTaskStatuData() {
        return taskStatuData;
    }

    public void setTaskStatuData(String taskStatuData) {
        this.taskStatuData = taskStatuData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasReportHomeEntity that = (TasReportHomeEntity) o;

        if (homeId != that.homeId) return false;
        if (fpNum != null ? !fpNum.equals(that.fpNum) : that.fpNum != null) return false;
        if (userNum != null ? !userNum.equals(that.userNum) : that.userNum != null) return false;
        if (serverNum != null ? !serverNum.equals(that.serverNum) : that.serverNum != null) return false;
        if (busNum != null ? !busNum.equals(that.busNum) : that.busNum != null) return false;
        if (busFailNum != null ? !busFailNum.equals(that.busFailNum) : that.busFailNum != null) return false;
        if (fpAddData != null ? !fpAddData.equals(that.fpAddData) : that.fpAddData != null) return false;
        if (busTypeData != null ? !busTypeData.equals(that.busTypeData) : that.busTypeData != null) return false;
        if (serverStatuData != null ? !serverStatuData.equals(that.serverStatuData) : that.serverStatuData != null)
            return false;
        if (taskStatuData != null ? !taskStatuData.equals(that.taskStatuData) : that.taskStatuData != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (homeId ^ (homeId >>> 32));
        result = 31 * result + (fpNum != null ? fpNum.hashCode() : 0);
        result = 31 * result + (userNum != null ? userNum.hashCode() : 0);
        result = 31 * result + (serverNum != null ? serverNum.hashCode() : 0);
        result = 31 * result + (busNum != null ? busNum.hashCode() : 0);
        result = 31 * result + (busFailNum != null ? busFailNum.hashCode() : 0);
        result = 31 * result + (fpAddData != null ? fpAddData.hashCode() : 0);
        result = 31 * result + (busTypeData != null ? busTypeData.hashCode() : 0);
        result = 31 * result + (serverStatuData != null ? serverStatuData.hashCode() : 0);
        result = 31 * result + (taskStatuData != null ? taskStatuData.hashCode() : 0);
        return result;
    }
}
