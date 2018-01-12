/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service;

import com.aratek.exception.InternalServiceException;
import java.util.List;
import java.io.Serializable;

public interface CommonService<T,ID extends Serializable>  {
    /**
     * 保存对象信息
     * @param obj（对象）
     * @param operator（操作者）
     * @param values（泛型参数，主要是为了适配各种模型）
     * @return
     */
    void save(T obj, String operator, Object... values) throws InternalServiceException;

    /**
     * 修改对象信息
     * @param obj（对象）
     * @param operator（操作者）
     * @param id（标示ID）
     * @param values（泛型参数，主要是为了适配各种模型）
     * @return boolean  是否成功
     */
    void update(T obj, String operator, ID id, Object... values) throws InternalServiceException;

    /**
     * 删除对象
     * @param id（标示ID）
     * @param values（泛型参数，主要是为了适配各种模型）
     * @return 对象
     */
    void delete(ID id, Object... values) throws InternalServiceException;

    /**
     * 获取对象列表
     * @param values（查询条件）
     * @return 对象list
     */
    List<T> findAll(Object... values);

    /**
     * 根据id获取对象
     * @param id（对象id）
     * @return 对象
     */
    T findOne(ID id);

    /**
     * 根据属性以及属性值获取对象
     * @param param 属性以及属性值
     * @return 对象
     */
    T findByParam(String param, Object value);

}

