package com.liguanqiao.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 功能描述:
 *
 * @author by lgq
 * @create 2019/10/29
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class SpringCloudDemoConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoConfigApplication.class,args);
	}
}
