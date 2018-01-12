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
@Table(name = "TAS_IMPORT_IMG")
@SuppressWarnings("serial")
public class TasImportImg implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasImportImg";
	public static final String ALIAS_IMG_FINGER_ID_POSITION = "imgFingerIdPosition";
	public static final String ALIAS_IMG_DATA = "imgData";
	public static final String ALIAS_IMG_CREATE_DATE = "imgCreateDate";
	public static final String ALIAS_IMG_READ_FLAG = "imgReadFlag";


    /**
     * imgFingerIdPosition       db_column: IMG_FINGER_ID_POSITION
     */
    @Id
    @Column(name = "IMG_FINGER_ID_POSITION", unique = true, nullable = false, insertable = true, updatable = true, length = 35)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String imgFingerIdPosition;

    /**
     * imgData       db_column: IMG_DATA
     */

    @Column(name = "IMG_DATA", unique = false, nullable = true, insertable = true, updatable = true, length = 4000)
    private byte[] imgData;

    /**
     * imgCreateDate       db_column: IMG_CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "IMG_CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String imgCreateDate;

    /**
     * imgReadFlag       db_column: IMG_READ_FLAG
     */
    @NotBlank @Length(max=4)
    @Column(name = "IMG_READ_FLAG", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
    private String imgReadFlag;
}


