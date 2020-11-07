package com.george.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.george.entity.Employee;
import com.george.entity.Location;

@Transactional
@Repository
public class LocationDAOImpl implements LocationDAO {

	//inject session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Location> getLocations() {
		
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		//create a query
		Query<Location> theQuery = 
				currentSession.createQuery("from Location", Location.class);
		
		//execute query and get result list
		List<Location> locations = theQuery.getResultList();
		
		
		//return the results
		return locations;
		
		
	}

	@Override
	public void saveLocation(Location theLocation) {
		
		//get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save the employee
		currentSession.saveOrUpdate(theLocation);
		
	}

	@Override
	public Location getLocation(int theId) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve /read from database using the primary key
		Location theLocation = currentSession.get(Location.class, theId);
		
		return theLocation;
	}

	@Override
	public void deleteLocation(int theId) {
				//get session
				Session currentSession = sessionFactory.getCurrentSession();
				
				//delete by id
				Query theQuery = currentSession.createQuery("delete from Location where id=:locationId");
				theQuery.setParameter("locationId", theId);
				theQuery.executeUpdate();
		
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

}
