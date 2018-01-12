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
@Table(name = "TAS_MON_SERVICE_STATISTIC")
@SuppressWarnings("serial")
public class TasMonServiceStatistic implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasMonServiceStatistic";
	public static final String ALIAS_MON_SERVICE_ID = "monServiceId";
	public static final String ALIAS_ENGINE_CLUSTER_CODE = "engineClusterCode";
	public static final String ALIAS_ENGINE_SERVER_CODE = "engineServerCode";
	public static final String ALIAS_SERVICE_KEY = "serviceKey";
	public static final String ALIAS_TOTAL_VALUE = "totalValue";
	public static final String ALIAS_CREATE_DATE = "createDate";


    /**
     * monServiceId       db_column: MON_SERVICE_ID
     */
    @Id
    @Column(name = "MON_SERVICE_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="trustafis_seq")
    @SequenceGenerator(name="trustafis_seq", sequenceName="SEQ_TAS_MON_SERVICE_STATISTIC")
    private Long monServiceId;

    /**
     * engineClusterCode       db_column: ENGINE_CLUSTER_CODE
     */
    @NotBlank @Length(max=50)
    @Column(name = "ENGINE_CLUSTER_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String engineClusterCode;

    /**
     * engineServerCode       db_column: ENGINE_SERVER_CODE
     */
    @NotBlank @Length(max=20)
    @Column(name = "ENGINE_SERVER_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String engineServerCode;

    /**
     * serviceKey       db_column: SERVICE_KEY
     */
    @NotBlank @Length(max=80)
    @Column(name = "SERVICE_KEY", unique = false, nullable = false, insertable = true, updatable = true, length = 80)
    private String serviceKey;

    /**
     * totalValue       db_column: TOTAL_VALUE
     */
    @NotBlank @Length(max=250)
    @Column(name = "TOTAL_VALUE", unique = false, nullable = false, insertable = true, updatable = true, length = 250)
    private String totalValue;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;
}


