package com.xsn.redisdemo.dao;//package com.xsn.mybatisdemo.dao;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//@MapperScan
//public class DataSourceCon {
////    配置db1数据库
//    @Bean(name = "db1DataSource")
////    生成db1数据源对象 根据前缀匹配配置文件
//    @ConfigurationProperties(prefix = "spring.datasource.db1")
//    public DataSource testDataSource(){
//        return DataSourceBuilder.create().build();
//    }
////    依赖数据源
//    @Bean(name = "db1SqlSessionFactory")
//    @Primary
//    public SqlSessionFactory testSqlSessionFactory(@Qualifier("db1DataSource") DataSource dataSource) throws Exception{
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        return bean.getObject();
//    }
////    配置事务管理
//    @Bean(name = "db1TransactionManager")
//    public DataSourceTransactionManager testTransactionManager(@Qualifier("db1DataSource") DataSource dataSource){
//        return new DataSourceTransactionManager(dataSource);
//    }
//    @Bean(name = "db1SqlSessionTemplate")
//    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("db1SqlSessionFactory") SqlSessionFactory SqlSessionFactory){
//        return new SqlSessionTemplate(SqlSessionFactory);
//    }
//}
