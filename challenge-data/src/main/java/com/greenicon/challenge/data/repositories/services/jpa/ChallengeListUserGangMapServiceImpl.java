package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.ChallengeListUserGangMap;
import com.greenicon.challenge.data.repositories.ChallengeListUserGangMapRepository;
import com.greenicon.challenge.data.repositories.services.ChallengeListUserGangMapDbService;

@Service
public class ChallengeListUserGangMapServiceImpl implements ChallengeListUserGangMapDbService{

	@Resource
	ChallengeListUserGangMapRepository repository;

	public void create(ChallengeListUserGangMap challengeListUserGangMap) {
		repository.saveAndFlush(challengeListUserGangMap);		
	}

	public void delete(String id) {
		repository.delete(id);
	}

	public void update(ChallengeListUserGangMap challengeListUserGangMap) {
		repository.saveAndFlush(challengeListUserGangMap);		
	}

	public ChallengeListUserGangMap find(String id) {
		return repository.findOne(id);
	}

	public List<ChallengeListUserGangMap> findAll() {
		return repository.findAll();
	}

}
