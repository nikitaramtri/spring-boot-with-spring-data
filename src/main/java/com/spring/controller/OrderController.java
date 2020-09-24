package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.json.Order;
import com.spring.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping(value = "/order", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	@GetMapping(value = "/order/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Order getOrderById(@PathVariable("id")String orderId) {
		long id = Integer.parseInt(orderId);
		return orderService.getOrderById(id);
	}
	
	@PostMapping(value="/order", consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Order> createNewOrder(@RequestBody Order order) {
		System.out.println(order.toString());
		orderService.addOrder(order);
		return orderService.getAllOrders();
	}
	
	@PutMapping(value="/order", consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Order> editOrder(@RequestBody Order order) {
		System.out.println(order.toString());
		orderService.editOrder(order);
		return orderService.getAllOrders();
	}
	
	@DeleteMapping(value="/order/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Order> deleteOrderById(@PathVariable("id")String orderId) {
		long id = Integer.parseInt(orderId);
		orderService.deleteOrderById(id);
		return orderService.getAllOrders();
	}	
	
	@DeleteMapping(value="/order", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Order> deleteOrders() {
		orderService.deleteOrders();
		return orderService.getAllOrders();
	}	
}
