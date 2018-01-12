/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.Tas1to1VerifyResult;
import com.aratek.dao.Tas1to1VerifyResultDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.Tas1to1VerifyResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tas1to1VerifyResultService")
public class Tas1to1VerifyResultServiceImpl implements Tas1to1VerifyResultService {

    @Autowired
    private Tas1to1VerifyResultDao tas1to1VerifyResultDao;

    @Override
    public void save(Tas1to1VerifyResult obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(Tas1to1VerifyResult obj, String operator, String id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(String id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<Tas1to1VerifyResult> findAll(Object... values) {
        return tas1to1VerifyResultDao.findAll();
    }

    @Override
    public Tas1to1VerifyResult findOne(String id) {
        return null;
    }

    @Override
    public Tas1to1VerifyResult findByParam(String param, Object value) {
        return null;
    }
}
