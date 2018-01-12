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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAS_MON_ENV_STATISTIC")
@SuppressWarnings("serial")
public class TasMonEnvStatistic implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasMonEnvStatistic";
	public static final String ALIAS_MON_ENV_ID = "monEnvId";
	public static final String ALIAS_ENGINE_CLUSTER_CODE = "engineClusterCode";
	public static final String ALIAS_ENGINE_SERVER_CODE = "engineServerCode";
	public static final String ALIAS_ENGINE_SERVER_BIOMETRICS_MODEL = "engineServerBiometricsModel";
	public static final String ALIAS_ENGINE_SERVER_TYPE = "engineServerType";
	public static final String ALIAS_ENGINE_SERVER_IP = "engineServerIp";
	public static final String ALIAS_ENGINE_SERVER_MAC = "engineServerMac";
	public static final String ALIAS_ENGINE_SERVER_CPU = "engineServerCpu";
	public static final String ALIAS_ENGINE_SERVER_PORT = "engineServerPort";
	public static final String ALIAS_ENGINE_WORKSTATION_STATUS = "engineWorkstationStatus";
	public static final String ALIAS_ENGINE_WARN_FIELD = "engineWarnField";
	public static final String ALIAS_ENGINE_NETWORK_STATUS = "engineNetworkStatus";
	public static final String ALIAS_ENGINE_LODA_FINGER_NUMBER = "engineLodaFingerNumber";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_MODIFY_DATE = "modifyDate";
	public static final String ALIAS_ENGINE_RUNNING_TIME = "engineRunningTime";


    /**
     * monEnvId       db_column: MON_ENV_ID
     */
    @Id
    @Column(name = "MON_ENV_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="trustafis_seq")
    @SequenceGenerator(name="trustafis_seq", sequenceName="SEQ_TAS_MON_ENV_STATISTIC")
    private Long monEnvId;

    /**
     * engineClusterCode       db_column: ENGINE_CLUSTER_CODE
     */
    @NotBlank @Length(max=50)
    @Column(name = "ENGINE_CLUSTER_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String engineClusterCode;

    /**
     * engineServerCode       db_column: ENGINE_SERVER_CODE
     */
    @NotBlank @Length(max=50)
    @Column(name = "ENGINE_SERVER_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String engineServerCode;

    /**
     * engineServerBiometricsModel       db_column: ENGINE_SERVER_BIOMETRICS_MODEL
     */
    @NotBlank @Length(max=50)
    @Column(name = "ENGINE_SERVER_BIOMETRICS_MODEL", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String engineServerBiometricsModel;

    /**
     * engineServerType       db_column: ENGINE_SERVER_TYPE
     */
    @NotBlank @Length(max=1)
    @Column(name = "ENGINE_SERVER_TYPE", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String engineServerType;

    /**
     * engineServerIp       db_column: ENGINE_SERVER_IP
     */
    @NotBlank @Length(max=50)
    @Column(name = "ENGINE_SERVER_IP", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String engineServerIp;

    /**
     * engineServerMac       db_column: ENGINE_SERVER_MAC
     */
    @NotBlank @Length(max=50)
    @Column(name = "ENGINE_SERVER_MAC", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String engineServerMac;

    /**
     * engineServerCpu       db_column: ENGINE_SERVER_CPU
     */
    @Length(max=50)
    @Column(name = "ENGINE_SERVER_CPU", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String engineServerCpu;

    /**
     * engineServerPort       db_column: ENGINE_SERVER_PORT
     */
    @NotBlank @Length(max=50)
    @Column(name = "ENGINE_SERVER_PORT", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
    private String engineServerPort;

    /**
     * engineWorkstationStatus       db_column: ENGINE_WORKSTATION_STATUS
     */
    @NotBlank @Length(max=1)
    @Column(name = "ENGINE_WORKSTATION_STATUS", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String engineWorkstationStatus;

    /**
     * engineWarnField       db_column: ENGINE_WARN_FIELD
     */
    @Length(max=50)
    @Column(name = "ENGINE_WARN_FIELD", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String engineWarnField;

    /**
     * engineNetworkStatus       db_column: ENGINE_NETWORK_STATUS
     */
    @NotBlank @Length(max=1)
    @Column(name = "ENGINE_NETWORK_STATUS", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String engineNetworkStatus;

    /**
     * engineLodaFingerNumber       db_column: ENGINE_LODA_FINGER_NUMBER
     */
    @NotNull
    @Column(name = "ENGINE_LODA_FINGER_NUMBER", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private Long engineLodaFingerNumber;

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

    /**
     * engineRunningTime       db_column: ENGINE_RUNNING_TIME
     */
    @NotNull
    @Column(name = "ENGINE_RUNNING_TIME", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private Long engineRunningTime;
}


