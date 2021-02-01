package com.order.hclorders.service;

import java.util.List;

import com.order.hclorders.dto.OrdersHistoryDto;
import com.order.hclorders.dto.OrdersTxnDetail;

public interface HistoryService {

	List<OrdersHistoryDto> getLatestDetail();

	List<OrdersTxnDetail> getTransactionDetail();

}
