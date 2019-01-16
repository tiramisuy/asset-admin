package com.jubao.modules.sys.service.impl;

import com.jubao.modules.sys.dao.MyBaseMapper;
import com.jubao.modules.sys.service.BaseService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈基础通用服务〉
 *
 * @author yuanxianchu
 * @create 2019/1/16
 * @since 1.0.0
 */
public class BaseServiceImpl<T, M extends MyBaseMapper<T>> implements BaseService<T> {

    @Autowired
    private M mapper;

    @Override
    public int insert(T record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(T record) {
        return mapper.insertSelective(record);
    }

    @Override
    public boolean existsWithPrimaryKey(Object key) {
        return mapper.existsWithPrimaryKey(key);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public T selectByPrimaryKey(Object key) {
        return mapper.selectByPrimaryKey(key);
    }

    @Override
    public int selectCount(T record) {
        return mapper.selectCount(record);
    }

    @Override
    public List<T> select(T record) {
        return mapper.select(record);
    }

    @Override
    public T selectOne(T record) {
        return mapper.selectOne(record);
    }

    @Override
    public int updateByPrimaryKey(T record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByExample(Object example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

    @Override
    public int selectCountByExample(Object example) {
        return mapper.selectCountByExample(example);
    }

    @Override
    public T selectOneByExample(Object example) {
        return mapper.selectOneByExample(example);
    }

    @Override
    public int updateByExample(T record, Object example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByExampleSelective(T record, Object example) {
        return mapper.updateByExampleSelective(record, example);
    }

    @Override
    public int deleteByIds(String ids) {
        return mapper.deleteByIds(ids);
    }

    @Override
    public List<T> selectByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    @Override
    public List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {
        return mapper.selectByExampleAndRowBounds(example,rowBounds);
    }

    @Override
    public List<T> selectByRowBounds(T record, RowBounds rowBounds) {
        return mapper.selectByRowBounds(record,rowBounds);
    }

    @Override
    public int insertList(List<? extends T> recordList) {
        return mapper.insertList(recordList);
    }

    @Override
    public int insertUseGeneratedKeys(T record) {
        return mapper.insertUseGeneratedKeys(record);
    }

    @Override
    public int deleteByPrimaryKey(Object key) {
        return mapper.deleteByPrimaryKey(key);
    }

    @Override
    public int delete(T record) {
        return mapper.delete(record);
    }
}
