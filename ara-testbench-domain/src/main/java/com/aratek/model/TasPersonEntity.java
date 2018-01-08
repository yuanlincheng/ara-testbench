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
@Table(name = "TAS_PERSON", schema = "TRUSTAFIS_U")
public class TasPersonEntity {
    private String personId;
    private String fpExchageFileId;
    private String personEid;
    private String familyName;
    private String middleName;
    private String firstName;
    private String nationalName;
    private String cnName;
    private String sex;
    private String birthDate;
    private String nationCode;
    private String nationIdNum;
    private String fpDatasourceCode;
    private String collectPlace;
    private String collectPerson;
    private String activeStatu;
    private String updateStatu;
    private String createDate;
    private String modifyDate;

    @Id
    @Column(name = "PERSON_ID")
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "FP_EXCHAGE_FILE_ID")
    public String getFpExchageFileId() {
        return fpExchageFileId;
    }

    public void setFpExchageFileId(String fpExchageFileId) {
        this.fpExchageFileId = fpExchageFileId;
    }

    @Basic
    @Column(name = "PERSON_EID")
    public String getPersonEid() {
        return personEid;
    }

    public void setPersonEid(String personEid) {
        this.personEid = personEid;
    }

    @Basic
    @Column(name = "FAMILY_NAME")
    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Basic
    @Column(name = "MIDDLE_NAME")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "FIRST_NAME")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "NATIONAL_NAME")
    public String getNationalName() {
        return nationalName;
    }

    public void setNationalName(String nationalName) {
        this.nationalName = nationalName;
    }

    @Basic
    @Column(name = "CN_NAME")
    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    @Basic
    @Column(name = "SEX")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "BIRTH_DATE")
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "NATION_CODE")
    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    @Basic
    @Column(name = "NATION_ID_NUM")
    public String getNationIdNum() {
        return nationIdNum;
    }

    public void setNationIdNum(String nationIdNum) {
        this.nationIdNum = nationIdNum;
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
    @Column(name = "ACTIVE_STATU")
    public String getActiveStatu() {
        return activeStatu;
    }

    public void setActiveStatu(String activeStatu) {
        this.activeStatu = activeStatu;
    }

    @Basic
    @Column(name = "UPDATE_STATU")
    public String getUpdateStatu() {
        return updateStatu;
    }

    public void setUpdateStatu(String updateStatu) {
        this.updateStatu = updateStatu;
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
    @Column(name = "MODIFY_DATE")
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

        TasPersonEntity that = (TasPersonEntity) o;

        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (fpExchageFileId != null ? !fpExchageFileId.equals(that.fpExchageFileId) : that.fpExchageFileId != null)
            return false;
        if (personEid != null ? !personEid.equals(that.personEid) : that.personEid != null) return false;
        if (familyName != null ? !familyName.equals(that.familyName) : that.familyName != null) return false;
        if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (nationalName != null ? !nationalName.equals(that.nationalName) : that.nationalName != null) return false;
        if (cnName != null ? !cnName.equals(that.cnName) : that.cnName != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (nationCode != null ? !nationCode.equals(that.nationCode) : that.nationCode != null) return false;
        if (nationIdNum != null ? !nationIdNum.equals(that.nationIdNum) : that.nationIdNum != null) return false;
        if (fpDatasourceCode != null ? !fpDatasourceCode.equals(that.fpDatasourceCode) : that.fpDatasourceCode != null)
            return false;
        if (collectPlace != null ? !collectPlace.equals(that.collectPlace) : that.collectPlace != null) return false;
        if (collectPerson != null ? !collectPerson.equals(that.collectPerson) : that.collectPerson != null)
            return false;
        if (activeStatu != null ? !activeStatu.equals(that.activeStatu) : that.activeStatu != null) return false;
        if (updateStatu != null ? !updateStatu.equals(that.updateStatu) : that.updateStatu != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personId != null ? personId.hashCode() : 0;
        result = 31 * result + (fpExchageFileId != null ? fpExchageFileId.hashCode() : 0);
        result = 31 * result + (personEid != null ? personEid.hashCode() : 0);
        result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (nationalName != null ? nationalName.hashCode() : 0);
        result = 31 * result + (cnName != null ? cnName.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (nationCode != null ? nationCode.hashCode() : 0);
        result = 31 * result + (nationIdNum != null ? nationIdNum.hashCode() : 0);
        result = 31 * result + (fpDatasourceCode != null ? fpDatasourceCode.hashCode() : 0);
        result = 31 * result + (collectPlace != null ? collectPlace.hashCode() : 0);
        result = 31 * result + (collectPerson != null ? collectPerson.hashCode() : 0);
        result = 31 * result + (activeStatu != null ? activeStatu.hashCode() : 0);
        result = 31 * result + (updateStatu != null ? updateStatu.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        return result;
    }
}
