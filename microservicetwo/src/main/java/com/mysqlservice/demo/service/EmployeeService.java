package com.mysqlservice.demo.service;

import com.mysqlservice.demo.utility.EmployeeLocationDTO;

public interface EmployeeService {
	public EmployeeLocationDTO getEmployeeLocationDetails(Integer employeeId)  throws Exception;
}
