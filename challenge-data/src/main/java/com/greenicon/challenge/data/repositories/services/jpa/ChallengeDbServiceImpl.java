package com.greenicon.challenge.data.repositories.services.jpa;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.Challenge;
import com.greenicon.challenge.data.repositories.ChallengeRepository;
import com.greenicon.challenge.data.repositories.services.ChallengeDbService;

@Service
public class ChallengeDbServiceImpl implements ChallengeDbService{

	@Resource
	ChallengeRepository repository;

	public void create(Challenge challenge) {
		repository.saveAndFlush(challenge);		
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(Challenge challenge) {
		repository.saveAndFlush(challenge);		
	}

	public Challenge find(String id) {
		return repository.findOne(id);
	}

	public List<Challenge> findAll() {
		return repository.findAll();
	}

	public List<Challenge> findByByCategory(String category) {
		return repository.findByCategory(category);
	}
	
	public List<Challenge> findByByTag(String tag) {
		return null;//	TODO
	}

	public List<Challenge> findByLocationId(String locationId) {
		return repository.findByLocationId(locationId);
	}

	public List<Challenge> findByCreatedtsAfter(Timestamp timestamp) {
		return repository.findByCreatedtsAfter(timestamp);
	}
}
