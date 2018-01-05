package com.aratek.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/6 0:08
 * @description: xxx
 * own: Aratek
 */
@Entity
@Table(name = "TAS_FP_TP_BUFFER", schema = "TRUSTAFIS_U")
@IdClass(TasFpTpBufferEntityPK.class)
public class TasFpTpBufferEntity {
    private String personId;
    private String fpIndexCode;
    private String fpTemplateNo;
    private String fpDatasourceCode;
    private String fpExchangeFileId;
    private Long serialNumber;
    private String template;
    private byte[] templateB;
    private String extInfo;
    private String fpCategoty;
    private Long singularPointNum;
    private Long templatePointNum;
    private double qualityScore;
    private String algCode;
    private String algVersion;
    private long fpBlockIndex;
    private String colStatuCode;
    private String fpDeviceCode;
    private String fpDeviceSn;
    private String activeStatu;
    private String updateStatu;
    private String createDate;
    private String modifyDate;
    private TasPersonEntity tasPersonByPersonId;

    @Id
    @Column(name = "PERSON_ID", nullable = false, length = 30)
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Id
    @Column(name = "FP_INDEX_CODE", nullable = false, length = 2)
    public String getFpIndexCode() {
        return fpIndexCode;
    }

    public void setFpIndexCode(String fpIndexCode) {
        this.fpIndexCode = fpIndexCode;
    }

    @Id
    @Column(name = "FP_TEMPLATE_NO", nullable = false, length = 2)
    public String getFpTemplateNo() {
        return fpTemplateNo;
    }

    public void setFpTemplateNo(String fpTemplateNo) {
        this.fpTemplateNo = fpTemplateNo;
    }

    @Basic
    @Column(name = "FP_DATASOURCE_CODE", nullable = false, length = 4)
    public String getFpDatasourceCode() {
        return fpDatasourceCode;
    }

    public void setFpDatasourceCode(String fpDatasourceCode) {
        this.fpDatasourceCode = fpDatasourceCode;
    }

    @Basic
    @Column(name = "FP_EXCHANGE_FILE_ID", nullable = true, length = 50)
    public String getFpExchangeFileId() {
        return fpExchangeFileId;
    }

    public void setFpExchangeFileId(String fpExchangeFileId) {
        this.fpExchangeFileId = fpExchangeFileId;
    }

    @Basic
    @Column(name = "SERIAL_NUMBER", nullable = true, precision = 0)
    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Basic
    @Column(name = "TEMPLATE", nullable = true, length = 4000)
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Basic
    @Column(name = "TEMPLATE_B", nullable = true)
    public byte[] getTemplateB() {
        return templateB;
    }

    public void setTemplateB(byte[] templateB) {
        this.templateB = templateB;
    }

    @Basic
    @Column(name = "EXT_INFO", nullable = true, length = 2000)
    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    @Basic
    @Column(name = "FP_CATEGOTY", nullable = true, length = 30)
    public String getFpCategoty() {
        return fpCategoty;
    }

    public void setFpCategoty(String fpCategoty) {
        this.fpCategoty = fpCategoty;
    }

    @Basic
    @Column(name = "SINGULAR_POINT_NUM", nullable = true, precision = 0)
    public Long getSingularPointNum() {
        return singularPointNum;
    }

    public void setSingularPointNum(Long singularPointNum) {
        this.singularPointNum = singularPointNum;
    }

    @Basic
    @Column(name = "TEMPLATE_POINT_NUM", nullable = true, precision = 0)
    public Long getTemplatePointNum() {
        return templatePointNum;
    }

    public void setTemplatePointNum(Long templatePointNum) {
        this.templatePointNum = templatePointNum;
    }

    @Basic
    @Column(name = "QUALITY_SCORE", nullable = false, precision = 0)
    public double getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(double qualityScore) {
        this.qualityScore = qualityScore;
    }

    @Basic
    @Column(name = "ALG_CODE", nullable = false, length = 10)
    public String getAlgCode() {
        return algCode;
    }

    public void setAlgCode(String algCode) {
        this.algCode = algCode;
    }

    @Basic
    @Column(name = "ALG_VERSION", nullable = false, length = 10)
    public String getAlgVersion() {
        return algVersion;
    }

    public void setAlgVersion(String algVersion) {
        this.algVersion = algVersion;
    }

    @Basic
    @Column(name = "FP_BLOCK_INDEX", nullable = false, precision = 0)
    public long getFpBlockIndex() {
        return fpBlockIndex;
    }

    public void setFpBlockIndex(long fpBlockIndex) {
        this.fpBlockIndex = fpBlockIndex;
    }

    @Basic
    @Column(name = "COL_STATU_CODE", nullable = false, length = 1)
    public String getColStatuCode() {
        return colStatuCode;
    }

    public void setColStatuCode(String colStatuCode) {
        this.colStatuCode = colStatuCode;
    }

    @Basic
    @Column(name = "FP_DEVICE_CODE", nullable = true, length = 4)
    public String getFpDeviceCode() {
        return fpDeviceCode;
    }

    public void setFpDeviceCode(String fpDeviceCode) {
        this.fpDeviceCode = fpDeviceCode;
    }

