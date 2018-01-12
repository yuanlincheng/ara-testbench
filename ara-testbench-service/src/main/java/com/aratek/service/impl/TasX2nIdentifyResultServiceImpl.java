/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasX2nIdentifyResult;
import com.aratek.dao.TasX2nIdentifyResultDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasX2nIdentifyResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasX2nIdentifyResultService")
public class TasX2nIdentifyResultServiceImpl implements TasX2nIdentifyResultService {

    @Autowired
    private TasX2nIdentifyResultDao tasX2nIdentifyResultDao;

    @Override
    public void save(TasX2nIdentifyResult obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasX2nIdentifyResult obj, String operator, String id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(String id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasX2nIdentifyResult> findAll(Object... values) {
        return tasX2nIdentifyResultDao.findAll();
    }

    @Override
    public TasX2nIdentifyResult findOne(String id) {
        return null;
    }

    @Override
    public TasX2nIdentifyResult findByParam(String param, Object value) {
        return null;
    }
}
