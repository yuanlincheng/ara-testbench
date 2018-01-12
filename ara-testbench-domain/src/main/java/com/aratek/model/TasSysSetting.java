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
@Table(name = "TAS_SYS_SETTING")
@SuppressWarnings("serial")
public class TasSysSetting implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasSysSetting";
	public static final String ALIAS_SETTING_ID = "settingId";
	public static final String ALIAS_APP_ID = "appId";
	public static final String ALIAS_MAIN_KEY = "mainKey";
	public static final String ALIAS_SUB_KEY = "subKey";
	public static final String ALIAS_VALUE = "value";
	public static final String ALIAS_MODEFY_STATUS = "modefyStatus";
	public static final String ALIAS_SHOW_STATUS = "showStatus";
	public static final String ALIAS_PARANAME = "paraname";
	public static final String ALIAS_NOTE = "note";


    /**
     * settingId       db_column: SETTING_ID
     */
    @Id
    @Column(name = "SETTING_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="trustafis_seq")
    @SequenceGenerator(name="trustafis_seq", sequenceName="SEQ_TAS_SYS_SETTING")
    private Long settingId;

    /**
     * appId       db_column: APP_ID
     */
    @NotBlank @Length(max=30)
    @Column(name = "APP_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String appId;

    /**
     * mainKey       db_column: MAIN_KEY
     */
    @Length(max=50)
    @Column(name = "MAIN_KEY", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String mainKey;

    /**
     * subKey       db_column: SUB_KEY
     */
    @NotBlank @Length(max=50)
    @Column(name = "SUB_KEY", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String subKey;

    /**
     * value       db_column: VALUE
     */
    @NotBlank @Length(max=100)
    @Column(name = "VALUE", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
    private String value;

    /**
     * modefyStatus       db_column: MODEFY_STATUS
     */
    @NotBlank @Length(max=1)
    @Column(name = "MODEFY_STATUS", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String modefyStatus;

    /**
     * showStatus       db_column: SHOW_STATUS
     */
    @NotBlank @Length(max=1)
    @Column(name = "SHOW_STATUS", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String showStatus;

    /**
     * paraname       db_column: PARANAME
     */
    @NotBlank @Length(max=100)
    @Column(name = "PARANAME", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
    private String paraname;

    /**
     * note       db_column: NOTE
     */
    @Length(max=250)
    @Column(name = "NOTE", unique = false, nullable = true, insertable = true, updatable = true, length = 250)
    private String note;
}


