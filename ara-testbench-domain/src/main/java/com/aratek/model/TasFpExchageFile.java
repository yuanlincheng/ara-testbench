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
@Table(name = "TAS_FP_EXCHAGE_FILE")
@SuppressWarnings("serial")
public class TasFpExchageFile implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasFpExchageFile";
	public static final String ALIAS_FP_EXCHAGE_FILE_ID = "fpExchageFileId";
	public static final String ALIAS_FP_DATASOURCE_CODE = "fpDatasourceCode";
	public static final String ALIAS_OPERATE_TYPE = "operateType";
	public static final String ALIAS_FILE_SAVE_URL = "fileSaveUrl";
	public static final String ALIAS_FILE_RESOLVE_RESULT = "fileResolveResult";
	public static final String ALIAS_FILE_RESOLVE_RES_MSG = "fileResolveResMsg";
	public static final String ALIAS_COLLECT_DATE = "collectDate";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_DATA_VERSION = "dataVersion";


    /**
     * fpExchageFileId       db_column: FP_EXCHAGE_FILE_ID
     */
    @Id
    @Column(name = "FP_EXCHAGE_FILE_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String fpExchageFileId;

    /**
     * fpDatasourceCode       db_column: FP_DATASOURCE_CODE
     */
    @NotBlank @Length(max=4)
    @Column(name = "FP_DATASOURCE_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private String fpDatasourceCode;

    /**
     * operateType       db_column: OPERATE_TYPE
     */
    @NotBlank @Length(max=1)
    @Column(name = "OPERATE_TYPE", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String operateType;

    /**
     * fileSaveUrl       db_column: FILE_SAVE_URL
     */
    @Length(max=255)
    @Column(name = "FILE_SAVE_URL", unique = false, nullable = true, insertable = true, updatable = true, length = 255)
    private String fileSaveUrl;

    /**
     * fileResolveResult       db_column: FILE_RESOLVE_RESULT
     */
    @Length(max=4)
    @Column(name = "FILE_RESOLVE_RESULT", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private String fileResolveResult;

    /**
     * fileResolveResMsg       db_column: FILE_RESOLVE_RES_MSG
     */
    @Length(max=250)
    @Column(name = "FILE_RESOLVE_RES_MSG", unique = false, nullable = true, insertable = true, updatable = true, length = 250)
    private String fileResolveResMsg;

    /**
     * collectDate       db_column: COLLECT_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "COLLECT_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String collectDate;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;

    /**
     * dataVersion       db_column: DATA_VERSION
     */
    @Length(max=4)
    @Column(name = "DATA_VERSION", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private String dataVersion;

	private Set tasFpimageDetails = new HashSet(0);
	public void setTasFpimageDetails(Set<TasFpimageDetail> tasFpimageDetail){
		this.tasFpimageDetails = tasFpimageDetail;
	}

	@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "tasFpExchageFile")
	public Set<TasFpimageDetail> getTasFpimageDetails() {
		return tasFpimageDetails;
	}

	private Set tasPersons = new HashSet(0);
	public void setTasPersons(Set<TasPerson> tasPerson){
		this.tasPersons = tasPerson;
	}

	@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "tasFpExchageFile")
	public Set<TasPerson> getTasPersons() {
		return tasPersons;
	}
}


