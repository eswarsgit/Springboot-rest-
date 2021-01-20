package com.scb.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.scb.entity.Transaction;

@Repository
public interface ReportRepository extends JpaRepository<Transaction,Long> {

	//List<Transaction> findAll(String fromDate, String toDate);

	List<Transaction> findAllByTxnDateBetween(Date fromDate, Date toDate);

	//List<Transaction> findAll(Pageable pageobj);
	
	

	
	
	 List<Transaction> findAllBytxnDateBetween(
			 @Param("frmdate") Date frmdate,
			 @Param("toDate") Date toDate);

	 //SELECT * FROM transaction WHERE DATE_FORMAT(txndate,'%d-%b-%Y') >= '01-01-2021' 
	 @Query(value = "SELECT * FROM transaction WHERE DATE_FORMAT(txndate,'%d-%b-%Y') >= :frmdate ", nativeQuery = true)
		List<Transaction> getRptBtwn(@Param("frmdate")String frmdate);


	@Query(value = "SELECT * FROM transaction ", nativeQuery = true)
		List<Transaction> getRptBtwn();
	
	
	
	List<Transaction> findByAccountNumber(Long fromAcc);//working fine




	
}
