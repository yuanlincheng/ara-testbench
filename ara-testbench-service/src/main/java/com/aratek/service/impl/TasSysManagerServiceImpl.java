/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasSysManager;
import com.aratek.dao.TasSysManagerDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasSysManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasSysManagerService")
public class TasSysManagerServiceImpl implements TasSysManagerService {

    @Autowired
    private TasSysManagerDao tasSysManagerDao;

    @Override
    public void save(TasSysManager obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasSysManager obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasSysManager> findAll(Object... values) {
        return tasSysManagerDao.findAll();
    }

    @Override
    public TasSysManager findOne(Long id) {
        return null;
    }

    @Override
    public TasSysManager findByParam(String param, Object value) {
        return null;
    }
}
