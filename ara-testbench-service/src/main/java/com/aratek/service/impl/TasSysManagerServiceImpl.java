package com.aratek.service.impl;

import com.aratek.dao.TasSysManagerDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.model.TasSysManagerEntity;
import com.aratek.service.TasSysManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/6 21:26
 * @description: xxx
 * own: Aratek
 */
@Service("tasSysManagerService")
public class TasSysManagerServiceImpl implements TasSysManagerService {

    @Autowired
    private TasSysManagerDao tasSysManagerDao;

    @Override
    public void save(TasSysManagerEntity obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasSysManagerEntity obj, String operator, Serializable id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Serializable id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasSysManagerEntity> findAll(Object... values) {
        return tasSysManagerDao.findAll();
    }

    @Override
    public TasSysManagerEntity findOne(Serializable id) {
        return null;
    }

    @Override
    public TasSysManagerEntity findByParam(String param, Object value) {
        return null;
    }
}
