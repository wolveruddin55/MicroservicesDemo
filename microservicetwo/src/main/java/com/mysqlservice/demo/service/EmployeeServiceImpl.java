package com.mysqlservice.demo.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysqlservice.demo.entity.EmployeeEntity;
import com.mysqlservice.demo.feignclient.ProjectFeign;
import com.mysqlservice.demo.repository.EmployeeRepository;
import com.mysqlservice.demo.utility.EmployeeLocationDTO;

import feign.Response;
import feign.Util;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ProjectFeign projectFeign;
	
	@Override
	public EmployeeLocationDTO getEmployeeLocationDetails(Integer employeeId) throws Exception {
		try {
			EmployeeLocationDTO employeeLocationDTO= new EmployeeLocationDTO();
			EmployeeEntity employeeEntity= employeeRepository.findById(employeeId).get();
			employeeLocationDTO.setEmployeeId(employeeEntity.getEmployeeId());
			employeeLocationDTO.setEmployeeName(employeeEntity.getEmployeeName());
			employeeLocationDTO.setLocationId(employeeEntity.getLocationId());
			Response response= projectFeign.getLocationById(employeeEntity.getLocationId());
			System.out.println(response.body().toString());
			employeeLocationDTO.setLocationName(Util.toString(response.body().asReader()));
			return employeeLocationDTO;
		}catch (Exception e) {
			throw e;
		}
	}

}
