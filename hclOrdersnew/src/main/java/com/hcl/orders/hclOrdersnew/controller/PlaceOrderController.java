package com.hcl.orders.hclOrdersnew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.orders.hclOrdersnew.dto.PlaceOrderDetail;
import com.hcl.orders.hclOrdersnew.service.PlaceOrderService;
import com.hcl.orders.hclOrdersnew.util.StringUilts;
@RestController
@RequestMapping("/placeorder")
public class PlaceOrderController {
	
	@Autowired
	PlaceOrderService placeorderService;
	
	@PostMapping("")
	public String placeOrder(@RequestBody  PlaceOrderDetail plcdtls) {
		if(StringUilts.validateStr(plcdtls))
			return "Place Order Details should not be Null";
		String resp=placeorderService.placeOrderDtls(plcdtls);
		//System.out.println(plcdtls.getUserName()+"==="+plcdtls.getPassword());
		return resp;
	} 

	
	@GetMapping("/getPort")
	public String findPort() {
		return placeorderService.findPort();
	} 
}
