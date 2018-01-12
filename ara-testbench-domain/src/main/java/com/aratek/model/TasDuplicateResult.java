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
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAS_DUPLICATE_RESULT")
@SuppressWarnings("serial")
public class TasDuplicateResult implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasDuplicateResult";
	public static final String ALIAS_DUPLICATE_RESULT_ID = "duplicateResultId";
	public static final String ALIAS_TASK_UUID = "taskUuid";
	public static final String ALIAS_REQUEST_FP_ID = "requestFpId";
	public static final String ALIAS_PERSON_ID = "personId";
	public static final String ALIAS_DUPLICATE_PERSON_COUNT = "duplicatePersonCount";
	public static final String ALIAS_POLICY_CODE = "policyCode";
	public static final String ALIAS_RESULT_CODE = "resultCode";
	public static final String ALIAS_RESULT_MSG = "resultMsg";
	public static final String ALIAS_ACTION_STATU = "actionStatu";
	public static final String ALIAS_CONTENT = "content";
	public static final String ALIAS_READ_STATU = "readStatu";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_DUPLICATE_RESULT_UUID = "duplicateResultUuid";
	public static final String ALIAS_TASK_ID = "taskId";


    /**
     * duplicateResultUuid       db_column: DUPLICATE_RESULT_UUID
     */
    @Id
    @Column(name = "DUPLICATE_RESULT_UUID", unique = true, nullable = false, insertable = true, updatable = true, length = 20)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String duplicateResultUuid;

    /**
     * duplicateResultId       db_column: DUPLICATE_RESULT_ID
     */
    @Length(max=20)
    @Column(name = "DUPLICATE_RESULT_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String duplicateResultId;

    /**
     * taskUuid       db_column: TASK_UUID
     */
    @NotBlank @Length(max=20)
    @Column(name = "TASK_UUID", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String taskUuid;

    /**
     * requestFpId       db_column: REQUEST_FP_ID
     */
    @Length(max=50)
    @Column(name = "REQUEST_FP_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String requestFpId;

    /**
     * personId       db_column: PERSON_ID
     */
    @Length(max=30)
    @Column(name = "PERSON_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String personId;

    /**
     * duplicatePersonCount       db_column: DUPLICATE_PERSON_COUNT
     */

    @Column(name = "DUPLICATE_PERSON_COUNT", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long duplicatePersonCount;

    /**
     * policyCode       db_column: POLICY_CODE
     */
    @Length(max=4)
    @Column(name = "POLICY_CODE", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private String policyCode;

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
    @NotNull
    @Column(name = "ACTION_STATU", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private Long actionStatu;

    /**
     * content       db_column: CONTENT
     */

    @Column(name = "CONTENT", unique = false, nullable = true, insertable = true, updatable = true, length = 4000)
    private java.sql.Clob content;

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

	private Set tasDuplicateDetails = new HashSet(0);
	public void setTasDuplicateDetails(Set<TasDuplicateDetail> tasDuplicateDetail){
		this.tasDuplicateDetails = tasDuplicateDetail;
	}

	@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "tasDuplicateResult")
	public Set<TasDuplicateDetail> getTasDuplicateDetails() {
		return tasDuplicateDetails;
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


