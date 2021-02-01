package com.hcl.orders.hclOrdersnew.service;

import java.util.List;

import com.hcl.orders.hclOrdersnew.dto.OrdersHistoryDto;


public interface HistoryService {

	List<OrdersHistoryDto> getLatestDetail();

}
