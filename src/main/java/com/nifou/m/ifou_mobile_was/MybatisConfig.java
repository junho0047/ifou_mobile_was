package com.nifou.m.ifou_mobile_was;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
// application.properties 설정 대신 좀더 상세한 설정을 위한 config
@Configuration
@Lazy
//@EnableTransactionManagement
@RequiredArgsConstructor
@MapperScan(basePackages = "com.nifou.m.ifou_mobile_was.mybatis.mapper")
public class MybatisConfig {

    private final ApplicationContext context;

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {

        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

        sessionFactory.setDataSource(dataSource);
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        sessionFactory.setMapperLocations(
                context.getResources( // 1
                        // 실제 쿼리가 들어갈 xml 패키지 경로
                        "classpath:mybatis/mapper/*.xml"
                ));

        // Value Object를 선언해 놓은 package 경로
        // Mapper의 result, parameterType의 패키지 경로를 클래스만 작성 할 수 있도록 도와줌.
        sessionFactory.setTypeAliasesPackage( "mybatis/mybatis-config.xml" );
        sessionFactory.setConfigLocation(
                context.getResource(
                        // 마이바티스 관련 설정
                        "classpath:mybatis/mybatis-config.xml"
                ));
        return sessionFactory.getObject();
    }

    // Mybatis Template
    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);

        sqlSessionTemplate.getConfiguration().setMapUnderscoreToCamelCase(true);

//        sqlSessionTemplate.getConfiguration().setUseGeneratedKeys(true);
        return sqlSessionTemplate;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}