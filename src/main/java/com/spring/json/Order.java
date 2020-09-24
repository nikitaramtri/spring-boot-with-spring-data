package com.spring.json;

public class Order {
	private long id;
	private String title;
	private double price;
	private int quantity;
	
	public Order() {}
	public Order(long id, String title, double price, int quantity) {
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
