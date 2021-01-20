package com.scb.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.scb.dto.CustCreatedto;

@Entity
@Table(name="bcustomer")

public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3704116820858214392L;
		

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name")
		private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="age")
	private Long age;
	@Column(name="accountnumber")
	private Long accountNumber;
	
	@Column(name="createddate")
	private Date createddate;
	
	@Column(name="pannumber")
	private String pannumber;
	public Customer(CustCreatedto new2bank) {
		this.setAge(new2bank.getAge());
		this.setFirstName(new2bank.getFirstName());
		this.setLastName(new2bank.getLastName());
		this.setPannumber(new2bank.getPannumber());
	}

	public String getPannumber() {
		return pannumber;
	}

	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountnumber) {
		this.accountNumber = accountnumber;
	}
	
	Customer(){
		System.out.println("test sasdafafasd");
	}
	
	}
