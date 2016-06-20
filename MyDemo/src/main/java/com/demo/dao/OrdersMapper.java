package com.demo.dao;

import com.demo.entity.Orders;
import com.demo.entity.OrdersExample;
import com.demo.entity.Page;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
	int countByExample(OrdersExample example);

	int deleteByExample(OrdersExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(Orders record);

	int insertSelective(Orders record);

	List<Orders> selectByExample(OrdersExample example);

	List<Orders> selectByPage(Page page);

	Orders selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

	int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

	int updateByPrimaryKeySelective(Orders record);

	int updateByPrimaryKey(Orders record);
}