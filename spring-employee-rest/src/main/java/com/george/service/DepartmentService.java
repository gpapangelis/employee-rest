package com.george.service;

import java.util.List;

import com.george.entity.Department;

public interface DepartmentService {

	public List<Department> getDepartments();

	public void saveDepartment(Department theDepartment);

	public Department getDepartment(int theId);

	public void deleteDepartment(int theId);
	
	public List<Department> searchDepartments(String theDepartmentName);
	
	public List<Department> getDepartmentsByLoc(int loc);
}
