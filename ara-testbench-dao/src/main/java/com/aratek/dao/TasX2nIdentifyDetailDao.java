/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.dao;

import com.aratek.model.TasX2nIdentifyDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.io.Serializable;

public interface TasX2nIdentifyDetailDao extends JpaRepository<TasX2nIdentifyDetail, Long>, JpaSpecificationExecutor<TasX2nIdentifyDetail>, Serializable{

}

