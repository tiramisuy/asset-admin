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
 * 数据源切面处理,loan-data-source
 *
 * @author wl_code@163.com
 * @version 1.0
 * @date 2019/1/2
 */
@Aspect
@Component
public class DataSourceLoansAspect {
    private static Logger LOG = LoggerFactory.getLogger(DataSourceLoansAspect.class);

    @Pointcut("execution(* com.jubao.modules.loans.service.impl..*.*(..))")
    public void pointDBLoansCut() {
    }

    /**
     * 数据源到loans-data-source
     *
     * @param point
     * @return
     * @throws Throwable
     */
    @Around("pointDBLoansCut()")
    public Object doAround(ProceedingJoinPoint point) throws Throwable {
        DataSourceContextHolder.setDataSource(DataSourceEnum.LOANS.getName());
        LOG.debug("use datasource : {}", DataSourceEnum.LOANS.getName());
        try {
        return point.proceed();
        } finally {
            DataSourceContextHolder.clear();
            LOG.debug("clear datasource...");
        }

    }
}
