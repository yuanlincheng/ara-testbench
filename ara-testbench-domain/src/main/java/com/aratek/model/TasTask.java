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
@Table(name = "TAS_TASK")
@SuppressWarnings("serial")
public class TasTask implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasTask";
	public static final String ALIAS_TASK_ID = "taskId";
	public static final String ALIAS_FOREIN_REQUEST_ID = "foreinRequestId";
	public static final String ALIAS_TASK_COM_CODE = "taskComCode";
	public static final String ALIAS_TASK_COMMENT = "taskComment";
	public static final String ALIAS_TASK_RESULT = "taskResult";
	public static final String ALIAS_TASK_RET_CODE = "taskRetCode";
	public static final String ALIAS_TASK_STATE = "taskState";
	public static final String ALIAS_TASK_COMPLETE_DATE = "taskCompleteDate";
	public static final String ALIAS_TASK_RECEIVE_FLAG = "taskReceiveFlag";
	public static final String ALIAS_TASK_RECEIVE_DATE = "taskReceiveDate";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_TASK_UUID = "taskUuid";


    /**
     * taskUuid       db_column: TASK_UUID
     */
    @Id
    @Column(name = "TASK_UUID", unique = true, nullable = false, insertable = true, updatable = true, length = 20)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String taskUuid;

    /**
     * taskId       db_column: TASK_ID
     */
    @Length(max=30)
    @Column(name = "TASK_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String taskId;

    /**
     * foreinRequestId       db_column: FOREIN_REQUEST_ID
     */
    @Length(max=50)
    @Column(name = "FOREIN_REQUEST_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String foreinRequestId;

    /**
     * taskComCode       db_column: TASK_COM_CODE
     */
    @NotBlank @Length(max=4)
    @Column(name = "TASK_COM_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private String taskComCode;

    /**
     * taskComment       db_column: TASK_COMMENT
     */
    @NotNull
    @Column(name = "TASK_COMMENT", unique = false, nullable = false, insertable = true, updatable = true, length = 4000)
    private java.sql.Clob taskComment;

    /**
     * taskResult       db_column: TASK_RESULT
     */

    @Column(name = "TASK_RESULT", unique = false, nullable = true, insertable = true, updatable = true, length = 4000)
    private java.sql.Clob taskResult;

    /**
     * taskRetCode       db_column: TASK_RET_CODE
     */
    @Length(max=4)
    @Column(name = "TASK_RET_CODE", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private String taskRetCode;

    /**
     * taskState       db_column: TASK_STATE
     */
    @Length(max=1)
    @Column(name = "TASK_STATE", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String taskState;

    /**
     * taskCompleteDate       db_column: TASK_COMPLETE_DATE
     */
    @Length(max=20)
    @Column(name = "TASK_COMPLETE_DATE", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String taskCompleteDate;

    /**
     * taskReceiveFlag       db_column: TASK_RECEIVE_FLAG
     */
    @NotBlank @Length(max=1)
    @Column(name = "TASK_RECEIVE_FLAG", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String taskReceiveFlag;

    /**
     * taskReceiveDate       db_column: TASK_RECEIVE_DATE
     */
    @Length(max=20)
    @Column(name = "TASK_RECEIVE_DATE", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String taskReceiveDate;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;

	private Set tasDuplicateResults = new HashSet(0);
	public void setTasDuplicateResults(Set<TasDuplicateResult> tasDuplicateResult){
		this.tasDuplicateResults = tasDuplicateResult;
	}

	@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "tasTask")
	public Set<TasDuplicateResult> getTasDuplicateResults() {
		return tasDuplicateResults;
	}

	private Set tas1to1VerifyResults = new HashSet(0);
	public void setTas1to1VerifyResults(Set<Tas1to1VerifyResult> tas1to1VerifyResult){
		this.tas1to1VerifyResults = tas1to1VerifyResult;
	}

	@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "tasTask")
	public Set<Tas1to1VerifyResult> getTas1to1VerifyResults() {
		return tas1to1VerifyResults;
	}

	private Set tasX2nIdentifyResults = new HashSet(0);
	public void setTasX2nIdentifyResults(Set<TasX2nIdentifyResult> tasX2nIdentifyResult){
		this.tasX2nIdentifyResults = tasX2nIdentifyResult;
	}

	@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "tasTask")
	public Set<TasX2nIdentifyResult> getTasX2nIdentifyResults() {
		return tasX2nIdentifyResults;
	}
}


