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
@Table(name = "TAS_SYS_PAGE")
@SuppressWarnings("serial")
public class TasSysPage implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasSysPage";
	public static final String ALIAS_PAGE_ID = "pageId";
	public static final String ALIAS_CODE = "code";
	public static final String ALIAS_PCODE = "pcode";
	public static final String ALIAS_NAME = "name";
	public static final String ALIAS_OPEN = "open";
	public static final String ALIAS_URL = "url";
	public static final String ALIAS_STATU = "statu";
	public static final String ALIAS_NOTE = "note";


    /**
     * pageId       db_column: PAGE_ID
     */
    @Id
    @Column(name = "PAGE_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="trustafis_seq")
    @SequenceGenerator(name="trustafis_seq", sequenceName="SEQ_TAS_SYS_PAGE")
    private Long pageId;

    /**
     * code       db_column: CODE
     */
    @NotBlank @Length(max=30)
    @Column(name = "CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String code;

    /**
     * pcode       db_column: PCODE
     */
    @NotBlank @Length(max=30)
    @Column(name = "PCODE", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String pcode;

    /**
     * name       db_column: NAME
     */
    @NotBlank @Length(max=30)
    @Column(name = "NAME", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String name;

    /**
     * open       db_column: OPEN
     */
    @NotBlank @Length(max=10)
    @Column(name = "OPEN", unique = false, nullable = false, insertable = true, updatable = true, length = 10)
    private String open;

    /**
     * url       db_column: URL
     */
    @NotBlank @Length(max=100)
    @Column(name = "URL", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
    private String url;

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
}


