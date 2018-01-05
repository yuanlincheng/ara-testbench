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
public class TasFpTpBufferEntityPK implements Serializable {
    private String personId;
    private String fpIndexCode;
    private String fpTemplateNo;
    private String activeStatu;

    @Column(name = "PERSON_ID", nullable = false, length = 30)
    @Id
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Column(name = "FP_INDEX_CODE", nullable = false, length = 2)
    @Id
    public String getFpIndexCode() {
        return fpIndexCode;
    }

    public void setFpIndexCode(String fpIndexCode) {
        this.fpIndexCode = fpIndexCode;
    }

    @Column(name = "FP_TEMPLATE_NO", nullable = false, length = 2)
    @Id
    public String getFpTemplateNo() {
        return fpTemplateNo;
    }

    public void setFpTemplateNo(String fpTemplateNo) {
        this.fpTemplateNo = fpTemplateNo;
    }

    @Column(name = "ACTIVE_STATU", nullable = false, length = 1)
    @Id
    public String getActiveStatu() {
        return activeStatu;
    }

    public void setActiveStatu(String activeStatu) {
        this.activeStatu = activeStatu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasFpTpBufferEntityPK that = (TasFpTpBufferEntityPK) o;

        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (fpIndexCode != null ? !fpIndexCode.equals(that.fpIndexCode) : that.fpIndexCode != null) return false;
        if (fpTemplateNo != null ? !fpTemplateNo.equals(that.fpTemplateNo) : that.fpTemplateNo != null) return false;
        if (activeStatu != null ? !activeStatu.equals(that.activeStatu) : that.activeStatu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + (fpIndexCode != null ? fpIndexCode.hashCode() : 0);
        result = 31 * result + (fpTemplateNo != null ? fpTemplateNo.hashCode() : 0);
        result = 31 * result + (activeStatu != null ? activeStatu.hashCode() : 0);
        return result;
    }
}
