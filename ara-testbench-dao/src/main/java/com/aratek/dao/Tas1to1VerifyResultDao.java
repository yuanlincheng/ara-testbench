/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.dao;

import com.aratek.model.Tas1to1VerifyResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.io.Serializable;

public interface Tas1to1VerifyResultDao extends JpaRepository<Tas1to1VerifyResult, String>, JpaSpecificationExecutor<Tas1to1VerifyResult>, Serializable{

}

