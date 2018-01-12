/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasSysSetting;
import com.aratek.dao.TasSysSettingDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasSysSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasSysSettingService")
public class TasSysSettingServiceImpl implements TasSysSettingService {

    @Autowired
    private TasSysSettingDao tasSysSettingDao;

    @Override
    public void save(TasSysSetting obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasSysSetting obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasSysSetting> findAll(Object... values) {
        return tasSysSettingDao.findAll();
    }

    @Override
    public TasSysSetting findOne(Long id) {
        return null;
    }

    @Override
    public TasSysSetting findByParam(String param, Object value) {
        return null;
    }
}
