package com.george.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.george.entity.Department;
import com.george.service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentRestController {
	
	//autowire the employee service
	@Autowired 
	private DepartmentService departmentService;
	
	//add mapping for get employees
	@GetMapping("/departments")
	public List<Department> getDepartments() {
		
		return departmentService.getDepartments();
	}
	

	
	
	//add mapping for get employee by id
	@GetMapping("/departments/{departmentId}")
	public Department getDepartment(@PathVariable int departmentId) {
		
		Department theDepartment = departmentService.getDepartment(departmentId);
		
		if (theDepartment == null) {
			
			throw new EmployeeNotFoundException("Department id not found- " + departmentId);
			
		}
		
		return theDepartment;
	}
	
}
