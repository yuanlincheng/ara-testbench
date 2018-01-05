package com.aratek.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/6 0:08
 * @description: xxx
 * own: Aratek
 */
@Entity
@Table(name = "TAS_X2N_IDENTIFY_RESULT", schema = "TRUSTAFIS_U")
public class TasX2NIdentifyResultEntity {
    private String identifyResultId;
    private String taskUuid;
    private String resultFlag;
    private String resultCode;
    private String resultMsg;
    private String content;
    private long actionStatu;
    private String readStatu;
    private String createDate;
    private String policyCode;
    private String identifyResultUuid;
    private String taskId;
    private String resultFlage;
    private Collection<TasX2NIdentifyDetailEntity> tasX2NIdentifyDetailsByIdentifyResultUuid;
    private TasTaskEntity tasTaskByTaskUuid;

    @Basic
    @Column(name = "IDENTIFY_RESULT_ID", nullable = true, length = 20)
    public String getIdentifyResultId() {
        return identifyResultId;
    }

    public void setIdentifyResultId(String identifyResultId) {
        this.identifyResultId = identifyResultId;
    }

    @Basic
    @Column(name = "TASK_UUID", nullable = false, length = 20)
    public String getTaskUuid() {
        return taskUuid;
    }

    public void setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
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
    @Column(name = "RESULT_MSG", nullable = true, length = 100)
    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    @Basic
    @Column(name = "CONTENT", nullable = true)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "ACTION_STATU", nullable = false, precision = 0)
    public long getActionStatu() {
        return actionStatu;
    }

    public void setActionStatu(long actionStatu) {
        this.actionStatu = actionStatu;
    }

    @Basic
    @Column(name = "READ_STATU", nullable = false, length = 1)
    public String getReadStatu() {
        return readStatu;
    }

    public void setReadStatu(String readStatu) {
        this.readStatu = readStatu;
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
    @Column(name = "POLICY_CODE", nullable = false, length = 4)
    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    @Id
    @Column(name = "IDENTIFY_RESULT_UUID", nullable = false, length = 20)
    public String getIdentifyResultUuid() {
        return identifyResultUuid;
    }

    public void setIdentifyResultUuid(String identifyResultUuid) {
        this.identifyResultUuid = identifyResultUuid;
    }

    @Basic
    @Column(name = "TASK_ID", nullable = true, length = 30)
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "RESULT_FLAGE", nullable = true, length = 1)
    public String getResultFlage() {
        return resultFlage;
    }

    public void setResultFlage(String resultFlage) {
        this.resultFlage = resultFlage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasX2NIdentifyResultEntity that = (TasX2NIdentifyResultEntity) o;

        if (actionStatu != that.actionStatu) return false;
        if (identifyResultId != null ? !identifyResultId.equals(that.identifyResultId) : that.identifyResultId != null)
            return false;
        if (taskUuid != null ? !taskUuid.equals(that.taskUuid) : that.taskUuid != null) return false;
        if (resultFlag != null ? !resultFlag.equals(that.resultFlag) : that.resultFlag != null) return false;
        if (resultCode != null ? !resultCode.equals(that.resultCode) : that.resultCode != null) return false;
        if (resultMsg != null ? !resultMsg.equals(that.resultMsg) : that.resultMsg != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (readStatu != null ? !readStatu.equals(that.readStatu) : that.readStatu != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (policyCode != null ? !policyCode.equals(that.policyCode) : that.policyCode != null) return false;
        if (identifyResultUuid != null ? !identifyResultUuid.equals(that.identifyResultUuid) : that.identifyResultUuid != null)
            return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        if (resultFlage != null ? !resultFlage.equals(that.resultFlage) : that.resultFlage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = identifyResultId != null ? identifyResultId.hashCode() : 0;
        result = 31 * result + (taskUuid != null ? taskUuid.hashCode() : 0);
        result = 31 * result + (resultFlag != null ? resultFlag.hashCode() : 0);
        result = 31 * result + (resultCode != null ? resultCode.hashCode() : 0);
        result = 31 * result + (resultMsg != null ? resultMsg.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (int) (actionStatu ^ (actionStatu >>> 32));
        result = 31 * result + (readStatu != null ? readStatu.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (policyCode != null ? policyCode.hashCode() : 0);
        result = 31 * result + (identifyResultUuid != null ? identifyResultUuid.hashCode() : 0);
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        result = 31 * result + (resultFlage != null ? resultFlage.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tasX2NIdentifyResultByIdentifyResultUuid")
    public Collection<TasX2NIdentifyDetailEntity> getTasX2NIdentifyDetailsByIdentifyResultUuid() {
        return tasX2NIdentifyDetailsByIdentifyResultUuid;
    }

    public void setTasX2NIdentifyDetailsByIdentifyResultUuid(Collection<TasX2NIdentifyDetailEntity> tasX2NIdentifyDetailsByIdentifyResultUuid) {
        this.tasX2NIdentifyDetailsByIdentifyResultUuid = tasX2NIdentifyDetailsByIdentifyResultUuid;
    }

    @ManyToOne
    @JoinColumn(name = "TASK_UUID", referencedColumnName = "TASK_UUID", nullable = false)
    public TasTaskEntity getTasTaskByTaskUuid() {
        return tasTaskByTaskUuid;
    }

    public void setTasTaskByTaskUuid(TasTaskEntity tasTaskByTaskUuid) {
        this.tasTaskByTaskUuid = tasTaskByTaskUuid;
    }
}
