package com.aratek.model;

import javax.persistence.*;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/7 13:15
 * @description: xxx
 * own: Aratek
 */
@Entity
@Table(name = "TAS_SYS_ROLE", schema = "TRUSTAFIS_U")
public class TasSysRoleEntity {
    private long roleId;
    private String name;
    private String purview;
    private String note;
    private String isRoot;

    @Id
    @Column(name = "ROLE_ID")
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "PURVIEW")
    public String getPurview() {
        return purview;
    }

    public void setPurview(String purview) {
        this.purview = purview;
    }

    @Basic
    @Column(name = "NOTE")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "IS_ROOT")
    public String getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(String isRoot) {
        this.isRoot = isRoot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasSysRoleEntity that = (TasSysRoleEntity) o;

        if (roleId != that.roleId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (purview != null ? !purview.equals(that.purview) : that.purview != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;
        if (isRoot != null ? !isRoot.equals(that.isRoot) : that.isRoot != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (purview != null ? purview.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (isRoot != null ? isRoot.hashCode() : 0);
        return result;
    }
}
