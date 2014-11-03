package com.greenicon.challenge.data.repositories.services;

import java.util.Collection;
import java.util.List;

import com.greenicon.challenge.data.models.ChallengeUserGangMap;

public interface ChallengeUserGangMapDbService {

	void create(ChallengeUserGangMap challengeUserGangMap);
	void delete(String id);
	void update(ChallengeUserGangMap challengeUserGangMap);	
	ChallengeUserGangMap find(String id);
	List<ChallengeUserGangMap> findAll();
	
	Collection<String> findByChallengeeIdAndState(String challengeeId, String state);
}
