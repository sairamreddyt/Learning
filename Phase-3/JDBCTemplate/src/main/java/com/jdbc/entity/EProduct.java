package com.jdbc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EProduct {
	private long Id;
	private String name;
	private BigDecimal price;
	private Date date;
	public EProduct() {
	}
	public EProduct(long id, String name, BigDecimal price, Date date) {
		Id = id;
		this.name = name;
		this.price = price;
		this.date = date;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
