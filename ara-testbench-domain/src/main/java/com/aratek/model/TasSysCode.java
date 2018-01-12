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
@Table(name = "TAS_SYS_CODE")
@SuppressWarnings("serial")
public class TasSysCode implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasSysCode";
	public static final String ALIAS_CODE_ID = "codeId";
	public static final String ALIAS_CODE = "code";
	public static final String ALIAS_CODE_MEAN = "codeMean";
	public static final String ALIAS_TYPE = "type";
	public static final String ALIAS_TYPE_MEAN = "typeMean";
	public static final String ALIAS_ISBASE = "isbase";
	public static final String ALIAS_STATU = "statu";
	public static final String ALIAS_NOTE = "note";
	public static final String ALIAS_CREATE_DATE = "createDate";


    /**
     * codeId       db_column: CODE_ID
     */
    @Id
    @Column(name = "CODE_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="trustafis_seq")
    @SequenceGenerator(name="trustafis_seq", sequenceName="SEQ_TAS_SYS_CODE")
    private Long codeId;

    /**
     * code       db_column: CODE
     */
    @NotBlank @Length(max=50)
    @Column(name = "CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String code;

    /**
     * codeMean       db_column: CODE_MEAN
     */
    @NotBlank @Length(max=50)
    @Column(name = "CODE_MEAN", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String codeMean;

    /**
     * type       db_column: TYPE
     */
    @NotBlank @Length(max=11)
    @Column(name = "TYPE", unique = false, nullable = false, insertable = true, updatable = true, length = 11)
    private String type;

    /**
     * typeMean       db_column: TYPE_MEAN
     */
    @NotBlank @Length(max=50)
    @Column(name = "TYPE_MEAN", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String typeMean;

    /**
     * isbase       db_column: ISBASE
     */
    @NotBlank @Length(max=1)
    @Column(name = "ISBASE", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String isbase;

    /**
     * statu       db_column: STATU
     */
    @NotBlank @Length(max=1)
    @Column(name = "STATU", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String statu;

    /**
     * note       db_column: NOTE
     */
    @Length(max=250)
    @Column(name = "NOTE", unique = false, nullable = true, insertable = true, updatable = true, length = 250)
    private String note;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;
}


