/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasMonServiceStatistic;
import com.aratek.dao.TasMonServiceStatisticDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasMonServiceStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasMonServiceStatisticService")
public class TasMonServiceStatisticServiceImpl implements TasMonServiceStatisticService {

    @Autowired
    private TasMonServiceStatisticDao tasMonServiceStatisticDao;

    @Override
    public void save(TasMonServiceStatistic obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasMonServiceStatistic obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasMonServiceStatistic> findAll(Object... values) {
        return tasMonServiceStatisticDao.findAll();
    }

    @Override
    public TasMonServiceStatistic findOne(Long id) {
        return null;
    }

    @Override
    public TasMonServiceStatistic findByParam(String param, Object value) {
        return null;
    }
}
