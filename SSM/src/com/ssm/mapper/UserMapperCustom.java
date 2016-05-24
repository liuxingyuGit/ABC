package com.ssm.mapper;

import java.util.HashMap;
import java.util.List;

import com.ssm.entity.User;
import com.ssm.entity.UserCustom;

public interface UserMapperCustom {

	/**
	 * 根据 id 和 password 查询用户 登录查询
	 * 
	 * @param id
	 * @param password
	 * @return
	 * @throws Exception
	 */
	UserCustom findByIdAndPassword(HashMap hashmap) throws Exception;

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
	List<String> findUserByUserName(String username) throws Exception;

}