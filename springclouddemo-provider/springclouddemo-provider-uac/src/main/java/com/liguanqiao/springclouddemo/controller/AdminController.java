package com.liguanqiao.springclouddemo.controller;


import com.liguanqiao.springclouddemo.service.AdminFeignApi;
import com.liguanqiao.springclouddemo.service.AdminService;
import com.liguanqiao.springclouddemo.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lgq
 * @since 2019-10-29
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Value("${server.port}")
	private String port;

	@Resource
	private AdminService adminService;

	@Resource
	private AdminFeignApi adminFeignApi;

	@GetMapping("/list")
	public List<Admin> list(){
		List<Admin> list = adminService.list();
		list.get(0).setAdminPortrait(port);
		return list;
	}

	@GetMapping("/list1")
	public List<Admin> list1(){
		return adminFeignApi.list();
	}
}

