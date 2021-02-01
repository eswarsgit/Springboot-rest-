package com.order.hclorders.dto;

import java.io.Serializable;

public class OrderHistoryDto  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String itemDesc;
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	
	
	
	private Long orderQuantity;
	
	private Long rateperunit;
	

	private Long orderAmt;
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

	
	
	
}
