/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasSysCode;
import com.aratek.dao.TasSysCodeDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasSysCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasSysCodeService")
public class TasSysCodeServiceImpl implements TasSysCodeService {

    @Autowired
    private TasSysCodeDao tasSysCodeDao;

    @Override
    public void save(TasSysCode obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasSysCode obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasSysCode> findAll(Object... values) {
        return tasSysCodeDao.findAll();
    }

    @Override
    public TasSysCode findOne(Long id) {
        return null;
    }

    @Override
    public TasSysCode findByParam(String param, Object value) {
        return null;
    }
}
