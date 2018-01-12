/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasFpimage;
import com.aratek.dao.TasFpimageDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasFpimageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasFpimageService")
public class TasFpimageServiceImpl implements TasFpimageService {

    @Autowired
    private TasFpimageDao tasFpimageDao;

    @Override
    public void save(TasFpimage obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasFpimage obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasFpimage> findAll(Object... values) {
        return tasFpimageDao.findAll();
    }

    @Override
    public TasFpimage findOne(Long id) {
        return null;
    }

    @Override
    public TasFpimage findByParam(String param, Object value) {
        return null;
    }
}
