package com.george.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.george.entity.Employee;
import com.george.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	//autowire the employee service
	@Autowired 
	private EmployeeService employeeService;
	
	//add mapping for get employees
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		
		return employeeService.getEmployees();
	}
	

	
	
	//add mapping for get employee by id
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		
		Employee theEmployee = employeeService.getEmployee(employeeId);
		
		if (theEmployee == null) {
			
			throw new EmployeeNotFoundException("Employee id not found- " + employeeId);
			
		}
		
		return theEmployee;
	}
	
}
