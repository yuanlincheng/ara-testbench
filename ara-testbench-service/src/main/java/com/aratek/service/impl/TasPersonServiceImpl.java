/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasPerson;
import com.aratek.dao.TasPersonDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasPersonService")
public class TasPersonServiceImpl implements TasPersonService {

    @Autowired
    private TasPersonDao tasPersonDao;

    @Override
    public void save(TasPerson obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasPerson obj, String operator, String id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(String id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasPerson> findAll(Object... values) {
        return tasPersonDao.findAll();
    }

    @Override
    public TasPerson findOne(String id) {
        return null;
    }

    @Override
    public TasPerson findByParam(String param, Object value) {
        return null;
    }
}
