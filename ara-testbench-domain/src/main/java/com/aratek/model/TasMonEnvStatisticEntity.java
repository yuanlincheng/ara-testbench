package com.aratek.model;

import javax.persistence.*;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/6 0:08
 * @description: xxx
 * own: Aratek
 */
@Entity
@Table(name = "TAS_MON_ENV_STATISTIC", schema = "TRUSTAFIS_U")
public class TasMonEnvStatisticEntity {
    private long monEnvId;
    private String engineClusterCode;
    private String engineServerCode;
    private String engineServerBiometricsModel;
    private String engineServerType;
    private String engineServerIp;
    private String engineServerMac;
    private String engineServerCpu;
    private String engineServerPort;
    private String engineWorkstationStatus;
    private String engineWarnField;
    private String engineNetworkStatus;
    private long engineLodaFingerNumber;
    private String createDate;
    private String modifyDate;
    private long engineRunningTime;

    @Id
    @Column(name = "MON_ENV_ID", nullable = false, precision = 0)
    public long getMonEnvId() {
        return monEnvId;
    }

    public void setMonEnvId(long monEnvId) {
        this.monEnvId = monEnvId;
    }

    @Basic
    @Column(name = "ENGINE_CLUSTER_CODE", nullable = false, length = 50)
    public String getEngineClusterCode() {
        return engineClusterCode;
    }

    public void setEngineClusterCode(String engineClusterCode) {
        this.engineClusterCode = engineClusterCode;
    }

    @Basic
    @Column(name = "ENGINE_SERVER_CODE", nullable = false, length = 50)
    public String getEngineServerCode() {
        return engineServerCode;
    }

    public void setEngineServerCode(String engineServerCode) {
        this.engineServerCode = engineServerCode;
    }

    @Basic
    @Column(name = "ENGINE_SERVER_BIOMETRICS_MODEL", nullable = false, length = 50)
    public String getEngineServerBiometricsModel() {
        return engineServerBiometricsModel;
    }

    public void setEngineServerBiometricsModel(String engineServerBiometricsModel) {
        this.engineServerBiometricsModel = engineServerBiometricsModel;
    }

    @Basic
    @Column(name = "ENGINE_SERVER_TYPE", nullable = false, length = 1)
    public String getEngineServerType() {
        return engineServerType;
    }

    public void setEngineServerType(String engineServerType) {
        this.engineServerType = engineServerType;
    }

    @Basic
    @Column(name = "ENGINE_SERVER_IP", nullable = false, length = 50)
    public String getEngineServerIp() {
        return engineServerIp;
    }

    public void setEngineServerIp(String engineServerIp) {
        this.engineServerIp = engineServerIp;
    }

    @Basic
    @Column(name = "ENGINE_SERVER_MAC", nullable = false, length = 50)
    public String getEngineServerMac() {
        return engineServerMac;
    }

    public void setEngineServerMac(String engineServerMac) {
        this.engineServerMac = engineServerMac;
    }

    @Basic
    @Column(name = "ENGINE_SERVER_CPU", nullable = true, length = 50)
    public String getEngineServerCpu() {
        return engineServerCpu;
    }

    public void setEngineServerCpu(String engineServerCpu) {
        this.engineServerCpu = engineServerCpu;
    }

    @Basic
    @Column(name = "ENGINE_SERVER_PORT", nullable = false, length = 50)
    public String getEngineServerPort() {
        return engineServerPort;
    }

    public void setEngineServerPort(String engineServerPort) {
        this.engineServerPort = engineServerPort;
    }

    @Basic
    @Column(name = "ENGINE_WORKSTATION_STATUS", nullable = false, length = 1)
    public String getEngineWorkstationStatus() {
        return engineWorkstationStatus;
    }

    public void setEngineWorkstationStatus(String engineWorkstationStatus) {
        this.engineWorkstationStatus = engineWorkstationStatus;
    }

    @Basic
    @Column(name = "ENGINE_WARN_FIELD", nullable = true, length = 50)
    public String getEngineWarnField() {
        return engineWarnField;
    }

    public void setEngineWarnField(String engineWarnField) {
        this.engineWarnField = engineWarnField;
    }

