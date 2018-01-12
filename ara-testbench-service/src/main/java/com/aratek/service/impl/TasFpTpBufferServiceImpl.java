/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasFpTpBuffer;
import com.aratek.dao.TasFpTpBufferDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasFpTpBufferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasFpTpBufferService")
public class TasFpTpBufferServiceImpl implements TasFpTpBufferService {

    @Autowired
    private TasFpTpBufferDao tasFpTpBufferDao;

    @Override
    public void save(TasFpTpBuffer obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasFpTpBuffer obj, String operator, String id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(String id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasFpTpBuffer> findAll(Object... values) {
        return tasFpTpBufferDao.findAll();
    }

    @Override
    public TasFpTpBuffer findOne(String id) {
        return null;
    }

    @Override
    public TasFpTpBuffer findByParam(String param, Object value) {
        return null;
    }
}
