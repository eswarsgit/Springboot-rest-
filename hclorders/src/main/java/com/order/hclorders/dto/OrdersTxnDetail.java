package com.order.hclorders.dto;

import java.io.Serializable;
import java.util.List;

public class OrdersTxnDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private OrdersHistoryDto ordes;
	public OrdersHistoryDto getOrdes() {
		return ordes;
	}
	public void setOrdes(OrdersHistoryDto ordes) {
		this.ordes = ordes;
	}
	public List<OrderHistoryDto> getOrderHist() {
		return orderHist;
	}
	public void setOrderHist(List<OrderHistoryDto> orderHisLst) {
		this.orderHist = orderHisLst;
	}
	private List<OrderHistoryDto> orderHist;

	
	
}
