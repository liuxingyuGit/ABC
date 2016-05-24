package com.ssm.service;

import com.ssm.entity.OrderdetailCustom;

public interface OrderDetailService {
	/**
	 * 添加订单明细
	 * 
	 * @return
	 * @throws Exception
	 */
	int addOrderDetail(OrderdetailCustom orderdetailCustom) throws Exception;
}
