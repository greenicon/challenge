package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.ChallengeData;

public interface ChallengeDataDbService {

	void create(ChallengeData challengeData);
	void delete(String id);
	void update(ChallengeData challengeData);	
	ChallengeData find(String id);
	List<ChallengeData> findAll();
}
