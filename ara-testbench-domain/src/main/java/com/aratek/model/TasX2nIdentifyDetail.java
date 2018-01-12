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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAS_X2N_IDENTIFY_DETAIL")
@SuppressWarnings("serial")
public class TasX2nIdentifyDetail implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasX2nIdentifyDetail";
	public static final String ALIAS_IDENTIFY_RESULT_UUID = "identifyResultUuid";
	public static final String ALIAS_IDENTIFY_DETAIL_ID = "identifyDetailId";
	public static final String ALIAS_RESPONSE_FP_ID = "responseFpId";
	public static final String ALIAS_RESPONSE_TOP_NUMBER = "responseTopNumber";
	public static final String ALIAS_RESULT_TOTAL_SCORE = "resultTotalScore";
	public static final String ALIAS_LEFT_THUMB_VER_SCORE = "leftThumbVerScore";
	public static final String ALIAS_LEFT_INDEX_VER_SCORE = "leftIndexVerScore";
	public static final String ALIAS_LEFT_MIDDLE_VER_SCORE = "leftMiddleVerScore";
	public static final String ALIAS_LEFT_RING_VER_SCORE = "leftRingVerScore";
	public static final String ALIAS_LEFT_LITTLE_VER_SCORE = "leftLittleVerScore";
	public static final String ALIAS_RIGHT_THUMB_VER_SCORE = "rightThumbVerScore";
	public static final String ALIAS_RIGHT_INDEX_VER_SCORE = "rightIndexVerScore";
	public static final String ALIAS_RIGHT_MIDDLE_VER_SCORE = "rightMiddleVerScore";
	public static final String ALIAS_RIGHT_RING_VER_SCORE = "rightRingVerScore";
	public static final String ALIAS_RIGHT_LITTLE_VER_SCORE = "rightLittleVerScore";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_POLICY_CODE = "policyCode";
	public static final String ALIAS_IDENTIFY_RESULT_ID = "identifyResultId";


    /**
     * identifyDetailId       db_column: IDENTIFY_DETAIL_ID
     */
    @Id
    @Column(name = "IDENTIFY_DETAIL_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="trustafis_seq")
    @SequenceGenerator(name="trustafis_seq", sequenceName="SEQ_TAS_X2N_IDENTIFY_DETAIL")
    private Long identifyDetailId;

    /**
     * identifyResultUuid       db_column: IDENTIFY_RESULT_UUID
     */
    @NotBlank @Length(max=20)
    @Column(name = "IDENTIFY_RESULT_UUID", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String identifyResultUuid;

    /**
     * responseFpId       db_column: RESPONSE_FP_ID
     */
    @NotBlank @Length(max=50)
    @Column(name = "RESPONSE_FP_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String responseFpId;

    /**
     * responseTopNumber       db_column: RESPONSE_TOP_NUMBER
     */
    @NotNull @Max(9223372036854775807L)
    @Column(name = "RESPONSE_TOP_NUMBER", unique = false, nullable = false, insertable = true, updatable = true, length = 38)
    private Long responseTopNumber;

    /**
     * resultTotalScore       db_column: RESULT_TOTAL_SCORE
     */
    @Max(9999999L)
    @Column(name = "RESULT_TOTAL_SCORE", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private Long resultTotalScore;

    /**
     * leftThumbVerScore       db_column: LEFT_THUMB_VER_SCORE
     */
    @Max(9999999L)
    @Column(name = "LEFT_THUMB_VER_SCORE", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private Long leftThumbVerScore;

    /**
     * leftIndexVerScore       db_column: LEFT_INDEX_VER_SCORE
     */
    @Max(9999999L)
    @Column(name = "LEFT_INDEX_VER_SCORE", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private Long leftIndexVerScore;

    /**
     * leftMiddleVerScore       db_column: LEFT_MIDDLE_VER_SCORE
     */
    @Max(9999999L)
    @Column(name = "LEFT_MIDDLE_VER_SCORE", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private Long leftMiddleVerScore;

    /**
     * leftRingVerScore       db_column: LEFT_RING_VER_SCORE
     */
    @Max(9999999L)
    @Column(name = "LEFT_RING_VER_SCORE", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private Long leftRingVerScore;

    /**
     * leftLittleVerScore       db_column: LEFT_LITTLE_VER_SCORE
     */
    @Max(9999999L)
    @Column(name = "LEFT_LITTLE_VER_SCORE", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private Long leftLittleVerScore;

    /**
     * rightThumbVerScore       db_column: RIGHT_THUMB_VER_SCORE
     */
    @Max(9999999L)
    @Column(name = "RIGHT_THUMB_VER_SCORE", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private Long rightThumbVerScore;

    /**
     * rightIndexVerScore       db_column: RIGHT_INDEX_VER_SCORE
     */
    @Max(9999999L)
    @Column(name = "RIGHT_INDEX_VER_SCORE", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private Long rightIndexVerScore;

    /**
     * rightMiddleVerScore       db_column: RIGHT_MIDDLE_VER_SCORE
     */
    @Max(9999999L)
    @Column(name = "RIGHT_MIDDLE_VER_SCORE", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private Long rightMiddleVerScore;

    /**
     * rightRingVerScore       db_column: RIGHT_RING_VER_SCORE
     */
    @Max(9999999L)
    @Column(name = "RIGHT_RING_VER_SCORE", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private Long rightRingVerScore;

    /**
     * rightLittleVerScore       db_column: RIGHT_LITTLE_VER_SCORE
     */
    @Max(9999999L)
    @Column(name = "RIGHT_LITTLE_VER_SCORE", unique = false, nullable = true, insertable = true, updatable = true, length = 7)
    private Long rightLittleVerScore;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;

    /**
     * policyCode       db_column: POLICY_CODE
     */
    @Length(max=4)
    @Column(name = "POLICY_CODE", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private String policyCode;

    /**
     * identifyResultId       db_column: IDENTIFY_RESULT_ID
     */
    @Length(max=20)
    @Column(name = "IDENTIFY_RESULT_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String identifyResultId;

	private TasX2nIdentifyResult tasX2nIdentifyResult;
	public void setTasX2nIdentifyResult(TasX2nIdentifyResult tasX2nIdentifyResult){
		this.tasX2nIdentifyResult = tasX2nIdentifyResult;
	}

	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "IDENTIFY_RESULT_UUID",nullable = false, insertable = false, updatable = false)
	})
	public TasX2nIdentifyResult getTasX2nIdentifyResult() {
		return tasX2nIdentifyResult;
	}
}


