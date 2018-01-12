/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasFpVerifyLog;
import com.aratek.dao.TasFpVerifyLogDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasFpVerifyLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasFpVerifyLogService")
public class TasFpVerifyLogServiceImpl implements TasFpVerifyLogService {

    @Autowired
    private TasFpVerifyLogDao tasFpVerifyLogDao;

    @Override
    public void save(TasFpVerifyLog obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasFpVerifyLog obj, String operator, String id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(String id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasFpVerifyLog> findAll(Object... values) {
        return tasFpVerifyLogDao.findAll();
    }

    @Override
    public TasFpVerifyLog findOne(String id) {
        return null;
    }

    @Override
    public TasFpVerifyLog findByParam(String param, Object value) {
        return null;
    }
}
