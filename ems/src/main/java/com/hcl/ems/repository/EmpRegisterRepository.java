package com.hcl.ems.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ems.entity.Employee;

@Repository
public interface EmpRegisterRepository extends JpaRepository<Employee,Long>{

	Optional <Employee> findByPanNumber(String panNumber);
	
	
	/*@Query(value = "SELECT * FROM employee_details WHERE pannumber=:pan", nativeQuery = true)
	Employee validatePan(String pan);*/
	
}
