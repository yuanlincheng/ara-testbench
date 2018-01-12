/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasTask;
import com.aratek.dao.TasTaskDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasTaskService")
public class TasTaskServiceImpl implements TasTaskService {

    @Autowired
    private TasTaskDao tasTaskDao;

    @Override
    public void save(TasTask obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasTask obj, String operator, String id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(String id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasTask> findAll(Object... values) {
        return tasTaskDao.findAll();
    }

    @Override
    public TasTask findOne(String id) {
        return null;
    }

    @Override
    public TasTask findByParam(String param, Object value) {
        return null;
    }
}
