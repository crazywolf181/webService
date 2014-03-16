package com.Employee;

import javax.jws.WebService;

@WebService(endpointInterface="com.Employee.EmployeeService")
public class EmployeeServiceImplementation implements EmployeeService {

	@Override
	public String printName(int employeeId) {
		//interfacing with he database as well as business logic
		return "Result Employee";
	}

}
