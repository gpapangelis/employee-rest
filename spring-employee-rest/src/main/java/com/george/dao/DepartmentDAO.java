package com.george.dao;

import java.util.List;

import com.george.entity.Department;
import com.george.entity.Employee;

public interface DepartmentDAO {

	public List<Department> getDepartments();
	
	public List<Department> getDepartmentsByLoc(int loc);

	public void saveDepartment(Department theDepartment);

	public Department getDepartment(int theId);

	public void deleteDepartment(int theId);

	public List<Department> searchDepartments(String theDepartmentName);

	
}
