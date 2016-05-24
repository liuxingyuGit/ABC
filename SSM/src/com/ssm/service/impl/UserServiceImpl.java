package com.ssm.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.entity.User;
import com.ssm.entity.UserCustom;
import com.ssm.mapper.UserMapper;
import com.ssm.mapper.UserMapperCustom;
import com.ssm.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapperCustom userMapperCustom;

	@Autowired
	private UserMapper userMapper;

	/**
	 * 登录的实现类
	 */
	@Override
	public UserCustom login(HashMap hashmap) throws Exception {
		if (hashmap.containsKey("id") && hashmap.containsKey("password")) {
			UserCustom userCustom = userMapperCustom.findByIdAndPassword(hashmap);
			return userCustom;
		}
		return null;
	}

	/**
	 * 添加新用户
	 */
	@Override
	public int addNewUser(UserCustom userCustom) throws Exception {
		int result = userMapperCustom.addNewUser(userCustom);
		return result;
	}

	/**
	 * 检查用户名是否已经存在
	 */
	@Override
	public boolean findUserByUserName(String username) throws Exception {
		List<String> list = userMapperCustom.findUserByUserName(username);
		if(list.isEmpty()){
			return false;
		}else{
			return true;
		}
		
	}

}
