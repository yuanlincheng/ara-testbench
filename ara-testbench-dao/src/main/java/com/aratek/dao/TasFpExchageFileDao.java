/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.dao;

import com.aratek.model.TasFpExchageFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import java.io.Serializable;

public interface TasFpExchageFileDao extends JpaRepository<TasFpExchageFile, String>, JpaSpecificationExecutor<TasFpExchageFile>, Serializable{

}

