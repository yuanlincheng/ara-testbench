package com.aratek.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/6 0:08
 * @description: xxx
 * own: Aratek
 */
public class TasFpVerifyLogEntityPK implements Serializable {
    private String logVerifyLogId;
    private long topNumber;
    private String policyCode;

    @Column(name = "LOG_VERIFY_LOG_ID", nullable = false, length = 50)
    @Id
    public String getLogVerifyLogId() {
        return logVerifyLogId;
    }

    public void setLogVerifyLogId(String logVerifyLogId) {
        this.logVerifyLogId = logVerifyLogId;
    }

    @Column(name = "TOP_NUMBER", nullable = false, precision = 0)
    @Id
    public long getTopNumber() {
        return topNumber;
    }

    public void setTopNumber(long topNumber) {
        this.topNumber = topNumber;
    }

    @Column(name = "POLICY_CODE", nullable = false, length = 4)
    @Id
    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasFpVerifyLogEntityPK that = (TasFpVerifyLogEntityPK) o;

        if (topNumber != that.topNumber) return false;
        if (logVerifyLogId != null ? !logVerifyLogId.equals(that.logVerifyLogId) : that.logVerifyLogId != null)
            return false;
        if (policyCode != null ? !policyCode.equals(that.policyCode) : that.policyCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logVerifyLogId != null ? logVerifyLogId.hashCode() : 0;
        result = 31 * result + (int) (topNumber ^ (topNumber >>> 32));
        result = 31 * result + (policyCode != null ? policyCode.hashCode() : 0);
        return result;
    }
}
