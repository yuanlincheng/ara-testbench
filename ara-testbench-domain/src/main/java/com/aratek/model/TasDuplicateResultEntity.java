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
@Table(name = "TAS_DUPLICATE_RESULT", schema = "TRUSTAFIS_U")
public class TasDuplicateResultEntity {
    private String duplicateResultId;
    private String taskUuid;
    private String requestFpId;
    private String personId;
    private Long duplicatePersonCount;
    private String policyCode;
    private String resultCode;
    private String resultMsg;
    private long actionStatu;
    private String content;
    private String readStatu;
    private String createDate;
    private String duplicateResultUuid;
    private String taskId;
    private Collection<TasDuplicateDetailEntity> tasDuplicateDetailsByDuplicateResultUuid;
    private TasTaskEntity tasTaskByTaskUuid;

    @Basic
    @Column(name = "DUPLICATE_RESULT_ID", nullable = true, length = 20)
    public String getDuplicateResultId() {
        return duplicateResultId;
    }

    public void setDuplicateResultId(String duplicateResultId) {
        this.duplicateResultId = duplicateResultId;
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
    @Column(name = "REQUEST_FP_ID", nullable = true, length = 50)
    public String getRequestFpId() {
        return requestFpId;
    }

    public void setRequestFpId(String requestFpId) {
        this.requestFpId = requestFpId;
    }

    @Basic
    @Column(name = "PERSON_ID", nullable = true, length = 30)
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "DUPLICATE_PERSON_COUNT", nullable = true, precision = 0)
    public Long getDuplicatePersonCount() {
        return duplicatePersonCount;
    }

    public void setDuplicatePersonCount(Long duplicatePersonCount) {
        this.duplicatePersonCount = duplicatePersonCount;
    }

    @Basic
    @Column(name = "POLICY_CODE", nullable = true, length = 4)
    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
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
    @Column(name = "ACTION_STATU", nullable = false, precision = 0)
    public long getActionStatu() {
        return actionStatu;
    }

    public void setActionStatu(long actionStatu) {
        this.actionStatu = actionStatu;
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

    @Id
    @Column(name = "DUPLICATE_RESULT_UUID", nullable = false, length = 20)
    public String getDuplicateResultUuid() {
        return duplicateResultUuid;
    }

    public void setDuplicateResultUuid(String duplicateResultUuid) {
        this.duplicateResultUuid = duplicateResultUuid;
    }

    @Basic
    @Column(name = "TASK_ID", nullable = true, length = 30)
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasDuplicateResultEntity that = (TasDuplicateResultEntity) o;

        if (actionStatu != that.actionStatu) return false;
        if (duplicateResultId != null ? !duplicateResultId.equals(that.duplicateResultId) : that.duplicateResultId != null)
            return false;
        if (taskUuid != null ? !taskUuid.equals(that.taskUuid) : that.taskUuid != null) return false;
        if (requestFpId != null ? !requestFpId.equals(that.requestFpId) : that.requestFpId != null) return false;
        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (duplicatePersonCount != null ? !duplicatePersonCount.equals(that.duplicatePersonCount) : that.duplicatePersonCount != null)
            return false;
        if (policyCode != null ? !policyCode.equals(that.policyCode) : that.policyCode != null) return false;
        if (resultCode != null ? !resultCode.equals(that.resultCode) : that.resultCode != null) return false;
        if (resultMsg != null ? !resultMsg.equals(that.resultMsg) : that.resultMsg != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (readStatu != null ? !readStatu.equals(that.readStatu) : that.readStatu != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (duplicateResultUuid != null ? !duplicateResultUuid.equals(that.duplicateResultUuid) : that.duplicateResultUuid != null)
            return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = duplicateResultId != null ? duplicateResultId.hashCode() : 0;
        result = 31 * result + (taskUuid != null ? taskUuid.hashCode() : 0);
        result = 31 * result + (requestFpId != null ? requestFpId.hashCode() : 0);
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        result = 31 * result + (duplicatePersonCount != null ? duplicatePersonCount.hashCode() : 0);
        result = 31 * result + (policyCode != null ? policyCode.hashCode() : 0);
        result = 31 * result + (resultCode != null ? resultCode.hashCode() : 0);
        result = 31 * result + (resultMsg != null ? resultMsg.hashCode() : 0);
        result = 31 * result + (int) (actionStatu ^ (actionStatu >>> 32));
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (readStatu != null ? readStatu.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (duplicateResultUuid != null ? duplicateResultUuid.hashCode() : 0);
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tasDuplicateResultByDuplicateResultUuid")
    public Collection<TasDuplicateDetailEntity> getTasDuplicateDetailsByDuplicateResultUuid() {
        return tasDuplicateDetailsByDuplicateResultUuid;
    }

    public void setTasDuplicateDetailsByDuplicateResultUuid(Collection<TasDuplicateDetailEntity> tasDuplicateDetailsByDuplicateResultUuid) {
        this.tasDuplicateDetailsByDuplicateResultUuid = tasDuplicateDetailsByDuplicateResultUuid;
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
