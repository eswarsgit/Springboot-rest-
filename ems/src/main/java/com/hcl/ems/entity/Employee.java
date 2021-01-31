package com.hcl.ems.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.hcl.ems.entity.dto.EmployeeDto;
@Entity
@Table(name = "employee_details")
public class Employee implements Serializable {

	
	
	  public Employee(){}

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "eid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eId;

	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "age")
	@Min(21)
	@Max(56)
	private Long age;
	@Column(name = "pannumber")
	private String panNumber;
	
	@Column(name = "joiningdate")
	private LocalDateTime joiningDate;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "isManager")
	private Boolean isManager;	
	
	
	public Boolean getIsManager() {
		return isManager;
	}

	public void setIsManager(Boolean isManager) {
		this.isManager = isManager;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "createddate")
	private Date createdDate;

	public Employee(EmployeeDto newEmp) {
		this.setAge(newEmp.getAge());
		this.setFirstName(newEmp.getFirstName());
		this.setAddress(newEmp.getAddress());
		this.setLastName(newEmp.getLastName());
		this.setPanNumber(newEmp.getPanNumber());
		this.setJoiningDate(LocalDateTime.now());
		this.setIsManager(newEmp.getIsManager());
			
	}

	public Long geteId() {
		return eId;
	}

	public void seteId(Long eId) {
		this.eId = eId;
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

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

		

	public LocalDateTime getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDateTime joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	
}
