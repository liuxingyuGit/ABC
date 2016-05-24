package com.ssm.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.entity.User;
import com.ssm.entity.UserCustom;
import com.ssm.service.ItemsService;
import com.ssm.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private ItemsService itemsService;

	// 登录 ——>首页（显示商品信息）
	@RequestMapping(value = "/userLogin")
	public String userLogin(Integer id, String password, Model model, HttpServletRequest request) throws Exception {
		HashMap hashmap = new HashMap();
		hashmap.put("id", id);
		hashmap.put("password", password);
		UserCustom userCustom = userService.login(hashmap);
		model.addAttribute("user", userCustom);
		request.getSession().setAttribute("user", userCustom);
		// 所有的商品信息
		model.addAttribute("itemsList", itemsService.getAllItems());
		return "index";
	}

	//添加员工
	@RequestMapping(value = "/register")
	public String addNewUser(UserCustom userCustom) throws Exception {
		userCustom.setUserRoot(1);
		int result = userService.addNewUser(userCustom);
		if (result > 0) {
			return "login";
		} else {
			return "register";
		}
	}

	/**
	 * 检查用户名是否存在 返回 json数据
	 * 
	 * @param username
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/existsName")
	public boolean existsName(String username) throws Exception {
		boolean flag = userService.findUserByUserName(username);
		if (flag) {
			return false;
		}
		return true;
	}

}
