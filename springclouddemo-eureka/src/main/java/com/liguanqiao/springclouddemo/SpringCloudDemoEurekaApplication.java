package com.liguanqiao.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 功能描述:
 *
 * @author by lgq
 * @create 2019/10/29
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudDemoEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoEurekaApplication.class,args);
	}
}
