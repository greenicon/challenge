package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.ChallengeUserGangMap;
import com.greenicon.challenge.data.repositories.ChallengeUserGangMapRepository;
import com.greenicon.challenge.data.repositories.services.ChallengeUserGangMapDbService;

@Service
public class ChallengeUserGangMapDbServiceImpl implements ChallengeUserGangMapDbService{

	@Resource
	ChallengeUserGangMapRepository repository;

	public void create(ChallengeUserGangMap challengeUserGangMap) {
		repository.saveAndFlush(challengeUserGangMap);		
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(ChallengeUserGangMap challengeUserGangMap) {
		repository.saveAndFlush(challengeUserGangMap);		
	}

	public ChallengeUserGangMap find(String id) {
		return repository.findOne(id);
	}

	public List<ChallengeUserGangMap> findAll() {
		return repository.findAll();
	}

	public Collection<String> findByChallengeeIdAndState(String challengeeId,
			String state) {
		return repository.findByChallengeeIdAndState(challengeeId, state);
	}
}
