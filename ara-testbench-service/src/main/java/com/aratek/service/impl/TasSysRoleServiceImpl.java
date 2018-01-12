/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import com.aratek.model.TasSysRole;
import com.aratek.dao.TasSysRoleDao;
import com.aratek.exception.InternalServiceException;
import com.aratek.service.TasSysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("tasSysRoleService")
public class TasSysRoleServiceImpl implements TasSysRoleService {

    @Autowired
    private TasSysRoleDao tasSysRoleDao;

    @Override
    public void save(TasSysRole obj, String operator, Object... values) throws InternalServiceException {

    }

    @Override
    public void update(TasSysRole obj, String operator, Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public void delete(Long id, Object... values) throws InternalServiceException {

    }

    @Override
    public List<TasSysRole> findAll(Object... values) {
        return tasSysRoleDao.findAll();
    }

    @Override
    public TasSysRole findOne(Long id) {
        return null;
    }

    @Override
    public TasSysRole findByParam(String param, Object value) {
        return null;
    }
}
