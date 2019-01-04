package com.jubao.modules.loans.service.impl;

import com.jubao.common.annotation.DataSource;
import com.jubao.common.entity.Page;
import com.jubao.common.entity.Query;
import com.jubao.common.support.orm.db.DataSourceEnum;
import com.jubao.modules.loans.dao.CustUserMapper;
import com.jubao.modules.loans.entity.CustUser;
import com.jubao.modules.loans.service.CustUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wl_code@163.com
 * @version 1.0
 * @date 2019/1/2
 */
@Service("custUserService")
public class CustUserServiceImpl implements CustUserService {

    @Autowired
    private CustUserMapper custUserMapper;


    @Override
    public int save(CustUser t) {
        return 0;
    }

    @Override
    public int save(Query query) {
        return 0;
    }

    @Override
    public int batchSave(List<CustUser> items) {
        return 0;
    }

    @Override
    public CustUser getObject(CustUser t) {
        return null;
    }

    @Override
    public CustUser getObjectById(Object id) {
        return null;
    }

    @Override
    public int update(CustUser t) {
        return 0;
    }

    @Override
    public int update(Query query) {
        return 0;
    }

    @Override
    public int batchUpdate(Query query) {
        return 0;
    }

    @Override
    public int remove(Object id) {
        return 0;
    }

    @Override
    public int removeLogic(Object id) {
        return 0;
    }

    @Override
    public int batchRemove(Object[] id) {
        return 0;
    }

    @Override
    public int batchRemoveLogic(Object[] id) {
        return 0;
    }

    @Override
    public List<CustUser> listForPage(Page<CustUser> page, Query query) {
        return null;
    }

    @Override
    public List<CustUser> list(Query query) {
        return custUserMapper.list(query);
    }

    @Override
    public List<CustUser> list() {
        return custUserMapper.list();
    }

    @Override
    public int countCustUserotal() {
        return 0;
    }

    @Override
    public int countCustUserotal(Query query) {
        return 0;
    }
}
