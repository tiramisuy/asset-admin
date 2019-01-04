package com.jubao.modules.loans.service;

import com.jubao.common.entity.Page;
import com.jubao.common.entity.Query;
import com.jubao.modules.loans.entity.CustUser;

import java.util.List;

/**
 * @author wl_code@163.com
 * @version 1.0
 * @date 2019/1/2
 */
public interface CustUserService  {

    /**
     * 新增
     * @param t
     * @return
     */
    int save(CustUser t);

    /**
     * 新增
     * @param query
     * @return
     */
    int save(Query query);

    /**
     * 批量新增
     * @param items
     * @return
     */
    int batchSave(List<CustUser> items);

    /**
     * 查询详情
     * @param t
     * @return
     */
    CustUser getObject(CustUser t);

    /**
     * 根据id查询详情
     * @param id
     * @return
     */
    CustUser getObjectById(Object id);

    /**
     * 更新
     * @param t
     * @return
     */
    int update(CustUser t);

    /**
     * 更新
     * @param query
     * @return
     */
    int update(Query query);

    /**
     * 批量更新
     * @param query
     * @return
     */
    int batchUpdate(Query query);

    /**
     * 删除
     * @param id
     * @return
     */
    int remove(Object id);

    /**
     * 逻辑删除
     * @param id
     * @return
     */
    int removeLogic(Object id);

    /**
     * 批量删除
     * @param id
     * @return
     */
    int batchRemove(Object[] id);

    /**
     * 批量逻辑删除
     * @param id
     * @return
     */
    int batchRemoveLogic(Object[] id);

    /**
     * 分页查询列表
     * @param page
     * @param query
     * @return
     */
    List<CustUser> listForPage(Page<CustUser> page, Query query);

    /**
     * 查询列表
     * @param query
     * @return
     */
    List<CustUser> list(Query query);

    /**
     * 查询列表
     * @return
     */
    List<CustUser> list();

    /**
     * 统计
     * @return
     */
    int countCustUserotal();

    /**
     * 统计
     * @param query
     * @return
     */
    int countCustUserotal(Query query);
}
