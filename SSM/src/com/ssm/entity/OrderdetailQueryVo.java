package com.ssm.entity;

import java.util.List;

/**
 * 订单明细的包装类
 */
public class OrderdetailQueryVo {

	// 包含了购买商品的信息
	private List<Buy> itemsList;

	public List<Buy> getItemsList() {
		return itemsList;
	}

	public void setItemsList(List<Buy> itemsList) {
		this.itemsList = itemsList;
	}

}