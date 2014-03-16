package com.server;

import javax.xml.ws.Endpoint;

import com.Employee.EmployeeServiceImplementation;

public class Publisher {
	public static void main(String[] args) {
		//Creates a service endpoint that exposes a service for use
		// kind of like in that .net based website
		Endpoint.publish("http://localhost:8090/WS/example", new EmployeeServiceImplementation());
	}
}
