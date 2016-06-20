package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.OrdersMapper;
import com.demo.entity.Orders;
import com.demo.entity.Page;
import com.demo.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrdersMapper ordersMapper;

	public List<Orders> findByPage(Page page) {
		return ordersMapper.selectByPage(page);
	}

	public int findOrderCount() {
		return ordersMapper.countByExample(null);
	}

}
