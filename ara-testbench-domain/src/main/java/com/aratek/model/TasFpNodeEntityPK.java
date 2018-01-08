package com.aratek.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/7 13:14
 * @description: xxx
 * own: Aratek
 */
public class TasFpNodeEntityPK implements Serializable {
    private String masterId;
    private String nodeId;

    @Column(name = "MASTER_ID")
    @Id
    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    @Column(name = "NODE_ID")
    @Id
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasFpNodeEntityPK that = (TasFpNodeEntityPK) o;

        if (masterId != null ? !masterId.equals(that.masterId) : that.masterId != null) return false;
        if (nodeId != null ? !nodeId.equals(that.nodeId) : that.nodeId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = masterId != null ? masterId.hashCode() : 0;
        result = 31 * result + (nodeId != null ? nodeId.hashCode() : 0);
        return result;
    }
}
