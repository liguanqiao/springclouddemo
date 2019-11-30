package com.liguanqiao.springclouddemo.service.impl;

import com.liguanqiao.springclouddemo.pojo.Admin;
import com.liguanqiao.springclouddemo.dao.AdminMapper;
import com.liguanqiao.springclouddemo.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lgq
 * @since 2019-10-29
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
