package com.scb.controller;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scb.entity.Transaction;
import com.scb.service.ReportService;

@RestController
@RequestMapping("Reports")
public class ReportController {
		
	@Autowired
	ReportService reportService;
	

	@GetMapping("/getAllReportData")
	public List<Transaction> getReeprtData(){
		return reportService.getRpt();
		
	}

	@GetMapping("/getReportDataWithPage")
	public List<Transaction> getReeprtData(@RequestParam @Min(0) int pageNum,@RequestParam @Min(0) int pageSize){
			return reportService.getRpt(pageSize,pageNum);
		
	}
	
	
	@GetMapping("/getReportDataWithDate")
	public List<Transaction> getReportData(@RequestParam Date fromDate,@RequestParam Date toDate){
			return reportService.getRpt(fromDate,toDate);
		
	}
	
	@GetMapping("/getReportByAccountWise")
	public List<Transaction> getReportByAccountWise(@RequestParam @Min(0) Long accountNum){
			return reportService.getReportByAccWise(accountNum);
		
	}
	
	
	
	//FindByAccountBalance
	
	/*@GetMapping("/getcustomerlist")
	public List<Customer> getAllCustomer(){
		System.out.println("test get customer----------------->");
		return registerService.getAllCustomer();
	}
	
	
	@GetMapping("/{customerid}")
	public Optional<Customer> getUserById(@PathVariable Long customerid) {
		return registerService.getByCustomerId(customerid);
	}
	
	*/
/*	
	@GetMapping("/getReport")
	public List<Transaction> getReport(@PathVariable Date frmdate, @PathVariable Date toDate){
		System.out.println("getReportr-----------------frmdate>"+frmdate+"--toDate"+toDate);
		return registerService.getRpt(frmdate,toDate);
	}
	
	@GetMapping("/getRort")
	public List<Transaction> getReport(@RequestParam String frmdate, @RequestParam String toDate){
		System.out.println("getReportr-----------------frmdate>"+frmdate+"--toDate"+toDate);
		return registerService.getRpt(frmdate,toDate);
	}

	@GetMapping("/getDataReport")
	public List<Transaction> getData(@RequestParam String fromdate){
		System.out.println("getReportr-----------------frmdate>"+fromdate+"--toDate");
		return registerService.getRpt(fromdate);
		}
	*/

	
	
}
