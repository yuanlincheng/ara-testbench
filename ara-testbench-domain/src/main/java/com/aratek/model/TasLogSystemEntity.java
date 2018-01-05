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
@Table(name = "TAS_LOG_SYSTEM", schema = "TRUSTAFIS_U")
public class TasLogSystemEntity {
    private long logSystemId;
    private String type;
    private String operate;
    private String content;
    private String createDate;
    private String createBy;

    @Id
    @Column(name = "LOG_SYSTEM_ID", nullable = false, precision = 0)
    public long getLogSystemId() {
        return logSystemId;
    }

    public void setLogSystemId(long logSystemId) {
        this.logSystemId = logSystemId;
    }

    @Basic
    @Column(name = "TYPE", nullable = false, length = 15)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "OPERATE", nullable = false, length = 20)
    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    @Basic
    @Column(name = "CONTENT", nullable = false, length = 500)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
    @Column(name = "CREATE_BY", nullable = false, length = 30)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasLogSystemEntity that = (TasLogSystemEntity) o;

        if (logSystemId != that.logSystemId) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (operate != null ? !operate.equals(that.operate) : that.operate != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (logSystemId ^ (logSystemId >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (operate != null ? operate.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        return result;
    }
}
