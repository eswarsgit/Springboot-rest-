package com.order.hclorders.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.hclorders.dto.OrdersHistoryDto;
import com.order.hclorders.service.HistoryService;

@RestController 
@RequestMapping("/orderhis")
public class OrderHistory {
	
	@Autowired
	HistoryService historyService;
	
	@GetMapping("")
	public List<OrdersHistoryDto> getLatestDetail() {
	return historyService.getLatestDetail();

}
}
