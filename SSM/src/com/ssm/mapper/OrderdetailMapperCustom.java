package com.ssm.mapper;

import com.ssm.entity.OrderdetailCustom;

/**
 * 自定义的订单明细Dao接口
 */
public interface OrderdetailMapperCustom {

	/**
	 * 添加订单明细
	 * 
	 * @param orderdetailCustom
	 * @return
	 * @throws Exception
	 */
	int addOrderDetail(OrderdetailCustom orderdetailCustom) throws Exception;
}