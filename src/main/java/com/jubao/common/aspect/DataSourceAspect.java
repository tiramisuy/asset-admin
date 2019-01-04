package com.jubao.common.aspect;

import com.jubao.common.annotation.DataSource;
import com.jubao.common.support.orm.db.DataSourceContextHolder;
import com.jubao.common.support.orm.db.DataSourceEnum;
import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 数据源切面处理
 */
@Aspect
@Component
public class DataSourceAspect {

    private static Logger LOG = LoggerFactory.getLogger(DataSourceAspect.class);

    @Pointcut("@annotation(com.jubao.common.annotation.DataSource)")
    public void pointCut() {

    }

    @Around("pointCut()")
    public Object doAround(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        DataSource ds = method.getAnnotation(DataSource.class);

        DataSourceEnum value = ds.value();
        if (value.getName().equals(DataSourceEnum.LOAN_ASSET.getName())) {
            DataSourceContextHolder.setDataSource(DataSourceEnum.LOAN_ASSET.getName());
            LOG.debug("set datasource is null, use datasource : {}", DataSourceEnum.LOAN_ASSET.getName());
        } else if (value.getName().equals(DataSourceEnum.LOANS.getName())) {
            DataSourceContextHolder.setDataSource(DataSourceEnum.LOAN_ASSET.getName());
            LOG.debug("use datasource : {}", DataSourceEnum.LOAN_ASSET.getName());
        } else if (value.getName().equals(DataSourceEnum.CREDIT.getName())) {
            DataSourceContextHolder.setDataSource(DataSourceEnum.CREDIT.getName());
            LOG.debug("use datasource : {}", DataSourceEnum.CREDIT.getName());
        }

        try {
            return point.proceed();
        } finally {
            DataSourceContextHolder.clear();
            LOG.debug("clear datasource...");
        }

    }

}
