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
@Table(name = "TAS_FP_VERIFY_LOG", schema = "TRUSTAFIS_U")
@IdClass(TasFpVerifyLogEntityPK.class)
public class TasFpVerifyLogEntity {
    private String logVerifyLogId;
    private long topNumber;
    private String policyCode;
    private String optType;
    private String returnCode;
    private String selfFlag;
    private String startTime;
    private Long spendTime;
    private Long filterTime;
    private Long filterPercent;
    private String personIdRequest;
    private String personIdFound;
    private String filterThreshold;
    private String matchingThreshold;
    private String matchingCnt;
    private Long filterScore0;
    private Long matchingScore0;
    private Long filterScore1;
    private Long matchingScore1;
    private Long filterScore2;
    private Long matchingScore2;
    private Long filterScore3;
    private Long matchingScore3;
    private Long filterScore4;
    private Long matchingScore4;
    private Long filterScore5;
    private Long matchingScore5;
    private Long filterScore6;
    private Long matchingScore6;
    private Long filterScore7;
    private Long matchingScore7;
    private Long filterScore8;
    private Long matchingScore8;
    private Long filterScore9;
    private Long matchingScore9;
    private Long filterScore10;
    private Long matchingScore10;

    @Id
    @Column(name = "LOG_VERIFY_LOG_ID", nullable = false, length = 50)
    public String getLogVerifyLogId() {
        return logVerifyLogId;
    }

    public void setLogVerifyLogId(String logVerifyLogId) {
        this.logVerifyLogId = logVerifyLogId;
    }

    @Id
    @Column(name = "TOP_NUMBER", nullable = false, precision = 0)
    public long getTopNumber() {
        return topNumber;
    }

    public void setTopNumber(long topNumber) {
        this.topNumber = topNumber;
    }

    @Id
    @Column(name = "POLICY_CODE", nullable = false, length = 4)
    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    @Basic
    @Column(name = "OPT_TYPE", nullable = false, length = 20)
    public String getOptType() {
        return optType;
    }

    public void setOptType(String optType) {
        this.optType = optType;
    }

    @Basic
    @Column(name = "RETURN_CODE", nullable = false, length = 20)
    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    @Basic
    @Column(name = "SELF_FLAG", nullable = true, length = 1)
    public String getSelfFlag() {
        return selfFlag;
    }

    public void setSelfFlag(String selfFlag) {
        this.selfFlag = selfFlag;
    }

