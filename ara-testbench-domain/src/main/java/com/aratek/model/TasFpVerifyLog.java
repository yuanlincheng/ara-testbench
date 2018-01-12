/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.model;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import lombok.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAS_FP_VERIFY_LOG")
@SuppressWarnings("serial")
public class TasFpVerifyLog implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasFpVerifyLog";
	public static final String ALIAS_LOG_VERIFY_LOG_ID = "logVerifyLogId";
	public static final String ALIAS_TOP_NUMBER = "topNumber";
	public static final String ALIAS_POLICY_CODE = "policyCode";
	public static final String ALIAS_OPT_TYPE = "optType";
	public static final String ALIAS_RETURN_CODE = "returnCode";
	public static final String ALIAS_SELF_FLAG = "selfFlag";
	public static final String ALIAS_START_TIME = "startTime";
	public static final String ALIAS_SPEND_TIME = "spendTime";
	public static final String ALIAS_FILTER_TIME = "filterTime";
	public static final String ALIAS_FILTER_PERCENT = "filterPercent";
	public static final String ALIAS_PERSON_ID_REQUEST = "personIdRequest";
	public static final String ALIAS_PERSON_ID_FOUND = "personIdFound";
	public static final String ALIAS_FILTER_THRESHOLD = "filterThreshold";
	public static final String ALIAS_MATCHING_THRESHOLD = "matchingThreshold";
	public static final String ALIAS_MATCHING_CNT = "matchingCnt";
	public static final String ALIAS_FILTER_SCORE0 = "filterScore0";
	public static final String ALIAS_MATCHING_SCORE0 = "matchingScore0";
	public static final String ALIAS_FILTER_SCORE1 = "filterScore1";
	public static final String ALIAS_MATCHING_SCORE1 = "matchingScore1";
	public static final String ALIAS_FILTER_SCORE2 = "filterScore2";
	public static final String ALIAS_MATCHING_SCORE2 = "matchingScore2";
	public static final String ALIAS_FILTER_SCORE3 = "filterScore3";
	public static final String ALIAS_MATCHING_SCORE3 = "matchingScore3";
	public static final String ALIAS_FILTER_SCORE4 = "filterScore4";
	public static final String ALIAS_MATCHING_SCORE4 = "matchingScore4";
	public static final String ALIAS_FILTER_SCORE5 = "filterScore5";
	public static final String ALIAS_MATCHING_SCORE5 = "matchingScore5";
	public static final String ALIAS_FILTER_SCORE6 = "filterScore6";
	public static final String ALIAS_MATCHING_SCORE6 = "matchingScore6";
	public static final String ALIAS_FILTER_SCORE7 = "filterScore7";
	public static final String ALIAS_MATCHING_SCORE7 = "matchingScore7";
	public static final String ALIAS_FILTER_SCORE8 = "filterScore8";
	public static final String ALIAS_MATCHING_SCORE8 = "matchingScore8";
	public static final String ALIAS_FILTER_SCORE9 = "filterScore9";
	public static final String ALIAS_MATCHING_SCORE9 = "matchingScore9";
	public static final String ALIAS_FILTER_SCORE10 = "filterScore10";
	public static final String ALIAS_MATCHING_SCORE10 = "matchingScore10";


    /**
     * embedded_id_column
     */
    @EmbeddedId
    private TasFpVerifyLogId id;

    /**
     * optType       db_column: OPT_TYPE
     */
    @NotBlank @Length(max=20)
    @Column(name = "OPT_TYPE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String optType;

    /**
     * returnCode       db_column: RETURN_CODE
     */
    @NotBlank @Length(max=20)
    @Column(name = "RETURN_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String returnCode;

    /**
     * selfFlag       db_column: SELF_FLAG
     */
    @Length(max=1)
    @Column(name = "SELF_FLAG", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
    private String selfFlag;

    /**
     * startTime       db_column: START_TIME
     */
    @NotBlank @Length(max=20)
    @Column(name = "START_TIME", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String startTime;

    /**
     * spendTime       db_column: SPEND_TIME
     */
    
    @Column(name = "SPEND_TIME", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long spendTime;

    /**
     * filterTime       db_column: FILTER_TIME
     */
    
    @Column(name = "FILTER_TIME", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long filterTime;

    /**
     * filterPercent       db_column: FILTER_PERCENT
     */
    
    @Column(name = "FILTER_PERCENT", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long filterPercent;

    /**
     * personIdRequest       db_column: PERSON_ID_REQUEST
     */
    @Length(max=30)
    @Column(name = "PERSON_ID_REQUEST", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String personIdRequest;

    /**
     * personIdFound       db_column: PERSON_ID_FOUND
     */
    @Length(max=300)
    @Column(name = "PERSON_ID_FOUND", unique = false, nullable = true, insertable = true, updatable = true, length = 300)
    private String personIdFound;

    /**
     * filterThreshold       db_column: FILTER_THRESHOLD
     */
    @Length(max=30)
    @Column(name = "FILTER_THRESHOLD", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String filterThreshold;

    /**
     * matchingThreshold       db_column: MATCHING_THRESHOLD
     */
    @Length(max=30)
    @Column(name = "MATCHING_THRESHOLD", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String matchingThreshold;

    /**
     * matchingCnt       db_column: MATCHING_CNT
     */
    @Length(max=10)
    @Column(name = "MATCHING_CNT", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
    private String matchingCnt;

    /**
     * filterScore0       db_column: FILTER_SCORE0
     */
    
    @Column(name = "FILTER_SCORE0", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long filterScore0;

    /**
     * matchingScore0       db_column: MATCHING_SCORE0
     */
    
    @Column(name = "MATCHING_SCORE0", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long matchingScore0;

    /**
     * filterScore1       db_column: FILTER_SCORE1
     */
    
    @Column(name = "FILTER_SCORE1", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long filterScore1;

    /**
     * matchingScore1       db_column: MATCHING_SCORE1
     */
    
    @Column(name = "MATCHING_SCORE1", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long matchingScore1;

    /**
     * filterScore2       db_column: FILTER_SCORE2
     */
    
    @Column(name = "FILTER_SCORE2", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long filterScore2;

    /**
     * matchingScore2       db_column: MATCHING_SCORE2
     */
    
    @Column(name = "MATCHING_SCORE2", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long matchingScore2;

    /**
     * filterScore3       db_column: FILTER_SCORE3
     */
    
    @Column(name = "FILTER_SCORE3", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long filterScore3;

    /**
     * matchingScore3       db_column: MATCHING_SCORE3
     */
    
    @Column(name = "MATCHING_SCORE3", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long matchingScore3;

    /**
     * filterScore4       db_column: FILTER_SCORE4
     */
    
    @Column(name = "FILTER_SCORE4", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long filterScore4;

    /**
     * matchingScore4       db_column: MATCHING_SCORE4
     */
    
    @Column(name = "MATCHING_SCORE4", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long matchingScore4;

    /**
     * filterScore5       db_column: FILTER_SCORE5
     */
    
    @Column(name = "FILTER_SCORE5", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long filterScore5;

    /**
     * matchingScore5       db_column: MATCHING_SCORE5
     */
    
    @Column(name = "MATCHING_SCORE5", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long matchingScore5;

    /**
     * filterScore6       db_column: FILTER_SCORE6
     */
    
    @Column(name = "FILTER_SCORE6", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long filterScore6;

    /**
     * matchingScore6       db_column: MATCHING_SCORE6
     */
    
    @Column(name = "MATCHING_SCORE6", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long matchingScore6;

    /**
     * filterScore7       db_column: FILTER_SCORE7
     */
    
    @Column(name = "FILTER_SCORE7", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long filterScore7;

    /**
     * matchingScore7       db_column: MATCHING_SCORE7
     */
    
    @Column(name = "MATCHING_SCORE7", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long matchingScore7;

    /**
     * filterScore8       db_column: FILTER_SCORE8
     */
    
    @Column(name = "FILTER_SCORE8", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long filterScore8;

    /**
     * matchingScore8       db_column: MATCHING_SCORE8
     */
    
    @Column(name = "MATCHING_SCORE8", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long matchingScore8;

    /**
     * filterScore9       db_column: FILTER_SCORE9
     */
    
    @Column(name = "FILTER_SCORE9", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long filterScore9;

    /**
     * matchingScore9       db_column: MATCHING_SCORE9
     */
    
    @Column(name = "MATCHING_SCORE9", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long matchingScore9;

    /**
     * filterScore10       db_column: FILTER_SCORE10
     */
    
    @Column(name = "FILTER_SCORE10", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long filterScore10;

    /**
     * matchingScore10       db_column: MATCHING_SCORE10
     */
    
    @Column(name = "MATCHING_SCORE10", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long matchingScore10;
}


