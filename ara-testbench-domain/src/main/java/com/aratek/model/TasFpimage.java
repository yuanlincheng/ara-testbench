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
@Table(name = "TAS_FPIMAGE")
@SuppressWarnings("serial")
public class TasFpimage implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasFpimage";
	public static final String ALIAS_FP_IMAGE_ID = "fpImageId";
	public static final String ALIAS_PERSON_ID = "personId";
	public static final String ALIAS_FP_IMG_DETAIL_ID = "fpImgDetailId";
	public static final String ALIAS_FP_IMAGE_FILE_NAME = "fpImageFileName";
	public static final String ALIAS_FP_DATASOURCE_CODE = "fpDatasourceCode";
	public static final String ALIAS_FP_INDEX_CODE = "fpIndexCode";
	public static final String ALIAS_QUALITY_LEVEL = "qualityLevel";
	public static final String ALIAS_QUALITY_SCORE = "qualityScore";
	public static final String ALIAS_IMAGE_FORMAT_CODE = "imageFormatCode";
	public static final String ALIAS_IMAGE_DATA = "imageData";
	public static final String ALIAS_COL_STATU_CODE = "colStatuCode";
	public static final String ALIAS_FP_DEVICE_CODE = "fpDeviceCode";
	public static final String ALIAS_FP_DEVICE_SN = "fpDeviceSn";
	public static final String ALIAS_COLLECT_PLACE = "collectPlace";
	public static final String ALIAS_COLLECT_PERSON = "collectPerson";
	public static final String ALIAS_COLLECT_TIME = "collectTime";
	public static final String ALIAS_CREATE_DATE = "createDate";


    /**
     * fpImageId       db_column: FP_IMAGE_ID
     */
    @Id
    @Column(name = "FP_IMAGE_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="trustafis_seq")
    @SequenceGenerator(name="trustafis_seq", sequenceName="SEQ_TAS_FPIMAGE")
    private Long fpImageId;

    /**
     * personId       db_column: PERSON_ID
     */
    @NotBlank @Length(max=30)
    @Column(name = "PERSON_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String personId;

    /**
     * fpImgDetailId       db_column: FP_IMG_DETAIL_ID
     */
    @NotNull
    @Column(name = "FP_IMG_DETAIL_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private Long fpImgDetailId;

    /**
     * fpImageFileName       db_column: FP_IMAGE_FILE_NAME
     */
    @Length(max=80)
    @Column(name = "FP_IMAGE_FILE_NAME", unique = false, nullable = true, insertable = true, updatable = true, length = 80)
    private String fpImageFileName;

    /**
     * fpDatasourceCode       db_column: FP_DATASOURCE_CODE
     */
    @NotBlank @Length(max=4)
    @Column(name = "FP_DATASOURCE_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private String fpDatasourceCode;

    /**
     * fpIndexCode       db_column: FP_INDEX_CODE
     */
    @NotBlank @Length(max=2)
    @Column(name = "FP_INDEX_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 2)
    private String fpIndexCode;

    /**
     * qualityLevel       db_column: QUALITY_LEVEL
     */
    @NotNull @Max(9223372036854775807L)
    @Column(name = "QUALITY_LEVEL", unique = false, nullable = false, insertable = true, updatable = true, length = 38)
    private Long qualityLevel;

    /**
     * qualityScore       db_column: QUALITY_SCORE
     */
    @NotNull @Max(9223372036854775807L)
    @Column(name = "QUALITY_SCORE", unique = false, nullable = false, insertable = true, updatable = true, length = 38)
    private Long qualityScore;

    /**
     * imageFormatCode       db_column: IMAGE_FORMAT_CODE
     */
    @Length(max=2)
    @Column(name = "IMAGE_FORMAT_CODE", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String imageFormatCode;

    /**
     * imageData       db_column: IMAGE_DATA
     */

    @Column(name = "IMAGE_DATA", unique = false, nullable = true, insertable = true, updatable = true, length = 4000)
    private byte[] imageData;

    /**
     * colStatuCode       db_column: COL_STATU_CODE
     */
    @NotNull @Max(9223372036854775807L)
    @Column(name = "COL_STATU_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 38)
    private Long colStatuCode;

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
     * collectPlace       db_column: COLLECT_PLACE
     */
    @Length(max=10)
    @Column(name = "COLLECT_PLACE", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
    private String collectPlace;

    /**
     * collectPerson       db_column: COLLECT_PERSON
     */
    @Length(max=30)
    @Column(name = "COLLECT_PERSON", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String collectPerson;

    /**
     * collectTime       db_column: COLLECT_TIME
     */
    @Length(max=20)
    @Column(name = "COLLECT_TIME", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String collectTime;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;

	private TasFpimageDetail tasFpimageDetail;
	public void setTasFpimageDetail(TasFpimageDetail tasFpimageDetail){
		this.tasFpimageDetail = tasFpimageDetail;
	}

	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "FP_IMG_DETAIL_ID",nullable = false, insertable = false, updatable = false)
	})
	public TasFpimageDetail getTasFpimageDetail() {
		return tasFpimageDetail;
	}

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


