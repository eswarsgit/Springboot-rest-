package com.hcl.orders.hclOrdersnew.dto;

import java.io.Serializable;
import java.util.ArrayList;

public class PlaceOrderDetail implements Serializable   {
	
	/**
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<MenuDto> orderDetails;
	public ArrayList<MenuDto> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(ArrayList<MenuDto> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	private Long usrId;
	private Long frmAccountnum;
	public Long getUsrId() {
		return usrId;
	}
	public void setUsrId(Long usrId) {
		this.usrId = usrId;
	}
	public Long getFrmAccountnum() {
		return frmAccountnum;
	}
	public void setFrmAccountnum(Long frmAccountnum) {
		this.frmAccountnum = frmAccountnum;
	}


}
