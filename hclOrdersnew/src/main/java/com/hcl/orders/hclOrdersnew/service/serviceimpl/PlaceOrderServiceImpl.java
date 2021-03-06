package com.hcl.orders.hclOrdersnew.service.serviceimpl;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import com.hcl.orders.hclOrdersnew.dto.MenuDto;
import com.hcl.orders.hclOrdersnew.dto.PlaceOrderDetail;
import com.hcl.orders.hclOrdersnew.entity.Menu;
import com.hcl.orders.hclOrdersnew.entity.OrderHistory;
import com.hcl.orders.hclOrdersnew.entity.Orders;
import com.hcl.orders.hclOrdersnew.feignclient.BankClient;
import com.hcl.orders.hclOrdersnew.repository.FoodSearchReposotiry;
import com.hcl.orders.hclOrdersnew.repository.OrdersReposotory;
import com.hcl.orders.hclOrdersnew.repository.PlaceOrderServiceRepository;
import com.hcl.orders.hclOrdersnew.service.PlaceOrderService;
import com.hcl.orders.hclOrdersnew.util.StringUilts;


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
		OrderHistory od = new OrderHistory(orderedtls.getUsrId());
		Long total = 0L;

		for (int i = 0; i < odList.size(); i++) {
			Long totalAmount = 0L;

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
			od.setRateperunit(100L);
			od.setOrderAmt(totalAmount);
			od.setOrderdesc(mto.getMenuid());
			od.setCustId(100L);
			od.setOrderedDate(LocalDateTime.now());
			orderhistLst.add(od);
		}

		Orders ords = new Orders();
		ords.setOrderedDate(LocalDateTime.now());
		ords.setOrdersUserId(orderedtls.getUsrId());
		ords.setTotalAmount(total);
		Orders orderSavedEntity = ordersRepo.save(ords);

		orderhistLst.forEach(f -> f.setOrderedtxnId(orderSavedEntity.getOrderId()));

		System.out.println("orderhistLst.size()" + orderhistLst.size());
System.out.println("==================================================Banking===================");
Long toAcc=(long) 123456798;
String resp=bankclnt.doFundtransfer(orderedtls.getFrmAccountnum(), toAcc, total);
		placeServiceRepo.saveAll(orderhistLst);

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
