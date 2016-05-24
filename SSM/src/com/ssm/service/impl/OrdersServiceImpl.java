package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.entity.Orders;
import com.ssm.entity.OrdersCustom;
import com.ssm.mapper.OrdersMapperCustom;
import com.ssm.service.OrdersService;

public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersMapperCustom ordersMapperCustom;

	/**
	 * 添加订单
	 * 
	 * @param record
	 * @return
	 */
	@Override
	public int insertOrders(Orders record) throws Exception {
		int result = ordersMapperCustom.insertOrders(record);
		return result;
	}

	/**
	 * 查询订单 及 关联查询 订单明细(数量，总额)、商品信息(名称，价格)
	 * 
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<OrdersCustom> findOrderAndItems(Integer orders_id) throws Exception {
		List<OrdersCustom> orderList = null;
		if (orders_id != null) {
			orderList = ordersMapperCustom.findOrderAndItems(orders_id);
			if (!orderList.isEmpty()) {
				return orderList;
			} else {
				throw new Exception("没有该订单编号的信息");
			}
		} else {
			throw new Exception("请输入订单编号");
		}
	}

}
