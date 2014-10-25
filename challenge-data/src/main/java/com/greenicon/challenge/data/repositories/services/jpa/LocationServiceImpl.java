package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.Location;
import com.greenicon.challenge.data.repositories.LocationRepository;
import com.greenicon.challenge.data.repositories.services.LocationDbService;

@Service
public class LocationServiceImpl implements LocationDbService{

	@Resource
	LocationRepository repository;

	public void create(Location challenge) {
		repository.saveAndFlush(challenge);		
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(Location challenge) {
		repository.saveAndFlush(challenge);		
	}

	public Location find(String id) {
		return repository.findOne(id);
	}

	public List<Location> findAll() {
		return repository.findAll();
	}

}
