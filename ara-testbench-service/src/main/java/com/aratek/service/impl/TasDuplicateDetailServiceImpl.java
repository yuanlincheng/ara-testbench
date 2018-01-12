/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasDuplicateDetail;
import com.aratek.dao.TasDuplicateDetailDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasDuplicateDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasDuplicateDetailService")
public class TasDuplicateDetailServiceImpl implements TasDuplicateDetailService {

    @Autowired
    private TasDuplicateDetailDao tasDuplicateDetailDao;

    @Override
    public void save(TasDuplicateDetail obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasDuplicateDetail obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasDuplicateDetail> findAll(Object... values) {
        return tasDuplicateDetailDao.findAll();
    }

    @Override
    public TasDuplicateDetail findOne(Long id) {
        return null;
    }

    @Override
    public TasDuplicateDetail findByParam(String param, Object value) {
        return null;
    }
}