    @Basic
    @Column(name = "FP_DEVICE_SN", nullable = true, length = 20)
    public String getFpDeviceSn() {
        return fpDeviceSn;
    }

    public void setFpDeviceSn(String fpDeviceSn) {
        this.fpDeviceSn = fpDeviceSn;
    }

    @Id
    @Column(name = "ACTIVE_STATU", nullable = false, length = 1)
    public String getActiveStatu() {
        return activeStatu;
    }

    public void setActiveStatu(String activeStatu) {
        this.activeStatu = activeStatu;
    }

    @Basic
    @Column(name = "UPDATE_STATU", nullable = false, length = 1)
    public String getUpdateStatu() {
        return updateStatu;
    }

    public void setUpdateStatu(String updateStatu) {
        this.updateStatu = updateStatu;
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
    @Column(name = "MODIFY_DATE", nullable = true, length = 20)
    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasFpTpBufferEntity that = (TasFpTpBufferEntity) o;

        if (Double.compare(that.qualityScore, qualityScore) != 0) return false;
        if (fpBlockIndex != that.fpBlockIndex) return false;
        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (fpIndexCode != null ? !fpIndexCode.equals(that.fpIndexCode) : that.fpIndexCode != null) return false;
        if (fpTemplateNo != null ? !fpTemplateNo.equals(that.fpTemplateNo) : that.fpTemplateNo != null) return false;
        if (fpDatasourceCode != null ? !fpDatasourceCode.equals(that.fpDatasourceCode) : that.fpDatasourceCode != null)
            return false;
        if (fpExchangeFileId != null ? !fpExchangeFileId.equals(that.fpExchangeFileId) : that.fpExchangeFileId != null)
            return false;
        if (serialNumber != null ? !serialNumber.equals(that.serialNumber) : that.serialNumber != null) return false;
        if (template != null ? !template.equals(that.template) : that.template != null) return false;
        if (!Arrays.equals(templateB, that.templateB)) return false;
        if (extInfo != null ? !extInfo.equals(that.extInfo) : that.extInfo != null) return false;
        if (fpCategoty != null ? !fpCategoty.equals(that.fpCategoty) : that.fpCategoty != null) return false;
        if (singularPointNum != null ? !singularPointNum.equals(that.singularPointNum) : that.singularPointNum != null)
            return false;
        if (templatePointNum != null ? !templatePointNum.equals(that.templatePointNum) : that.templatePointNum != null)
            return false;
        if (algCode != null ? !algCode.equals(that.algCode) : that.algCode != null) return false;
        if (algVersion != null ? !algVersion.equals(that.algVersion) : that.algVersion != null) return false;
        if (colStatuCode != null ? !colStatuCode.equals(that.colStatuCode) : that.colStatuCode != null) return false;
        if (fpDeviceCode != null ? !fpDeviceCode.equals(that.fpDeviceCode) : that.fpDeviceCode != null) return false;
        if (fpDeviceSn != null ? !fpDeviceSn.equals(that.fpDeviceSn) : that.fpDeviceSn != null) return false;
        if (activeStatu != null ? !activeStatu.equals(that.activeStatu) : that.activeStatu != null) return false;
        if (updateStatu != null ? !updateStatu.equals(that.updateStatu) : that.updateStatu != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + (fpIndexCode != null ? fpIndexCode.hashCode() : 0);
        result = 31 * result + (fpTemplateNo != null ? fpTemplateNo.hashCode() : 0);
        result = 31 * result + (fpDatasourceCode != null ? fpDatasourceCode.hashCode() : 0);
        result = 31 * result + (fpExchangeFileId != null ? fpExchangeFileId.hashCode() : 0);
        result = 31 * result + (serialNumber != null ? serialNumber.hashCode() : 0);
        result = 31 * result + (template != null ? template.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(templateB);
        result = 31 * result + (extInfo != null ? extInfo.hashCode() : 0);
        result = 31 * result + (fpCategoty != null ? fpCategoty.hashCode() : 0);
        result = 31 * result + (singularPointNum != null ? singularPointNum.hashCode() : 0);
        result = 31 * result + (templatePointNum != null ? templatePointNum.hashCode() : 0);
        temp = Double.doubleToLongBits(qualityScore);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (algCode != null ? algCode.hashCode() : 0);
        result = 31 * result + (algVersion != null ? algVersion.hashCode() : 0);
        result = 31 * result + (int) (fpBlockIndex ^ (fpBlockIndex >>> 32));
        result = 31 * result + (colStatuCode != null ? colStatuCode.hashCode() : 0);
        result = 31 * result + (fpDeviceCode != null ? fpDeviceCode.hashCode() : 0);
        result = 31 * result + (fpDeviceSn != null ? fpDeviceSn.hashCode() : 0);
        result = 31 * result + (activeStatu != null ? activeStatu.hashCode() : 0);
        result = 31 * result + (updateStatu != null ? updateStatu.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "PERSON_ID", referencedColumnName = "PERSON_ID", nullable = false)
    public TasPersonEntity getTasPersonByPersonId() {
        return tasPersonByPersonId;
    }

    public void setTasPersonByPersonId(TasPersonEntity tasPersonByPersonId) {
        this.tasPersonByPersonId = tasPersonByPersonId;
    }
}