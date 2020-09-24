package com.spring.utils;

import java.util.ArrayList;
import java.util.List;

import com.spring.entity.OrderEntity;
import com.spring.json.Order;

public class OrderUtil {

	public static Order convertOrderEntityIntoOrder(OrderEntity orderEntity) {
		return new Order(orderEntity.getId(), orderEntity.getTitle(), orderEntity.getPrice(),
				orderEntity.getQuantity());
	}
	
	public static OrderEntity convertOrderIntoOrderEntity(Order order) {
		return new OrderEntity(order.getId(), order.getTitle(), order.getPrice(),
				order.getQuantity());
	}

	public static List<Order> convertOrderEntityListIntoOrderList(List<OrderEntity> orderEntitiList) {
		List<Order> orders = new ArrayList<Order>();
		for (OrderEntity orderEntity : orderEntitiList) {
			orders.add(convertOrderEntityIntoOrder(orderEntity));
		}
		return orders;
	}
}
