package com.hcl.orders.hclOrdersnew.service.serviceimpl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.orders.hclOrdersnew.dto.OrdersHistoryDto;
import com.hcl.orders.hclOrdersnew.repository.HistoryRepository;
import com.hcl.orders.hclOrdersnew.service.HistoryService;


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
