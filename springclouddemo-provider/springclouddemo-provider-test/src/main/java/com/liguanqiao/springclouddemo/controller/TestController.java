package com.liguanqiao.springclouddemo.controller;

import com.liguanqiao.springclouddemo.pojo.Admin;
import com.liguanqiao.springclouddemo.service.AdminFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述:
 *
 * @author by lgq
 * @create 2019/10/30
 */
@RestController
public class TestController {

	@Autowired
	private AdminFeignApi adminFeignApi;

	@GetMapping("/test/list")
	public List<Admin> list(){
		return adminFeignApi.list();
	}
}
