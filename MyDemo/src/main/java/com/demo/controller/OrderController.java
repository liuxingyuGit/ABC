package com.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.entity.Orders;
import com.demo.entity.Page;
import com.demo.service.OrderService;

@Controller
@RequestMapping(value = "/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	/**
	 * 分页查询订单
	 * 
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/orderlist")
	public Map<String, Object> orderlist(Integer page, Integer rows) {
		Map<String, Object> map = new HashMap<String, Object>();
		Page p = new Page();
		p.setPage((page - 1) * rows);
		p.setRows(rows);
		List<Orders> list = orderService.findByPage(p);
		map.put("total", orderService.findOrderCount());
		map.put("rows", list);
		return map;
	}
}
