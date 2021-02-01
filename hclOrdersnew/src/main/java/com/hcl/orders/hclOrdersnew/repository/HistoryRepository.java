package com.hcl.orders.hclOrdersnew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.orders.hclOrdersnew.dto.OrdersHistoryDto;


@Repository
public interface HistoryRepository extends JpaRepository<OrdersHistoryDto, Long > {

}
