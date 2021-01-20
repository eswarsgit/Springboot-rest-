package com.scb.service.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.scb.entity.Transaction;
import com.scb.repository.ReportRepository;
import com.scb.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	ReportRepository reportRepo;
	@Override
	public List<Transaction> getRpt() {
		
		return reportRepo.findAll();
	}

public List<Transaction> getRpt(int pageSize,int pageNum) {
		
		Pageable pageobj = PageRequest.of(pageNum,pageSize);
		return reportRepo.findAll(pageobj).getContent();
	}

@Override
public List<Transaction> getRpt(Date fromDate, Date toDate) {
	return reportRepo.findAllByTxnDateBetween(fromDate, toDate);
}

@Override
public List<Transaction> getReportByAccWise(Long accountNum) {
	return reportRepo.findByAccountNumber(accountNum);
}
	
}
