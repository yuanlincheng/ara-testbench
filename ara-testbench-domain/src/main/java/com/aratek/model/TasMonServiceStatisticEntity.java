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
@Table(name = "TAS_MON_SERVICE_STATISTIC", schema = "TRUSTAFIS_U")
public class TasMonServiceStatisticEntity {
    private long monServiceId;
    private String engineClusterCode;
    private String engineServerCode;
    private String serviceKey;
    private String totalValue;
    private String createDate;

    @Id
    @Column(name = "MON_SERVICE_ID", nullable = false, precision = 0)
    public long getMonServiceId() {
        return monServiceId;
    }

    public void setMonServiceId(long monServiceId) {
        this.monServiceId = monServiceId;
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
    @Column(name = "ENGINE_SERVER_CODE", nullable = false, length = 20)
    public String getEngineServerCode() {
        return engineServerCode;
    }

    public void setEngineServerCode(String engineServerCode) {
        this.engineServerCode = engineServerCode;
    }

    @Basic
    @Column(name = "SERVICE_KEY", nullable = false, length = 80)
    public String getServiceKey() {
        return serviceKey;
    }

    public void setServiceKey(String serviceKey) {
        this.serviceKey = serviceKey;
    }

    @Basic
    @Column(name = "TOTAL_VALUE", nullable = false, length = 250)
    public String getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(String totalValue) {
        this.totalValue = totalValue;
    }

    @Basic
    @Column(name = "CREATE_DATE", nullable = false, length = 20)
    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasMonServiceStatisticEntity that = (TasMonServiceStatisticEntity) o;

        if (monServiceId != that.monServiceId) return false;
        if (engineClusterCode != null ? !engineClusterCode.equals(that.engineClusterCode) : that.engineClusterCode != null)
            return false;
        if (engineServerCode != null ? !engineServerCode.equals(that.engineServerCode) : that.engineServerCode != null)
            return false;
        if (serviceKey != null ? !serviceKey.equals(that.serviceKey) : that.serviceKey != null) return false;
        if (totalValue != null ? !totalValue.equals(that.totalValue) : that.totalValue != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (monServiceId ^ (monServiceId >>> 32));
        result = 31 * result + (engineClusterCode != null ? engineClusterCode.hashCode() : 0);
        result = 31 * result + (engineServerCode != null ? engineServerCode.hashCode() : 0);
        result = 31 * result + (serviceKey != null ? serviceKey.hashCode() : 0);
        result = 31 * result + (totalValue != null ? totalValue.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
