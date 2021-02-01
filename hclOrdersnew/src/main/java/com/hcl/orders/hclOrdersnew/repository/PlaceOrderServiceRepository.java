package com.hcl.orders.hclOrdersnew.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.orders.hclOrdersnew.entity.OrderHistory;


@Repository
public interface PlaceOrderServiceRepository  extends JpaRepository<OrderHistory, Long>{


	//Long findMaxOrderedtxnId();


//	Long findOneByOrderedtxnId();
	@Query(value = "SELECT MAX(order_txn_id)+1 as valu FROM order_details ", nativeQuery = true)
	Long findByMaxOrderedtxnId();

	//String placeOrderDtls();
	
	
	//@Query(value = "SELECT orderId,userid,total_amount,order_date FROM orders ord,order_details dtil WHERE ord.orderid=dtil.order_txn_id order by order_txn_id desc", nativeQuery = true)
	

}
