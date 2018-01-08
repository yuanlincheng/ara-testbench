package com.aratek.model;

import javax.persistence.*;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/7 13:15
 * @description: xxx
 * own: Aratek
 */
@Entity
@Table(name = "TAS_TASK", schema = "TRUSTAFIS_U")
public class TasTaskEntity {
    private String taskId;
    private String foreinRequestId;
    private String taskComCode;
    private String taskComment;
    private String taskResult;
    private String taskRetCode;
    private String taskState;
    private String taskCompleteDate;
    private String taskReceiveFlag;
    private String taskReceiveDate;
    private String createDate;
    private String taskUuid;

    @Basic
    @Column(name = "TASK_ID")
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Basic
    @Column(name = "FOREIN_REQUEST_ID")
    public String getForeinRequestId() {
        return foreinRequestId;
    }

    public void setForeinRequestId(String foreinRequestId) {
        this.foreinRequestId = foreinRequestId;
    }

    @Basic
    @Column(name = "TASK_COM_CODE")
    public String getTaskComCode() {
        return taskComCode;
    }

    public void setTaskComCode(String taskComCode) {
        this.taskComCode = taskComCode;
    }

    @Basic
    @Column(name = "TASK_COMMENT")
    public String getTaskComment() {
        return taskComment;
    }

    public void setTaskComment(String taskComment) {
        this.taskComment = taskComment;
    }

    @Basic
    @Column(name = "TASK_RESULT")
    public String getTaskResult() {
        return taskResult;
    }

    public void setTaskResult(String taskResult) {
        this.taskResult = taskResult;
    }

    @Basic
    @Column(name = "TASK_RET_CODE")
    public String getTaskRetCode() {
        return taskRetCode;
    }

    public void setTaskRetCode(String taskRetCode) {
        this.taskRetCode = taskRetCode;
    }

    @Basic
    @Column(name = "TASK_STATE")
    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    @Basic
    @Column(name = "TASK_COMPLETE_DATE")
    public String getTaskCompleteDate() {
        return taskCompleteDate;
    }

    public void setTaskCompleteDate(String taskCompleteDate) {
        this.taskCompleteDate = taskCompleteDate;
    }

    @Basic
    @Column(name = "TASK_RECEIVE_FLAG")
    public String getTaskReceiveFlag() {
        return taskReceiveFlag;
    }

    public void setTaskReceiveFlag(String taskReceiveFlag) {
        this.taskReceiveFlag = taskReceiveFlag;
    }

    @Basic
    @Column(name = "TASK_RECEIVE_DATE")
    public String getTaskReceiveDate() {
        return taskReceiveDate;
    }

    public void setTaskReceiveDate(String taskReceiveDate) {
        this.taskReceiveDate = taskReceiveDate;
    }

    @Basic
    @Column(name = "CREATE_DATE")
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Id
    @Column(name = "TASK_UUID")
    public String getTaskUuid() {
        return taskUuid;
    }

    public void setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasTaskEntity that = (TasTaskEntity) o;

        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        if (foreinRequestId != null ? !foreinRequestId.equals(that.foreinRequestId) : that.foreinRequestId != null)
            return false;
        if (taskComCode != null ? !taskComCode.equals(that.taskComCode) : that.taskComCode != null) return false;
        if (taskComment != null ? !taskComment.equals(that.taskComment) : that.taskComment != null) return false;
        if (taskResult != null ? !taskResult.equals(that.taskResult) : that.taskResult != null) return false;
        if (taskRetCode != null ? !taskRetCode.equals(that.taskRetCode) : that.taskRetCode != null) return false;
        if (taskState != null ? !taskState.equals(that.taskState) : that.taskState != null) return false;
        if (taskCompleteDate != null ? !taskCompleteDate.equals(that.taskCompleteDate) : that.taskCompleteDate != null)
            return false;
        if (taskReceiveFlag != null ? !taskReceiveFlag.equals(that.taskReceiveFlag) : that.taskReceiveFlag != null)
            return false;
        if (taskReceiveDate != null ? !taskReceiveDate.equals(that.taskReceiveDate) : that.taskReceiveDate != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (taskUuid != null ? !taskUuid.equals(that.taskUuid) : that.taskUuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskId != null ? taskId.hashCode() : 0;
        result = 31 * result + (foreinRequestId != null ? foreinRequestId.hashCode() : 0);
        result = 31 * result + (taskComCode != null ? taskComCode.hashCode() : 0);
        result = 31 * result + (taskComment != null ? taskComment.hashCode() : 0);
        result = 31 * result + (taskResult != null ? taskResult.hashCode() : 0);
        result = 31 * result + (taskRetCode != null ? taskRetCode.hashCode() : 0);
        result = 31 * result + (taskState != null ? taskState.hashCode() : 0);
        result = 31 * result + (taskCompleteDate != null ? taskCompleteDate.hashCode() : 0);
        result = 31 * result + (taskReceiveFlag != null ? taskReceiveFlag.hashCode() : 0);
        result = 31 * result + (taskReceiveDate != null ? taskReceiveDate.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (taskUuid != null ? taskUuid.hashCode() : 0);
        return result;
    }
}
