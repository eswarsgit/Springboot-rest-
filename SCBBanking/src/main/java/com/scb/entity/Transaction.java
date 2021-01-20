package com.scb.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")

public class Transaction implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3704116820858214392L;
		
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="accountnumber")
	private Long accountNumber;
	
	@Column(name="accountbalance")
	private Long accountBalance;

	@Column(name="accountdesc")
	private String accountDesc;
	
	@Column(name="txndate")
	private Date txnDate;

	@Column(name="current_rec")
	private String currentRecPtr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountDesc() {
		return accountDesc;
	}

	public void setAccountDesc(String accountDesc) {
		this.accountDesc = accountDesc;
	}

	public Date getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	public String getCurrentRecPtr() {
		return currentRecPtr;
	}

	public void setCurrentRecPtr(String currentRecPtr) {
		this.currentRecPtr = currentRecPtr;
	}
	
		
	}
