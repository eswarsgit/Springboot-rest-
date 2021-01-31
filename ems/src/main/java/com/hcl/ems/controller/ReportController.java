package com.hcl.ems.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ems.entity.Employee;
import com.hcl.ems.service.ReportService;

@RestController
@RequestMapping("/getAllReport")

public class ReportController {

	@Autowired
	ReportService rptService;

	@GetMapping("")
	public List<Employee> getAllReport() {
		List<Employee> resp = rptService.getRport();
		return resp;
	}

	@GetMapping("/getTop5ByJoinin")
	public List<Employee> getTop5ByJoinin() {
		List<Employee> resp = rptService.getRportTop5();
		return resp;
	}

	@GetMapping("/getReportByDate")
	public List<Employee> getTop5ByJoinin(
			@RequestParam("localDateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime localDateTime) {
		List<Employee> resp = rptService.getReportByDate(localDateTime);
		return resp;
	}

	@GetMapping("/getAllWrkDays")
	public String getAllWrkDays(
			@RequestParam(value = "fromDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromDate,
			@RequestParam(value = "toDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toDate) {
		String resp = rptService.getAllWrkDays(fromDate, toDate);
		return resp;
	}

	@GetMapping("/getManagerList")
	public List<Employee> getManagerListS() {
		List<Employee> resp = rptService.getManagerList();
		return resp;
	}

	@GetMapping("/get7YeasExp")
	public List<Employee> get7YeasExp() {
		List<Employee> resp = rptService.get7YeasExp();
		return resp;
	}
}
