package com.hcl.ems.service.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.ems.entity.Employee;
import com.hcl.ems.entity.dto.EmployeeDto;
import com.hcl.ems.repository.EmpRegisterRepository;
import com.hcl.ems.service.EmpRegisterService;

@Service
public class EmpRegisterServiceImpl implements EmpRegisterService {

	@Autowired
	EmpRegisterRepository empRepository;

	public String doRegister(EmployeeDto newEmp) {
	Optional<Employee> emptmp=empRepository.findByPanNumber(newEmp.getPanNumber());
	
	if (emptmp.isPresent()) {
		Employee presEmpDtl=emptmp.get();
		return "Employee Exists with Our Orgnasation PAN : " + presEmpDtl.getPanNumber() + " Employee ID : "+ presEmpDtl.geteId();
	}else {
			Employee emp = new Employee(newEmp);
			empRepository.save(emp);
			Optional<Employee> custPan=empRepository.findByPanNumber(newEmp.getPanNumber());
			return "Employee ID: " + custPan.get().geteId() + "  Employeee Created Sucessfully";
		}

	}

}
