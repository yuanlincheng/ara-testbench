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
@Table(name = "TAS_FPIMAGE_DETAIL")
@SuppressWarnings("serial")
public class TasFpimageDetail implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasFpimageDetail";
	public static final String ALIAS_FP_IMG_DETAIL_ID = "fpImgDetailId";
	public static final String ALIAS_FP_EXCHAGE_FILE_ID = "fpExchageFileId";
	public static final String ALIAS_IMAGE_WIDTH = "imageWidth";
	public static final String ALIAS_IMAGE_HEIGHT = "imageHeight";
	public static final String ALIAS_FP_DEVICE_CODE = "fpDeviceCode";
	public static final String ALIAS_DEVICE_SN = "deviceSn";
	public static final String ALIAS_TECHNICAL_FLAG = "technicalFlag";
	public static final String ALIAS_DEV_SUP_FLAG = "devSupFlag";
	public static final String ALIAS_DEV_TYPE_FLAG = "devTypeFlag";
	public static final String ALIAS_DEVICE_VERSION = "deviceVersion";
	public static final String ALIAS_ACQT_LEVEL = "acqtLevel";
	public static final String ALIAS_SCALE_UNITS = "scaleUnits";
	public static final String ALIAS_HORIZSCAN_RL = "horizscanRl";
	public static final String ALIAS_VERTSCAN_RL = "vertscanRl";
	public static final String ALIAS_MAX_IMAGE_WIDTH = "maxImageWidth";
	public static final String ALIAS_MAX_IMAGE_HEIGHT = "maxImageHeight";
	public static final String ALIAS_CERT_MARK = "certMark";
	public static final String ALIAS_CER_COUNT = "cerCount";
	public static final String ALIAS_CER_ORG = "cerOrg";
	public static final String ALIAS_HORIZIMAGE_RL = "horizimageRl";
	public static final String ALIAS_VERTIMAGE_RL = "vertimageRl";
	public static final String ALIAS_IMAGE_RL = "imageRl";
	public static final String ALIAS_PIXEL_DEPTH = "pixelDepth";
	public static final String ALIAS_IMPRINT_TYPE = "imprintType";
	public static final String ALIAS_COM_ALGORITHM = "comAlgorithm";
	public static final String ALIAS_COM_SUP_FLAG = "comSupFlag";
	public static final String ALIAS_COM_ALG_VERSION = "comAlgVersion";
	public static final String ALIAS_QUA_ALGORITHM = "quaAlgorithm";
	public static final String ALIAS_QUA_SUP_FLAG = "quaSupFlag";
	public static final String ALIAS_QUA_ALG_VERSION = "quaAlgVersion";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_COLLECT_PLACE = "collectPlace";
	public static final String ALIAS_COLLECT_TIME = "collectTime";
	public static final String ALIAS_COLLECT_PERSON = "collectPerson";


    /**
     * fpImgDetailId       db_column: FP_IMG_DETAIL_ID
     */
    @Id
    @Column(name = "FP_IMG_DETAIL_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="trustafis_seq")
    @SequenceGenerator(name="trustafis_seq", sequenceName="SEQ_TAS_FPIMAGE_DETAIL")
    private Long fpImgDetailId;

    /**
     * fpExchageFileId       db_column: FP_EXCHAGE_FILE_ID
     */
    @NotBlank @Length(max=50)
    @Column(name = "FP_EXCHAGE_FILE_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String fpExchageFileId;

    /**
     * imageWidth       db_column: IMAGE_WIDTH
     */
    @NotNull
    @Column(name = "IMAGE_WIDTH", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private Long imageWidth;

    /**
     * imageHeight       db_column: IMAGE_HEIGHT
     */
    @NotNull
    @Column(name = "IMAGE_HEIGHT", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private Long imageHeight;

    /**
     * fpDeviceCode       db_column: FP_DEVICE_CODE
     */
    @NotBlank @Length(max=4)
    @Column(name = "FP_DEVICE_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private String fpDeviceCode;

    /**
     * deviceSn       db_column: DEVICE_SN
     */
    @NotBlank @Length(max=20)
    @Column(name = "DEVICE_SN", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String deviceSn;

    /**
     * technicalFlag       db_column: TECHNICAL_FLAG
     */

    @Column(name = "TECHNICAL_FLAG", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long technicalFlag;

    /**
     * devSupFlag       db_column: DEV_SUP_FLAG
     */
    @Length(max=4)
    @Column(name = "DEV_SUP_FLAG", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private String devSupFlag;

    /**
     * devTypeFlag       db_column: DEV_TYPE_FLAG
     */
    @Length(max=4)
    @Column(name = "DEV_TYPE_FLAG", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private String devTypeFlag;

    /**
     * deviceVersion       db_column: DEVICE_VERSION
     */
    @Length(max=2)
    @Column(name = "DEVICE_VERSION", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String deviceVersion;

    /**
     * acqtLevel       db_column: ACQT_LEVEL
     */

    @Column(name = "ACQT_LEVEL", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long acqtLevel;

    /**
     * scaleUnits       db_column: SCALE_UNITS
     */

    @Column(name = "SCALE_UNITS", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long scaleUnits;

    /**
     * horizscanRl       db_column: HORIZSCAN_RL
     */

    @Column(name = "HORIZSCAN_RL", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long horizscanRl;

    /**
     * vertscanRl       db_column: VERTSCAN_RL
     */

    @Column(name = "VERTSCAN_RL", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long vertscanRl;

    /**
     * maxImageWidth       db_column: MAX_IMAGE_WIDTH
     */

    @Column(name = "MAX_IMAGE_WIDTH", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long maxImageWidth;

    /**
     * maxImageHeight       db_column: MAX_IMAGE_HEIGHT
     */

    @Column(name = "MAX_IMAGE_HEIGHT", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long maxImageHeight;

    /**
     * certMark       db_column: CERT_MARK
     */

    @Column(name = "CERT_MARK", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long certMark;

    /**
     * cerCount       db_column: CER_COUNT
     */

    @Column(name = "CER_COUNT", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long cerCount;

    /**
     * cerOrg       db_column: CER_ORG
     */
    @Length(max=4)
    @Column(name = "CER_ORG", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private String cerOrg;

    /**
     * horizimageRl       db_column: HORIZIMAGE_RL
     */

    @Column(name = "HORIZIMAGE_RL", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long horizimageRl;

    /**
     * vertimageRl       db_column: VERTIMAGE_RL
     */

    @Column(name = "VERTIMAGE_RL", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long vertimageRl;

    /**
     * imageRl       db_column: IMAGE_RL
     */
    @NotNull
    @Column(name = "IMAGE_RL", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private Long imageRl;

    /**
     * pixelDepth       db_column: PIXEL_DEPTH
     */
    @NotNull
    @Column(name = "PIXEL_DEPTH", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private Long pixelDepth;

    /**
     * imprintType       db_column: IMPRINT_TYPE
     */

    @Column(name = "IMPRINT_TYPE", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long imprintType;

    /**
     * comAlgorithm       db_column: COM_ALGORITHM
     */

    @Column(name = "COM_ALGORITHM", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long comAlgorithm;

    /**
     * comSupFlag       db_column: COM_SUP_FLAG
     */
    @Length(max=4)
    @Column(name = "COM_SUP_FLAG", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private String comSupFlag;

    /**
     * comAlgVersion       db_column: COM_ALG_VERSION
     */

    @Column(name = "COM_ALG_VERSION", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long comAlgVersion;

    /**
     * quaAlgorithm       db_column: QUA_ALGORITHM
     */
    @Length(max=4)
    @Column(name = "QUA_ALGORITHM", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private String quaAlgorithm;

    /**
     * quaSupFlag       db_column: QUA_SUP_FLAG
     */
    @Length(max=4)
    @Column(name = "QUA_SUP_FLAG", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
    private String quaSupFlag;

    /**
     * quaAlgVersion       db_column: QUA_ALG_VERSION
     */

    @Column(name = "QUA_ALG_VERSION", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long quaAlgVersion;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;

    /**
     * collectPlace       db_column: COLLECT_PLACE
     */
    @NotBlank @Length(max=10)
    @Column(name = "COLLECT_PLACE", unique = false, nullable = false, insertable = true, updatable = true, length = 10)
    private String collectPlace;

    /**
     * collectTime       db_column: COLLECT_TIME
     */
    @NotBlank @Length(max=20)
    @Column(name = "COLLECT_TIME", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String collectTime;

    /**
     * collectPerson       db_column: COLLECT_PERSON
     */
    @NotBlank @Length(max=30)
    @Column(name = "COLLECT_PERSON", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String collectPerson;

	private Set tasFpimages = new HashSet(0);
	public void setTasFpimages(Set<TasFpimage> tasFpimage){
		this.tasFpimages = tasFpimage;
	}

	@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "tasFpimageDetail")
	public Set<TasFpimage> getTasFpimages() {
		return tasFpimages;
	}

	private TasFpExchageFile tasFpExchageFile;
	public void setTasFpExchageFile(TasFpExchageFile tasFpExchageFile){
		this.tasFpExchageFile = tasFpExchageFile;
	}

	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "FP_EXCHAGE_FILE_ID",nullable = false, insertable = false, updatable = false)
	})
	public TasFpExchageFile getTasFpExchageFile() {
		return tasFpExchageFile;
	}
}


