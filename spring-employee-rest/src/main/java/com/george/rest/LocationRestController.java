package com.george.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.george.entity.Location;
import com.george.service.LocationService;

@RestController
@RequestMapping("/api")
public class LocationRestController {
	
	//autowire the employee service
	@Autowired 
	private LocationService locationService;
	
	//add mapping for get employees
	@GetMapping("/locations")
	public List<Location> getLocations() {
		
		return locationService.getLocations();
	}
	

	
	
	//add mapping for get employee by id
	@GetMapping("/locations/{locationId}")
	public Location getLocation(@PathVariable int locationId) {
		
		Location theLocation = locationService.getLocation(locationId);
		
		if (theLocation == null) {
			
			throw new EmployeeNotFoundException("Location id not found- " + locationId);
			
		}
		
		return theLocation;
	}
	
}
