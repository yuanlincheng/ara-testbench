/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAS_SYS_ROLE")
@SuppressWarnings("serial")
public class TasSysRole implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasSysRole";
	public static final String ALIAS_ROLE_ID = "roleId";
	public static final String ALIAS_NAME = "name";
	public static final String ALIAS_PURVIEW = "purview";
	public static final String ALIAS_NOTE = "note";
	public static final String ALIAS_IS_ROOT = "isRoot";


    /**
     * roleId       db_column: ROLE_ID
     */
    @Id
    @Column(name = "ROLE_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="trustafis_seq")
    @SequenceGenerator(name="trustafis_seq", sequenceName="SEQ_TAS_SYS_ROLE")
    private Long roleId;

    /**
     * name       db_column: NAME
     */
    @NotBlank @Length(max=30)
    @Column(name = "NAME", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String name;

    /**
     * purview       db_column: PURVIEW
     */
    @NotBlank @Length(max=150)
    @Column(name = "PURVIEW", unique = false, nullable = false, insertable = true, updatable = true, length = 150)
    private String purview;

    /**
     * note       db_column: NOTE
     */
    @Length(max=250)
    @Column(name = "NOTE", unique = false, nullable = true, insertable = true, updatable = true, length = 250)
    private String note;

    /**
     * isRoot       db_column: IS_ROOT
     */
    @NotBlank @Length(max=1)
    @Column(name = "IS_ROOT", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String isRoot;

	private Set tasSysManagers = new HashSet(0);
	public void setTasSysManagers(Set<TasSysManager> tasSysManager){
		this.tasSysManagers = tasSysManager;
	}

	@OneToMany(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "tasSysRole")
	public Set<TasSysManager> getTasSysManagers() {
		return tasSysManagers;
	}
}


