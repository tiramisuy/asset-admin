package com.jubao.common.aspect;

import com.jubao.common.support.orm.db.DataSourceContextHolder;
import com.jubao.common.support.orm.db.DataSourceEnum;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 数据源切面处理,credit-data-source
 *
 * @author wl_code@163.com
 * @version 1.0
 * @date 2019/1/2
 */
@Aspect
@Component
public class DataSourceCreditAspect {
    private static Logger LOG = LoggerFactory.getLogger(DataSourceCreditAspect.class);

    @Pointcut("execution(* com.jubao.modules.credit.service.impl..*.*(..))")
    public void pointDBCreditCut() {}

    /**
     * 数据源到credit-data-source
     *
     * @param point
     * @return
     * @throws Throwable
     */
    @Around("pointDBCreditCut()")
    public Object doAround(ProceedingJoinPoint point) throws Throwable {
        DataSourceContextHolder.setDataSource(DataSourceEnum.CREDIT.getName());
        LOG.debug("use datasource : {}", DataSourceEnum.CREDIT.getName());
        try {
            return point.proceed();
        } finally {
            DataSourceContextHolder.clear();
            LOG.debug("clear datasource...");
        }

    }
}
