package com.hcl.orders.hclOrdersnew.service;

import com.hcl.orders.hclOrdersnew.dto.PlaceOrderDetail;

public interface PlaceOrderService {

	String placeOrderDtls(PlaceOrderDetail plcdtls);

	String findPort();

}
