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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAS_LOGIN")
@SuppressWarnings("serial")
public class TasLogin implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasLogin";
	public static final String ALIAS_TOKEN_ID = "tokenId";
	public static final String ALIAS_CREATE_DATE = "createDate";


    /**
     * tokenId       db_column: TOKEN_ID
     */
    @Id
    @Column(name = "TOKEN_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 20)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String tokenId;

    /**
     * createDate       db_column: CREATE_DATE
     */
    @NotBlank @Length(max=20)
    @Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
    private String createDate;
}


