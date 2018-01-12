/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasFpNode;
import com.aratek.dao.TasFpNodeDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasFpNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasFpNodeService")
public class TasFpNodeServiceImpl implements TasFpNodeService {

    @Autowired
    private TasFpNodeDao tasFpNodeDao;

    @Override
    public void save(TasFpNode obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasFpNode obj, String operator, String id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(String id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasFpNode> findAll(Object... values) {
        return tasFpNodeDao.findAll();
    }

    @Override
    public TasFpNode findOne(String id) {
        return null;
    }

    @Override
    public TasFpNode findByParam(String param, Object value) {
        return null;
    }
}
