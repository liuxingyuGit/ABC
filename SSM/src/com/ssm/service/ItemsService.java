package com.ssm.service;

import java.util.List;

import com.ssm.entity.ItemsCustom;

public interface ItemsService {

	/**
	 * 查询所有的商品信息
	 * @return
	 * @throws Exception
	 */
	List<ItemsCustom> getAllItems() throws Exception;
	
	/**
	 * 根据 Id 查询商品信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	ItemsCustom findItemsById(Integer id) throws Exception;
}
