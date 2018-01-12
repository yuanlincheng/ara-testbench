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
@Table(name = "TAS_LOG_BUSINESS")
@SuppressWarnings("serial")
public class TasLogBusiness implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasLogBusiness";
	public static final String ALIAS_LOG_BUS_ID = "logBusId";
	public static final String ALIAS_ACTION_TYPE = "actionType";
	public static final String ALIAS_RESULT_FLAG = "resultFlag";
	public static final String ALIAS_RESULT_CODE = "resultCode";
	public static final String ALIAS_CONTENT = "content";
	public static final String ALIAS_RESULT_ID = "resultId";
	public static final String ALIAS_CLIENT_IP = "clientIp";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_RESULT_MSG = "resultMsg";


    /**
     * logBusId       db_column: LOG_BUS_ID
     */
    @Id
    @Column(name = "LOG_BUS_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="trustafis_seq")
    @SequenceGenerator(name="trustafis_seq", sequenceName="SEQ_TAS_LOG_BUSINESS")
    private Long logBusId;

    /**
     * actionType       db_column: ACTION_TYPE
     */
    @NotBlank @Length(max=2)
    @Column(name = "ACTION_TYPE", unique = false, nullable = false, insertable = true, updatable = true, length = 2)
    private String actionType;

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
     * content       db_column: CONTENT
     */
    @Length(max=500)
    @Column(name = "CONTENT", unique = false, nullable = true, insertable = true, updatable = true, length = 500)
    private String content;

    /**
     * resultId       db_column: RESULT_ID
     */
    @Length(max=50)
    @Column(name = "RESULT_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String resultId;

    /**
     * clientIp       db_column: CLIENT_IP
     */
    @Length(max=20)
    @Column(name = "CLIENT_IP", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String clientIp;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;

    /**
     * resultMsg       db_column: RESULT_MSG
     */
    @Length(max=100)
    @Column(name = "RESULT_MSG", unique = false, nullable = true, insertable = true, updatable = true, length = 100)
    private String resultMsg;
}


