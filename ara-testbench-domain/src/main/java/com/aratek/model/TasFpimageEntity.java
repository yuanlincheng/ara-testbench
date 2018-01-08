package com.aratek.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/7 13:14
 * @description: xxx
 * own: Aratek
 */
@Entity
@Table(name = "TAS_FPIMAGE", schema = "TRUSTAFIS_U")
public class TasFpimageEntity {
    private long fpImageId;
    private String personId;
    private long fpImgDetailId;
    private String fpImageFileName;
    private String fpDatasourceCode;
    private String fpIndexCode;
    private long qualityLevel;
    private long qualityScore;
    private String imageFormatCode;
    private byte[] imageData;
    private long colStatuCode;
    private String fpDeviceCode;
    private String fpDeviceSn;
    private String collectPlace;
    private String collectPerson;
    private String collectTime;
    private String createDate;

    @Id
    @Column(name = "FP_IMAGE_ID")
    public long getFpImageId() {
        return fpImageId;
    }

    public void setFpImageId(long fpImageId) {
        this.fpImageId = fpImageId;
    }

    @Basic
    @Column(name = "PERSON_ID")
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "FP_IMG_DETAIL_ID")
    public long getFpImgDetailId() {
        return fpImgDetailId;
    }

    public void setFpImgDetailId(long fpImgDetailId) {
        this.fpImgDetailId = fpImgDetailId;
    }

    @Basic
    @Column(name = "FP_IMAGE_FILE_NAME")
    public String getFpImageFileName() {
        return fpImageFileName;
    }

    public void setFpImageFileName(String fpImageFileName) {
        this.fpImageFileName = fpImageFileName;
    }

    @Basic
    @Column(name = "FP_DATASOURCE_CODE")
    public String getFpDatasourceCode() {
        return fpDatasourceCode;
    }

    public void setFpDatasourceCode(String fpDatasourceCode) {
        this.fpDatasourceCode = fpDatasourceCode;
    }

    @Basic
    @Column(name = "FP_INDEX_CODE")
    public String getFpIndexCode() {
        return fpIndexCode;
    }

    public void setFpIndexCode(String fpIndexCode) {
        this.fpIndexCode = fpIndexCode;
    }

    @Basic
    @Column(name = "QUALITY_LEVEL")
    public long getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(long qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    @Basic
    @Column(name = "QUALITY_SCORE")
    public long getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(long qualityScore) {
        this.qualityScore = qualityScore;
    }

    @Basic
    @Column(name = "IMAGE_FORMAT_CODE")
    public String getImageFormatCode() {
        return imageFormatCode;
    }

    public void setImageFormatCode(String imageFormatCode) {
        this.imageFormatCode = imageFormatCode;
    }

    @Basic
    @Column(name = "IMAGE_DATA")
    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    @Basic
    @Column(name = "COL_STATU_CODE")
    public long getColStatuCode() {
        return colStatuCode;
    }

    public void setColStatuCode(long colStatuCode) {
        this.colStatuCode = colStatuCode;
    }

    @Basic
    @Column(name = "FP_DEVICE_CODE")
    public String getFpDeviceCode() {
        return fpDeviceCode;
    }

    public void setFpDeviceCode(String fpDeviceCode) {
        this.fpDeviceCode = fpDeviceCode;
    }

    @Basic
    @Column(name = "FP_DEVICE_SN")
    public String getFpDeviceSn() {
        return fpDeviceSn;
    }

    public void setFpDeviceSn(String fpDeviceSn) {
        this.fpDeviceSn = fpDeviceSn;
    }

    @Basic
    @Column(name = "COLLECT_PLACE")
    public String getCollectPlace() {
        return collectPlace;
    }

    public void setCollectPlace(String collectPlace) {
        this.collectPlace = collectPlace;
    }

    @Basic
    @Column(name = "COLLECT_PERSON")
    public String getCollectPerson() {
        return collectPerson;
    }

    public void setCollectPerson(String collectPerson) {
        this.collectPerson = collectPerson;
    }

    @Basic
    @Column(name = "COLLECT_TIME")
    public String getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime;
    }

    @Basic
    @Column(name = "CREATE_DATE")
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasFpimageEntity that = (TasFpimageEntity) o;

        if (fpImageId != that.fpImageId) return false;
        if (fpImgDetailId != that.fpImgDetailId) return false;
        if (qualityLevel != that.qualityLevel) return false;
        if (qualityScore != that.qualityScore) return false;
        if (colStatuCode != that.colStatuCode) return false;
        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (fpImageFileName != null ? !fpImageFileName.equals(that.fpImageFileName) : that.fpImageFileName != null)
            return false;
        if (fpDatasourceCode != null ? !fpDatasourceCode.equals(that.fpDatasourceCode) : that.fpDatasourceCode != null)
            return false;
        if (fpIndexCode != null ? !fpIndexCode.equals(that.fpIndexCode) : that.fpIndexCode != null) return false;
        if (imageFormatCode != null ? !imageFormatCode.equals(that.imageFormatCode) : that.imageFormatCode != null)
            return false;
        if (!Arrays.equals(imageData, that.imageData)) return false;
        if (fpDeviceCode != null ? !fpDeviceCode.equals(that.fpDeviceCode) : that.fpDeviceCode != null) return false;
        if (fpDeviceSn != null ? !fpDeviceSn.equals(that.fpDeviceSn) : that.fpDeviceSn != null) return false;
        if (collectPlace != null ? !collectPlace.equals(that.collectPlace) : that.collectPlace != null) return false;
        if (collectPerson != null ? !collectPerson.equals(that.collectPerson) : that.collectPerson != null)
            return false;
        if (collectTime != null ? !collectTime.equals(that.collectTime) : that.collectTime != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (fpImageId ^ (fpImageId >>> 32));
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        result = 31 * result + (int) (fpImgDetailId ^ (fpImgDetailId >>> 32));
        result = 31 * result + (fpImageFileName != null ? fpImageFileName.hashCode() : 0);
        result = 31 * result + (fpDatasourceCode != null ? fpDatasourceCode.hashCode() : 0);
        result = 31 * result + (fpIndexCode != null ? fpIndexCode.hashCode() : 0);
        result = 31 * result + (int) (qualityLevel ^ (qualityLevel >>> 32));
        result = 31 * result + (int) (qualityScore ^ (qualityScore >>> 32));
        result = 31 * result + (imageFormatCode != null ? imageFormatCode.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(imageData);
        result = 31 * result + (int) (colStatuCode ^ (colStatuCode >>> 32));
        result = 31 * result + (fpDeviceCode != null ? fpDeviceCode.hashCode() : 0);
        result = 31 * result + (fpDeviceSn != null ? fpDeviceSn.hashCode() : 0);
        result = 31 * result + (collectPlace != null ? collectPlace.hashCode() : 0);
        result = 31 * result + (collectPerson != null ? collectPerson.hashCode() : 0);
        result = 31 * result + (collectTime != null ? collectTime.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
