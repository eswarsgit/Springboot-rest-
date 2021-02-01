package com.order.hclorders.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class OrderHistory implements Serializable {
	
	/**
	 * 
	 */
	public OrderHistory() {}
	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	
	
	@Column(name="cust_id")
	private Long custId;
	
	
	public Long getOrderedtxnId() {
		return orderedtxnId;
	}

	public void setOrderedtxnId(Long orderedtxnId) {
		this.orderedtxnId = orderedtxnId;
	}

	@Column(name="order_desc")
	private Long orderdesc;
	
	
	@Column(name="order_quantity")
	private Long orderQuantity;
	
	@Column(name="rate_per_unit")
	private Long rateperunit;
	

	@Column(name="order_amt")
	private Long orderAmt;

	@Column(name="ordered_date")
	private LocalDateTime orderedDate;
	
	@Column(name="order_txn_id")
	private Long orderedtxnId;
	
	
	

	public OrderHistory(Long usrId) {
		this.setCustId(usrId);
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public Long getOrderdesc() {
		return orderdesc;
	}

	public void setOrderdesc(Long orderdesc) {
		this.orderdesc = orderdesc;
	}

	public Long getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(Long orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Long getRateperunit() {
		return rateperunit;
	}

	public void setRateperunit(Long rateperunit) {
		this.rateperunit = rateperunit;
	}

	public Long getOrderAmt() {
		return orderAmt;
	}

	public void setOrderAmt(Long orderAmt) {
		this.orderAmt = orderAmt;
	}

	public LocalDateTime getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(LocalDateTime orderedDate) {
		this.orderedDate = orderedDate;
	}

		
}
