package com.order.hclorders.service.serviceimpl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.hclorders.dto.OrdersHistoryDto;
import com.order.hclorders.repository.HistoryRepository;
import com.order.hclorders.service.HistoryService;

@Service
public class HistoryServiceImpl implements HistoryService {
@Autowired
	HistoryRepository histRepo;
	@Override
	public List<OrdersHistoryDto> getLatestDetail() {
		
		System.out.println(histRepo.findAll().size());
	List<OrdersHistoryDto> orderhisList=histRepo.findAll();//orderhisList.stream().sorted(Comparator.comparingLong(OrdersHistoryDto::getOrderId)).collect(Collectors.toList()).subList(0, 5);
System.out.println("orderhisList.size();"+orderhisList.size());
//orderhisList.forEach(t->t.setOrdersUserId(ordersUserId););

		return histRepo.findAll().stream().sorted(Comparator.comparingLong(OrdersHistoryDto::getOrderId)).collect(Collectors.toList()).subList(0, 5);
	}

}
