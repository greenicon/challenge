package com.greenicon.challenge.data.repositories.services.jpa;

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
}
