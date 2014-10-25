package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.ChallengeListProp;
import com.greenicon.challenge.data.repositories.ChallengeListPropRepository;
import com.greenicon.challenge.data.repositories.services.ChallengeListPropDbService;

@Service
public class ChallengeListPropServiceImpl implements ChallengeListPropDbService{

	@Resource
	ChallengeListPropRepository repository;

	public void create(ChallengeListProp challengeListProp) {
		repository.saveAndFlush(challengeListProp);
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(ChallengeListProp challengeListProp) {
		repository.saveAndFlush(challengeListProp);		
	}

	public ChallengeListProp find(String id) {
		return repository.findOne(id);
	}

	public List<ChallengeListProp> findAll() {
		return repository.findAll();
	}

}
