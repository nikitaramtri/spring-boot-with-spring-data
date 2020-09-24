package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.OrderEntity;
import com.spring.json.Order;
import com.spring.repo.OrderRepository;
import com.spring.utils.OrderUtil;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<Order> getAllOrders() {
		List<OrderEntity> orders = orderRepository.findAll();
		return OrderUtil.convertOrderEntityListIntoOrderList(orders);
	}
	
	@Override
	public Order getOrderById(long id) {
		OrderEntity order = orderRepository.findById(id);
		return OrderUtil.convertOrderEntityIntoOrder(order);
	}
	
	@Override
	public void addOrder(Order order) {
		OrderEntity orderEntity = OrderUtil.convertOrderIntoOrderEntity(order);
		orderRepository.save(orderEntity);
		
	}
	@Override
	public void editOrder(Order order) {
		OrderEntity orderEntity = OrderUtil.convertOrderIntoOrderEntity(order);
		orderRepository.save(orderEntity);
		
	}
	@Override
	public void deleteOrderById(long id) {
		orderRepository.deleteById(id);
	
	}
	@Override
	public void deleteOrders() {
		orderRepository.deleteAll();
	
	}
	
}
