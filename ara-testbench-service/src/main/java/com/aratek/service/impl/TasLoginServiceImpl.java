/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasLogin;
import com.aratek.dao.TasLoginDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasLoginService")
public class TasLoginServiceImpl implements TasLoginService {

    @Autowired
    private TasLoginDao tasLoginDao;

    @Override
    public void save(TasLogin obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasLogin obj, String operator, String id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(String id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasLogin> findAll(Object... values) {
        return tasLoginDao.findAll();
    }

    @Override
    public TasLogin findOne(String id) {
        return null;
    }

    @Override
    public TasLogin findByParam(String param, Object value) {
        return null;
    }
}
