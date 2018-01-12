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

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TAS_REPORT_HOME")
@SuppressWarnings("serial")
public class TasReportHome implements Serializable{

    //数据库相关模板数据，自动生成
    public static final String TABLE_ALIAS = "TasReportHome";
	public static final String ALIAS_HOME_ID = "homeId";
	public static final String ALIAS_FP_NUM = "fpNum";
	public static final String ALIAS_USER_NUM = "userNum";
	public static final String ALIAS_SERVER_NUM = "serverNum";
	public static final String ALIAS_BUS_NUM = "busNum";
	public static final String ALIAS_BUS_FAIL_NUM = "busFailNum";
	public static final String ALIAS_FP_ADD_DATA = "fpAddData";
	public static final String ALIAS_BUS_TYPE_DATA = "busTypeData";
	public static final String ALIAS_SERVER_STATU_DATA = "serverStatuData";
	public static final String ALIAS_TASK_STATU_DATA = "taskStatuData";


    /**
     * homeId       db_column: HOME_ID
     */
    @Id
    @Column(name = "HOME_ID", unique = true, nullable = false, insertable = true, updatable = true, length = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="trustafis_seq")
    @SequenceGenerator(name="trustafis_seq", sequenceName="SEQ_TAS_REPORT_HOME")
    private Long homeId;

    /**
     * fpNum       db_column: FP_NUM
     */

    @Column(name = "FP_NUM", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long fpNum;

    /**
     * userNum       db_column: USER_NUM
     */

    @Column(name = "USER_NUM", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long userNum;

    /**
     * serverNum       db_column: SERVER_NUM
     */

    @Column(name = "SERVER_NUM", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long serverNum;

    /**
     * busNum       db_column: BUS_NUM
     */

    @Column(name = "BUS_NUM", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long busNum;

    /**
     * busFailNum       db_column: BUS_FAIL_NUM
     */

    @Column(name = "BUS_FAIL_NUM", unique = false, nullable = true, insertable = true, updatable = true, length = 0)
    private Long busFailNum;

    /**
     * fpAddData       db_column: FP_ADD_DATA
     */
    @Length(max=500)
    @Column(name = "FP_ADD_DATA", unique = false, nullable = true, insertable = true, updatable = true, length = 500)
    private String fpAddData;

    /**
     * busTypeData       db_column: BUS_TYPE_DATA
     */
    @Length(max=500)
    @Column(name = "BUS_TYPE_DATA", unique = false, nullable = true, insertable = true, updatable = true, length = 500)
    private String busTypeData;

    /**
     * serverStatuData       db_column: SERVER_STATU_DATA
     */
    @Length(max=50)
    @Column(name = "SERVER_STATU_DATA", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String serverStatuData;

    /**
     * taskStatuData       db_column: TASK_STATU_DATA
     */
    @Length(max=50)
    @Column(name = "TASK_STATU_DATA", unique = false, nullable = true, insertable = true, updatable = true, length = 50)
    private String taskStatuData;
}


