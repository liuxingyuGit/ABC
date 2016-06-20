package com.demo.service;

import java.util.List;

import com.demo.entity.Page;
import com.demo.entity.User;

public interface UserService {

	// 登录
	User login(Integer id, String password);

	// 注册
	int register(User user);

	// 获取用户总数
	int findUserCount();

	// 分页查询用户
	List<User> findByPage(Page page);

	// 删除用户
	int deleteUser(Integer id);
}
