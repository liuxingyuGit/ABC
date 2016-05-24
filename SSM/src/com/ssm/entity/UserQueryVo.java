package com.ssm.entity;

/**
 * 用户的包装类(包装了查询用户的相关信息)
 * 
 * @author Employee
 *
 */
public class UserQueryVo {

	//用户信息
	private User user;

	// 为了系统 可扩展性，对原始生成的实体类进行扩展
	private UserCustom userCustom;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}

}