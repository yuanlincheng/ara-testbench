
/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.model;

import javax.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.lang.*;


@Data
@NoArgsConstructor
@Embeddable
@SuppressWarnings("serial")
public class TasFpVerifyLogId implements Serializable{

    @Column(name = "LOG_VERIFY_LOG_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 50)
	private String logVerifyLogId;

    @Column(name = "TOP_NUMBER", unique = false, nullable = false, insertable = true, updatable = true, length = 0)
	private Long topNumber;

    @Column(name = "POLICY_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
	private String policyCode;
}