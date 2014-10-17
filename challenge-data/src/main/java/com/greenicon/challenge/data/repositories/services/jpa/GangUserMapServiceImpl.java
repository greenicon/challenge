package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.GangUserMap;
import com.greenicon.challenge.data.repositories.GangUserMapRepository;
import com.greenicon.challenge.data.repositories.services.GangUserMapService;

@Service
public class GangUserMapServiceImpl implements GangUserMapService{

	@Resource
	GangUserMapRepository repository;

	public void create(GangUserMap gangUserMap) {
		repository.saveAndFlush(gangUserMap);		
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(GangUserMap gangUserMap) {
		repository.saveAndFlush(gangUserMap);		
	}

	public GangUserMap find(String id) {
		return repository.findOne(id);
	}

	public List<GangUserMap> findAll() {
		return repository.findAll();
	}
}
