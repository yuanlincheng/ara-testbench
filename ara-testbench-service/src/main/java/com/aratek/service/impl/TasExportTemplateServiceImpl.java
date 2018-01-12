/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasExportTemplate;
import com.aratek.dao.TasExportTemplateDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasExportTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasExportTemplateService")
public class TasExportTemplateServiceImpl implements TasExportTemplateService {

    @Autowired
    private TasExportTemplateDao tasExportTemplateDao;

    @Override
    public void save(TasExportTemplate obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasExportTemplate obj, String operator, String id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(String id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasExportTemplate> findAll(Object... values) {
        return tasExportTemplateDao.findAll();
    }

    @Override
    public TasExportTemplate findOne(String id) {
        return null;
    }

    @Override
    public TasExportTemplate findByParam(String param, Object value) {
        return null;
    }
}
