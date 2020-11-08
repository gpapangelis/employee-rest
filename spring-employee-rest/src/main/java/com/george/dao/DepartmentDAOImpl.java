package com.george.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.george.entity.Department;
import com.george.entity.Employee;
import com.george.entity.Location;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	//inject session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Department> getDepartments() {
		
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		//create a query
		Query<Department> theQuery = 
				currentSession.createQuery("from Department", Department.class);
		
		//execute query and get result list
		List<Department> departments = theQuery.getResultList();
		
		
		//return the results
		return departments;
		
		
	}

	@Override
	public void saveDepartment(Department theDepartment) {
		
		//get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the employee
		currentSession.saveOrUpdate(theDepartment);
		
	}

	@Override
	public Department getDepartment(int theId) {
				// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// now retrieve /read from database using the primary key
				Department theDepartment = currentSession.get(Department.class, theId);
				
				return theDepartment;
	}

	@Override
	public void deleteDepartment(int theId) {
				//get session
				Session currentSession = sessionFactory.getCurrentSession();
				
				//delete by id
				Query theQuery = currentSession.createQuery("delete from Department where id=:departmentId");
				theQuery.setParameter("departmentId", theId);
				theQuery.executeUpdate();
		
	}

	@Override
	public List<Department> searchDepartments(String theDepartmentName) {
		// TODO Auto-generated method stub
		return null;
	}

	//add for search by deptid   (prosoxh sto id)
	/*@Override
	public List<Employee> getEmployeesByDep(int deptid) {
		
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession(); 
				
		//create a query
		Query<Employee> theQuery = 
						currentSession.createQuery("from Employee WHERE deptid = 1", Employee.class);
		
				
		//execute query and get result list
		List<Employee> employees = theQuery.getResultList();
				
				
		//return the results
		return employees;
		
	}    */
	
	@Override
	public List<Department> getDepartmentsByLoc(int loc) {
		
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		
		Query theQuery = null;
		//create a query ... sort by last name
		
		/*Query<Employee> theQuery = currentSession.createQuery("from Employee WHERE deptid = :d order by lastName" , 
															Employee.class); */
		
		theQuery =currentSession.createQuery("from Department WHERE locid = :l ", Department.class);
		
		theQuery.setParameter("l", loc);
			
		//execute query and get result list
		List<Department> departments = theQuery.getResultList();
		
		//return the results
		return departments;
	}
	
	

}
