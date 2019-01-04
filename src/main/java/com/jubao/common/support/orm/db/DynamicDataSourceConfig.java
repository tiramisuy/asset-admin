package com.jubao.common.support.orm.db;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * 配置多数据源
 */
@Configuration
public class DynamicDataSourceConfig {

    /**
     * 动态数据源配置
     *
     * @return
     */
    @Bean
    @Primary
    public DataSource multipleDataSource(@Qualifier("loan-asset") DataSource loanAsset, @Qualifier("loans") DataSource loans, @Qualifier("credit") DataSource credit) {
        MultipleDataSource multipleDataSource = new MultipleDataSource();
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DataSourceEnum.LOAN_ASSET.getName(), loanAsset);
        targetDataSources.put(DataSourceEnum.LOANS.getName(), loans);
        targetDataSources.put(DataSourceEnum.CREDIT.getName(), credit);
        //添加数据源
        multipleDataSource.setTargetDataSources(targetDataSources);
        //设置默认数据源
        multipleDataSource.setDefaultTargetDataSource(loanAsset);
        return multipleDataSource;
    }

    @Bean(name = "loan-asset")
    @ConfigurationProperties(prefix = "spring.datasource.druid.loan-asset")
    public DataSource loanAsset() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "loans")
    @ConfigurationProperties(prefix = "spring.datasource.druid.loans")
    public DataSource loans() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "credit")
    @ConfigurationProperties(prefix = "spring.datasource.druid.credit")
    public DataSource credit() {
        return DruidDataSourceBuilder.create().build();
    }


//    @Bean("sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
//        sqlSessionFactory.setDataSource(multipleDataSource(loanAsset(),loans(),credit()));
//        //sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/*/*Mapper.xml"));
//        //sqlSessionFactory.setGlobalConfig(globalConfiguration());
//        return sqlSessionFactory.getObject();
//    }
}
