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
@Table(name = "TAS_FPIMAGE_DETAIL", schema = "TRUSTAFIS_U")
public class TasFpimageDetailEntity {
    private long fpImgDetailId;
    private String fpExchageFileId;
    private long imageWidth;
    private long imageHeight;
    private String fpDeviceCode;
    private String deviceSn;
    private Long technicalFlag;
    private String devSupFlag;
    private String devTypeFlag;
    private String deviceVersion;
    private Long acqtLevel;
    private Long scaleUnits;
    private Long horizscanRl;
    private Long vertscanRl;
    private Long maxImageWidth;
    private Long maxImageHeight;
    private Long certMark;
    private Long cerCount;
    private String cerOrg;
    private Long horizimageRl;
    private Long vertimageRl;
    private long imageRl;
    private long pixelDepth;
    private Long imprintType;
    private Long comAlgorithm;
    private String comSupFlag;
    private Long comAlgVersion;
    private String quaAlgorithm;
    private String quaSupFlag;
    private Long quaAlgVersion;
    private String createDate;
    private String collectPlace;
    private String collectTime;
    private String collectPerson;
    private Collection<TasFpimageEntity> tasFpimagesByFpImgDetailId;
    private TasFpExchageFileEntity tasFpExchageFileByFpExchageFileId;

    @Id
    @Column(name = "FP_IMG_DETAIL_ID", nullable = false, precision = 0)
    public long getFpImgDetailId() {
        return fpImgDetailId;
    }

    public void setFpImgDetailId(long fpImgDetailId) {
        this.fpImgDetailId = fpImgDetailId;
    }

    @Basic
    @Column(name = "FP_EXCHAGE_FILE_ID", nullable = false, length = 50)
    public String getFpExchageFileId() {
        return fpExchageFileId;
    }

    public void setFpExchageFileId(String fpExchageFileId) {
        this.fpExchageFileId = fpExchageFileId;
    }

    @Basic
    @Column(name = "IMAGE_WIDTH", nullable = false, precision = 0)
    public long getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(long imageWidth) {
        this.imageWidth = imageWidth;
    }

    @Basic
    @Column(name = "IMAGE_HEIGHT", nullable = false, precision = 0)
    public long getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(long imageHeight) {
        this.imageHeight = imageHeight;
    }

    @Basic
    @Column(name = "FP_DEVICE_CODE", nullable = false, length = 4)
    public String getFpDeviceCode() {
        return fpDeviceCode;
    }

    public void setFpDeviceCode(String fpDeviceCode) {
        this.fpDeviceCode = fpDeviceCode;
    }

    @Basic
    @Column(name = "DEVICE_SN", nullable = false, length = 20)
    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    @Basic
    @Column(name = "TECHNICAL_FLAG", nullable = true, precision = 0)
    public Long getTechnicalFlag() {
        return technicalFlag;
    }

    public void setTechnicalFlag(Long technicalFlag) {
        this.technicalFlag = technicalFlag;
    }

    @Basic
    @Column(name = "DEV_SUP_FLAG", nullable = true, length = 4)
    public String getDevSupFlag() {
        return devSupFlag;
    }

    public void setDevSupFlag(String devSupFlag) {
        this.devSupFlag = devSupFlag;
    }

    @Basic
    @Column(name = "DEV_TYPE_FLAG", nullable = true, length = 4)
    public String getDevTypeFlag() {
        return devTypeFlag;
    }

    public void setDevTypeFlag(String devTypeFlag) {
        this.devTypeFlag = devTypeFlag;
    }

