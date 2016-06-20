package com.demo.service;

import java.util.List;

import com.demo.entity.Orders;
import com.demo.entity.Page;

public interface OrderService {

	// 分页查询订单
	List<Orders> findByPage(Page page);

	// 获取订单总数
	int findOrderCount();

}
