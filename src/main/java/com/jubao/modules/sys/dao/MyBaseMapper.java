package com.jubao.modules.sys.dao;

import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.*;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * 〈一句话功能简述〉<br>
 * 〈通用基础mapper〉
 *
 * @author yuanxianchu
 * @create 2019/1/16
 * @since 1.0.0
 */
@RegisterMapper
public interface MyBaseMapper<T> extends
        BaseMapper<T>,
        ExampleMapper<T>,
        RowBoundsMapper<T>,
        Marker,
        IdsMapper<T>, MySqlMapper<T> {

}