package com.demo.entity;

public class Page {

	private Integer rows;
	private Integer page;
	private ProductCondition productCondition;

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public ProductCondition getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(ProductCondition productCondition) {
		this.productCondition = productCondition;
	}

}
