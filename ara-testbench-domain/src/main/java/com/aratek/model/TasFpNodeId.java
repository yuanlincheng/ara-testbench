
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
public class TasFpNodeId implements Serializable{

    @Column(name = "MASTER_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 7)
	private String masterId;

    @Column(name = "NODE_ID", unique = false, nullable = false, insertable = true, updatable = true, length = 7)
	private String nodeId;
}