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
@Table(name = "TAS_SYS_CODE", schema = "TRUSTAFIS_U")
public class TasSysCodeEntity {
    private long codeId;
    private String code;
    private String codeMean;
    private String type;
    private String typeMean;
    private String isbase;
    private String statu;
    private String note;
    private String createDate;

    @Id
    @Column(name = "CODE_ID")
    public long getCodeId() {
        return codeId;
    }

    public void setCodeId(long codeId) {
        this.codeId = codeId;
    }

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "CODE_MEAN")
    public String getCodeMean() {
        return codeMean;
    }

    public void setCodeMean(String codeMean) {
        this.codeMean = codeMean;
    }

    @Basic
    @Column(name = "TYPE")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "TYPE_MEAN")
    public String getTypeMean() {
        return typeMean;
    }

    public void setTypeMean(String typeMean) {
        this.typeMean = typeMean;
    }

    @Basic
    @Column(name = "ISBASE")
    public String getIsbase() {
        return isbase;
    }

    public void setIsbase(String isbase) {
        this.isbase = isbase;
    }

    @Basic
    @Column(name = "STATU")
    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    @Basic
    @Column(name = "NOTE")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

        TasSysCodeEntity that = (TasSysCodeEntity) o;

        if (codeId != that.codeId) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (codeMean != null ? !codeMean.equals(that.codeMean) : that.codeMean != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (typeMean != null ? !typeMean.equals(that.typeMean) : that.typeMean != null) return false;
        if (isbase != null ? !isbase.equals(that.isbase) : that.isbase != null) return false;
        if (statu != null ? !statu.equals(that.statu) : that.statu != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (codeId ^ (codeId >>> 32));
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (codeMean != null ? codeMean.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (typeMean != null ? typeMean.hashCode() : 0);
        result = 31 * result + (isbase != null ? isbase.hashCode() : 0);
        result = 31 * result + (statu != null ? statu.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
