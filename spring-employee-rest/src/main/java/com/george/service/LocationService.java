package com.george.service;

import java.util.List;

import com.george.entity.Location;

public interface LocationService {

	public List<Location> getLocations();

	public void saveLocation(Location theLocation);

	public Location getLocation(int theId);

	public void deleteLocation(int theId);
}
