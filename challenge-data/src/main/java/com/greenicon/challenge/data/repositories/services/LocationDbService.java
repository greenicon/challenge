package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.Location;

public interface LocationDbService {
	
	void create(Location challenge);
	void delete(String id);
	void update(Location challenge);	
	Location find(String id);
	List<Location> findAll();
}
