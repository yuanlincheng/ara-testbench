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
@Table(name = "TAS_EXPORT_TEMPLATE")
@SuppressWarnings("serial")
public class TasExportTemplate implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasExportTemplate";
	public static final String ALIAS_TEMPLATE_ID = "templateId";
	public static final String ALIAS_TEMPLATE_DATA = "templateData";
	public static final String ALIAS_READ_FLAG = "readFlag";
	public static final String ALIAS_TEMPLATE_CREATE_DATE = "templateCreateDate";
	public static final String ALIAS_CONVERT_FLAG = "convertFlag";
	public static final String ALIAS_IMG_WIDTH = "imgWidth";
	public static final String ALIAS_IMG_HEIGHT = "imgHeight";
	public static final String ALIAS_IMG_QUALITY = "imgQuality";
	public static final String ALIAS_TEM_MIN = "temMin";
	public static final String ALIAS_IMG_DPI = "imgDpi";
	public static final String ALIAS_IMG_DEPTH = "imgDepth";
	public static final String ALIAS_ALG_CODE = "algCode";
	public static final String ALIAS_ALG_VERSION = "algVersion";


    /**
     * templateId       db_column: TEMPLATE_ID
     */
    @Id
    @Column(name = "TEMPLATE_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 35)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String templateId;

    /**
     * templateData       db_column: TEMPLATE_DATA
     */
    @Length(max=4000)
    @Column(name = "TEMPLATE_DATA", unique = false, nullable = true, insertable = true, updatable = true, length = 4000)
    private String templateData;

    /**
     * readFlag       db_column: READ_FLAG
     */
    @Length(max=2)
    @Column(name = "READ_FLAG", unique = false, nullable = true, insertable = true, updatable = true, length = 2)
    private String readFlag;

    /**
     * templateCreateDate       db_column: TEMPLATE_CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "TEMPLATE_CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String templateCreateDate;

    /**
     * convertFlag       db_column: CONVERT_FLAG
     */
    @NotBlank @Length(max=3)
    @Column(name = "CONVERT_FLAG", unique = false, nullable = false, insertable = true, updatable = true, length = 3)
    private String convertFlag;

    /**
     * imgWidth       db_column: IMG_WIDTH
     */
    
    @Column(name = "IMG_WIDTH", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long imgWidth;

    /**
     * imgHeight       db_column: IMG_HEIGHT
     */
    
    @Column(name = "IMG_HEIGHT", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long imgHeight;

    /**
     * imgQuality       db_column: IMG_QUALITY
     */
    
    @Column(name = "IMG_QUALITY", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long imgQuality;

    /**
     * temMin       db_column: TEM_MIN
     */
    
    @Column(name = "TEM_MIN", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long temMin;

    /**
     * imgDpi       db_column: IMG_DPI
     */
    
    @Column(name = "IMG_DPI", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long imgDpi;

    /**
     * imgDepth       db_column: IMG_DEPTH
     */
    
    @Column(name = "IMG_DEPTH", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long imgDepth;

    /**
     * algCode       db_column: ALG_CODE
     */
    @Length(max=10)
    @Column(name = "ALG_CODE", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
    private String algCode;

    /**
     * algVersion       db_column: ALG_VERSION
     */
    @Length(max=10)
    @Column(name = "ALG_VERSION", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
    private String algVersion;
}


