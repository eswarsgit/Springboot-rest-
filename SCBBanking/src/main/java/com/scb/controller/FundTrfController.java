package com.scb.controller;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scb.service.FundtransferService;

@RestController
@RequestMapping("fundTransfer")
public class FundTrfController {

	@Autowired
	FundtransferService fundTrfService;

	@Size(min = 1, message = "required")
	@GetMapping("/doFundtransfer")
	public String doFundtransfer(@RequestParam @Min(0) Long fromAcc, @RequestParam @Min(0) Long toAcc,
			@RequestParam @Min(0) Long trfAmt) {
		System.out.println("test doFundtransfer customer---fromAcc-->" + fromAcc + "---toAcc-->" + toAcc  +"----trfAmt");
		String resp = " Requried only Number";

		if (fromAcc.equals(toAcc)) {
			resp = " Transfer Operation is not allowed with the same account Number ";
			return resp;
		}

		Long currentBal = fundTrfService.getCurrentBalance(fromAcc);

		if (null == currentBal) {
			System.out.println("Am inside the current bal ");
			resp = " From Account is not exits so please give the valide Account Number :" + fromAcc;
			return resp;
		} else if (null == fundTrfService.getCurrentBalance(toAcc)) {
			resp = " To Account is not exits so please give the valide Account Number :" + toAcc;
			return resp;
		}

		if (trfAmt < currentBal) {
			System.out.println(currentBal);
			Long avalibal = fundTrfService.doTransper(fromAcc, toAcc, trfAmt, currentBal);
			resp = "Your Requested Amount " + trfAmt + " has been transfer to this Account:  " + toAcc
					+ " Sucessfully...\n Your Avaliable Balance is :" + avalibal;
		} else {
			System.out.println(
					"\"No suffcient fund avaliable\" we have only :" + currentBal + " But trying to trf :" + trfAmt);
			resp = "\"No suffcient fund avaliable\" we have only :" + currentBal + " But trying to trf :" + trfAmt;
		}
		return resp;
	}
	@Autowired
	Environment environment;
	
	@GetMapping("/port")
	public String getPortNo() {
		String port = environment.getProperty("local.server.port");
		return "From Order app : " + port;
	}
	
}
