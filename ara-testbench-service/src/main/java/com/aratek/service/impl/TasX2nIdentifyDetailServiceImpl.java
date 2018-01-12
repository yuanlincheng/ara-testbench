/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasX2nIdentifyDetail;
import com.aratek.dao.TasX2nIdentifyDetailDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasX2nIdentifyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasX2nIdentifyDetailService")
public class TasX2nIdentifyDetailServiceImpl implements TasX2nIdentifyDetailService {

    @Autowired
    private TasX2nIdentifyDetailDao tasX2nIdentifyDetailDao;

    @Override
    public void save(TasX2nIdentifyDetail obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasX2nIdentifyDetail obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasX2nIdentifyDetail> findAll(Object... values) {
        return tasX2nIdentifyDetailDao.findAll();
    }

    @Override
    public TasX2nIdentifyDetail findOne(Long id) {
        return null;
    }

    @Override
    public TasX2nIdentifyDetail findByParam(String param, Object value) {
        return null;
    }
}
