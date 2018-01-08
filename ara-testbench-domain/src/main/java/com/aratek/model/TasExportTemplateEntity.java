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
@Table(name = "TAS_EXPORT_TEMPLATE", schema = "TRUSTAFIS_U")
public class TasExportTemplateEntity {
    private String templateId;
    private String templateData;
    private String readFlag;
    private String templateCreateDate;
    private String convertFlag;
    private Long imgWidth;
    private Long imgHeight;
    private Long imgQuality;
    private Long temMin;
    private Long imgDpi;
    private Long imgDepth;
    private String algCode;
    private String algVersion;

    @Id
    @Column(name = "TEMPLATE_ID")
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Basic
    @Column(name = "TEMPLATE_DATA")
    public String getTemplateData() {
        return templateData;
    }

    public void setTemplateData(String templateData) {
        this.templateData = templateData;
    }

    @Basic
    @Column(name = "READ_FLAG")
    public String getReadFlag() {
        return readFlag;
    }

    public void setReadFlag(String readFlag) {
        this.readFlag = readFlag;
    }

    @Basic
    @Column(name = "TEMPLATE_CREATE_DATE")
    public String getTemplateCreateDate() {
        return templateCreateDate;
    }

    public void setTemplateCreateDate(String templateCreateDate) {
        this.templateCreateDate = templateCreateDate;
    }

    @Basic
    @Column(name = "CONVERT_FLAG")
    public String getConvertFlag() {
        return convertFlag;
    }

    public void setConvertFlag(String convertFlag) {
        this.convertFlag = convertFlag;
    }

    @Basic
    @Column(name = "IMG_WIDTH")
    public Long getImgWidth() {
        return imgWidth;
    }

    public void setImgWidth(Long imgWidth) {
        this.imgWidth = imgWidth;
    }

    @Basic
    @Column(name = "IMG_HEIGHT")
    public Long getImgHeight() {
        return imgHeight;
    }

    public void setImgHeight(Long imgHeight) {
        this.imgHeight = imgHeight;
    }

    @Basic
    @Column(name = "IMG_QUALITY")
    public Long getImgQuality() {
        return imgQuality;
    }

    public void setImgQuality(Long imgQuality) {
        this.imgQuality = imgQuality;
    }

    @Basic
    @Column(name = "TEM_MIN")
    public Long getTemMin() {
        return temMin;
    }

    public void setTemMin(Long temMin) {
        this.temMin = temMin;
    }

    @Basic
    @Column(name = "IMG_DPI")
    public Long getImgDpi() {
        return imgDpi;
    }

    public void setImgDpi(Long imgDpi) {
        this.imgDpi = imgDpi;
    }

    @Basic
    @Column(name = "IMG_DEPTH")
    public Long getImgDepth() {
        return imgDepth;
    }

    public void setImgDepth(Long imgDepth) {
        this.imgDepth = imgDepth;
    }

    @Basic
    @Column(name = "ALG_CODE")
    public String getAlgCode() {
        return algCode;
    }

    public void setAlgCode(String algCode) {
        this.algCode = algCode;
    }

    @Basic
    @Column(name = "ALG_VERSION")
    public String getAlgVersion() {
        return algVersion;
    }

    public void setAlgVersion(String algVersion) {
        this.algVersion = algVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasExportTemplateEntity that = (TasExportTemplateEntity) o;

        if (templateId != null ? !templateId.equals(that.templateId) : that.templateId != null) return false;
        if (templateData != null ? !templateData.equals(that.templateData) : that.templateData != null) return false;
        if (readFlag != null ? !readFlag.equals(that.readFlag) : that.readFlag != null) return false;
        if (templateCreateDate != null ? !templateCreateDate.equals(that.templateCreateDate) : that.templateCreateDate != null)
            return false;
        if (convertFlag != null ? !convertFlag.equals(that.convertFlag) : that.convertFlag != null) return false;
        if (imgWidth != null ? !imgWidth.equals(that.imgWidth) : that.imgWidth != null) return false;
        if (imgHeight != null ? !imgHeight.equals(that.imgHeight) : that.imgHeight != null) return false;
        if (imgQuality != null ? !imgQuality.equals(that.imgQuality) : that.imgQuality != null) return false;
        if (temMin != null ? !temMin.equals(that.temMin) : that.temMin != null) return false;
        if (imgDpi != null ? !imgDpi.equals(that.imgDpi) : that.imgDpi != null) return false;
        if (imgDepth != null ? !imgDepth.equals(that.imgDepth) : that.imgDepth != null) return false;
        if (algCode != null ? !algCode.equals(that.algCode) : that.algCode != null) return false;
        if (algVersion != null ? !algVersion.equals(that.algVersion) : that.algVersion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = templateId != null ? templateId.hashCode() : 0;
        result = 31 * result + (templateData != null ? templateData.hashCode() : 0);
        result = 31 * result + (readFlag != null ? readFlag.hashCode() : 0);
        result = 31 * result + (templateCreateDate != null ? templateCreateDate.hashCode() : 0);
        result = 31 * result + (convertFlag != null ? convertFlag.hashCode() : 0);
        result = 31 * result + (imgWidth != null ? imgWidth.hashCode() : 0);
        result = 31 * result + (imgHeight != null ? imgHeight.hashCode() : 0);
        result = 31 * result + (imgQuality != null ? imgQuality.hashCode() : 0);
        result = 31 * result + (temMin != null ? temMin.hashCode() : 0);
        result = 31 * result + (imgDpi != null ? imgDpi.hashCode() : 0);
        result = 31 * result + (imgDepth != null ? imgDepth.hashCode() : 0);
        result = 31 * result + (algCode != null ? algCode.hashCode() : 0);
        result = 31 * result + (algVersion != null ? algVersion.hashCode() : 0);
        return result;
    }
}
