package com.jubao.common.annotation;

import com.jubao.common.support.orm.db.DataSourceEnum;

import java.lang.annotation.*;

/**
 * 数据源注解
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

    DataSourceEnum value() default DataSourceEnum.LOAN_ASSET;

}
