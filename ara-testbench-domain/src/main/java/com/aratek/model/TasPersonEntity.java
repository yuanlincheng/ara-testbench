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
    private Collection<Tas1To1VerifyResultEntity> tas1To1VerifyResultsByPersonId;
    private Collection<TasFpimageEntity> tasFpimagesByPersonId;
    private Collection<TasFpTemplateEntity> tasFpTemplatesByPersonId;
    private Collection<TasFpTpBufferEntity> tasFpTpBuffersByPersonId;
    private TasFpExchageFileEntity tasFpExchageFileByFpExchageFileId;

    @Id
    @Column(name = "PERSON_ID", nullable = false, length = 30)
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
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
    @Column(name = "PERSON_EID", nullable = false, length = 80)
    public String getPersonEid() {
        return personEid;
    }

    public void setPersonEid(String personEid) {
        this.personEid = personEid;
    }

    @Basic
    @Column(name = "FAMILY_NAME", nullable = true, length = 60)
    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    @Basic
    @Column(name = "MIDDLE_NAME", nullable = true, length = 60)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = true, length = 60)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "NATIONAL_NAME", nullable = true, length = 80)
    public String getNationalName() {
        return nationalName;
    }

    public void setNationalName(String nationalName) {
        this.nationalName = nationalName;
    }

    @Basic
    @Column(name = "CN_NAME", nullable = true, length = 30)
    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    @Basic
    @Column(name = "SEX", nullable = false, length = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "BIRTH_DATE", nullable = false, length = 30)
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "NATION_CODE", nullable = false, length = 30)
    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    @Basic
    @Column(name = "NATION_ID_NUM", nullable = true, length = 60)
    public String getNationIdNum() {
        return nationIdNum;
    }

    public void setNationIdNum(String nationIdNum) {
        this.nationIdNum = nationIdNum;
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
    @Column(name = "COLLECT_PLACE", nullable = true, length = 10)
    public String getCollectPlace() {
        return collectPlace;
    }

    public void setCollectPlace(String collectPlace) {
        this.collectPlace = collectPlace;
    }

    @Basic
    @Column(name = "COLLECT_PERSON", nullable = true, length = 30)
    public String getCollectPerson() {
        return collectPerson;
    }

    public void setCollectPerson(String collectPerson) {
        this.collectPerson = collectPerson;
    }

    @Basic
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
    @Column(name = "MODIFY_DATE", nullable = false, length = 20)
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

    @OneToMany(mappedBy = "tasPersonByPersonId")
    public Collection<Tas1To1VerifyResultEntity> getTas1To1VerifyResultsByPersonId() {
        return tas1To1VerifyResultsByPersonId;
    }

    public void setTas1To1VerifyResultsByPersonId(Collection<Tas1To1VerifyResultEntity> tas1To1VerifyResultsByPersonId) {
        this.tas1To1VerifyResultsByPersonId = tas1To1VerifyResultsByPersonId;
    }

    @OneToMany(mappedBy = "tasPersonByPersonId")
    public Collection<TasFpimageEntity> getTasFpimagesByPersonId() {
        return tasFpimagesByPersonId;
    }

    public void setTasFpimagesByPersonId(Collection<TasFpimageEntity> tasFpimagesByPersonId) {
        this.tasFpimagesByPersonId = tasFpimagesByPersonId;
    }

    @OneToMany(mappedBy = "tasPersonByPersonId")
    public Collection<TasFpTemplateEntity> getTasFpTemplatesByPersonId() {
        return tasFpTemplatesByPersonId;
    }

    public void setTasFpTemplatesByPersonId(Collection<TasFpTemplateEntity> tasFpTemplatesByPersonId) {
        this.tasFpTemplatesByPersonId = tasFpTemplatesByPersonId;
    }

    @OneToMany(mappedBy = "tasPersonByPersonId")
    public Collection<TasFpTpBufferEntity> getTasFpTpBuffersByPersonId() {
        return tasFpTpBuffersByPersonId;
    }

    public void setTasFpTpBuffersByPersonId(Collection<TasFpTpBufferEntity> tasFpTpBuffersByPersonId) {
        this.tasFpTpBuffersByPersonId = tasFpTpBuffersByPersonId;
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
