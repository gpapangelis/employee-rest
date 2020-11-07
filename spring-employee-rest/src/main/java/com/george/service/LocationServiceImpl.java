package com.george.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.george.dao.LocationDAO;
import com.george.entity.Location;

@Service
public class LocationServiceImpl implements LocationService {

	
	//need to inject employee dao
	@Autowired
	private LocationDAO locationDAO;
	
	
	@Override
	@Transactional
	public List<Location> getLocations() {
		return locationDAO.getLocations();
	}


	@Override
	@Transactional
	public void saveLocation(Location theLocation) {
		
		locationDAO.saveLocation(theLocation);
		
	}


	@Override
	@Transactional
	public Location getLocation(int theId) {
		
		return locationDAO.getLocation(theId);
	}


	@Override
	public void deleteLocation(int theId) {
		
		locationDAO.deleteLocation(theId);
		
	}

}
