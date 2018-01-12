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
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAS_SYS_MANAGER")
@SuppressWarnings("serial")
public class TasSysManager implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasSysManager";
	public static final String ALIAS_MANAGER_ID = "managerId";
	public static final String ALIAS_ACCOUNT = "account";
	public static final String ALIAS_PASSWORD = "password";
	public static final String ALIAS_ROLE_ID = "roleId";
	public static final String ALIAS_IS_ROOT = "isRoot";
	public static final String ALIAS_STATU = "statu";
	public static final String ALIAS_LAST_LOGIN = "lastLogin";
	public static final String ALIAS_CREATE_DATE = "createDate";
	public static final String ALIAS_CREATE_BY = "createBy";
	public static final String ALIAS_MODIFY_DATE = "modifyDate";
	public static final String ALIAS_MODIFY_BY = "modifyBy";


    /**
     * managerId       db_column: MANAGER_ID
     */
    @Id
    @Column(name = "MANAGER_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="trustafis_seq")
    @SequenceGenerator(name="trustafis_seq", sequenceName="SEQ_TAS_SYS_MANAGER")
    private Long managerId;

    /**
     * account       db_column: ACCOUNT
     */
    @NotBlank @Length(max=30)
    @Column(name = "ACCOUNT", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
    private String account;

    /**
     * password       db_column: PASSWORD
     */
    @NotBlank @Length(max=100)
    @Column(name = "PASSWORD", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
    private String password;

    /**
     * roleId       db_column: ROLE_ID
     */
    @NotNull
    @Column(name = "ROLE_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
    private Long roleId;

    /**
     * isRoot       db_column: IS_ROOT
     */
    @NotBlank @Length(max=1)
    @Column(name = "IS_ROOT", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String isRoot;

    /**
     * statu       db_column: STATU
     */
    @NotBlank @Length(max=1)
    @Column(name = "STATU", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
    private String statu;

    /**
     * lastLogin       db_column: LAST_LOGIN
     */
    @Length(max=20)
    @Column(name = "LAST_LOGIN", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String lastLogin;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;

    /**
     * createBy       db_column: CREATE_BY
     */
    @Length(max=30)
    @Column(name = "CREATE_BY", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String createBy;

    /**
     * modifyDate       db_column: MODIFY_DATE
     */
    @Length(max=20)
    @Column(name = "MODIFY_DATE", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
    private String modifyDate;

    /**
     * modifyBy       db_column: MODIFY_BY
     */
    @Length(max=30)
    @Column(name = "MODIFY_BY", unique = false, nullable = true, insertable = true, updatable = true, length = 30)
    private String modifyBy;

	private TasSysRole tasSysRole;
	public void setTasSysRole(TasSysRole tasSysRole){
		this.tasSysRole = tasSysRole;
	}

	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "ROLE_ID",nullable = false, insertable = false, updatable = false)
	})
	public TasSysRole getTasSysRole() {
		return tasSysRole;
	}
}


