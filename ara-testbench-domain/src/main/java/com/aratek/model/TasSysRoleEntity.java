package com.aratek.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/6 0:08
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
    private Collection<TasSysManagerEntity> tasSysManagersByRoleId;

    @Id
    @Column(name = "ROLE_ID", nullable = false, precision = 0)
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "NAME", nullable = false, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "PURVIEW", nullable = false, length = 150)
    public String getPurview() {
        return purview;
    }

    public void setPurview(String purview) {
        this.purview = purview;
    }

    @Basic
    @Column(name = "NOTE", nullable = true, length = 250)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Basic
    @Column(name = "IS_ROOT", nullable = false, length = 1)
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

    @OneToMany(mappedBy = "tasSysRoleByRoleId")
    public Collection<TasSysManagerEntity> getTasSysManagersByRoleId() {
        return tasSysManagersByRoleId;
    }

    public void setTasSysManagersByRoleId(Collection<TasSysManagerEntity> tasSysManagersByRoleId) {
        this.tasSysManagersByRoleId = tasSysManagersByRoleId;
    }
}
