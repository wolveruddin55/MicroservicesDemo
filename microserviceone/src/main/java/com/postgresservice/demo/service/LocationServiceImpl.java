package com.postgresservice.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgresservice.demo.entity.LocationEntity;
import com.postgresservice.demo.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository locationRepository;
	
	@Override
	public String locationName(Long locationId) {
		LocationEntity entity= locationRepository.findById(locationId).get();
		return entity.getBaseLocation();
	}

}
