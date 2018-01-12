/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasMonEnvStatistic;
import com.aratek.dao.TasMonEnvStatisticDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasMonEnvStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasMonEnvStatisticService")
public class TasMonEnvStatisticServiceImpl implements TasMonEnvStatisticService {

    @Autowired
    private TasMonEnvStatisticDao tasMonEnvStatisticDao;

    @Override
    public void save(TasMonEnvStatistic obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasMonEnvStatistic obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasMonEnvStatistic> findAll(Object... values) {
        return tasMonEnvStatisticDao.findAll();
    }

    @Override
    public TasMonEnvStatistic findOne(Long id) {
        return null;
    }

    @Override
    public TasMonEnvStatistic findByParam(String param, Object value) {
        return null;
    }
}
