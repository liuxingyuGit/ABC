package com.demo.entity;

import java.util.Date;

public class Product {
	private Integer proid;

	private String proname;

	private Float marketprice;

	private Float memberprice;

	private Date cometime;

	private String pic;

	private String prodetail;

	public Integer getProid() {
		return proid;
	}

	public void setProid(Integer proid) {
		this.proid = proid;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname == null ? null : proname.trim();
	}

	public Float getMarketprice() {
		return marketprice;
	}

	public void setMarketprice(Float marketprice) {
		this.marketprice = marketprice;
	}

	public Float getMemberprice() {
		return memberprice;
	}

	public void setMemberprice(Float memberprice) {
		this.memberprice = memberprice;
	}

	public Date getCometime() {
		return cometime;
	}

	public void setCometime(Date cometime) {
		this.cometime = cometime;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic == null ? null : pic.trim();
	}

	public String getProdetail() {
		return prodetail;
	}

	public void setProdetail(String prodetail) {
		this.prodetail = prodetail == null ? null : prodetail.trim();
	}
}