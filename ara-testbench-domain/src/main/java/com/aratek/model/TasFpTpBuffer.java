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
@Table(name = "TAS_FP_TP_BUFFER")
@SuppressWarnings("serial")
public class TasFpTpBuffer implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasFpTpBuffer";
	public static final String ALIAS_PERSON_ID = "personId";
	public static final String ALIAS_FP_INDEX_CODE = "fpIndexCode";
	public static final String ALIAS_FP_TEMPLATE_NO = "fpTemplateNo";
	public static final String ALIAS_FP_DATASOURCE_CODE = "fpDatasourceCode";
	public static final String ALIAS_FP_EXCHANGE_FILE_ID = "fpExchangeFileId";
	public static final String ALIAS_SERIAL_NUMBER = "serialNumber";
	public static final String ALIAS_TEMPLATE = "template";
	public static final String ALIAS_TEMPLATE_B = "templateB";
	public static final String ALIAS_EXT_INFO = "extInfo";
	public static final String ALIAS_FP_CATEGOTY = "fpCategoty";
	public static final String ALIAS_SINGULAR_POINT_NUM = "singularPointNum";
	public static final String ALIAS_TEMPLATE_POINT_NUM = "templatePointNum";
	public static final String ALIAS_QUALITY_SCORE = "qualityScore";
	public static final String ALIAS_ALG_CODE = "algCode";
	public static final String ALIAS_ALG_VERSION = "algVersion";
	public static final String ALIAS_FP_BLOCK_INDEX = "fpBlockIndex";
	public static final String ALIAS_COL_STATU_CODE = "colStatuCode";
	public static final String ALIAS_FP_DEVICE_CODE = "fpDeviceCode";
	public static final String ALIAS_FP_DEVICE_SN = "fpDeviceSn";
	public static final String ALIAS_ACTIVE_STATU = "activeStatu";
	public static final String ALIAS_UPDATE_STATU = "updateStatu";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_MODIFY_DATE = "modifyDate";


    /**
     * embedded_id_column
     */
    @EmbeddedId
    private TasFpTpBufferId id;

    /**
     * fpDatasourceCode       db_column: FP_DATASOURCE_CODE
     */
    @NotBlank @Length(max=4)
    @Column(name = "FP_DATASOURCE_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private String fpDatasourceCode;

    /**
     * fpExchangeFileId       db_column: FP_EXCHANGE_FILE_ID
     */
    @Length(max=50)
    @Column(name = "FP_EXCHANGE_FILE_ID", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String fpExchangeFileId;

    /**
     * serialNumber       db_column: SERIAL_NUMBER
     */
    @Max(9223372036854775807L)
    @Column(name = "SERIAL_NUMBER", unique = false, nullable = true, insertable = true, updatable = true, length = 38)
    private Long serialNumber;

    /**
     * template       db_column: TEMPLATE
     */
    @Length(max=4000)
    @Column(name = "TEMPLATE", unique = false, nullable = true, insertable = true, updatable = true, length = 4000)
    private String template;

    /**
     * templateB       db_column: TEMPLATE_B
     */
    
    @Column(name = "TEMPLATE_B", unique = false, nullable = true, insertable = true, updatable = true, length = 4000)
    private byte[] templateB;

    /**
     * extInfo       db_column: EXT_INFO
     */
    @Length(max=2000)
    @Column(name = "EXT_INFO", unique = false, nullable = true, insertable = true, updatable = true, length = 2000)
    private String extInfo;

    /**
     * fpCategoty       db_column: FP_CATEGOTY
     */
    @Length(max=30)
    @Column(name = "FP_CATEGOTY", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String fpCategoty;

    /**
     * singularPointNum       db_column: SINGULAR_POINT_NUM
     */
    @Max(9223372036854775807L)
    @Column(name = "SINGULAR_POINT_NUM", unique = false, nullable = true, insertable = true, updatable = true, length = 38)
    private Long singularPointNum;

    /**
     * templatePointNum       db_column: TEMPLATE_POINT_NUM
     */
    @Max(9223372036854775807L)
    @Column(name = "TEMPLATE_POINT_NUM", unique = false, nullable = true, insertable = true, updatable = true, length = 38)
    private Long templatePointNum;

    /**
     * qualityScore       db_column: QUALITY_SCORE
     */
    @NotNull 
    @Column(name = "QUALITY_SCORE", unique = false, nullable = false, insertable = true, updatable = true, length = 126)
    private java.lang.Double qualityScore;

    /**
     * algCode       db_column: ALG_CODE
     */
    @NotBlank @Length(max=10)
    @Column(name = "ALG_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 10)
    private String algCode;

    /**
     * algVersion       db_column: ALG_VERSION
     */
    @NotBlank @Length(max=10)
    @Column(name = "ALG_VERSION", unique = false, nullable = false, insertable = true, updatable = true, length = 10)
    private String algVersion;

    /**
     * fpBlockIndex       db_column: FP_BLOCK_INDEX
     */
    @NotNull 
    @Column(name = "FP_BLOCK_INDEX", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private Long fpBlockIndex;

    /**
     * colStatuCode       db_column: COL_STATU_CODE
     */
    @NotBlank @Length(max=1)
    @Column(name = "COL_STATU_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String colStatuCode;

    /**
     * fpDeviceCode       db_column: FP_DEVICE_CODE
     */
    @Length(max=4)
    @Column(name = "FP_DEVICE_CODE", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private String fpDeviceCode;

    /**
     * fpDeviceSn       db_column: FP_DEVICE_SN
     */
    @Length(max=20)
    @Column(name = "FP_DEVICE_SN", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String fpDeviceSn;

    /**
     * updateStatu       db_column: UPDATE_STATU
     */
    @NotBlank @Length(max=1)
    @Column(name = "UPDATE_STATU", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String updateStatu;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;

    /**
     * modifyDate       db_column: MODIFY_DATE
     */
    @Length(max=20)
    @Column(name = "MODIFY_DATE", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String modifyDate;

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


