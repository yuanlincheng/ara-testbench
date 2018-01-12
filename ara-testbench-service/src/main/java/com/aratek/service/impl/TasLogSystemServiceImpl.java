/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasLogSystem;
import com.aratek.dao.TasLogSystemDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasLogSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasLogSystemService")
public class TasLogSystemServiceImpl implements TasLogSystemService {

    @Autowired
    private TasLogSystemDao tasLogSystemDao;

    @Override
    public void save(TasLogSystem obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasLogSystem obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasLogSystem> findAll(Object... values) {
        return tasLogSystemDao.findAll();
    }

    @Override
    public TasLogSystem findOne(Long id) {
        return null;
    }

    @Override
    public TasLogSystem findByParam(String param, Object value) {
        return null;
    }
}
