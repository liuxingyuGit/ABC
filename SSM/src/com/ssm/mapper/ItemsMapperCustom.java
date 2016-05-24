package com.ssm.mapper;

import java.util.List;

import com.ssm.entity.ItemsCustom;

public interface ItemsMapperCustom {
	/**
	 * 查询所有的商品信息
	 * @return
	 * @throws Exception
	 */
   List<ItemsCustom> getAllItems() throws Exception;
   
}