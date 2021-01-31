package com.order.hclorders.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class OrderCustomer implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "usrId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usrId;

	@Column(name = "username")
	private String userName;

	@Column(name="email")
	private String email;
	
	
	@Column(name="contact")
	private Long contact;
	
	@Column(name="password")
	private String password;
	
	
	@Column(name="role")
	private String role;


	public Long getUsrId() {
		return usrId;
	}


	public void setUsrId(Long usrId) {
		this.usrId = usrId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getContact() {
		return contact;
	}


	public void setContact(Long contact) {
		this.contact = contact;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
}
