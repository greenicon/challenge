package com.greenicon.challenge.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenicon.challenge.data.models.Location;

public interface LocationRepository extends JpaRepository<Location, String>{

}
