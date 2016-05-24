package com.ssm.entity;

/**
 * 用户的扩展类
 * 
 * @author Employee
 *
 */
public class UserCustom extends User {
	// 用户的权限（0管理员——1普通用户）
	private Integer userRoot;

	public Integer getUserRoot() {
		return userRoot;
	}

	public void setUserRoot(Integer userRoot) {
		this.userRoot = userRoot;
	}

}