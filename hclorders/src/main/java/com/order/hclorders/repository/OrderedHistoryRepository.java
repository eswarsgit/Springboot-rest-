package com.order.hclorders.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.hclorders.entity.OrderHistory;

@Repository
public interface OrderedHistoryRepository  extends JpaRepository<OrderHistory, Long>{




	List<OrderHistory> findByorderedtxnId(Long ordId);

}
