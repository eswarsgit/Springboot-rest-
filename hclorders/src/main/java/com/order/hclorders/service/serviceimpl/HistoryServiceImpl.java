package com.order.hclorders.service.serviceimpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.hclorders.dto.OrderHistoryDto;
import com.order.hclorders.dto.OrdersHistoryDto;
import com.order.hclorders.dto.OrdersTxnDetail;
import com.order.hclorders.entity.Menu;
import com.order.hclorders.entity.OrderHistory;
import com.order.hclorders.repository.FoodSearchReposotiry;
import com.order.hclorders.repository.HistoryRepository;
import com.order.hclorders.repository.OrderedHistoryRepository;
import com.order.hclorders.service.HistoryService;

@Service
public class HistoryServiceImpl implements HistoryService {
@Autowired
	HistoryRepository histRepo;
@Autowired
OrderedHistoryRepository orderhisRepo;
@Autowired
FoodSearchReposotiry foodRepo;

@Override
	public List<OrdersHistoryDto> getLatestDetail() {
		
		System.out.println(histRepo.findAll().size());
	List<OrdersHistoryDto> orderhisList=histRepo.findAll();//orderhisList.stream().sorted(Comparator.comparingLong(OrdersHistoryDto::getOrderId)).collect(Collectors.toList()).subList(0, 5);
System.out.println("orderhisList.size();"+orderhisList.size());
//orderhisList.forEach(t->t.setOrdersUserId(ordersUserId););

		return histRepo.findAll().stream().sorted(Comparator.comparingLong(OrdersHistoryDto::getOrderId)).collect(Collectors.toList()).subList(0, 5);
	}
	
	
	@Override
	public List<OrdersTxnDetail> getTransactionDetail() {
		List<OrdersTxnDetail> orderTxnLst=new ArrayList<OrdersTxnDetail>();
		List<OrdersHistoryDto> OrderHistLst=histRepo.findAll().stream().sorted(Comparator.comparingLong(OrdersHistoryDto::getOrderId)).collect(Collectors.toList()).subList(0, 5);
		
		
		
		for(int i=0;i<OrderHistLst.size();i++) {
			List<OrderHistory> orderHisLst=new ArrayList<OrderHistory>();
			
			//
			//new replacement of id to value start here
			List<OrderHistoryDto>  tmporderList=new ArrayList<OrderHistoryDto>();	
			//
			
			OrdersHistoryDto orderHis=OrderHistLst.get(i);
			
			Long ordId=orderHis.getOrderId();
			if(null !=ordId) {
				orderHisLst=orderhisRepo.findByorderedtxnId(ordId);
				
				
				
				//new replacement of id to value start here
				//List<OrderHistoryDto>  tmporderList=new ArrayList<OrderHistoryDto>();				

				for(int o=0;o<orderHisLst.size();o++) {
					Long menuid=orderHisLst.get(o).getOrderdesc();
					Menu mn = foodRepo.getOne(menuid);
					String menuDesc=mn.getItem();
					
					//2 step
					OrderHistoryDto orhisDto=new OrderHistoryDto();
					//orhisDto.setCustId(orderHisLst.get(o).getCustId());
					orhisDto.setItemDesc(menuDesc);
					orhisDto.setOrderQuantity(orderHisLst.get(o).getOrderQuantity());
					orhisDto.setRateperunit(orderHisLst.get(o).getRateperunit());
					orhisDto.setOrderAmt(orderHisLst.get(o).getOrderAmt());		
					tmporderList.add(orhisDto);
					
					
					
					
					
				}
				//new replacement of id to value end here
			}
						
			OrdersTxnDetail orderTxn=new OrdersTxnDetail();
			orderTxn.setOrdes(orderHis);
			//orderTxn.setOrderHist(orderHisLst);
			orderTxn.setOrderHist(tmporderList);
			orderTxnLst.add(orderTxn);		
		}
		
		return orderTxnLst;
	}

}
