package com.Employee;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface EmployeeService {
	@WebMethod
	String printName(int employeeId);
}
