package com.postgresservice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.postgresservice.demo.entity.LocationEntity;

public interface LocationRepository extends JpaRepository<LocationEntity, Long> {

}
