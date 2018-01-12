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
@Table(name = "TAS_LOG_SYSTEM")
@SuppressWarnings("serial")
public class TasLogSystem implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasLogSystem";
	public static final String ALIAS_LOG_SYSTEM_ID = "logSystemId";
	public static final String ALIAS_TYPE = "type";
	public static final String ALIAS_OPERATE = "operate";
	public static final String ALIAS_CONTENT = "content";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_CREATE_BY = "createBy";


    /**
     * logSystemId       db_column: LOG_SYSTEM_ID
     */
    @Id
    @Column(name = "LOG_SYSTEM_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="trustafis_seq")
    @SequenceGenerator(name="trustafis_seq", sequenceName="SEQ_TAS_LOG_SYSTEM")
    private Long logSystemId;

    /**
     * type       db_column: TYPE
     */
    @NotBlank @Length(max=15)
    @Column(name = "TYPE", unique = false, nullable = false, insertable = true, updatable = true, length = 15)
    private String type;

    /**
     * operate       db_column: OPERATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "OPERATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String operate;

    /**
     * content       db_column: CONTENT
     */
    @NotBlank @Length(max=500)
    @Column(name = "CONTENT", unique = false, nullable = false, insertable = true, updatable = true, length = 500)
    private String content;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;

    /**
     * createBy       db_column: CREATE_BY
     */
    @NotBlank @Length(max=30)
    @Column(name = "CREATE_BY", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String createBy;
}


