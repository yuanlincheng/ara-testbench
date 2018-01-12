/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasImportImg;
import com.aratek.dao.TasImportImgDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasImportImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasImportImgService")
public class TasImportImgServiceImpl implements TasImportImgService {

    @Autowired
    private TasImportImgDao tasImportImgDao;

    @Override
    public void save(TasImportImg obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasImportImg obj, String operator, String id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(String id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasImportImg> findAll(Object... values) {
        return tasImportImgDao.findAll();
    }

    @Override
    public TasImportImg findOne(String id) {
        return null;
    }

    @Override
    public TasImportImg findByParam(String param, Object value) {
        return null;
    }
}
