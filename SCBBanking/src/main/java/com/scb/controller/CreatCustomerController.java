package com.scb.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scb.dto.CustCreatedto;
import com.scb.service.serviceimpl.CustomerCreationServiceImpl;

@RestController
@RequestMapping("register")
public class CreatCustomerController {

	Logger logger = LogManager.getLogger(CreatCustomerController.class);
	@Autowired
	CustomerCreationServiceImpl registerService;
	
	@PostMapping("")
	public String saveUser(@RequestParam CustCreatedto new2bank) {
		System.out.println("test----------------->");
		logger.info(" Rquest received to create customer in CreatCustomerController ");
		
		String firstName=new2bank.getFirstName();
		String lastName=new2bank.getLastName();
		Long Age=new2bank.getAge();
		String pan=new2bank.getPannumber();
		
		 if(null==pan)
			return " Your Pan Number should not be  Null";
		 else if(null == firstName)
			return " Your First Name should not be  Null";
		else if("null"==lastName)
			return " Your First Name should not be  Null";
		else if(null==Age)
			return " Your First Age should not be  Null";
		
		
		String Customer_id=registerService.saveCustomer(new2bank);
		return " WelCome to our Bank \n\nWe have Created Account for You \n\n please find Your Customer_id is  : "+Customer_id;
	}
	
}
