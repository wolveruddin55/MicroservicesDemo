package com.mysqlservice.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mysqlservice.demo.service.EmployeeServiceImpl;
import com.mysqlservice.demo.utility.EmployeeLocationDTO;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	
	@GetMapping("/get-employee-location-by-id")
	public EmployeeLocationDTO getEmployeesById(@RequestParam("employeeId") Integer employeeId) throws Exception {
		return employeeServiceImpl.getEmployeeLocationDetails(employeeId);
	}
}
