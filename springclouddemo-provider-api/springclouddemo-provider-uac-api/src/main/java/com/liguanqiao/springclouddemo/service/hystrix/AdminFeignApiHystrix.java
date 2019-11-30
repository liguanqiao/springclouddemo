package com.liguanqiao.springclouddemo.service.hystrix;

import com.liguanqiao.springclouddemo.pojo.Admin;
import com.liguanqiao.springclouddemo.service.AdminFeignApi;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述:
 *
 * @author by lgq
 * @create 2019/10/30
 */
@Component
public class AdminFeignApiHystrix implements FallbackFactory<AdminFeignApi> {

	@Override
	public AdminFeignApi create(Throwable throwable) {
		return new AdminFeignApi(){
			@Override
			public List<Admin> list() {
				System.out.println("负载均衡");
				return null;
			}
		};
	}
}
