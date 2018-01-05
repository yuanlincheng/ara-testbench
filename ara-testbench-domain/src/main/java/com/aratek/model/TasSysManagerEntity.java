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
@Table(name = "TAS_SYS_MANAGER", schema = "TRUSTAFIS_U")
public class TasSysManagerEntity {
    private long managerId;
    private String account;
    private String password;
    private long roleId;
    private String isRoot;
    private String statu;
    private String lastLogin;
    private String createDate;
    private String createBy;
    private String modifyDate;
    private String modifyBy;
    private TasSysRoleEntity tasSysRoleByRoleId;

    @Id
    @Column(name = "MANAGER_ID", nullable = false, precision = 0)
    public long getManagerId() {
        return managerId;
    }

    public void setManagerId(long managerId) {
        this.managerId = managerId;
    }

    @Basic
    @Column(name = "ACCOUNT", nullable = false, length = 30)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = false, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "ROLE_ID", nullable = false, precision = 0)
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "IS_ROOT", nullable = false, length = 1)
    public String getIsRoot() {
        return isRoot;
    }

    public void setIsRoot(String isRoot) {
        this.isRoot = isRoot;
    }

    @Basic
    @Column(name = "STATU", nullable = false, length = 1)
    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    @Basic
    @Column(name = "LAST_LOGIN", nullable = true, length = 20)
    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
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
    @Column(name = "CREATE_BY", nullable = true, length = 30)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
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
    @Column(name = "MODIFY_BY", nullable = true, length = 30)
    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasSysManagerEntity that = (TasSysManagerEntity) o;

        if (managerId != that.managerId) return false;
        if (roleId != that.roleId) return false;
        if (account != null ? !account.equals(that.account) : that.account != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (isRoot != null ? !isRoot.equals(that.isRoot) : that.isRoot != null) return false;
        if (statu != null ? !statu.equals(that.statu) : that.statu != null) return false;
        if (lastLogin != null ? !lastLogin.equals(that.lastLogin) : that.lastLogin != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (modifyBy != null ? !modifyBy.equals(that.modifyBy) : that.modifyBy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (managerId ^ (managerId >>> 32));
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (isRoot != null ? isRoot.hashCode() : 0);
        result = 31 * result + (statu != null ? statu.hashCode() : 0);
        result = 31 * result + (lastLogin != null ? lastLogin.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (modifyBy != null ? modifyBy.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID", nullable = false)
    public TasSysRoleEntity getTasSysRoleByRoleId() {
        return tasSysRoleByRoleId;
    }

    public void setTasSysRoleByRoleId(TasSysRoleEntity tasSysRoleByRoleId) {
        this.tasSysRoleByRoleId = tasSysRoleByRoleId;
    }
}
