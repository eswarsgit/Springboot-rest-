package com.order.hclorders.service.serviceimpl;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import com.order.hclorders.dto.MenuDto;
import com.order.hclorders.dto.PlaceOrderDetail;
import com.order.hclorders.entity.Menu;
import com.order.hclorders.entity.OrderHistory;
import com.order.hclorders.entity.Orders;
import com.order.hclorders.feignclient.BankClient;
import com.order.hclorders.repository.FoodSearchReposotiry;
import com.order.hclorders.repository.OrdersReposotory;
import com.order.hclorders.repository.PlaceOrderServiceRepository;
import com.order.hclorders.service.PlaceOrderService;
import com.order.hclorders.util.StringUilts;

@EnableFeignClients
@Service
public class PlaceOrderServiceImpl implements PlaceOrderService {

	@Autowired
	BankClient bankclnt;
	@Autowired
	PlaceOrderServiceRepository placeServiceRepo;
	@Autowired
	FoodSearchReposotiry foodRepo;
	@Autowired
	OrdersReposotory ordersRepo;
	
	@Transactional
	@Override
	public String placeOrderDtls(PlaceOrderDetail orderedtls) {

		ArrayList<MenuDto> odList = orderedtls.getOrderDetails();
		ArrayList<OrderHistory> orderhistLst = new ArrayList<OrderHistory>();
		
		Long total = 0L;

		for (int i = 0; i < odList.size(); i++) {
			Long totalAmount = 0L;
			OrderHistory od = new OrderHistory(orderedtls.getUsrId());
			MenuDto mto = odList.get(i);

			if (StringUilts.validateStr(mto.getMenuid()))
				return "No.of Quantity is not avlaible";

			Menu mn = foodRepo.getOne(mto.getMenuid());
			if (null == mn)
				return "MenuID not avlaible" + mto.getMenuid() + "From our DB";

			if (StringUilts.validateStr(mto.getQuantity()))
				return "No.of Quantity is not avlaible";

			totalAmount = mto.getQuantity() * mn.getPrice();
			total = totalAmount + total;
			od.setOrderQuantity(mto.getQuantity());
			od.setRateperunit(mn.getPrice());
			od.setOrderAmt(totalAmount);
			od.setOrderdesc(mto.getMenuid());
			od.setCustId(orderedtls.getUsrId());
			od.setOrderedDate(LocalDateTime.now());
			orderhistLst.add(od);
		}

		Orders ords = new Orders();
		ords.setOrderedDate(LocalDateTime.now());
		ords.setOrdersUserId(orderedtls.getUsrId());
		ords.setTotalAmount(total);
		Orders orderSavedEntity = ordersRepo.save(ords);
		
		

		//orderhistLst.forEach(f -> f.setOrderedtxnId(orderSavedEntity.getOrderId()));
	//	orderhistLst.forEach(tmp->ordersRepo.save(tmp));

		System.out.println("orderhistLst.size()" + orderhistLst.size());
System.out.println("==================================================Banking===================");
Long toAcc=(long) 123456798;
String resp=bankclnt.doFundtransfer(orderedtls.getFrmAccountnum(), toAcc, total);

for(int i=0;i<orderhistLst.size();i++) {
	
	orderhistLst.get(i).setOrderedtxnId(orderSavedEntity.getOrderId());
	placeServiceRepo.save(orderhistLst.get(i));
}
//		placeServiceRepo.saveAll(orderhistLst);

//2nd try
		// plcdtls<MenuDto> lambdaExpression = x->x.getList();
		/// names.forEach(lambdaExpression);
		System.out.println("Total Bill Amount is " + total);
		return "Order Saved Sucessfully---"+resp;
	}

	@Override
	public String findPort() {
		System.out.println("bankclnt.getPortNo();===="+bankclnt.getPortNo());
		return bankclnt.getPortNo();
	}

}
