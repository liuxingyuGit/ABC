package com.ssm.entity;

/**
 *
 * 包含了购买商品的所有信息
 */
public class Buy {

	private Integer items_id;// 商品编号
	private Integer items_num;// 商品数量(购买数量)
	private Float items_price;// 商品价格

	public Integer getItems_id() {
		return items_id;
	}

	public void setItems_id(Integer items_id) {
		this.items_id = items_id;
	}

	public Integer getItems_num() {
		return items_num;
	}

	public void setItems_num(Integer items_num) {
		this.items_num = items_num;
	}

	public Float getItems_price() {
		return items_price;
	}

	public void setItems_price(Float items_price) {
		this.items_price = items_price;
	}

}
