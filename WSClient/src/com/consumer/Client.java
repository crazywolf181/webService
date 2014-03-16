package com.consumer;

import com.employee.EmployeeService;
import com.employee.EmployeeServiceImplementationService;

public class Client {

	public static void main(String[] args) {

		EmployeeServiceImplementationService service = new EmployeeServiceImplementationService();
		EmployeeService employee = service.getEmployeeServiceImplementationPort();
		System.out.println(""+employee.printName(12));

	}

}
