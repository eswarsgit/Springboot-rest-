package com.scb.service.serviceimpl;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.entity.Transaction;
import com.scb.repository.TransactionRepository;
import com.scb.service.FundtransferService;

@Service
public class FundtransferServicePImpil implements FundtransferService {

	@Autowired
	TransactionRepository txnRepo;

	@Override
	public Long getCurrentBalance(Long fromAcc) {
		//return txnRepo.findByAccountBalance(fromAcc);
		return txnRepo.getcustBalance(fromAcc);
	}

	@Transactional
	@Override
	public Long doTransper(Long fromAcc, Long toAcc, Long trfAmt, Long currentBal) {
		
		System.out.println("=====FundtransferServicePImpil  =doTransper=====started=======");

		Transaction txn= txnRepo.findByAccountNumberAndCurrentRecPtr(fromAcc,"C");
		System.out.println("txn"+txn.toString());
		System.out.println("txn  -- before First from account update"+txn.getId() +"--"+txn.getAccountDesc() +"-::-"+txn.getCurrentRecPtr() +""+txn.getAccountBalance());
		txn.setCurrentRecPtr("D");
		txn.setId(txn.getId());
		txnRepo.save(txn);
	
		Transaction fromTxnObj=new Transaction();
		Long fromBalUpdate = currentBal - trfAmt;
		String txnDescp = " Deducted the Amount : " + trfAmt + "-- For Transfer--" + toAcc;
		System.out.println("before Source Account update:" + fromAcc + ",===" + txnDescp + "--," + fromBalUpdate);
		
		fromTxnObj.setAccountBalance(fromBalUpdate);
		fromTxnObj.setAccountDesc(txnDescp);
		fromTxnObj.setAccountNumber(fromAcc);
		fromTxnObj.setCurrentRecPtr("C");
		fromTxnObj.setTxnDate(new Date());
		txnRepo.save(fromTxnObj);
		System.out.println("================One update completed : impl From account  Compleetd Fully ================================================================");
		System.out.println("=====FundtransferServicePImpil  =doTransper=====From Account recrods Status update compleeted=======");
		
		
		//--- From account	update & insert is complted 	
		
		//To account update and insert is start
		System.out.println("=====FundtransferServicePImpil  =doTransper=====To Account ======="+toAcc +"====trying to update on Records Status");
	Transaction txnToacc= txnRepo.findByAccountNumberAndCurrentRecPtr(toAcc,"C");
	txnToacc.setCurrentRecPtr("D");
	txnToacc.setId(txnToacc.getId());
		System.out.println("=====FundtransferServicePImpil  =doTransper=====To Account ======="+toAcc +"trying to update on Records Status ---> before txnRepo.save(txn1);");
		txnRepo.save(txnToacc);
		System.out.println("=====FundtransferServicePImpil  =doTransper=====To Account ======="+toAcc +"compleeted  to account update on Records Status -- after txnRepo.save(txn1);");
		
		Long total = 0L;// txnRepo.FindByAccountbalance(toAcc);
		total = total + trfAmt;
		txnDescp = " Added the Amount : " + trfAmt + "-- From Transfer--" + fromAcc;
		
		Transaction ToaccTxnObj=new Transaction();
		ToaccTxnObj.setAccountBalance(total);
		ToaccTxnObj.setAccountDesc(txnDescp);
		ToaccTxnObj.setAccountNumber(toAcc);
		ToaccTxnObj.setCurrentRecPtr("C");
		ToaccTxnObj.setTxnDate(new Date());
		txnRepo.save(ToaccTxnObj);
		
		return fromBalUpdate;

	}
	
}
