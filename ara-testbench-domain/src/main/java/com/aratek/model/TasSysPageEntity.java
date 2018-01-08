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
@Table(name = "TAS_SYS_PAGE", schema = "TRUSTAFIS_U")
public class TasSysPageEntity {
    private long pageId;
    private String code;
    private String pcode;
    private String name;
    private String open;
    private String url;
    private String statu;
    private String note;

    @Id
    @Column(name = "PAGE_ID")
    public long getPageId() {
        return pageId;
    }

    public void setPageId(long pageId) {
        this.pageId = pageId;
    }

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "PCODE")
    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
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
    @Column(name = "OPEN")
    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    @Basic
    @Column(name = "URL")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "STATU")
    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
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

        TasSysPageEntity that = (TasSysPageEntity) o;

        if (pageId != that.pageId) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (pcode != null ? !pcode.equals(that.pcode) : that.pcode != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (open != null ? !open.equals(that.open) : that.open != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (statu != null ? !statu.equals(that.statu) : that.statu != null) return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (pageId ^ (pageId >>> 32));
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (pcode != null ? pcode.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (open != null ? open.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (statu != null ? statu.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        return result;
    }
}
