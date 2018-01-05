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
@Table(name = "TAS_X2N_IDENTIFY_DETAIL", schema = "TRUSTAFIS_U")
public class TasX2NIdentifyDetailEntity {
    private String identifyResultUuid;
    private long identifyDetailId;
    private String responseFpId;
    private long responseTopNumber;
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
    private String policyCode;
    private String identifyResultId;
    private TasX2NIdentifyResultEntity tasX2NIdentifyResultByIdentifyResultUuid;

    @Basic
    @Column(name = "IDENTIFY_RESULT_UUID", nullable = false, length = 20)
    public String getIdentifyResultUuid() {
        return identifyResultUuid;
    }

    public void setIdentifyResultUuid(String identifyResultUuid) {
        this.identifyResultUuid = identifyResultUuid;
    }

    @Id
    @Column(name = "IDENTIFY_DETAIL_ID", nullable = false, precision = 0)
    public long getIdentifyDetailId() {
        return identifyDetailId;
    }

    public void setIdentifyDetailId(long identifyDetailId) {
        this.identifyDetailId = identifyDetailId;
    }

    @Basic
    @Column(name = "RESPONSE_FP_ID", nullable = false, length = 50)
    public String getResponseFpId() {
        return responseFpId;
    }

    public void setResponseFpId(String responseFpId) {
        this.responseFpId = responseFpId;
    }

    @Basic
    @Column(name = "RESPONSE_TOP_NUMBER", nullable = false, precision = 0)
    public long getResponseTopNumber() {
        return responseTopNumber;
    }

    public void setResponseTopNumber(long responseTopNumber) {
        this.responseTopNumber = responseTopNumber;
    }

    @Basic
    @Column(name = "RESULT_TOTAL_SCORE", nullable = true, precision = 2)
    public Long getResultTotalScore() {
        return resultTotalScore;
    }

    public void setResultTotalScore(Long resultTotalScore) {
        this.resultTotalScore = resultTotalScore;
    }

    @Basic
    @Column(name = "LEFT_THUMB_VER_SCORE", nullable = true, precision = 2)
    public Long getLeftThumbVerScore() {
        return leftThumbVerScore;
    }

    public void setLeftThumbVerScore(Long leftThumbVerScore) {
        this.leftThumbVerScore = leftThumbVerScore;
    }

    @Basic
    @Column(name = "LEFT_INDEX_VER_SCORE", nullable = true, precision = 2)
    public Long getLeftIndexVerScore() {
        return leftIndexVerScore;
    }

    public void setLeftIndexVerScore(Long leftIndexVerScore) {
        this.leftIndexVerScore = leftIndexVerScore;
    }

    @Basic
    @Column(name = "LEFT_MIDDLE_VER_SCORE", nullable = true, precision = 2)
    public Long getLeftMiddleVerScore() {
        return leftMiddleVerScore;
    }

    public void setLeftMiddleVerScore(Long leftMiddleVerScore) {
        this.leftMiddleVerScore = leftMiddleVerScore;
    }

    @Basic
    @Column(name = "LEFT_RING_VER_SCORE", nullable = true, precision = 2)
    public Long getLeftRingVerScore() {
        return leftRingVerScore;
    }

    public void setLeftRingVerScore(Long leftRingVerScore) {
        this.leftRingVerScore = leftRingVerScore;
    }

    @Basic
    @Column(name = "LEFT_LITTLE_VER_SCORE", nullable = true, precision = 2)
    public Long getLeftLittleVerScore() {
        return leftLittleVerScore;
    }

    public void setLeftLittleVerScore(Long leftLittleVerScore) {
        this.leftLittleVerScore = leftLittleVerScore;
    }

    @Basic
    @Column(name = "RIGHT_THUMB_VER_SCORE", nullable = true, precision = 2)
    public Long getRightThumbVerScore() {
        return rightThumbVerScore;
    }

    public void setRightThumbVerScore(Long rightThumbVerScore) {
        this.rightThumbVerScore = rightThumbVerScore;
    }

    @Basic
    @Column(name = "RIGHT_INDEX_VER_SCORE", nullable = true, precision = 2)
    public Long getRightIndexVerScore() {
        return rightIndexVerScore;
    }

    public void setRightIndexVerScore(Long rightIndexVerScore) {
        this.rightIndexVerScore = rightIndexVerScore;
    }

    @Basic
    @Column(name = "RIGHT_MIDDLE_VER_SCORE", nullable = true, precision = 2)
    public Long getRightMiddleVerScore() {
        return rightMiddleVerScore;
    }

    public void setRightMiddleVerScore(Long rightMiddleVerScore) {
        this.rightMiddleVerScore = rightMiddleVerScore;
    }

    @Basic
    @Column(name = "RIGHT_RING_VER_SCORE", nullable = true, precision = 2)
    public Long getRightRingVerScore() {
        return rightRingVerScore;
    }

    public void setRightRingVerScore(Long rightRingVerScore) {
        this.rightRingVerScore = rightRingVerScore;
    }

    @Basic
    @Column(name = "RIGHT_LITTLE_VER_SCORE", nullable = true, precision = 2)
    public Long getRightLittleVerScore() {
        return rightLittleVerScore;
    }

    public void setRightLittleVerScore(Long rightLittleVerScore) {
        this.rightLittleVerScore = rightLittleVerScore;
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
    @Column(name = "POLICY_CODE", nullable = true, length = 4)
    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    @Basic
    @Column(name = "IDENTIFY_RESULT_ID", nullable = true, length = 20)
    public String getIdentifyResultId() {
        return identifyResultId;
    }

    public void setIdentifyResultId(String identifyResultId) {
        this.identifyResultId = identifyResultId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasX2NIdentifyDetailEntity that = (TasX2NIdentifyDetailEntity) o;

        if (identifyDetailId != that.identifyDetailId) return false;
        if (responseTopNumber != that.responseTopNumber) return false;
        if (identifyResultUuid != null ? !identifyResultUuid.equals(that.identifyResultUuid) : that.identifyResultUuid != null)
            return false;
        if (responseFpId != null ? !responseFpId.equals(that.responseFpId) : that.responseFpId != null) return false;
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
        if (policyCode != null ? !policyCode.equals(that.policyCode) : that.policyCode != null) return false;
        if (identifyResultId != null ? !identifyResultId.equals(that.identifyResultId) : that.identifyResultId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = identifyResultUuid != null ? identifyResultUuid.hashCode() : 0;
        result = 31 * result + (int) (identifyDetailId ^ (identifyDetailId >>> 32));
        result = 31 * result + (responseFpId != null ? responseFpId.hashCode() : 0);
        result = 31 * result + (int) (responseTopNumber ^ (responseTopNumber >>> 32));
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
        result = 31 * result + (policyCode != null ? policyCode.hashCode() : 0);
        result = 31 * result + (identifyResultId != null ? identifyResultId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDENTIFY_RESULT_UUID", referencedColumnName = "IDENTIFY_RESULT_UUID", nullable = false)
    public TasX2NIdentifyResultEntity getTasX2NIdentifyResultByIdentifyResultUuid() {
        return tasX2NIdentifyResultByIdentifyResultUuid;
    }

    public void setTasX2NIdentifyResultByIdentifyResultUuid(TasX2NIdentifyResultEntity tasX2NIdentifyResultByIdentifyResultUuid) {
        this.tasX2NIdentifyResultByIdentifyResultUuid = tasX2NIdentifyResultByIdentifyResultUuid;
    }
}
