package com.aratek.dao;

import com.aratek.model.TasDuplicateResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/8 22:19
 * @description: xxx
 * own: Aratek
 */
public interface TasDuplicateResultDao extends JpaRepository<TasDuplicateResultEntity, Long>, JpaSpecificationExecutor<TasDuplicateResultEntity>, Serializable {
}
