package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserMapper;
import com.demo.entity.Page;
import com.demo.entity.User;
import com.demo.entity.UserExample;
import com.demo.service.UserService;

@Service("useService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	// 登录
	public User login(Integer id, String password) {
		UserExample userExample = new UserExample();
		UserExample.Criteria cir = userExample.createCriteria();
		cir.andIdEqualTo(id);
		cir.andPasswordEqualTo(password);
		User user = userMapper.selectByExample(userExample).get(0);
		if (user != null) {
			return user;
		}
		return null;
	}

	// 注册
	public int register(User user) {
		int value = userMapper.insertSelective(user);
		if (value > 0) {
			return value;
		}
		return 0;
	}

	public int findUserCount() {
		return userMapper.countByExample(null);
	}

	public List<User> findByPage(Page page) {
		return userMapper.selectByPage(page);
	}

	public int deleteUser(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

}
