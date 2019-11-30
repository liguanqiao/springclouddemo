package com.liguanqiao.springclouddemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 功能描述:
 *
 * @author by lgq
 * @create 2019/10/30
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(basePackages = "com.liguanqiao.springclouddemo.dao")
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@EnableFeignClients
public class SpringCloudDemoTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoTestApplication.class,args);
	}
}