    @Basic
    @Column(name = "ENGINE_NETWORK_STATUS", nullable = false, length = 1)
    public String getEngineNetworkStatus() {
        return engineNetworkStatus;
    }

    public void setEngineNetworkStatus(String engineNetworkStatus) {
        this.engineNetworkStatus = engineNetworkStatus;
    }

    @Basic
    @Column(name = "ENGINE_LODA_FINGER_NUMBER", nullable = false, precision = 0)
    public long getEngineLodaFingerNumber() {
        return engineLodaFingerNumber;
    }

    public void setEngineLodaFingerNumber(long engineLodaFingerNumber) {
        this.engineLodaFingerNumber = engineLodaFingerNumber;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = false, length = 20)
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "MODIFY_DATE", nullable = true, length = 20)
    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "ENGINE_RUNNING_TIME", nullable = false, precision = 0)
    public long getEngineRunningTime() {
        return engineRunningTime;
    }

    public void setEngineRunningTime(long engineRunningTime) {
        this.engineRunningTime = engineRunningTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasMonEnvStatisticEntity that = (TasMonEnvStatisticEntity) o;

        if (monEnvId != that.monEnvId) return false;
        if (engineLodaFingerNumber != that.engineLodaFingerNumber) return false;
        if (engineRunningTime != that.engineRunningTime) return false;
        if (engineClusterCode != null ? !engineClusterCode.equals(that.engineClusterCode) : that.engineClusterCode != null)
            return false;
        if (engineServerCode != null ? !engineServerCode.equals(that.engineServerCode) : that.engineServerCode != null)
            return false;
        if (engineServerBiometricsModel != null ? !engineServerBiometricsModel.equals(that.engineServerBiometricsModel) : that.engineServerBiometricsModel != null)
            return false;
        if (engineServerType != null ? !engineServerType.equals(that.engineServerType) : that.engineServerType != null)
            return false;
        if (engineServerIp != null ? !engineServerIp.equals(that.engineServerIp) : that.engineServerIp != null)
            return false;
        if (engineServerMac != null ? !engineServerMac.equals(that.engineServerMac) : that.engineServerMac != null)
            return false;
        if (engineServerCpu != null ? !engineServerCpu.equals(that.engineServerCpu) : that.engineServerCpu != null)
            return false;
        if (engineServerPort != null ? !engineServerPort.equals(that.engineServerPort) : that.engineServerPort != null)
            return false;
        if (engineWorkstationStatus != null ? !engineWorkstationStatus.equals(that.engineWorkstationStatus) : that.engineWorkstationStatus != null)
            return false;
        if (engineWarnField != null ? !engineWarnField.equals(that.engineWarnField) : that.engineWarnField != null)
            return false;
        if (engineNetworkStatus != null ? !engineNetworkStatus.equals(that.engineNetworkStatus) : that.engineNetworkStatus != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (monEnvId ^ (monEnvId >>> 32));
        result = 31 * result + (engineClusterCode != null ? engineClusterCode.hashCode() : 0);
        result = 31 * result + (engineServerCode != null ? engineServerCode.hashCode() : 0);
        result = 31 * result + (engineServerBiometricsModel != null ? engineServerBiometricsModel.hashCode() : 0);
        result = 31 * result + (engineServerType != null ? engineServerType.hashCode() : 0);
        result = 31 * result + (engineServerIp != null ? engineServerIp.hashCode() : 0);
        result = 31 * result + (engineServerMac != null ? engineServerMac.hashCode() : 0);
        result = 31 * result + (engineServerCpu != null ? engineServerCpu.hashCode() : 0);
        result = 31 * result + (engineServerPort != null ? engineServerPort.hashCode() : 0);
        result = 31 * result + (engineWorkstationStatus != null ? engineWorkstationStatus.hashCode() : 0);
        result = 31 * result + (engineWarnField != null ? engineWarnField.hashCode() : 0);
        result = 31 * result + (engineNetworkStatus != null ? engineNetworkStatus.hashCode() : 0);
        result = 31 * result + (int) (engineLodaFingerNumber ^ (engineLodaFingerNumber >>> 32));
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (int) (engineRunningTime ^ (engineRunningTime >>> 32));
        return result;
    }
}
