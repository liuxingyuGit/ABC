package com.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.entity.Orderdetail;
import com.ssm.entity.OrderdetailCustom;
import com.ssm.mapper.OrderdetailMapperCustom;
import com.ssm.service.OrderDetailService;

public class OrderDetailServiceImpl implements OrderDetailService {

	@Autowired
	private OrderdetailMapperCustom orderdetailMapperCustom;

	@Override
	public int addOrderDetail(OrderdetailCustom orderdetailCustom) throws Exception {
		int result = orderdetailMapperCustom.addOrderDetail(orderdetailCustom);
		return result;
	}

}
