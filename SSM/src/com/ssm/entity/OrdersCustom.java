package com.ssm.entity;

/**
 * 订单(Orders)类的扩展类
 * 
 * @author Employee
 *
 */
public class OrdersCustom extends Orders {

	/**
	 * 显示订单相关信息
	 */
	private Integer itemsNum;// 商品数量
	private Float amount;// 一条明细的总额
	private String name;// 商品名
	private Float price;// 商品价格

	public Integer getItemsNum() {
		return itemsNum;
	}

	public void setItemsNum(Integer itemsNum) {
		this.itemsNum = itemsNum;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}