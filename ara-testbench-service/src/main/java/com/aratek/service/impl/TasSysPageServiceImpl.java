/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasSysPage;
import com.aratek.dao.TasSysPageDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasSysPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasSysPageService")
public class TasSysPageServiceImpl implements TasSysPageService {

    @Autowired
    private TasSysPageDao tasSysPageDao;

    @Override
    public void save(TasSysPage obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasSysPage obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasSysPage> findAll(Object... values) {
        return tasSysPageDao.findAll();
    }

    @Override
    public TasSysPage findOne(Long id) {
        return null;
    }

    @Override
    public TasSysPage findByParam(String param, Object value) {
        return null;
    }
}
