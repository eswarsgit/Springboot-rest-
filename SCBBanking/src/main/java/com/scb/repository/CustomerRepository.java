package com.scb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.scb.entity.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
	
	@Query(value = "SELECT MAX(accountnumber)+1 as valu FROM bcustomer", nativeQuery = true)
	Long getMaxCustomerID();

	@Query(value = "SELECT pannumber FROM bcustomer WHERE pannumber=:pan", nativeQuery = true)
	String validatePan(String pan);
	
	Optional <Customer> findByPannumber(String panNumber);
	
	
	/*@Query(value = "SELECT accountbalance FROM transaction WHERE accountnumber=:fromAcc", nativeQuery = true)
	Long getcustBalance(@Param("fromAcc") Long toAcc);

	

	@Query(value = "SELECT * FROM transaction WHERE DATE_FORMAT(txndate,'%d-%b-%Y') BETWEEN :frmdate and :toDate ", nativeQuery = true)
	List<Transaction> getRptBtwn(@Param("frmdate")Date frmdate, @Param("toDate")Date toDate);

	
	
	
	@Query(value = "SELECT * FROM transaction WHERE DATE_FORMAT(txndate,'%d-%b-%Y') BETWEEN :frmdate and :toDate ", nativeQuery = true)
	List<Transaction> getRptBtwn2(@Param("frmdate")String frmdate, @Param("toDate")String toDate);

*/	
/*	@Query(value = "SELECT * FROM transaction WHERE DATE_FORMAT(txndate,'%d-%b-%Y') BETWEEN :frmdate and :toDate ", nativeQuery = true)
	 List<Transaction> findAllBytxndateBetween(
		      Date txndateDate,
		      Date txndateEndDate);*/
	
	
}
