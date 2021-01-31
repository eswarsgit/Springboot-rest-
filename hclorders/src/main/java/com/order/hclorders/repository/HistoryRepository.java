package com.order.hclorders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.hclorders.dto.OrdersHistoryDto;

@Repository
public interface HistoryRepository extends JpaRepository<OrdersHistoryDto, Long > {

}
