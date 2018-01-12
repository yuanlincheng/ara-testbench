/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasReportHome;
import com.aratek.dao.TasReportHomeDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasReportHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasReportHomeService")
public class TasReportHomeServiceImpl implements TasReportHomeService {

    @Autowired
    private TasReportHomeDao tasReportHomeDao;

    @Override
    public void save(TasReportHome obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasReportHome obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasReportHome> findAll(Object... values) {
        return tasReportHomeDao.findAll();
    }

    @Override
    public TasReportHome findOne(Long id) {
        return null;
    }

    @Override
    public TasReportHome findByParam(String param, Object value) {
        return null;
    }
}
