package com.order.hclorders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.hclorders.entity.Orders;

@Repository
public interface OrdersReposotory extends JpaRepository<Orders,Long>{

	
	

}
