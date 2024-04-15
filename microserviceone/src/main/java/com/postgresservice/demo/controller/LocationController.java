package com.postgresservice.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.postgresservice.demo.service.LocationServiceImpl;

@RestController
@RequestMapping("/api/v1/postgres")
public class LocationController {

	@Autowired
	LocationServiceImpl locationServiceImpl;
	
	@GetMapping("/get-location-by-id")
	public String getLocationById(@RequestParam("locationId") Long locationId) {
		return locationServiceImpl.locationName(locationId);
	}
}