    @Basic
    @Column(name = "START_TIME", nullable = false, length = 20)
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "SPEND_TIME", nullable = true, precision = 0)
    public Long getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(Long spendTime) {
        this.spendTime = spendTime;
    }

    @Basic
    @Column(name = "FILTER_TIME", nullable = true, precision = 0)
    public Long getFilterTime() {
        return filterTime;
    }

    public void setFilterTime(Long filterTime) {
        this.filterTime = filterTime;
    }

    @Basic
    @Column(name = "FILTER_PERCENT", nullable = true, precision = 0)
    public Long getFilterPercent() {
        return filterPercent;
    }

    public void setFilterPercent(Long filterPercent) {
        this.filterPercent = filterPercent;
    }

    @Basic
    @Column(name = "PERSON_ID_REQUEST", nullable = true, length = 30)
    public String getPersonIdRequest() {
        return personIdRequest;
    }

    public void setPersonIdRequest(String personIdRequest) {
        this.personIdRequest = personIdRequest;
    }

    @Basic
    @Column(name = "PERSON_ID_FOUND", nullable = true, length = 300)
    public String getPersonIdFound() {
        return personIdFound;
    }

    public void setPersonIdFound(String personIdFound) {
        this.personIdFound = personIdFound;
    }

    @Basic
    @Column(name = "FILTER_THRESHOLD", nullable = true, length = 30)
    public String getFilterThreshold() {
        return filterThreshold;
    }

    public void setFilterThreshold(String filterThreshold) {
        this.filterThreshold = filterThreshold;
    }

    @Basic
    @Column(name = "MATCHING_THRESHOLD", nullable = true, length = 30)
    public String getMatchingThreshold() {
        return matchingThreshold;
    }

    public void setMatchingThreshold(String matchingThreshold) {
        this.matchingThreshold = matchingThreshold;
    }

    @Basic
    @Column(name = "MATCHING_CNT", nullable = true, length = 10)
    public String getMatchingCnt() {
        return matchingCnt;
    }

    public void setMatchingCnt(String matchingCnt) {
        this.matchingCnt = matchingCnt;
    }

    @Basic
    @Column(name = "FILTER_SCORE0", nullable = true, precision = 0)
    public Long getFilterScore0() {
        return filterScore0;
    }

    public void setFilterScore0(Long filterScore0) {
        this.filterScore0 = filterScore0;
    }

    @Basic
    @Column(name = "MATCHING_SCORE0", nullable = true, precision = 0)
    public Long getMatchingScore0() {
        return matchingScore0;
    }

    public void setMatchingScore0(Long matchingScore0) {
        this.matchingScore0 = matchingScore0;
    }

    @Basic
    @Column(name = "FILTER_SCORE1", nullable = true, precision = 0)
    public Long getFilterScore1() {
        return filterScore1;
    }

    public void setFilterScore1(Long filterScore1) {
        this.filterScore1 = filterScore1;
    }

    @Basic
    @Column(name = "MATCHING_SCORE1", nullable = true, precision = 0)
    public Long getMatchingScore1() {
        return matchingScore1;
    }

    public void setMatchingScore1(Long matchingScore1) {
        this.matchingScore1 = matchingScore1;
    }

    @Basic
    @Column(name = "FILTER_SCORE2", nullable = true, precision = 0)
    public Long getFilterScore2() {
        return filterScore2;
    }

    public void setFilterScore2(Long filterScore2) {
        this.filterScore2 = filterScore2;
    }

    @Basic
    @Column(name = "MATCHING_SCORE2", nullable = true, precision = 0)
    public Long getMatchingScore2() {
        return matchingScore2;
    }

    public void setMatchingScore2(Long matchingScore2) {
        this.matchingScore2 = matchingScore2;
    }

    @Basic
    @Column(name = "FILTER_SCORE3", nullable = true, precision = 0)
    public Long getFilterScore3() {
        return filterScore3;
    }

    public void setFilterScore3(Long filterScore3) {
        this.filterScore3 = filterScore3;
    }

    @Basic
    @Column(name = "MATCHING_SCORE3", nullable = true, precision = 0)
    public Long getMatchingScore3() {
        return matchingScore3;
    }

    public void setMatchingScore3(Long matchingScore3) {
        this.matchingScore3 = matchingScore3;
    }

    @Basic
    @Column(name = "FILTER_SCORE4", nullable = true, precision = 0)
    public Long getFilterScore4() {
        return filterScore4;
    }

    public void setFilterScore4(Long filterScore4) {
        this.filterScore4 = filterScore4;
    }

    @Basic
    @Column(name = "MATCHING_SCORE4", nullable = true, precision = 0)
    public Long getMatchingScore4() {
        return matchingScore4;
    }

    public void setMatchingScore4(Long matchingScore4) {
        this.matchingScore4 = matchingScore4;
    }

    @Basic
    @Column(name = "FILTER_SCORE5", nullable = true, precision = 0)
    public Long getFilterScore5() {
        return filterScore5;
    }

    public void setFilterScore5(Long filterScore5) {
        this.filterScore5 = filterScore5;
    }

    @Basic
    @Column(name = "MATCHING_SCORE5", nullable = true, precision = 0)
    public Long getMatchingScore5() {
        return matchingScore5;
    }

    public void setMatchingScore5(Long matchingScore5) {
        this.matchingScore5 = matchingScore5;
    }

    @Basic
    @Column(name = "FILTER_SCORE6", nullable = true, precision = 0)
    public Long getFilterScore6() {
        return filterScore6;
    }

    public void setFilterScore6(Long filterScore6) {
        this.filterScore6 = filterScore6;
    }

    @Basic
    @Column(name = "MATCHING_SCORE6", nullable = true, precision = 0)
    public Long getMatchingScore6() {
        return matchingScore6;
    }

    public void setMatchingScore6(Long matchingScore6) {
        this.matchingScore6 = matchingScore6;
    }

    @Basic
    @Column(name = "FILTER_SCORE7", nullable = true, precision = 0)
    public Long getFilterScore7() {
        return filterScore7;
    }

    public void setFilterScore7(Long filterScore7) {
        this.filterScore7 = filterScore7;
    }

    @Basic
    @Column(name = "MATCHING_SCORE7", nullable = true, precision = 0)
    public Long getMatchingScore7() {
        return matchingScore7;
    }

    public void setMatchingScore7(Long matchingScore7) {
        this.matchingScore7 = matchingScore7;
    }

    @Basic
    @Column(name = "FILTER_SCORE8", nullable = true, precision = 0)
    public Long getFilterScore8() {
        return filterScore8;
    }

    public void setFilterScore8(Long filterScore8) {
        this.filterScore8 = filterScore8;
    }

    @Basic
    @Column(name = "MATCHING_SCORE8", nullable = true, precision = 0)
    public Long getMatchingScore8() {
        return matchingScore8;
    }

    public void setMatchingScore8(Long matchingScore8) {
        this.matchingScore8 = matchingScore8;
    }

    @Basic
    @Column(name = "FILTER_SCORE9", nullable = true, precision = 0)
    public Long getFilterScore9() {
        return filterScore9;
    }

    public void setFilterScore9(Long filterScore9) {
        this.filterScore9 = filterScore9;
    }

    @Basic
    @Column(name = "MATCHING_SCORE9", nullable = true, precision = 0)
    public Long getMatchingScore9() {
        return matchingScore9;
    }

    public void setMatchingScore9(Long matchingScore9) {
        this.matchingScore9 = matchingScore9;
    }

    @Basic
    @Column(name = "FILTER_SCORE10", nullable = true, precision = 0)
    public Long getFilterScore10() {
        return filterScore10;
    }

    public void setFilterScore10(Long filterScore10) {
        this.filterScore10 = filterScore10;
    }

    @Basic
    @Column(name = "MATCHING_SCORE10", nullable = true, precision = 0)
    public Long getMatchingScore10() {
        return matchingScore10;
    }

    public void setMatchingScore10(Long matchingScore10) {
        this.matchingScore10 = matchingScore10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasFpVerifyLogEntity that = (TasFpVerifyLogEntity) o;

        if (topNumber != that.topNumber) return false;
        if (logVerifyLogId != null ? !logVerifyLogId.equals(that.logVerifyLogId) : that.logVerifyLogId != null)
            return false;
        if (policyCode != null ? !policyCode.equals(that.policyCode) : that.policyCode != null) return false;
        if (optType != null ? !optType.equals(that.optType) : that.optType != null) return false;
        if (returnCode != null ? !returnCode.equals(that.returnCode) : that.returnCode != null) return false;
        if (selfFlag != null ? !selfFlag.equals(that.selfFlag) : that.selfFlag != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (spendTime != null ? !spendTime.equals(that.spendTime) : that.spendTime != null) return false;
        if (filterTime != null ? !filterTime.equals(that.filterTime) : that.filterTime != null) return false;
        if (filterPercent != null ? !filterPercent.equals(that.filterPercent) : that.filterPercent != null)
            return false;
        if (personIdRequest != null ? !personIdRequest.equals(that.personIdRequest) : that.personIdRequest != null)
            return false;
        if (personIdFound != null ? !personIdFound.equals(that.personIdFound) : that.personIdFound != null)
            return false;
        if (filterThreshold != null ? !filterThreshold.equals(that.filterThreshold) : that.filterThreshold != null)
            return false;
        if (matchingThreshold != null ? !matchingThreshold.equals(that.matchingThreshold) : that.matchingThreshold != null)
            return false;
        if (matchingCnt != null ? !matchingCnt.equals(that.matchingCnt) : that.matchingCnt != null) return false;
        if (filterScore0 != null ? !filterScore0.equals(that.filterScore0) : that.filterScore0 != null) return false;
        if (matchingScore0 != null ? !matchingScore0.equals(that.matchingScore0) : that.matchingScore0 != null)
            return false;
        if (filterScore1 != null ? !filterScore1.equals(that.filterScore1) : that.filterScore1 != null) return false;
        if (matchingScore1 != null ? !matchingScore1.equals(that.matchingScore1) : that.matchingScore1 != null)
            return false;
        if (filterScore2 != null ? !filterScore2.equals(that.filterScore2) : that.filterScore2 != null) return false;
        if (matchingScore2 != null ? !matchingScore2.equals(that.matchingScore2) : that.matchingScore2 != null)
            return false;
        if (filterScore3 != null ? !filterScore3.equals(that.filterScore3) : that.filterScore3 != null) return false;
        if (matchingScore3 != null ? !matchingScore3.equals(that.matchingScore3) : that.matchingScore3 != null)
            return false;
        if (filterScore4 != null ? !filterScore4.equals(that.filterScore4) : that.filterScore4 != null) return false;
        if (matchingScore4 != null ? !matchingScore4.equals(that.matchingScore4) : that.matchingScore4 != null)
            return false;
        if (filterScore5 != null ? !filterScore5.equals(that.filterScore5) : that.filterScore5 != null) return false;
        if (matchingScore5 != null ? !matchingScore5.equals(that.matchingScore5) : that.matchingScore5 != null)
            return false;
        if (filterScore6 != null ? !filterScore6.equals(that.filterScore6) : that.filterScore6 != null) return false;
        if (matchingScore6 != null ? !matchingScore6.equals(that.matchingScore6) : that.matchingScore6 != null)
            return false;
        if (filterScore7 != null ? !filterScore7.equals(that.filterScore7) : that.filterScore7 != null) return false;
        if (matchingScore7 != null ? !matchingScore7.equals(that.matchingScore7) : that.matchingScore7 != null)
            return false;
        if (filterScore8 != null ? !filterScore8.equals(that.filterScore8) : that.filterScore8 != null) return false;
        if (matchingScore8 != null ? !matchingScore8.equals(that.matchingScore8) : that.matchingScore8 != null)
            return false;
        if (filterScore9 != null ? !filterScore9.equals(that.filterScore9) : that.filterScore9 != null) return false;
        if (matchingScore9 != null ? !matchingScore9.equals(that.matchingScore9) : that.matchingScore9 != null)
            return false;
        if (filterScore10 != null ? !filterScore10.equals(that.filterScore10) : that.filterScore10 != null)
            return false;
        if (matchingScore10 != null ? !matchingScore10.equals(that.matchingScore10) : that.matchingScore10 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logVerifyLogId != null ? logVerifyLogId.hashCode() : 0;
        result = 31 * result + (int) (topNumber ^ (topNumber >>> 32));
        result = 31 * result + (policyCode != null ? policyCode.hashCode() : 0);
        result = 31 * result + (optType != null ? optType.hashCode() : 0);
        result = 31 * result + (returnCode != null ? returnCode.hashCode() : 0);
        result = 31 * result + (selfFlag != null ? selfFlag.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (spendTime != null ? spendTime.hashCode() : 0);
        result = 31 * result + (filterTime != null ? filterTime.hashCode() : 0);
        result = 31 * result + (filterPercent != null ? filterPercent.hashCode() : 0);
        result = 31 * result + (personIdRequest != null ? personIdRequest.hashCode() : 0);
        result = 31 * result + (personIdFound != null ? personIdFound.hashCode() : 0);
        result = 31 * result + (filterThreshold != null ? filterThreshold.hashCode() : 0);
        result = 31 * result + (matchingThreshold != null ? matchingThreshold.hashCode() : 0);
        result = 31 * result + (matchingCnt != null ? matchingCnt.hashCode() : 0);
        result = 31 * result + (filterScore0 != null ? filterScore0.hashCode() : 0);
        result = 31 * result + (matchingScore0 != null ? matchingScore0.hashCode() : 0);
        result = 31 * result + (filterScore1 != null ? filterScore1.hashCode() : 0);
        result = 31 * result + (matchingScore1 != null ? matchingScore1.hashCode() : 0);
        result = 31 * result + (filterScore2 != null ? filterScore2.hashCode() : 0);
        result = 31 * result + (matchingScore2 != null ? matchingScore2.hashCode() : 0);
        result = 31 * result + (filterScore3 != null ? filterScore3.hashCode() : 0);
        result = 31 * result + (matchingScore3 != null ? matchingScore3.hashCode() : 0);
        result = 31 * result + (filterScore4 != null ? filterScore4.hashCode() : 0);
        result = 31 * result + (matchingScore4 != null ? matchingScore4.hashCode() : 0);
        result = 31 * result + (filterScore5 != null ? filterScore5.hashCode() : 0);
        result = 31 * result + (matchingScore5 != null ? matchingScore5.hashCode() : 0);
        result = 31 * result + (filterScore6 != null ? filterScore6.hashCode() : 0);
        result = 31 * result + (matchingScore6 != null ? matchingScore6.hashCode() : 0);
        result = 31 * result + (filterScore7 != null ? filterScore7.hashCode() : 0);
        result = 31 * result + (matchingScore7 != null ? matchingScore7.hashCode() : 0);
        result = 31 * result + (filterScore8 != null ? filterScore8.hashCode() : 0);
        result = 31 * result + (matchingScore8 != null ? matchingScore8.hashCode() : 0);
        result = 31 * result + (filterScore9 != null ? filterScore9.hashCode() : 0);
        result = 31 * result + (matchingScore9 != null ? matchingScore9.hashCode() : 0);
        result = 31 * result + (filterScore10 != null ? filterScore10.hashCode() : 0);
        result = 31 * result + (matchingScore10 != null ? matchingScore10.hashCode() : 0);
        return result;
    }
}
