package com.spring.service;

import java.util.List;

import com.spring.json.Order;

public interface OrderService {
	List<Order> getAllOrders();

	Order getOrderById(long id);

	void addOrder(Order order);

	void editOrder(Order order);

	void deleteOrderById(long id);

	void deleteOrders();
}
