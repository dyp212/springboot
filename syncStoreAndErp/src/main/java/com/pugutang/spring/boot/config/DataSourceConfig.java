package com.pugutang.spring.boot.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 数据源配置类
 * @author duany
 *
 */
@Configuration
public class DataSourceConfig {

	@Bean(name="oldDS")
	@Primary
	@ConfigurationProperties(prefix="spring.datasource.old")
	public DataSource oldDataSource(){
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name="newDS")
	@ConfigurationProperties(prefix="spring.datasource.new")
	public DataSource newDataSource(){
		return DataSourceBuilder.create().build();
	}
	
	@Value("${mybatis.mapperLocations}")
	private String mybatisMapperLocations;
	@Value("${mybatis.typeAliasesPackage}")
	private String mybatisTypeAliasesPackage;
	
	public String getMybatisMapperLocations(){
		return mybatisMapperLocations;
	}
	
	public String getMybatisTypeAliasesPackage(){
		return mybatisTypeAliasesPackage;
	}
	
}
