package com.hcl.ems.service.serviceImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ems.entity.Employee;
import com.hcl.ems.repository.ReortReposotiry;
import com.hcl.ems.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {

	
	@Autowired
	ReortReposotiry reportRepo;
	
	@Override
	public List<Employee> getRport() {
		return reportRepo.findAll();
	}

	@Override
	public List<Employee> getRportTop5() {
		return reportRepo.findAllTop5();
	}

	@Override
	public List<Employee> getReportByDate(LocalDateTime localDateTime) {
		return reportRepo.findByJoiningDateBetween(localDateTime,localDateTime);
	}

	
	@Override
	public String getAllWrkDays(LocalDate fromDate, LocalDate toDate) {
		String value=reportRepo.findByWrkingDateBetween(fromDate, toDate);
		System.out.println("value============="+value);
		return "Total number working days between From: "+fromDate +" and toDate  "+toDate +" :===>"+value;
	}

	@Override
	public String getAllWrkDays(Date fromDate, Date fromDate2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getManagerList() {
		return reportRepo.findAllIsManager();
		}

	@Override
	public List<Employee> get7YeasExp() {
		return reportRepo.findAllJoiningDateGreater7Years();
		}


	
}
