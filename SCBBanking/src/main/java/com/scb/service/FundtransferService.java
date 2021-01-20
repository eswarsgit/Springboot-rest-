package com.scb.service;

public interface FundtransferService {

	Long getCurrentBalance(Long fromAcc);

	Long doTransper(Long fromAcc, Long toAcc, Long trfAmt, Long currentBal);
	
	

}
