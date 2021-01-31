package com.order.hclorders.service;

import java.util.List;

import com.order.hclorders.dto.OrdersHistoryDto;

public interface HistoryService {

	List<OrdersHistoryDto> getLatestDetail();

}
