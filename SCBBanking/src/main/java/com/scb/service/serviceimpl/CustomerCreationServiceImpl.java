package com.scb.service.serviceimpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scb.dto.CustCreatedto;
import com.scb.entity.Customer;
import com.scb.entity.Transaction;
import com.scb.repository.CustomerRepository;
import com.scb.repository.TransactionRepository;
import com.scb.service.CustomerRegistractionService;

@Service
public class CustomerCreationServiceImpl implements CustomerRegistractionService {

	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	TransactionRepository txnRepository;

	@Override
	public String saveCustomer(CustCreatedto new2bank) {
		
		//System.out.println("________________"+customerRepository.findByPannumber(new2bank.getPannumber()) +"<-------------------->");
		Customer cust=new Customer (new2bank);
		cust.setAccountNumber(customerRepository.getMaxCustomerID());
		String pan = cust.getPannumber();
		
		///new validatin
		/*//cust1=new Customer (new2bank);
		Optional<Customer> cust1=new Optional<Customer>();
		System.out.println(cust1.toString());
		if(null !=cust1) {
			System.out.println("System.out.println(cust1.toString());"+cust1.toString());
			cust1=customerRepository.findByPannumber(new2bank.getPannumber());
		System.out.println("----------->"+cust1.getAccountNumber()+"-----"+cust1.getPannumber());
		}*/
				///new validation
		
		
		String custPanExists = customerRepository.validatePan(pan);
		System.out.println("custPanExists--"+custPanExists);
		if (null==custPanExists) {
			cust.setCreateddate(new Date());
			customerRepository.save(cust);
			Transaction txn=new Transaction();
			txn.setAccountBalance(0L);
			txn.setAccountDesc("This is Your Account Opening Entry so always Deposit amount is 0");
			txn.setAccountNumber(cust.getAccountNumber());
			txn.setCurrentRecPtr("C");
			txn.setTxnDate(new Date());
			txnRepository.save(txn);
			return "customer -id  :-" + cust.getAccountNumber();
		} else {
			return " /Pan id Exists  :" + pan+ " \n \n Your Existing account Number is "+cust.getAccountNumber() +" \n \n";
		}

	}

	/*@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> getByCustomerId(Long customerid) {
		// TODO Auto-generated method stub
		return customerRepository.findById(customerid);
	}

	@Override
	public Long getCurrentBalance(Long fromAcc) {
		return customerRepository.getcustBalance(fromAcc);
	}

	@Transactional
	@Override
	public Long doTransper(Long fromAcc, Long toAcc, Long trfAmt, Long fromBal) {

		Long fromBalUpdate = fromBal - trfAmt;
		String txnDescp = " Deducted the Amount : " + trfAmt + "-- For Transfer--" + toAcc;
		System.out.println("before Source Account update:" + fromAcc + ",===" + txnDescp + "--," + fromBalUpdate);
		txnRepository.doTranf(fromAcc, txnDescp, fromBalUpdate);
		System.out.println("One update completed :");

		Long tobal = customerRepository.getcustBalance(toAcc);
		tobal = tobal + trfAmt;
		txnDescp = " Added the Amount : " + trfAmt + "-- From Transfer--" + fromAcc;
		txnRepository.doTranf(toAcc, txnDescp, tobal);
		return tobal;
	}

	@Override
	public List<Transaction> getRpt(Date frmdate, Date toDate) {
		// return customerRepository.getRptBtwn(frmdate, toDate);
		return txnRepository.findAllBytxnDateBetween(frmdate, toDate);
	}

	@Override
	public List<Transaction> getRpt(String frmdate, String toDate) {
		return customerRepository.getRptBtwn2(frmdate, toDate);
	}

	@Override
	public List<Transaction> getRpt(String frmdate) {
		return txnRepository.getRptBtwn(frmdate);
	}

	@Override
	public List<Transaction> getRpt() {
		return txnRepository.getRptBtwn();
	}

	@Override
	public String saveCustomer(Customer user) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
