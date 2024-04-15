package com.mysqlservice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysqlservice.demo.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{

}
