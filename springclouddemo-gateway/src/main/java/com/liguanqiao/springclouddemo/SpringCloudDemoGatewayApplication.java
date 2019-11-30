package com.liguanqiao.springclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 功能描述:
 *
 * @author by lgq
 * @create 2019/10/29
 */
@SpringBootApplication
@EnableZuulProxy
public class SpringCloudDemoGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoGatewayApplication.class,args);
	}
}
