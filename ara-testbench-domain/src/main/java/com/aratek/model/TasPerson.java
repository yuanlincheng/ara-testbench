/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAS_PERSON")
@SuppressWarnings("serial")
public class TasPerson implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasPerson";
	public static final String ALIAS_PERSON_ID = "personId";
	public static final String ALIAS_FP_EXCHAGE_FILE_ID = "fpExchageFileId";
	public static final String ALIAS_PERSON_EID = "personEid";
	public static final String ALIAS_FAMILY_NAME = "familyName";
	public static final String ALIAS_MIDDLE_NAME = "middleName";
	public static final String ALIAS_FIRST_NAME = "firstName";
	public static final String ALIAS_NATIONAL_NAME = "nationalName";
	public static final String ALIAS_CN_NAME = "cnName";
	public static final String ALIAS_SEX = "sex";
	public static final String ALIAS_BIRTH_DATE = "birthDate";
	public static final String ALIAS_NATION_CODE = "nationCode";
	public static final String ALIAS_NATION_ID_NUM = "nationIdNum";
	public static final String ALIAS_FP_DATASOURCE_CODE = "fpDatasourceCode";
	public static final String ALIAS_COLLECT_PLACE = "collectPlace";
	public static final String ALIAS_COLLECT_PERSON = "collectPerson";
	public static final String ALIAS_ACTIVE_STATU = "activeStatu";
	public static final String ALIAS_UPDATE_STATU = "updateStatu";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_MODIFY_DATE = "modifyDate";


    /**
     * personId       db_column: PERSON_ID
     */
    @Id
    @Column(name = "PERSON_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 30)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String personId;

    /**
     * fpExchageFileId       db_column: FP_EXCHAGE_FILE_ID
     */
    @NotBlank @Length(max=50)
    @Column(name = "FP_EXCHAGE_FILE_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String fpExchageFileId;

    /**
     * personEid       db_column: PERSON_EID
     */
    @NotBlank @Length(max=80)
    @Column(name = "PERSON_EID", unique = false, nullable = false, insertable = true, updatable = true, length = 80)
    private String personEid;

    /**
     * familyName       db_column: FAMILY_NAME
     */
    @Length(max=60)
    @Column(name = "FAMILY_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 60)
    private String familyName;

    /**
     * middleName       db_column: MIDDLE_NAME
     */
    @Length(max=60)
    @Column(name = "MIDDLE_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 60)
    private String middleName;

    /**
     * firstName       db_column: FIRST_NAME
     */
    @Length(max=60)
    @Column(name = "FIRST_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 60)
    private String firstName;

    /**
     * nationalName       db_column: NATIONAL_NAME
     */
    @Length(max=80)
    @Column(name = "NATIONAL_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 80)
    private String nationalName;

    /**
     * cnName       db_column: CN_NAME
     */
    @Length(max=30)
    @Column(name = "CN_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String cnName;

    /**
     * sex       db_column: SEX
     */
    @NotBlank @Length(max=2)
    @Column(name = "SEX", unique = false, nullable = false, insertable = true, updatable = true, length = 2)
    private String sex;

    /**
     * birthDate       db_column: BIRTH_DATE
     */
    @NotBlank @Length(max=30)
    @Column(name = "BIRTH_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String birthDate;

    /**
     * nationCode       db_column: NATION_CODE
     */
    @NotBlank @Length(max=30)
    @Column(name = "NATION_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String nationCode;

    /**
     * nationIdNum       db_column: NATION_ID_NUM
     */
    @Length(max=60)
    @Column(name = "NATION_ID_NUM", unique = false, nullable = true, insertable = true, updatable = true, length = 60)
    private String nationIdNum;

    /**
     * fpDatasourceCode       db_column: FP_DATASOURCE_CODE
     */
    @NotBlank @Length(max=4)
    @Column(name = "FP_DATASOURCE_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private String fpDatasourceCode;

    /**
     * collectPlace       db_column: COLLECT_PLACE
     */
    @Length(max=10)
    @Column(name = "COLLECT_PLACE", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
    private String collectPlace;

    /**
     * collectPerson       db_column: COLLECT_PERSON
     */
    @Length(max=30)
    @Column(name = "COLLECT_PERSON", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String collectPerson;

    /**
     * activeStatu       db_column: ACTIVE_STATU
     */
    @NotBlank @Length(max=1)
    @Column(name = "ACTIVE_STATU", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String activeStatu;

    /**
     * updateStatu       db_column: UPDATE_STATU
     */
    @NotBlank @Length(max=1)
    @Column(name = "UPDATE_STATU", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String updateStatu;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;

    /**
     * modifyDate       db_column: MODIFY_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "MODIFY_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String modifyDate;

	private Set tasFpimages = new HashSet(0);
	public void setTasFpimages(Set<TasFpimage> tasFpimage){
		this.tasFpimages = tasFpimage;
	}

	@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "tasPerson")
	public Set<TasFpimage> getTasFpimages() {
		return tasFpimages;
	}

	private Set tasFpTpBuffers = new HashSet(0);
	public void setTasFpTpBuffers(Set<TasFpTpBuffer> tasFpTpBuffer){
		this.tasFpTpBuffers = tasFpTpBuffer;
	}

	@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "tasPerson")
	public Set<TasFpTpBuffer> getTasFpTpBuffers() {
		return tasFpTpBuffers;
	}

	private Set tas1to1VerifyResults = new HashSet(0);
	public void setTas1to1VerifyResults(Set<Tas1to1VerifyResult> tas1to1VerifyResult){
		this.tas1to1VerifyResults = tas1to1VerifyResult;
	}

	@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "tasPerson")
	public Set<Tas1to1VerifyResult> getTas1to1VerifyResults() {
		return tas1to1VerifyResults;
	}

	private Set tasFpTemplates = new HashSet(0);
	public void setTasFpTemplates(Set<TasFpTemplate> tasFpTemplate){
		this.tasFpTemplates = tasFpTemplate;
	}

	@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "tasPerson")
	public Set<TasFpTemplate> getTasFpTemplates() {
		return tasFpTemplates;
	}

	private TasFpExchageFile tasFpExchageFile;
	public void setTasFpExchageFile(TasFpExchageFile tasFpExchageFile){
		this.tasFpExchageFile = tasFpExchageFile;
	}

	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "FP_EXCHAGE_FILE_ID",nullable = false, insertable = false, updatable = false)
	})
	public TasFpExchageFile getTasFpExchageFile() {
		return tasFpExchageFile;
	}
}


