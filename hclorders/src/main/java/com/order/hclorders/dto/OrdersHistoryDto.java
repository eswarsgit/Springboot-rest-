package com.order.hclorders.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrdersHistoryDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrdersUserId() {
		return ordersUserId;
	}

	public void setOrdersUserId(Long ordersUserId) {
		this.ordersUserId = ordersUserId;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public LocalDateTime getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(LocalDateTime orderedDate) {
		this.orderedDate = orderedDate;
	}

	@Id
	@Column(name = "orderid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;

	@Column(name = "userid")
	private Long ordersUserId;

	@Column(name = "total_amount")
	private Long totalAmount;

	@Column(name = "order_date")
	private LocalDateTime orderedDate;

	
	
}
