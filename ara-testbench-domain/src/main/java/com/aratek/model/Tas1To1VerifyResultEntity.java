package com.aratek.model;

import javax.persistence.*;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/7 13:14
 * @description: xxx
 * own: Aratek
 */
@Entity
@Table(name = "TAS_1TO1_VERIFY_RESULT", schema = "TRUSTAFIS_U")
public class Tas1To1VerifyResultEntity {
    private String personId;
    private String taskUuid;
    private String verifyResultId;
    private String verifyType;
    private String verifySourceData;
    private Long verifiedFpCount;
    private String verifyResult;
    private String verifiedRank1FpIndex;
    private String verifiedRank1FpSource;
    private String matchingThreshold;
    private String verifySuccessFlag;
    private String resultCode;
    private String resultMsg;
    private String actionStatu;
    private String readStatu;
    private String createDate;
    private String taskId;
    private String verifyResultUuid;

    @Basic
    @Column(name = "PERSON_ID")
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "TASK_UUID")
    public String getTaskUuid() {
        return taskUuid;
    }

    public void setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
    }

    @Basic
    @Column(name = "VERIFY_RESULT_ID")
    public String getVerifyResultId() {
        return verifyResultId;
    }

    public void setVerifyResultId(String verifyResultId) {
        this.verifyResultId = verifyResultId;
    }

    @Basic
    @Column(name = "VERIFY_TYPE")
    public String getVerifyType() {
        return verifyType;
    }

    public void setVerifyType(String verifyType) {
        this.verifyType = verifyType;
    }

    @Basic
    @Column(name = "VERIFY_SOURCE_DATA")
    public String getVerifySourceData() {
        return verifySourceData;
    }

    public void setVerifySourceData(String verifySourceData) {
        this.verifySourceData = verifySourceData;
    }

    @Basic
    @Column(name = "VERIFIED_FP_COUNT")
    public Long getVerifiedFpCount() {
        return verifiedFpCount;
    }

    public void setVerifiedFpCount(Long verifiedFpCount) {
        this.verifiedFpCount = verifiedFpCount;
    }

    @Basic
    @Column(name = "VERIFY_RESULT")
    public String getVerifyResult() {
        return verifyResult;
    }

    public void setVerifyResult(String verifyResult) {
        this.verifyResult = verifyResult;
    }

    @Basic
    @Column(name = "VERIFIED_RANK1_FP_INDEX")
    public String getVerifiedRank1FpIndex() {
        return verifiedRank1FpIndex;
    }

    public void setVerifiedRank1FpIndex(String verifiedRank1FpIndex) {
        this.verifiedRank1FpIndex = verifiedRank1FpIndex;
    }

    @Basic
    @Column(name = "VERIFIED_RANK1_FP_SOURCE")
    public String getVerifiedRank1FpSource() {
        return verifiedRank1FpSource;
    }

    public void setVerifiedRank1FpSource(String verifiedRank1FpSource) {
        this.verifiedRank1FpSource = verifiedRank1FpSource;
    }

    @Basic
    @Column(name = "MATCHING_THRESHOLD")
    public String getMatchingThreshold() {
        return matchingThreshold;
    }

    public void setMatchingThreshold(String matchingThreshold) {
        this.matchingThreshold = matchingThreshold;
    }

    @Basic
    @Column(name = "VERIFY_SUCCESS_FLAG")
    public String getVerifySuccessFlag() {
        return verifySuccessFlag;
    }

    public void setVerifySuccessFlag(String verifySuccessFlag) {
        this.verifySuccessFlag = verifySuccessFlag;
    }

    @Basic
    @Column(name = "RESULT_CODE")
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @Basic
    @Column(name = "RESULT_MSG")
    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    @Basic
    @Column(name = "ACTION_STATU")
    public String getActionStatu() {
        return actionStatu;
    }

    public void setActionStatu(String actionStatu) {
        this.actionStatu = actionStatu;
    }

    @Basic
    @Column(name = "READ_STATU")
    public String getReadStatu() {
        return readStatu;
    }

    public void setReadStatu(String readStatu) {
        this.readStatu = readStatu;
    }

    @Basic
    @Column(name = "CREATE_DATE")
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "TASK_ID")
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @Id
    @Column(name = "VERIFY_RESULT_UUID")
    public String getVerifyResultUuid() {
        return verifyResultUuid;
    }

    public void setVerifyResultUuid(String verifyResultUuid) {
        this.verifyResultUuid = verifyResultUuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tas1To1VerifyResultEntity that = (Tas1To1VerifyResultEntity) o;

        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (taskUuid != null ? !taskUuid.equals(that.taskUuid) : that.taskUuid != null) return false;
        if (verifyResultId != null ? !verifyResultId.equals(that.verifyResultId) : that.verifyResultId != null)
            return false;
        if (verifyType != null ? !verifyType.equals(that.verifyType) : that.verifyType != null) return false;
        if (verifySourceData != null ? !verifySourceData.equals(that.verifySourceData) : that.verifySourceData != null)
            return false;
        if (verifiedFpCount != null ? !verifiedFpCount.equals(that.verifiedFpCount) : that.verifiedFpCount != null)
            return false;
        if (verifyResult != null ? !verifyResult.equals(that.verifyResult) : that.verifyResult != null) return false;
        if (verifiedRank1FpIndex != null ? !verifiedRank1FpIndex.equals(that.verifiedRank1FpIndex) : that.verifiedRank1FpIndex != null)
            return false;
        if (verifiedRank1FpSource != null ? !verifiedRank1FpSource.equals(that.verifiedRank1FpSource) : that.verifiedRank1FpSource != null)
            return false;
        if (matchingThreshold != null ? !matchingThreshold.equals(that.matchingThreshold) : that.matchingThreshold != null)
            return false;
        if (verifySuccessFlag != null ? !verifySuccessFlag.equals(that.verifySuccessFlag) : that.verifySuccessFlag != null)
            return false;
        if (resultCode != null ? !resultCode.equals(that.resultCode) : that.resultCode != null) return false;
        if (resultMsg != null ? !resultMsg.equals(that.resultMsg) : that.resultMsg != null) return false;
        if (actionStatu != null ? !actionStatu.equals(that.actionStatu) : that.actionStatu != null) return false;
        if (readStatu != null ? !readStatu.equals(that.readStatu) : that.readStatu != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (taskId != null ? !taskId.equals(that.taskId) : that.taskId != null) return false;
        if (verifyResultUuid != null ? !verifyResultUuid.equals(that.verifyResultUuid) : that.verifyResultUuid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + (taskUuid != null ? taskUuid.hashCode() : 0);
        result = 31 * result + (verifyResultId != null ? verifyResultId.hashCode() : 0);
        result = 31 * result + (verifyType != null ? verifyType.hashCode() : 0);
        result = 31 * result + (verifySourceData != null ? verifySourceData.hashCode() : 0);
        result = 31 * result + (verifiedFpCount != null ? verifiedFpCount.hashCode() : 0);
        result = 31 * result + (verifyResult != null ? verifyResult.hashCode() : 0);
        result = 31 * result + (verifiedRank1FpIndex != null ? verifiedRank1FpIndex.hashCode() : 0);
        result = 31 * result + (verifiedRank1FpSource != null ? verifiedRank1FpSource.hashCode() : 0);
        result = 31 * result + (matchingThreshold != null ? matchingThreshold.hashCode() : 0);
        result = 31 * result + (verifySuccessFlag != null ? verifySuccessFlag.hashCode() : 0);
        result = 31 * result + (resultCode != null ? resultCode.hashCode() : 0);
        result = 31 * result + (resultMsg != null ? resultMsg.hashCode() : 0);
        result = 31 * result + (actionStatu != null ? actionStatu.hashCode() : 0);
        result = 31 * result + (readStatu != null ? readStatu.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        result = 31 * result + (verifyResultUuid != null ? verifyResultUuid.hashCode() : 0);
        return result;
    }
}
