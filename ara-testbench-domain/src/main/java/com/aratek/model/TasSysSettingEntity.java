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
@Table(name = "TAS_SYS_SETTING", schema = "TRUSTAFIS_U")
public class TasSysSettingEntity {
    private long settingId;
    private String appId;
    private String mainKey;
    private String subKey;
    private String value;
    private String modefyStatus;
    private String showStatus;
    private String paraname;
    private String note;

    @Id
    @Column(name = "SETTING_ID")
    public long getSettingId() {
        return settingId;
    }

    public void setSettingId(long settingId) {
        this.settingId = settingId;
    }

    @Basic
    @Column(name = "APP_ID")
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "MAIN_KEY")
    public String getMainKey() {
        return mainKey;
    }

    public void setMainKey(String mainKey) {
        this.mainKey = mainKey;
    }

    @Basic
    @Column(name = "SUB_KEY")
    public String getSubKey() {
        return subKey;
    }

    public void setSubKey(String subKey) {
        this.subKey = subKey;
    }

    @Basic
    @Column(name = "VALUE")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "MODEFY_STATUS")
    public String getModefyStatus() {
        return modefyStatus;
    }

    public void setModefyStatus(String modefyStatus) {
        this.modefyStatus = modefyStatus;
    }

    @Basic
    @Column(name = "SHOW_STATUS")
    public String getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(String showStatus) {
        this.showStatus = showStatus;
    }

    @Basic
    @Column(name = "PARANAME")
    public String getParaname() {
        return paraname;
    }

    public void setParaname(String paraname) {
        this.paraname = paraname;
    }

    @Basic
    @Column(name = "NOTE")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TasSysSettingEntity that = (TasSysSettingEntity) o;

        if (settingId != that.settingId) return false;
        if (appId != null ? !appId.equals(that.appId) : that.appId != null) return false;
        if (mainKey != null ? !mainKey.equals(that.mainKey) : that.mainKey != null) return false;
        if (subKey != null ? !subKey.equals(that.subKey) : that.subKey != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;
        if (modefyStatus != null ? !modefyStatus.equals(that.modefyStatus) : that.modefyStatus != null) return false;
        if (showStatus != null ? !showStatus.equals(that.showStatus) : that.showStatus != null) return false;
        if (paraname != null ? !paraname.equals(that.paraname) : that.paraname != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (settingId ^ (settingId >>> 32));
        result = 31 * result + (appId != null ? appId.hashCode() : 0);
        result = 31 * result + (mainKey != null ? mainKey.hashCode() : 0);
        result = 31 * result + (subKey != null ? subKey.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        result = 31 * result + (modefyStatus != null ? modefyStatus.hashCode() : 0);
        result = 31 * result + (showStatus != null ? showStatus.hashCode() : 0);
        result = 31 * result + (paraname != null ? paraname.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
