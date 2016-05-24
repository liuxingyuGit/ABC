package com.ssm.service;

import java.util.HashMap;
import java.util.List;

import com.ssm.entity.User;
import com.ssm.entity.UserCustom;

public interface UserService {
	/**
	 * 用户登录
	 * @return
	 * @throws Exception
	 */
	UserCustom login(HashMap hashmap) throws Exception;
	
	/**
	 * 添加新用户
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	int addNewUser(UserCustom userCustom) throws Exception;

	/**
	 * 检查用户名是否已经存在
	 * 
	 * @param username
	 * @return
	 * @throws Exception
	 */
	boolean findUserByUserName(String username) throws Exception;
}
