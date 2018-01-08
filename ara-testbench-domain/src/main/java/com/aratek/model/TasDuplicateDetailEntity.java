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
@Table(name = "TAS_DUPLICATE_DETAIL", schema = "TRUSTAFIS_U")
public class TasDuplicateDetailEntity {
    private long duplicateDetailId;
    private String responseFpId;
    private long resultRank;
    private String policyCode;
    private Long resultTotalScore;
    private Long leftThumbVerScore;
    private Long leftIndexVerScore;
    private Long leftMiddleVerScore;
    private Long leftRingVerScore;
    private Long leftLittleVerScore;
    private Long rightThumbVerScore;
    private Long rightIndexVerScore;
    private Long rightMiddleVerScore;
    private Long rightRingVerScore;
    private Long rightLittleVerScore;
    private String createDate;
    private String duplicateResultId;
    private String resultFlag;
    private String duplicateResultUuid;

    @Id
    @Column(name = "DUPLICATE_DETAIL_ID")
    public long getDuplicateDetailId() {
        return duplicateDetailId;
    }

    public void setDuplicateDetailId(long duplicateDetailId) {
        this.duplicateDetailId = duplicateDetailId;
    }

    @Basic
    @Column(name = "RESPONSE_FP_ID")
    public String getResponseFpId() {
        return responseFpId;
    }

    public void setResponseFpId(String responseFpId) {
        this.responseFpId = responseFpId;
    }

    @Basic
    @Column(name = "RESULT_RANK")
    public long getResultRank() {
        return resultRank;
    }

    public void setResultRank(long resultRank) {
        this.resultRank = resultRank;
    }

    @Basic
    @Column(name = "POLICY_CODE")
    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    @Basic
    @Column(name = "RESULT_TOTAL_SCORE")
    public Long getResultTotalScore() {
        return resultTotalScore;
    }

    public void setResultTotalScore(Long resultTotalScore) {
        this.resultTotalScore = resultTotalScore;
    }

    @Basic
    @Column(name = "LEFT_THUMB_VER_SCORE")
    public Long getLeftThumbVerScore() {
        return leftThumbVerScore;
    }

    public void setLeftThumbVerScore(Long leftThumbVerScore) {
        this.leftThumbVerScore = leftThumbVerScore;
    }

    @Basic
    @Column(name = "LEFT_INDEX_VER_SCORE")
    public Long getLeftIndexVerScore() {
        return leftIndexVerScore;
    }

    public void setLeftIndexVerScore(Long leftIndexVerScore) {
        this.leftIndexVerScore = leftIndexVerScore;
    }

    @Basic
    @Column(name = "LEFT_MIDDLE_VER_SCORE")
    public Long getLeftMiddleVerScore() {
        return leftMiddleVerScore;
    }

    public void setLeftMiddleVerScore(Long leftMiddleVerScore) {
        this.leftMiddleVerScore = leftMiddleVerScore;
    }

    @Basic
    @Column(name = "LEFT_RING_VER_SCORE")
    public Long getLeftRingVerScore() {
        return leftRingVerScore;
    }

    public void setLeftRingVerScore(Long leftRingVerScore) {
        this.leftRingVerScore = leftRingVerScore;
    }

    @Basic
    @Column(name = "LEFT_LITTLE_VER_SCORE")
    public Long getLeftLittleVerScore() {
        return leftLittleVerScore;
    }

    public void setLeftLittleVerScore(Long leftLittleVerScore) {
        this.leftLittleVerScore = leftLittleVerScore;
    }

    @Basic
    @Column(name = "RIGHT_THUMB_VER_SCORE")
    public Long getRightThumbVerScore() {
        return rightThumbVerScore;
    }

    public void setRightThumbVerScore(Long rightThumbVerScore) {
        this.rightThumbVerScore = rightThumbVerScore;
    }

    @Basic
    @Column(name = "RIGHT_INDEX_VER_SCORE")
    public Long getRightIndexVerScore() {
        return rightIndexVerScore;
    }

    public void setRightIndexVerScore(Long rightIndexVerScore) {
        this.rightIndexVerScore = rightIndexVerScore;
    }

    @Basic
    @Column(name = "RIGHT_MIDDLE_VER_SCORE")
    public Long getRightMiddleVerScore() {
        return rightMiddleVerScore;
    }

    public void setRightMiddleVerScore(Long rightMiddleVerScore) {
        this.rightMiddleVerScore = rightMiddleVerScore;
    }

    @Basic
    @Column(name = "RIGHT_RING_VER_SCORE")
    public Long getRightRingVerScore() {
        return rightRingVerScore;
    }

    public void setRightRingVerScore(Long rightRingVerScore) {
        this.rightRingVerScore = rightRingVerScore;
    }

    @Basic
    @Column(name = "RIGHT_LITTLE_VER_SCORE")
    public Long getRightLittleVerScore() {
        return rightLittleVerScore;
    }

