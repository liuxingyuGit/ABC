package com.ssm.entity;

/**
 * 商品信息查询的包装类
 */
public class ItemsQueryVo {
	// 商品信息
	private Items items;
	// 为了系统 可扩展性，对原始生成的实体类进行扩展
	private ItemsCustom itemsCustom;
	
	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}

}