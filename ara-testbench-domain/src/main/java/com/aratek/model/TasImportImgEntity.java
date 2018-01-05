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
@Table(name = "TAS_IMPORT_IMG", schema = "TRUSTAFIS_U")
public class TasImportImgEntity {
    private String imgFingerIdPosition;
    private byte[] imgData;
    private String imgCreateDate;
    private String imgReadFlag;

    @Id
    @Column(name = "IMG_FINGER_ID_POSITION", nullable = false, length = 35)
    public String getImgFingerIdPosition() {
        return imgFingerIdPosition;
    }

    public void setImgFingerIdPosition(String imgFingerIdPosition) {
        this.imgFingerIdPosition = imgFingerIdPosition;
    }

    @Basic
    @Column(name = "IMG_DATA", nullable = true)
    public byte[] getImgData() {
        return imgData;
    }

    public void setImgData(byte[] imgData) {
        this.imgData = imgData;
    }

    @Basic
    @Column(name = "IMG_CREATE_DATE", nullable = false, length = 20)
    public String getImgCreateDate() {
        return imgCreateDate;
    }

    public void setImgCreateDate(String imgCreateDate) {
        this.imgCreateDate = imgCreateDate;
    }

    @Basic
    @Column(name = "IMG_READ_FLAG", nullable = false, length = 4)
    public String getImgReadFlag() {
        return imgReadFlag;
    }

    public void setImgReadFlag(String imgReadFlag) {
        this.imgReadFlag = imgReadFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasImportImgEntity that = (TasImportImgEntity) o;

        if (imgFingerIdPosition != null ? !imgFingerIdPosition.equals(that.imgFingerIdPosition) : that.imgFingerIdPosition != null)
            return false;
        if (!Arrays.equals(imgData, that.imgData)) return false;
        if (imgCreateDate != null ? !imgCreateDate.equals(that.imgCreateDate) : that.imgCreateDate != null)
            return false;
        if (imgReadFlag != null ? !imgReadFlag.equals(that.imgReadFlag) : that.imgReadFlag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = imgFingerIdPosition != null ? imgFingerIdPosition.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(imgData);
        result = 31 * result + (imgCreateDate != null ? imgCreateDate.hashCode() : 0);
        result = 31 * result + (imgReadFlag != null ? imgReadFlag.hashCode() : 0);
        return result;
    }
}
