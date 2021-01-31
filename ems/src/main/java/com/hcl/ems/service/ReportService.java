package com.hcl.ems.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import com.hcl.ems.entity.Employee;

public interface ReportService {

	List<Employee> getRport();

	List<Employee> getRportTop5();

	List<Employee> getReportByDate(LocalDateTime localDateTime);

	String getAllWrkDays(Date fromDate, Date fromDate2);

	String getAllWrkDays(LocalDate fromDate, LocalDate toDate);

	List<Employee> getManagerList();

	List<Employee> get7YeasExp();

}
