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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAS_1TO1_VERIFY_RESULT")
@SuppressWarnings("serial")
public class Tas1to1VerifyResult implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "Tas1to1VerifyResult";
	public static final String ALIAS_PERSON_ID = "personId";
	public static final String ALIAS_TASK_UUID = "taskUuid";
	public static final String ALIAS_VERIFY_RESULT_ID = "verifyResultId";
	public static final String ALIAS_VERIFY_TYPE = "verifyType";
	public static final String ALIAS_VERIFY_SOURCE_DATA = "verifySourceData";
	public static final String ALIAS_VERIFIED_FP_COUNT = "verifiedFpCount";
	public static final String ALIAS_VERIFY_RESULT = "verifyResult";
	public static final String ALIAS_VERIFIED_RANK1_FP_INDEX = "verifiedRank1FpIndex";
	public static final String ALIAS_VERIFIED_RANK1_FP_SOURCE = "verifiedRank1FpSource";
	public static final String ALIAS_MATCHING_THRESHOLD = "matchingThreshold";
	public static final String ALIAS_VERIFY_SUCCESS_FLAG = "verifySuccessFlag";
	public static final String ALIAS_RESULT_CODE = "resultCode";
	public static final String ALIAS_RESULT_MSG = "resultMsg";
	public static final String ALIAS_ACTION_STATU = "actionStatu";
	public static final String ALIAS_READ_STATU = "readStatu";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_TASK_ID = "taskId";
	public static final String ALIAS_VERIFY_RESULT_UUID = "verifyResultUuid";


    /**
     * verifyResultUuid       db_column: VERIFY_RESULT_UUID
     */
    @Id
    @Column(name = "VERIFY_RESULT_UUID", unique = true, nullable = false, insertable = true, updatable = true, length = 20)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String verifyResultUuid;

    /**
     * personId       db_column: PERSON_ID
     */
    @NotBlank @Length(max=30)
    @Column(name = "PERSON_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String personId;

    /**
     * taskUuid       db_column: TASK_UUID
     */
    @NotBlank @Length(max=20)
    @Column(name = "TASK_UUID", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String taskUuid;

    /**
     * verifyResultId       db_column: VERIFY_RESULT_ID
     */
    @Length(max=20)
    @Column(name = "VERIFY_RESULT_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String verifyResultId;

    /**
     * verifyType       db_column: VERIFY_TYPE
     */
    @NotBlank @Length(max=2)
    @Column(name = "VERIFY_TYPE", unique = false, nullable = false, insertable = true, updatable = true, length = 2)
    private String verifyType;

    /**
     * verifySourceData       db_column: VERIFY_SOURCE_DATA
     */

    @Column(name = "VERIFY_SOURCE_DATA", unique = false, nullable = true, insertable = true, updatable = true, length = 4000)
    private java.sql.Clob verifySourceData;

    /**
     * verifiedFpCount       db_column: VERIFIED_FP_COUNT
     */

    @Column(name = "VERIFIED_FP_COUNT", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long verifiedFpCount;

    /**
     * verifyResult       db_column: VERIFY_RESULT
     */
    @NotBlank @Length(max=200)
    @Column(name = "VERIFY_RESULT", unique = false, nullable = false, insertable = true, updatable = true, length = 200)
    private String verifyResult;

    /**
     * verifiedRank1FpIndex       db_column: VERIFIED_RANK1_FP_INDEX
     */
    @Length(max=30)
    @Column(name = "VERIFIED_RANK1_FP_INDEX", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String verifiedRank1FpIndex;

    /**
     * verifiedRank1FpSource       db_column: VERIFIED_RANK1_FP_SOURCE
     */
    @Length(max=30)
    @Column(name = "VERIFIED_RANK1_FP_SOURCE", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String verifiedRank1FpSource;

    /**
     * matchingThreshold       db_column: MATCHING_THRESHOLD
     */
    @NotBlank @Length(max=30)
    @Column(name = "MATCHING_THRESHOLD", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String matchingThreshold;

    /**
     * verifySuccessFlag       db_column: VERIFY_SUCCESS_FLAG
     */
    @Length(max=1)
    @Column(name = "VERIFY_SUCCESS_FLAG", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String verifySuccessFlag;

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
     * actionStatu       db_column: ACTION_STATU
     */
    @NotBlank @Length(max=1)
    @Column(name = "ACTION_STATU", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String actionStatu;

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
     * taskId       db_column: TASK_ID
     */
    @Length(max=30)
    @Column(name = "TASK_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String taskId;

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

	private TasPerson tasPerson;
	public void setTasPerson(TasPerson tasPerson){
		this.tasPerson = tasPerson;
	}

	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "PERSON_ID",nullable = false, insertable = false, updatable = false)
	})
	public TasPerson getTasPerson() {
		return tasPerson;
	}
}


