package com.george.dao;

import java.util.List;

import com.george.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> getEmployees();
	
	public List<Employee> getEmployeesByDep(int dep);
	
	public void saveEmployee(Employee theEmployee);

	public Employee getEmployee(int theId);

	public void deleteEmployee(int theId);
	
	public List<Employee> searchEmployees(String theSearchName);
	
	
	
}
