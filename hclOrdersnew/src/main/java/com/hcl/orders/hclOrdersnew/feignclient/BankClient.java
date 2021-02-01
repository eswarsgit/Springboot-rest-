package com.hcl.orders.hclOrdersnew.feignclient;

import javax.validation.constraints.Min;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//http://localhost:8888/ScbBanking/fundTransfer/doFundtransfer?fromAcc=123456789&toAcc=123456797&trfAmt=425
@FeignClient(value = "fundtransfer-service", url = "http://localhost:8888/ScbBanking/")
//@FeignClient(value = "order-service", url = "http://localhost:8082/order/orders")
//@FeignClient(name = "http://ORDER-SERVICE/order/orders")
public interface BankClient {

	@GetMapping("/fundTransfer/port/")
	public String getPortNo();

	@GetMapping("fundTransfer/doFundtransfer")
	public String doFundtransfer(@RequestParam @Min(0) Long fromAcc, @RequestParam @Min(0) Long toAcc,
			@RequestParam @Min(0) Long trfAmt);



}