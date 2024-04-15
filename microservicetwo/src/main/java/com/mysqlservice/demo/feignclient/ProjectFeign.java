package com.mysqlservice.demo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url="http://localhost:5000", value="project-feign-client",path = "/api/v1/postgres")
public interface ProjectFeign {
	@GetMapping("/get-location-by-id")
	feign.Response getLocationById(@RequestParam("locationId") Long locationId);
}
