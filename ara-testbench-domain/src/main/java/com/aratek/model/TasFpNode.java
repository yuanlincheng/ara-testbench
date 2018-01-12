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

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAS_FP_NODE")
@SuppressWarnings("serial")
public class TasFpNode implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasFpNode";
	public static final String ALIAS_MASTER_ID = "masterId";
	public static final String ALIAS_NODE_ID = "nodeId";
	public static final String ALIAS_ENR_THREAD = "enrThread";
	public static final String ALIAS_VER_THREAD = "verThread";
	public static final String ALIAS_IDE_THREAD = "ideThread";
	public static final String ALIAS_DATA_ZONE = "dataZone";
	public static final String ALIAS_ONLINE_STAT = "onlineStat";
	public static final String ALIAS_ENR_CHOUR = "enrChour";
	public static final String ALIAS_ENR_CDAY = "enrCday";
	public static final String ALIAS_VER_CHOUR = "verChour";
	public static final String ALIAS_VER_CDAY = "verCday";
	public static final String ALIAS_IDE_CHOUR = "ideChour";
	public static final String ALIAS_IDE_CDAY = "ideCday";


    /**
     * embedded_id_column
     */
    @EmbeddedId
    private TasFpNodeId id;

    /**
     * enrThread       db_column: ENR_THREAD
     */
    @NotNull
    @Column(name = "ENR_THREAD", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private Long enrThread;

    /**
     * verThread       db_column: VER_THREAD
     */
    @NotNull
    @Column(name = "VER_THREAD", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private Long verThread;

    /**
     * ideThread       db_column: IDE_THREAD
     */
    @NotNull
    @Column(name = "IDE_THREAD", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private Long ideThread;

    /**
     * dataZone       db_column: DATA_ZONE
     */
    @NotBlank @Length(max=512)
    @Column(name = "DATA_ZONE", unique = false, nullable = false, insertable = true, updatable = true, length = 512)
    private String dataZone;

    /**
     * onlineStat       db_column: ONLINE_STAT
     */
    @NotBlank @Length(max=16)
    @Column(name = "ONLINE_STAT", unique = false, nullable = false, insertable = true, updatable = true, length = 16)
    private String onlineStat;

    /**
     * enrChour       db_column: ENR_C_HOUR
     */

    @Column(name = "ENR_C_HOUR", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long enrChour;

    /**
     * enrCday       db_column: ENR_C_DAY
     */

    @Column(name = "ENR_C_DAY", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long enrCday;

    /**
     * verChour       db_column: VER_C_HOUR
     */

    @Column(name = "VER_C_HOUR", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long verChour;

    /**
     * verCday       db_column: VER_C_DAY
     */

    @Column(name = "VER_C_DAY", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long verCday;

    /**
     * ideChour       db_column: IDE_C_HOUR
     */

    @Column(name = "IDE_C_HOUR", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long ideChour;

    /**
     * ideCday       db_column: IDE_C_DAY
     */

    @Column(name = "IDE_C_DAY", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long ideCday;
}