    public void setRightLittleVerScore(Long rightLittleVerScore) {
        this.rightLittleVerScore = rightLittleVerScore;
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
    @Column(name = "DUPLICATE_RESULT_ID")
    public String getDuplicateResultId() {
        return duplicateResultId;
    }

    public void setDuplicateResultId(String duplicateResultId) {
        this.duplicateResultId = duplicateResultId;
    }

    @Basic
    @Column(name = "RESULT_FLAG")
    public String getResultFlag() {
        return resultFlag;
    }

    public void setResultFlag(String resultFlag) {
        this.resultFlag = resultFlag;
    }

    @Basic
    @Column(name = "DUPLICATE_RESULT_UUID")
    public String getDuplicateResultUuid() {
        return duplicateResultUuid;
    }

    public void setDuplicateResultUuid(String duplicateResultUuid) {
        this.duplicateResultUuid = duplicateResultUuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasDuplicateDetailEntity that = (TasDuplicateDetailEntity) o;

        if (duplicateDetailId != that.duplicateDetailId) return false;
        if (resultRank != that.resultRank) return false;
        if (responseFpId != null ? !responseFpId.equals(that.responseFpId) : that.responseFpId != null) return false;
        if (policyCode != null ? !policyCode.equals(that.policyCode) : that.policyCode != null) return false;
        if (resultTotalScore != null ? !resultTotalScore.equals(that.resultTotalScore) : that.resultTotalScore != null)
            return false;
        if (leftThumbVerScore != null ? !leftThumbVerScore.equals(that.leftThumbVerScore) : that.leftThumbVerScore != null)
            return false;
        if (leftIndexVerScore != null ? !leftIndexVerScore.equals(that.leftIndexVerScore) : that.leftIndexVerScore != null)
            return false;
        if (leftMiddleVerScore != null ? !leftMiddleVerScore.equals(that.leftMiddleVerScore) : that.leftMiddleVerScore != null)
            return false;
        if (leftRingVerScore != null ? !leftRingVerScore.equals(that.leftRingVerScore) : that.leftRingVerScore != null)
            return false;
        if (leftLittleVerScore != null ? !leftLittleVerScore.equals(that.leftLittleVerScore) : that.leftLittleVerScore != null)
            return false;
        if (rightThumbVerScore != null ? !rightThumbVerScore.equals(that.rightThumbVerScore) : that.rightThumbVerScore != null)
            return false;
        if (rightIndexVerScore != null ? !rightIndexVerScore.equals(that.rightIndexVerScore) : that.rightIndexVerScore != null)
            return false;
        if (rightMiddleVerScore != null ? !rightMiddleVerScore.equals(that.rightMiddleVerScore) : that.rightMiddleVerScore != null)
            return false;
        if (rightRingVerScore != null ? !rightRingVerScore.equals(that.rightRingVerScore) : that.rightRingVerScore != null)
            return false;
        if (rightLittleVerScore != null ? !rightLittleVerScore.equals(that.rightLittleVerScore) : that.rightLittleVerScore != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (duplicateResultId != null ? !duplicateResultId.equals(that.duplicateResultId) : that.duplicateResultId != null)
            return false;
        if (resultFlag != null ? !resultFlag.equals(that.resultFlag) : that.resultFlag != null) return false;
        if (duplicateResultUuid != null ? !duplicateResultUuid.equals(that.duplicateResultUuid) : that.duplicateResultUuid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (duplicateDetailId ^ (duplicateDetailId >>> 32));
        result = 31 * result + (responseFpId != null ? responseFpId.hashCode() : 0);
        result = 31 * result + (int) (resultRank ^ (resultRank >>> 32));
        result = 31 * result + (policyCode != null ? policyCode.hashCode() : 0);
        result = 31 * result + (resultTotalScore != null ? resultTotalScore.hashCode() : 0);
        result = 31 * result + (leftThumbVerScore != null ? leftThumbVerScore.hashCode() : 0);
        result = 31 * result + (leftIndexVerScore != null ? leftIndexVerScore.hashCode() : 0);
        result = 31 * result + (leftMiddleVerScore != null ? leftMiddleVerScore.hashCode() : 0);
        result = 31 * result + (leftRingVerScore != null ? leftRingVerScore.hashCode() : 0);
        result = 31 * result + (leftLittleVerScore != null ? leftLittleVerScore.hashCode() : 0);
        result = 31 * result + (rightThumbVerScore != null ? rightThumbVerScore.hashCode() : 0);
        result = 31 * result + (rightIndexVerScore != null ? rightIndexVerScore.hashCode() : 0);
        result = 31 * result + (rightMiddleVerScore != null ? rightMiddleVerScore.hashCode() : 0);
        result = 31 * result + (rightRingVerScore != null ? rightRingVerScore.hashCode() : 0);
        result = 31 * result + (rightLittleVerScore != null ? rightLittleVerScore.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (duplicateResultId != null ? duplicateResultId.hashCode() : 0);
        result = 31 * result + (resultFlag != null ? resultFlag.hashCode() : 0);
        result = 31 * result + (duplicateResultUuid != null ? duplicateResultUuid.hashCode() : 0);
        return result;
    }
}
