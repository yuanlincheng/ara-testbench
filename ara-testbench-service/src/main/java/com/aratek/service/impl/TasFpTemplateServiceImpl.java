/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasFpTemplate;
import com.aratek.dao.TasFpTemplateDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasFpTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasFpTemplateService")
public class TasFpTemplateServiceImpl implements TasFpTemplateService {

    @Autowired
    private TasFpTemplateDao tasFpTemplateDao;

    @Override
    public void save(TasFpTemplate obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasFpTemplate obj, String operator, String id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(String id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasFpTemplate> findAll(Object... values) {
        return tasFpTemplateDao.findAll();
    }

    @Override
    public TasFpTemplate findOne(String id) {
        return null;
    }

    @Override
    public TasFpTemplate findByParam(String param, Object value) {
        return null;
    }
}
