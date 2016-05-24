package com.ssm.entity;

import java.util.Date;

/**
 * 订单明细的扩展类
 */
public class OrderdetailCustom extends Orderdetail {
	// 商品总额(一个明细 对应 一个总额)
	private Float amount;
	// 订单明细创建的时间
	private Date createtime;

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