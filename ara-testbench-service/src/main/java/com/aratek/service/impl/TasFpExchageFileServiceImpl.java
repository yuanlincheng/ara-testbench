/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasFpExchageFile;
import com.aratek.dao.TasFpExchageFileDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasFpExchageFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasFpExchageFileService")
public class TasFpExchageFileServiceImpl implements TasFpExchageFileService {

    @Autowired
    private TasFpExchageFileDao tasFpExchageFileDao;

    @Override
    public void save(TasFpExchageFile obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasFpExchageFile obj, String operator, String id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(String id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasFpExchageFile> findAll(Object... values) {
        return tasFpExchageFileDao.findAll();
    }

    @Override
    public TasFpExchageFile findOne(String id) {
        return null;
    }

    @Override
    public TasFpExchageFile findByParam(String param, Object value) {
        return null;
    }
}
