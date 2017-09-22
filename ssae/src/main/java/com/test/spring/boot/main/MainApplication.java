package com.test.spring.boot.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
/**
 * 项目启动主类
 * @author duany
 *
 */
@MapperScan(basePackages={"com.pugutang.spring.boot.dao.newDao","com.pugutang.spring.boot.dao.oldDao"})
@SpringBootApplication
@ComponentScan(basePackages={"com.pugutang.spring.boot"})
@EnableScheduling
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
	
	
}
