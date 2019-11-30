package com.liguanqiao.springclouddemo.service;

import com.liguanqiao.springclouddemo.pojo.Admin;
import com.liguanqiao.springclouddemo.service.hystrix.AdminFeignApiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "springclouddemo-provider-uac",fallbackFactory = AdminFeignApiHystrix.class)
public interface AdminFeignApi {

	/**
	 * 获取列表
	 * @return
	 */
	@GetMapping(value = "/api/admin/list")
	List<Admin> list();
}
