package com.scb.service;

import java.util.Date;
import java.util.List;

import com.scb.entity.Transaction;

public interface ReportService {

	List<Transaction> getRpt();

	List<Transaction> getRpt(int pageSize,int pageNum);

	List<Transaction> getRpt(Date fromDate, Date toDate);

	List<Transaction> getReportByAccWise(Long accountNum);

}
