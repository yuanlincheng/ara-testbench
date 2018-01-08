package com.aratek.dao;

import com.aratek.model.TasSysManagerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/6 21:07
 * @description: xxx
 * own: Aratek
 */
public interface TasSysManagerDao extends JpaRepository<TasSysManagerEntity, Long>, JpaSpecificationExecutor<TasSysManagerEntity>, Serializable {

}
