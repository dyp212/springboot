package com.test.spring.boot.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
/**
 * 老库数据源工厂类
 * @author duany
 *
 */
@Configuration
@MapperScan(basePackages={"com.pugutang.spring.boot.dao.oldDao"}, sqlSessionFactoryRef="oldSqlSessionFactory")
public class MyBatisDBOldConfig {

	@Autowired
	@Qualifier("oldDS")
	private DataSource oldDS;
	@Autowired
	private DataSourceConfig dataSourceConfig;
	
	@Bean
	public SqlSessionFactory oldSqlSessionFactory() throws Exception{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(oldDS);
		factoryBean.setTypeAliasesPackage(dataSourceConfig.getMybatisTypeAliasesPackage());
		factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(dataSourceConfig.getMybatisMapperLocations()));
		return factoryBean.getObject();
	}
	
	@Bean
	public SqlSessionTemplate sqlSessionTemplate() throws Exception{
		SqlSessionTemplate template = new SqlSessionTemplate(oldSqlSessionFactory());
		return template;
		
	}
}
