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
 * 数据源切面处理,loan-asset-data-source
 */
@Aspect
@Component
public class DataSourceLoanAssetAspect {

    private static Logger LOG = LoggerFactory.getLogger(DataSourceLoanAssetAspect.class);

    @Pointcut("execution(* com.jubao.modules.sys.service.impl..*.*(..))")
    public void pointDBLoanAssetCut() {}

    /**
     * 数据源到loan-asset-data-source
     * @param point
     * @return
     * @throws Throwable
     */
    @Around("pointDBLoanAssetCut()")
    public Object doAround(ProceedingJoinPoint point) throws Throwable {
        DataSourceContextHolder.setDataSource(DataSourceEnum.LOAN_ASSET.getName());
        LOG.debug("use datasource : {}", DataSourceEnum.LOAN_ASSET.getName());
//        MethodSignature signature = (MethodSignature) point.getSignature();
//        Method method = signature.getMethod();
//        DataSource ds = method.getAnnotation(DataSource.class);
//
//        DataSourceEnum value = ds.value();
//        // 设置为loans库
//        if (value.equals(DataSourceEnum.LOANS)) {
//            DynamicDataSource.setDataSource(DataSourceEnum.LOANS.getName());
//            LOG.debug("set datasource is null, use datasource : {}", DataSourceEnum.LOANS.getName());
//            // 设置为 loan_asset库
//        } else if (value.equals(DataSourceEnum.LOAN_ASSET)) {
//            DynamicDataSource.setDataSource(DataSourceEnum.LOAN_ASSET.getName());
//            LOG.debug("use datasource : {}", DataSourceEnum.LOAN_ASSET.getName());
//            // 设置为 credit库
//        } else if (value.equals(DataSourceEnum.CREDIT)) {
//            DynamicDataSource.setDataSource(DataSourceEnum.CREDIT.getName());
//            LOG.debug("use datasource : {}", DataSourceEnum.CREDIT.getName());
//        }
        try {
            return point.proceed();
        } finally {
            DataSourceContextHolder.clear();
            LOG.debug("clear datasource...");
        }

    }



}
