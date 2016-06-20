package com.demo.entity;

import java.util.Date;

public class Orderdetail {
	private Integer id;

	private Integer ordersId;

	private Integer itemsId;

	private Integer itemsNum;

	private Float amount;

	private Date createtime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}

	public Integer getItemsId() {
		return itemsId;
	}

	public void setItemsId(Integer itemsId) {
		this.itemsId = itemsId;
	}

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

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
}