package com.jubao.modules.loans.dao;

import com.jubao.common.entity.Query;
import com.jubao.modules.loans.entity.CustUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wl_code@163.com
 * @version 1.0
 * @date 2019/1/2
 */
@Mapper
public interface CustUserMapper {

    List<CustUser> list(Query query);

    List<CustUser> list();
}
