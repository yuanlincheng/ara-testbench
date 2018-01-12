/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasFpimageDetail;
import com.aratek.dao.TasFpimageDetailDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasFpimageDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasFpimageDetailService")
public class TasFpimageDetailServiceImpl implements TasFpimageDetailService {

    @Autowired
    private TasFpimageDetailDao tasFpimageDetailDao;

    @Override
    public void save(TasFpimageDetail obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasFpimageDetail obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasFpimageDetail> findAll(Object... values) {
        return tasFpimageDetailDao.findAll();
    }

    @Override
    public TasFpimageDetail findOne(Long id) {
        return null;
    }

    @Override
    public TasFpimageDetail findByParam(String param, Object value) {
        return null;
    }
}
