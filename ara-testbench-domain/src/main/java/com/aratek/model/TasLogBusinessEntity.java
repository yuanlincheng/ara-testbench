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
@Table(name = "TAS_LOG_BUSINESS", schema = "TRUSTAFIS_U")
public class TasLogBusinessEntity {
    private long logBusId;
    private String actionType;
    private String resultFlag;
    private String resultCode;
    private String content;
    private String resultId;
    private String clientIp;
    private String createDate;
    private String resultMsg;

    @Id
    @Column(name = "LOG_BUS_ID", nullable = false, precision = 0)
    public long getLogBusId() {
        return logBusId;
    }

    public void setLogBusId(long logBusId) {
        this.logBusId = logBusId;
    }

    @Basic
    @Column(name = "ACTION_TYPE", nullable = false, length = 2)
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    @Basic
    @Column(name = "RESULT_FLAG", nullable = true, length = 1)
    public String getResultFlag() {
        return resultFlag;
    }

    public void setResultFlag(String resultFlag) {
        this.resultFlag = resultFlag;
    }

    @Basic
    @Column(name = "RESULT_CODE", nullable = true, length = 5)
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @Basic
    @Column(name = "CONTENT", nullable = true, length = 500)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "RESULT_ID", nullable = true, length = 50)
    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    @Basic
    @Column(name = "CLIENT_IP", nullable = true, length = 20)
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = false, length = 20)
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "RESULT_MSG", nullable = true, length = 100)
    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasLogBusinessEntity that = (TasLogBusinessEntity) o;

        if (logBusId != that.logBusId) return false;
        if (actionType != null ? !actionType.equals(that.actionType) : that.actionType != null) return false;
        if (resultFlag != null ? !resultFlag.equals(that.resultFlag) : that.resultFlag != null) return false;
        if (resultCode != null ? !resultCode.equals(that.resultCode) : that.resultCode != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (resultId != null ? !resultId.equals(that.resultId) : that.resultId != null) return false;
        if (clientIp != null ? !clientIp.equals(that.clientIp) : that.clientIp != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (resultMsg != null ? !resultMsg.equals(that.resultMsg) : that.resultMsg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (logBusId ^ (logBusId >>> 32));
        result = 31 * result + (actionType != null ? actionType.hashCode() : 0);
        result = 31 * result + (resultFlag != null ? resultFlag.hashCode() : 0);
        result = 31 * result + (resultCode != null ? resultCode.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (resultId != null ? resultId.hashCode() : 0);
        result = 31 * result + (clientIp != null ? clientIp.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (resultMsg != null ? resultMsg.hashCode() : 0);
        return result;
    }
}
