package com.scb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.scb.entity.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long>{
	

	//Transaction findByAccountNumber(Long fromAcc);//working fine


	Transaction findByAccountNumberAndCurrentRecPtr(Long accNum,String currentRecPtr);// not working fine so moving with native query below

	
	@Query(value = "SELECT accountbalance FROM transaction WHERE accountnumber=:fromAcc  and current_rec='C'", nativeQuery = true)
	Long getcustBalance(@Param("fromAcc") Long fromAcc);
	
	
	
	

	/*@Query(value = "SELECT * FROM transaction WHERE accountnumber=:fromAcc and current_rec='C'", nativeQuery = true)
	Transaction findByAccountNumRecStatus(@Param("fromAcc") Long fromAcc);
	
	@Modifying
	@Query(value = " update transaction set accountbalance=:totalamount,accountdesc=:accdesc"
			+ "  WHERE accountnumber=:acc  ", nativeQuery = true)
	void doTranf(@Param("acc")Long fromAcc, @Param("accdesc") String accdesc, @Param("totalamount")Long fromBalUpdate);
*/
	

	@Modifying
	@Query(value = " update transaction set accountbalance=:totalamount,current_rec='D' "
			+ "  WHERE accountnumber=:acc ", nativeQuery = true)
	void doStatusTranfUpdate(@Param("acc")Long fromAcc);

}


