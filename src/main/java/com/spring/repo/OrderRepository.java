package com.spring.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>{
//	public List<OrderEntity> findByTitle(String title);
//	public List<OrderEntity> findByTitleAndPrice(String title, double price);
	
	public OrderEntity findById(long id);

//	public void persist(OrderEntity orderEntity);
}
