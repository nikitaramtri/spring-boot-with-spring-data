package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="ORDER_MASTER")
@Entity
public class OrderEntity {
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="title", length = 255, nullable = true)
	private String title;
	
	@Column(name="price")
	private double price;
	
	@Column(name="quantity")
	private int quantity;
	
	public OrderEntity() {}
	public OrderEntity(long id, String title, double price, int quantity) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", title=" + title + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
