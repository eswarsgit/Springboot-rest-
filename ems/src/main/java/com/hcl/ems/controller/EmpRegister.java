package com.hcl.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.ems.entity.dto.EmployeeDto;
import com.hcl.ems.service.EmpRegisterService;
import com.hcl.ems.util.StringUilts;

@RestController
@RequestMapping("/empRegister")

public class EmpRegister {

	@Autowired
	EmpRegisterService empService;

	@PostMapping("")
	public String doRegister(@RequestBody EmployeeDto newEmp) {

		String resp = "";
		
		if (StringUilts.validateStr(newEmp.getFirstName()))
			return " Your First Name should not be  Null";
		
		if (StringUilts.validateStr(newEmp.getLastName()))
			return " Your Last Name should not be  Null";

		if (StringUilts.validateStr(newEmp.getPanNumber()))
			return " Your Pan Number should not be  Null";
		
		if (StringUilts.validateStr(newEmp.getAddress()))
			return " Your Address should not be  Null";
		
			resp = empService.doRegister(newEmp);
		return resp;

	}

}



/*
@GetMapping - shortcut for @RequestMapping(method = RequestMethod.GET)
@PostMapping - shortcut for @RequestMapping(method = RequestMethod.POST)
@PutMapping - shortcut for @RequestMapping(method = RequestMethod.PUT)
@DeleteMapping - shortcut for @RequestMapping(method =RequestMethod.DELETE)

@PostMapping – Handle HTTP POST Requests
@GetMapping – Handle HTTP Get Requests
@PutMapping – Handle HTTP Put Requests
@DeleteMapping – Handle HTTP Delete Requests*/