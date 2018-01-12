/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasDuplicateResult;
import com.aratek.dao.TasDuplicateResultDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasDuplicateResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasDuplicateResultService")
public class TasDuplicateResultServiceImpl implements TasDuplicateResultService {

    @Autowired
    private TasDuplicateResultDao tasDuplicateResultDao;

    @Override
    public void save(TasDuplicateResult obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasDuplicateResult obj, String operator, String id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(String id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasDuplicateResult> findAll(Object... values) {
        return tasDuplicateResultDao.findAll();
    }

    @Override
    public TasDuplicateResult findOne(String id) {
        return null;
    }

    @Override
    public TasDuplicateResult findByParam(String param, Object value) {
        return null;
    }
}
