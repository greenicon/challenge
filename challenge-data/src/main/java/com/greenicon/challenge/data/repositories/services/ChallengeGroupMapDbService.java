package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.ChallengeGroupMap;

public interface ChallengeGroupMapDbService {

	void create(ChallengeGroupMap challengeGroupMap);
	void delete(String id);
	void update(ChallengeGroupMap challengeGroupMap);	
	ChallengeGroupMap find(String id);
	List<ChallengeGroupMap> findAll();

}
