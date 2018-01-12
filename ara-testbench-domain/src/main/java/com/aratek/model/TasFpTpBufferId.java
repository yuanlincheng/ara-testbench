
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
public class TasFpTpBufferId implements Serializable{

    @Column(name = "PERSON_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 30)
	private String personId;

    @Column(name = "FP_INDEX_CODE", unique = false, nullable = false, insertable = true, updatable = true, length = 2)
	private String fpIndexCode;

    @Column(name = "FP_TEMPLATE_NO", unique = false, nullable = false, insertable = true, updatable = true, length = 2)
	private String fpTemplateNo;

    @Column(name = "ACTIVE_STATU", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
	private String activeStatu;
}