package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.Page;
import com.demo.entity.User;
import com.demo.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 登录
	 * 
	 * @param id
	 * @param password
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/login")
	public User login(Integer id, String password, HttpSession session) {
		User user = userService.login(id, password);
		if (user != null) {
			session.setAttribute("user", user);
			return user;
		}
		return null;
	}

	/**
	 * 注册
	 * 
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/register")
	public int register(User user) {
		int result = userService.register(user);
		if (result > 0) {
			return result;
		}
		return 0;
	}

	/**
	 * 分页查询用户
	 * 
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/userlist")
	public Map<String, Object> userlist(Integer page, Integer rows) {
		Map<String, Object> map = new HashMap<String, Object>();
		Page p = new Page();
		p.setPage((page - 1) * rows);
		p.setRows(rows);
		List<User> list = userService.findByPage(p);
		map.put("total", userService.findUserCount());
		map.put("rows", list);
		return map;
	}

	/**
	 * 删除用户
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/delUser")
	public int delUser(Integer id) {
		int result = userService.deleteUser(id);
		if (result > 0) {
			return result;
		}
		return 0;
	}

}