    @Basic
    @Column(name = "DEVICE_VERSION", nullable = true, length = 2)
    public String getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion;
    }

    @Basic
    @Column(name = "ACQT_LEVEL", nullable = true, precision = 0)
    public Long getAcqtLevel() {
        return acqtLevel;
    }

    public void setAcqtLevel(Long acqtLevel) {
        this.acqtLevel = acqtLevel;
    }

    @Basic
    @Column(name = "SCALE_UNITS", nullable = true, precision = 0)
    public Long getScaleUnits() {
        return scaleUnits;
    }

    public void setScaleUnits(Long scaleUnits) {
        this.scaleUnits = scaleUnits;
    }

    @Basic
    @Column(name = "HORIZSCAN_RL", nullable = true, precision = 0)
    public Long getHorizscanRl() {
        return horizscanRl;
    }

    public void setHorizscanRl(Long horizscanRl) {
        this.horizscanRl = horizscanRl;
    }

    @Basic
    @Column(name = "VERTSCAN_RL", nullable = true, precision = 0)
    public Long getVertscanRl() {
        return vertscanRl;
    }

    public void setVertscanRl(Long vertscanRl) {
        this.vertscanRl = vertscanRl;
    }

    @Basic
    @Column(name = "MAX_IMAGE_WIDTH", nullable = true, precision = 0)
    public Long getMaxImageWidth() {
        return maxImageWidth;
    }

    public void setMaxImageWidth(Long maxImageWidth) {
        this.maxImageWidth = maxImageWidth;
    }

    @Basic
    @Column(name = "MAX_IMAGE_HEIGHT", nullable = true, precision = 0)
    public Long getMaxImageHeight() {
        return maxImageHeight;
    }

    public void setMaxImageHeight(Long maxImageHeight) {
        this.maxImageHeight = maxImageHeight;
    }

    @Basic
    @Column(name = "CERT_MARK", nullable = true, precision = 0)
    public Long getCertMark() {
        return certMark;
    }

    public void setCertMark(Long certMark) {
        this.certMark = certMark;
    }

    @Basic
    @Column(name = "CER_COUNT", nullable = true, precision = 0)
    public Long getCerCount() {
        return cerCount;
    }

    public void setCerCount(Long cerCount) {
        this.cerCount = cerCount;
    }

    @Basic
    @Column(name = "CER_ORG", nullable = true, length = 4)
    public String getCerOrg() {
        return cerOrg;
    }

    public void setCerOrg(String cerOrg) {
        this.cerOrg = cerOrg;
    }

    @Basic
    @Column(name = "HORIZIMAGE_RL", nullable = true, precision = 0)
    public Long getHorizimageRl() {
        return horizimageRl;
    }

    public void setHorizimageRl(Long horizimageRl) {
        this.horizimageRl = horizimageRl;
    }

    @Basic
    @Column(name = "VERTIMAGE_RL", nullable = true, precision = 0)
    public Long getVertimageRl() {
        return vertimageRl;
    }

    public void setVertimageRl(Long vertimageRl) {
        this.vertimageRl = vertimageRl;
    }

    @Basic
    @Column(name = "IMAGE_RL", nullable = false, precision = 0)
    public long getImageRl() {
        return imageRl;
    }

    public void setImageRl(long imageRl) {
        this.imageRl = imageRl;
    }

    @Basic
    @Column(name = "PIXEL_DEPTH", nullable = false, precision = 0)
    public long getPixelDepth() {
        return pixelDepth;
    }

    public void setPixelDepth(long pixelDepth) {
        this.pixelDepth = pixelDepth;
    }

    @Basic
    @Column(name = "IMPRINT_TYPE", nullable = true, precision = 0)
    public Long getImprintType() {
        return imprintType;
    }

    public void setImprintType(Long imprintType) {
        this.imprintType = imprintType;
    }

    @Basic
    @Column(name = "COM_ALGORITHM", nullable = true, precision = 0)
    public Long getComAlgorithm() {
        return comAlgorithm;
    }

    public void setComAlgorithm(Long comAlgorithm) {
        this.comAlgorithm = comAlgorithm;
    }

    @Basic
    @Column(name = "COM_SUP_FLAG", nullable = true, length = 4)
    public String getComSupFlag() {
        return comSupFlag;
    }

    public void setComSupFlag(String comSupFlag) {
        this.comSupFlag = comSupFlag;
    }

    @Basic
    @Column(name = "COM_ALG_VERSION", nullable = true, precision = 0)
    public Long getComAlgVersion() {
        return comAlgVersion;
    }

    public void setComAlgVersion(Long comAlgVersion) {
        this.comAlgVersion = comAlgVersion;
    }

    @Basic
    @Column(name = "QUA_ALGORITHM", nullable = true, length = 4)
    public String getQuaAlgorithm() {
        return quaAlgorithm;
    }

    public void setQuaAlgorithm(String quaAlgorithm) {
        this.quaAlgorithm = quaAlgorithm;
    }

    @Basic
    @Column(name = "QUA_SUP_FLAG", nullable = true, length = 4)
    public String getQuaSupFlag() {
        return quaSupFlag;
    }

    public void setQuaSupFlag(String quaSupFlag) {
        this.quaSupFlag = quaSupFlag;
    }

    @Basic
    @Column(name = "QUA_ALG_VERSION", nullable = true, precision = 0)
    public Long getQuaAlgVersion() {
        return quaAlgVersion;
    }

    public void setQuaAlgVersion(Long quaAlgVersion) {
        this.quaAlgVersion = quaAlgVersion;
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
    @Column(name = "COLLECT_PLACE", nullable = false, length = 10)
    public String getCollectPlace() {
        return collectPlace;
    }

    public void setCollectPlace(String collectPlace) {
        this.collectPlace = collectPlace;
    }

    @Basic
    @Column(name = "COLLECT_TIME", nullable = false, length = 20)
    public String getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime;
    }

    @Basic
    @Column(name = "COLLECT_PERSON", nullable = false, length = 30)
    public String getCollectPerson() {
        return collectPerson;
    }

    public void setCollectPerson(String collectPerson) {
        this.collectPerson = collectPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasFpimageDetailEntity that = (TasFpimageDetailEntity) o;

        if (fpImgDetailId != that.fpImgDetailId) return false;
        if (imageWidth != that.imageWidth) return false;
        if (imageHeight != that.imageHeight) return false;
        if (imageRl != that.imageRl) return false;
        if (pixelDepth != that.pixelDepth) return false;
        if (fpExchageFileId != null ? !fpExchageFileId.equals(that.fpExchageFileId) : that.fpExchageFileId != null)
            return false;
        if (fpDeviceCode != null ? !fpDeviceCode.equals(that.fpDeviceCode) : that.fpDeviceCode != null) return false;
        if (deviceSn != null ? !deviceSn.equals(that.deviceSn) : that.deviceSn != null) return false;
        if (technicalFlag != null ? !technicalFlag.equals(that.technicalFlag) : that.technicalFlag != null)
            return false;
        if (devSupFlag != null ? !devSupFlag.equals(that.devSupFlag) : that.devSupFlag != null) return false;
        if (devTypeFlag != null ? !devTypeFlag.equals(that.devTypeFlag) : that.devTypeFlag != null) return false;
        if (deviceVersion != null ? !deviceVersion.equals(that.deviceVersion) : that.deviceVersion != null)
            return false;
        if (acqtLevel != null ? !acqtLevel.equals(that.acqtLevel) : that.acqtLevel != null) return false;
        if (scaleUnits != null ? !scaleUnits.equals(that.scaleUnits) : that.scaleUnits != null) return false;
        if (horizscanRl != null ? !horizscanRl.equals(that.horizscanRl) : that.horizscanRl != null) return false;
        if (vertscanRl != null ? !vertscanRl.equals(that.vertscanRl) : that.vertscanRl != null) return false;
        if (maxImageWidth != null ? !maxImageWidth.equals(that.maxImageWidth) : that.maxImageWidth != null)
            return false;
        if (maxImageHeight != null ? !maxImageHeight.equals(that.maxImageHeight) : that.maxImageHeight != null)
            return false;
        if (certMark != null ? !certMark.equals(that.certMark) : that.certMark != null) return false;
        if (cerCount != null ? !cerCount.equals(that.cerCount) : that.cerCount != null) return false;
        if (cerOrg != null ? !cerOrg.equals(that.cerOrg) : that.cerOrg != null) return false;
        if (horizimageRl != null ? !horizimageRl.equals(that.horizimageRl) : that.horizimageRl != null) return false;
        if (vertimageRl != null ? !vertimageRl.equals(that.vertimageRl) : that.vertimageRl != null) return false;
        if (imprintType != null ? !imprintType.equals(that.imprintType) : that.imprintType != null) return false;
        if (comAlgorithm != null ? !comAlgorithm.equals(that.comAlgorithm) : that.comAlgorithm != null) return false;
        if (comSupFlag != null ? !comSupFlag.equals(that.comSupFlag) : that.comSupFlag != null) return false;
        if (comAlgVersion != null ? !comAlgVersion.equals(that.comAlgVersion) : that.comAlgVersion != null)
            return false;
        if (quaAlgorithm != null ? !quaAlgorithm.equals(that.quaAlgorithm) : that.quaAlgorithm != null) return false;
        if (quaSupFlag != null ? !quaSupFlag.equals(that.quaSupFlag) : that.quaSupFlag != null) return false;
        if (quaAlgVersion != null ? !quaAlgVersion.equals(that.quaAlgVersion) : that.quaAlgVersion != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (collectPlace != null ? !collectPlace.equals(that.collectPlace) : that.collectPlace != null) return false;
        if (collectTime != null ? !collectTime.equals(that.collectTime) : that.collectTime != null) return false;
        if (collectPerson != null ? !collectPerson.equals(that.collectPerson) : that.collectPerson != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (fpImgDetailId ^ (fpImgDetailId >>> 32));
        result = 31 * result + (fpExchageFileId != null ? fpExchageFileId.hashCode() : 0);
        result = 31 * result + (int) (imageWidth ^ (imageWidth >>> 32));
        result = 31 * result + (int) (imageHeight ^ (imageHeight >>> 32));
        result = 31 * result + (fpDeviceCode != null ? fpDeviceCode.hashCode() : 0);
        result = 31 * result + (deviceSn != null ? deviceSn.hashCode() : 0);
        result = 31 * result + (technicalFlag != null ? technicalFlag.hashCode() : 0);
        result = 31 * result + (devSupFlag != null ? devSupFlag.hashCode() : 0);
        result = 31 * result + (devTypeFlag != null ? devTypeFlag.hashCode() : 0);
        result = 31 * result + (deviceVersion != null ? deviceVersion.hashCode() : 0);
        result = 31 * result + (acqtLevel != null ? acqtLevel.hashCode() : 0);
        result = 31 * result + (scaleUnits != null ? scaleUnits.hashCode() : 0);
        result = 31 * result + (horizscanRl != null ? horizscanRl.hashCode() : 0);
        result = 31 * result + (vertscanRl != null ? vertscanRl.hashCode() : 0);
        result = 31 * result + (maxImageWidth != null ? maxImageWidth.hashCode() : 0);
        result = 31 * result + (maxImageHeight != null ? maxImageHeight.hashCode() : 0);
        result = 31 * result + (certMark != null ? certMark.hashCode() : 0);
        result = 31 * result + (cerCount != null ? cerCount.hashCode() : 0);
        result = 31 * result + (cerOrg != null ? cerOrg.hashCode() : 0);
        result = 31 * result + (horizimageRl != null ? horizimageRl.hashCode() : 0);
        result = 31 * result + (vertimageRl != null ? vertimageRl.hashCode() : 0);
        result = 31 * result + (int) (imageRl ^ (imageRl >>> 32));
        result = 31 * result + (int) (pixelDepth ^ (pixelDepth >>> 32));
        result = 31 * result + (imprintType != null ? imprintType.hashCode() : 0);
        result = 31 * result + (comAlgorithm != null ? comAlgorithm.hashCode() : 0);
        result = 31 * result + (comSupFlag != null ? comSupFlag.hashCode() : 0);
        result = 31 * result + (comAlgVersion != null ? comAlgVersion.hashCode() : 0);
        result = 31 * result + (quaAlgorithm != null ? quaAlgorithm.hashCode() : 0);
        result = 31 * result + (quaSupFlag != null ? quaSupFlag.hashCode() : 0);
        result = 31 * result + (quaAlgVersion != null ? quaAlgVersion.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (collectPlace != null ? collectPlace.hashCode() : 0);
        result = 31 * result + (collectTime != null ? collectTime.hashCode() : 0);
        result = 31 * result + (collectPerson != null ? collectPerson.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tasFpimageDetailByFpImgDetailId")
    public Collection<TasFpimageEntity> getTasFpimagesByFpImgDetailId() {
        return tasFpimagesByFpImgDetailId;
    }

    public void setTasFpimagesByFpImgDetailId(Collection<TasFpimageEntity> tasFpimagesByFpImgDetailId) {
        this.tasFpimagesByFpImgDetailId = tasFpimagesByFpImgDetailId;
    }

    @ManyToOne
    @JoinColumn(name = "FP_EXCHAGE_FILE_ID", referencedColumnName = "FP_EXCHAGE_FILE_ID", nullable = false)
    public TasFpExchageFileEntity getTasFpExchageFileByFpExchageFileId() {
        return tasFpExchageFileByFpExchageFileId;
    }

    public void setTasFpExchageFileByFpExchageFileId(TasFpExchageFileEntity tasFpExchageFileByFpExchageFileId) {
        this.tasFpExchageFileByFpExchageFileId = tasFpExchageFileByFpExchageFileId;
    }
}
