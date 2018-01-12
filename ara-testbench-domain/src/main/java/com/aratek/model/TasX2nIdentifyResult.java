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
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAS_X2N_IDENTIFY_RESULT")
@SuppressWarnings("serial")
public class TasX2nIdentifyResult implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasX2nIdentifyResult";
	public static final String ALIAS_IDENTIFY_RESULT_ID = "identifyResultId";
	public static final String ALIAS_TASK_UUID = "taskUuid";
	public static final String ALIAS_RESULT_FLAG = "resultFlag";
	public static final String ALIAS_RESULT_CODE = "resultCode";
	public static final String ALIAS_RESULT_MSG = "resultMsg";
	public static final String ALIAS_CONTENT = "content";
	public static final String ALIAS_ACTION_STATU = "actionStatu";
	public static final String ALIAS_READ_STATU = "readStatu";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_POLICY_CODE = "policyCode";
	public static final String ALIAS_IDENTIFY_RESULT_UUID = "identifyResultUuid";
	public static final String ALIAS_TASK_ID = "taskId";
	public static final String ALIAS_RESULT_FLAGE = "resultFlage";


    /**
     * identifyResultUuid       db_column: IDENTIFY_RESULT_UUID
     */
    @Id
    @Column(name = "IDENTIFY_RESULT_UUID", unique = true, nullable = false, insertable = true, updatable = true, length = 20)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String identifyResultUuid;

    /**
     * identifyResultId       db_column: IDENTIFY_RESULT_ID
     */
    @Length(max=20)
    @Column(name = "IDENTIFY_RESULT_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String identifyResultId;

    /**
     * taskUuid       db_column: TASK_UUID
     */
    @NotBlank @Length(max=20)
    @Column(name = "TASK_UUID", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String taskUuid;

    /**
     * resultFlag       db_column: RESULT_FLAG
     */
    @Length(max=1)
    @Column(name = "RESULT_FLAG", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String resultFlag;

    /**
     * resultCode       db_column: RESULT_CODE
     */
    @Length(max=5)
    @Column(name = "RESULT_CODE", unique = false, nullable = true, insertable = true, updatable = true, length = 5)
    private String resultCode;

    /**
     * resultMsg       db_column: RESULT_MSG
     */
    @Length(max=100)
    @Column(name = "RESULT_MSG", unique = false, nullable = true, insertable = true, updatable = true, length = 100)
    private String resultMsg;

    /**
     * content       db_column: CONTENT
     */

    @Column(name = "CONTENT", unique = false, nullable = true, insertable = true, updatable = true, length = 4000)
    private java.sql.Clob content;

    /**
     * actionStatu       db_column: ACTION_STATU
     */
    @NotNull @Max(9223372036854775807L)
    @Column(name = "ACTION_STATU", unique = false, nullable = false, insertable = true, updatable = true, length = 38)
    private Long actionStatu;

    /**
     * readStatu       db_column: READ_STATU
     */
    @NotBlank @Length(max=1)
    @Column(name = "READ_STATU", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String readStatu;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;

    /**
     * policyCode       db_column: POLICY_CODE
     */
    @NotBlank @Length(max=4)
    @Column(name = "POLICY_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private String policyCode;

    /**
     * taskId       db_column: TASK_ID
     */
    @Length(max=30)
    @Column(name = "TASK_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String taskId;

    /**
     * resultFlage       db_column: RESULT_FLAGE
     */
    @Length(max=1)
    @Column(name = "RESULT_FLAGE", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String resultFlage;

	private Set tasX2nIdentifyDetails = new HashSet(0);
	public void setTasX2nIdentifyDetails(Set<TasX2nIdentifyDetail> tasX2nIdentifyDetail){
		this.tasX2nIdentifyDetails = tasX2nIdentifyDetail;
	}

	@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "tasX2nIdentifyResult")
	public Set<TasX2nIdentifyDetail> getTasX2nIdentifyDetails() {
		return tasX2nIdentifyDetails;
	}

	private TasTask tasTask;
	public void setTasTask(TasTask tasTask){
		this.tasTask = tasTask;
	}

	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "TASK_UUID",nullable = false, insertable = false, updatable = false)
	})
	public TasTask getTasTask() {
		return tasTask;
	}
}


