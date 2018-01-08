package com.aratek.model;

import javax.persistence.*;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/7 13:14
 * @description: xxx
 * own: Aratek
 */
@Entity
@Table(name = "TAS_FP_NODE", schema = "TRUSTAFIS_U")
@IdClass(TasFpNodeEntityPK.class)
public class TasFpNodeEntity {
    private String masterId;
    private String nodeId;
    private long enrThread;
    private long verThread;
    private long ideThread;
    private String dataZone;
    private String onlineStat;
    private Long enrCHour;
    private Long enrCDay;
    private Long verCHour;
    private Long verCDay;
    private Long ideCHour;
    private Long ideCDay;

    @Id
    @Column(name = "MASTER_ID")
    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    @Id
    @Column(name = "NODE_ID")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Basic
    @Column(name = "ENR_THREAD")
    public long getEnrThread() {
        return enrThread;
    }

    public void setEnrThread(long enrThread) {
        this.enrThread = enrThread;
    }

    @Basic
    @Column(name = "VER_THREAD")
    public long getVerThread() {
        return verThread;
    }

    public void setVerThread(long verThread) {
        this.verThread = verThread;
    }

    @Basic
    @Column(name = "IDE_THREAD")
    public long getIdeThread() {
        return ideThread;
    }

    public void setIdeThread(long ideThread) {
        this.ideThread = ideThread;
    }

    @Basic
    @Column(name = "DATA_ZONE")
    public String getDataZone() {
        return dataZone;
    }

    public void setDataZone(String dataZone) {
        this.dataZone = dataZone;
    }

    @Basic
    @Column(name = "ONLINE_STAT")
    public String getOnlineStat() {
        return onlineStat;
    }

    public void setOnlineStat(String onlineStat) {
        this.onlineStat = onlineStat;
    }

    @Basic
    @Column(name = "ENR_C_HOUR")
    public Long getEnrCHour() {
        return enrCHour;
    }

    public void setEnrCHour(Long enrCHour) {
        this.enrCHour = enrCHour;
    }

    @Basic
    @Column(name = "ENR_C_DAY")
    public Long getEnrCDay() {
        return enrCDay;
    }

    public void setEnrCDay(Long enrCDay) {
        this.enrCDay = enrCDay;
    }

    @Basic
    @Column(name = "VER_C_HOUR")
    public Long getVerCHour() {
        return verCHour;
    }

    public void setVerCHour(Long verCHour) {
        this.verCHour = verCHour;
    }

    @Basic
    @Column(name = "VER_C_DAY")
    public Long getVerCDay() {
        return verCDay;
    }

    public void setVerCDay(Long verCDay) {
        this.verCDay = verCDay;
    }

    @Basic
    @Column(name = "IDE_C_HOUR")
    public Long getIdeCHour() {
        return ideCHour;
    }

    public void setIdeCHour(Long ideCHour) {
        this.ideCHour = ideCHour;
    }

    @Basic
    @Column(name = "IDE_C_DAY")
    public Long getIdeCDay() {
        return ideCDay;
    }

    public void setIdeCDay(Long ideCDay) {
        this.ideCDay = ideCDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasFpNodeEntity that = (TasFpNodeEntity) o;

        if (enrThread != that.enrThread) return false;
        if (verThread != that.verThread) return false;
        if (ideThread != that.ideThread) return false;
        if (masterId != null ? !masterId.equals(that.masterId) : that.masterId != null) return false;
        if (nodeId != null ? !nodeId.equals(that.nodeId) : that.nodeId != null) return false;
        if (dataZone != null ? !dataZone.equals(that.dataZone) : that.dataZone != null) return false;
        if (onlineStat != null ? !onlineStat.equals(that.onlineStat) : that.onlineStat != null) return false;
        if (enrCHour != null ? !enrCHour.equals(that.enrCHour) : that.enrCHour != null) return false;
        if (enrCDay != null ? !enrCDay.equals(that.enrCDay) : that.enrCDay != null) return false;
        if (verCHour != null ? !verCHour.equals(that.verCHour) : that.verCHour != null) return false;
        if (verCDay != null ? !verCDay.equals(that.verCDay) : that.verCDay != null) return false;
        if (ideCHour != null ? !ideCHour.equals(that.ideCHour) : that.ideCHour != null) return false;
        if (ideCDay != null ? !ideCDay.equals(that.ideCDay) : that.ideCDay != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = masterId != null ? masterId.hashCode() : 0;
        result = 31 * result + (nodeId != null ? nodeId.hashCode() : 0);
        result = 31 * result + (int) (enrThread ^ (enrThread >>> 32));
        result = 31 * result + (int) (verThread ^ (verThread >>> 32));
        result = 31 * result + (int) (ideThread ^ (ideThread >>> 32));
        result = 31 * result + (dataZone != null ? dataZone.hashCode() : 0);
        result = 31 * result + (onlineStat != null ? onlineStat.hashCode() : 0);
        result = 31 * result + (enrCHour != null ? enrCHour.hashCode() : 0);
        result = 31 * result + (enrCDay != null ? enrCDay.hashCode() : 0);
        result = 31 * result + (verCHour != null ? verCHour.hashCode() : 0);
        result = 31 * result + (verCDay != null ? verCDay.hashCode() : 0);
        result = 31 * result + (ideCHour != null ? ideCHour.hashCode() : 0);
        result = 31 * result + (ideCDay != null ? ideCDay.hashCode() : 0);
        return result;
    }
}
