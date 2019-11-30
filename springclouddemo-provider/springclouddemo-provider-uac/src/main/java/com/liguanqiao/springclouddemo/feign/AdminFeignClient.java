package com.liguanqiao.springclouddemo.feign;

import com.liguanqiao.springclouddemo.pojo.Admin;
import com.liguanqiao.springclouddemo.service.AdminFeignApi;
import com.liguanqiao.springclouddemo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
public class AdminFeignClient implements AdminFeignApi {

	@Resource
	private AdminService adminService;

	@Value("${server.port}")
	private String port;

	/**
	 * 获取列表
	 * @return
	 */
	@Override
	public List<Admin> list() {
		List<Admin> list = adminService.list();
		if(port.equals("8002")){
			int i = 10 / 0 ;
		}
		list.get(0).setAdminPortrait(port);
		return list;
	}
}
