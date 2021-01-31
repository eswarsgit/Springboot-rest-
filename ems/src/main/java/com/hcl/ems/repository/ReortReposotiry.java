package com.hcl.ems.repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.ems.entity.Employee;

@Repository
public interface ReortReposotiry extends JpaRepository<Employee, Long> {

	@Query(value = "SELECT * FROM employee_details ORDER BY joiningdate DESC LIMIT 5 ", nativeQuery = true)
	List<Employee> findAllTop5();

//List<Employee> findByJoiningDateBetween(LocalDateTime localDateTime);

//	List<Employee> findAllByJoiningDateBetween(LocalDateTime fromDate, LocalDateTime toDate);

	List<Employee> findByJoiningDateBetween(LocalDateTime localDateTime, LocalDateTime localDateTime2);

	@Query(value = "select 5 * (DATEDIFF(:fromDate,:toDate) DIV 7) + MID('0123444401233334012222340111123400001234000123440', 7 * WEEKDAY(:fromDate) + WEEKDAY(:toDate) + 1, 1)", nativeQuery = true)
	String findByWrkingDateBetween(LocalDate fromDate, LocalDate toDate);

	@Query(value = "SELECT * FROM employee_details where is_manager=1 ", nativeQuery = true)
	List<Employee> findAllIsManager();

	@Query(value = "SELECT * FROM employee_details where Year(DATE_SUB(NOW(),INTERVAL 7 YEAR)) >= YEAR(joiningdate)  ", nativeQuery = true)
	List<Employee> findAllJoiningDateGreater7Years();

}
