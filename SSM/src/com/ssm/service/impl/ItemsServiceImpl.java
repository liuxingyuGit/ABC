package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.entity.Items;
import com.ssm.entity.ItemsCustom;
import com.ssm.mapper.ItemsMapper;
import com.ssm.mapper.ItemsMapperCustom;
import com.ssm.service.ItemsService;

public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Autowired
	private ItemsMapper itemsMapper;
	
	/**
	 * 查询所有的商品信息
	 */
	@Override
	public List<ItemsCustom> getAllItems() throws Exception {
		List<ItemsCustom> list = itemsMapperCustom.getAllItems();
		return list;
	}

	/**
	 * 根据 Id 查询商品信息
	 */
	@Override
	public ItemsCustom findItemsById(Integer id) throws Exception {
		Items items = itemsMapper.selectByPrimaryKey(id);
		ItemsCustom itemsCustom = new ItemsCustom();
		BeanUtils.copyProperties(items, itemsCustom);
		return itemsCustom;
	}

}
