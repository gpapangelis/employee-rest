package com.george.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//add mapping for post employee - add new employee
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee theEmployee) {
	
		
		
		employeeService.saveEmployee(theEmployee);
		
		return theEmployee;
	}
	
	//add mapping for put employees - update
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		
		
		employeeService.saveEmployee(theEmployee);
		return theEmployee;
	}
	
	//add mapping for delete employee
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		
		Employee tempEmployee = employeeService.getEmployee(employeeId);
		
		//exception if null
		if (tempEmployee == null) {
			
			throw new EmployeeNotFoundException("Employee id not found- " + employeeId);
			
		}
		
		employeeService.deleteEmployee(employeeId);
		
		return "Deleted employee with id -" +employeeId;
	}
	
	/*
		@GetMapping("/employeesByDep/{deptId}")
		public Employee getEmployeeByDep(@PathVariable int deptId) {
			
			Employee theEmployee = employeeService.getEmployeeByDep(deptId);
			
			
			
			return theEmployee;
		}
		
		*/
	
	
		@GetMapping("employees/listByDep/{dep}")
		public List<Employee> listEmployeesByDep(Model theModel, @PathVariable("dep") int dep) {
			
			// get student from the service
			List<Employee> theEmployees = employeeService.getEmployeesByDep(dep);
			
			
			//add the students to the model
			theModel.addAttribute("employees" , theEmployees);
					
			return theEmployees;
			
		}
		
		@GetMapping("employees/search")
		public List<Employee> searchEmployees( @RequestParam("theSearchName") String theSearchName,
					Model theModel) { 
			
			//search employees from the service
			List<Employee> theEmployees = employeeService.searchEmployees(theSearchName);
			
			//add the employees to the model
			theModel.addAttribute("employees", theEmployees);
			
			return theEmployees;
		
		
		}
	
}
