/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasLogBusiness;
import com.aratek.dao.TasLogBusinessDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasLogBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasLogBusinessService")
public class TasLogBusinessServiceImpl implements TasLogBusinessService {

    @Autowired
    private TasLogBusinessDao tasLogBusinessDao;

    @Override
    public void save(TasLogBusiness obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasLogBusiness obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasLogBusiness> findAll(Object... values) {
        return tasLogBusinessDao.findAll();
    }

    @Override
    public TasLogBusiness findOne(Long id) {
        return null;
    }

    @Override
    public TasLogBusiness findByParam(String param, Object value) {
        return null;
    }
}
