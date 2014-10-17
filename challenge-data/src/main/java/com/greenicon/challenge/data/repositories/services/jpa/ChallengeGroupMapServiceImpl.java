package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.ChallengeGroupMap;
import com.greenicon.challenge.data.repositories.ChallengeGroupMapRepository;
import com.greenicon.challenge.data.repositories.services.ChallengeGroupMapService;

@Service
public class ChallengeGroupMapServiceImpl implements ChallengeGroupMapService{

	@Resource
	ChallengeGroupMapRepository repository;

	public void create(ChallengeGroupMap challengeGroupMap) {
		repository.save(challengeGroupMap);		
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(ChallengeGroupMap challengeGroupMap) {
		repository.saveAndFlush(challengeGroupMap);		
	}

	public ChallengeGroupMap find(String id) {
		return repository.findOne(id);
	}

	public List<ChallengeGroupMap> findAll() {
		return repository.findAll();
	}

}
