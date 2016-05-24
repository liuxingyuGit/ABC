package com.ssm.mapper;

import com.ssm.entity.Orders;
import com.ssm.entity.OrdersCustom;
import java.util.List;

public interface OrdersMapperCustom {

	/**
	 * 添加订单
	 * 
	 * @param record
	 * @return
	 */
	int insertOrders(Orders record) throws Exception;

	/**
	 * 查询订单 及 关联查询 订单明细(数量，总额)、商品信息(名称，价格)
	 * 
	 * @return
	 * @throws Exception
	 */
	List<OrdersCustom> findOrderAndItems(Integer orders_id) throws Exception;
}