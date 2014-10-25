package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.ChallengeList;
import com.greenicon.challenge.data.repositories.ChallengeListRepository;
import com.greenicon.challenge.data.repositories.services.ChallengeListDbService;

@Service
public class ChallengeListServiceImpl implements ChallengeListDbService{

	@Resource
	ChallengeListRepository repository;

	public void create(ChallengeList challengeList) {
		repository.saveAndFlush(challengeList);		
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(ChallengeList challengeList) {
		repository.saveAndFlush(challengeList);		
	}

	public ChallengeList find(String id) {
		return repository.findOne(id);
	}

	public List<ChallengeList> findAll() {
		return repository.findAll();
	}


}
