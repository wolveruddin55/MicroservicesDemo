package com.mysqlservice.demo.utility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeLocationDTO {
	private Integer employeeId;
	private String employeeName;
	private Long locationId;
	private String locationName;
}
