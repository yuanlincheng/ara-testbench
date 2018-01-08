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
@Table(name = "TAS_FP_EXCHAGE_FILE", schema = "TRUSTAFIS_U")
public class TasFpExchageFileEntity {
    private String fpExchageFileId;
    private String fpDatasourceCode;
    private String operateType;
    private String fileSaveUrl;
    private String fileResolveResult;
    private String fileResolveResMsg;
    private String collectDate;
    private String createDate;
    private String dataVersion;

    @Id
    @Column(name = "FP_EXCHAGE_FILE_ID")
    public String getFpExchageFileId() {
        return fpExchageFileId;
    }

    public void setFpExchageFileId(String fpExchageFileId) {
        this.fpExchageFileId = fpExchageFileId;
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
    @Column(name = "OPERATE_TYPE")
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    @Basic
    @Column(name = "FILE_SAVE_URL")
    public String getFileSaveUrl() {
        return fileSaveUrl;
    }

    public void setFileSaveUrl(String fileSaveUrl) {
        this.fileSaveUrl = fileSaveUrl;
    }

    @Basic
    @Column(name = "FILE_RESOLVE_RESULT")
    public String getFileResolveResult() {
        return fileResolveResult;
    }

    public void setFileResolveResult(String fileResolveResult) {
        this.fileResolveResult = fileResolveResult;
    }

    @Basic
    @Column(name = "FILE_RESOLVE_RES_MSG")
    public String getFileResolveResMsg() {
        return fileResolveResMsg;
    }

    public void setFileResolveResMsg(String fileResolveResMsg) {
        this.fileResolveResMsg = fileResolveResMsg;
    }

    @Basic
    @Column(name = "COLLECT_DATE")
    public String getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(String collectDate) {
        this.collectDate = collectDate;
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
    @Column(name = "DATA_VERSION")
    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasFpExchageFileEntity that = (TasFpExchageFileEntity) o;

        if (fpExchageFileId != null ? !fpExchageFileId.equals(that.fpExchageFileId) : that.fpExchageFileId != null)
            return false;
        if (fpDatasourceCode != null ? !fpDatasourceCode.equals(that.fpDatasourceCode) : that.fpDatasourceCode != null)
            return false;
        if (operateType != null ? !operateType.equals(that.operateType) : that.operateType != null) return false;
        if (fileSaveUrl != null ? !fileSaveUrl.equals(that.fileSaveUrl) : that.fileSaveUrl != null) return false;
        if (fileResolveResult != null ? !fileResolveResult.equals(that.fileResolveResult) : that.fileResolveResult != null)
            return false;
        if (fileResolveResMsg != null ? !fileResolveResMsg.equals(that.fileResolveResMsg) : that.fileResolveResMsg != null)
            return false;
        if (collectDate != null ? !collectDate.equals(that.collectDate) : that.collectDate != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (dataVersion != null ? !dataVersion.equals(that.dataVersion) : that.dataVersion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fpExchageFileId != null ? fpExchageFileId.hashCode() : 0;
        result = 31 * result + (fpDatasourceCode != null ? fpDatasourceCode.hashCode() : 0);
        result = 31 * result + (operateType != null ? operateType.hashCode() : 0);
        result = 31 * result + (fileSaveUrl != null ? fileSaveUrl.hashCode() : 0);
        result = 31 * result + (fileResolveResult != null ? fileResolveResult.hashCode() : 0);
        result = 31 * result + (fileResolveResMsg != null ? fileResolveResMsg.hashCode() : 0);
        result = 31 * result + (collectDate != null ? collectDate.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (dataVersion != null ? dataVersion.hashCode() : 0);
        return result;
    }
}
