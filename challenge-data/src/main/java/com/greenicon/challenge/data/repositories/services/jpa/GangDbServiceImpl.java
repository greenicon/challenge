package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.Gang;
import com.greenicon.challenge.data.repositories.GangRepository;
import com.greenicon.challenge.data.repositories.services.GangDbService;

@Service
public class GangDbServiceImpl implements GangDbService{

	@Resource
	GangRepository repository;

	public void create(Gang gang) {
		repository.saveAndFlush(gang);		
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(Gang gang) {
		repository.saveAndFlush(gang);		
	}

	public Gang find(String id) {
		return repository.findOne(id);
	}

	public List<Gang> findAll() {
		return repository.findAll();
	}
}
