package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.ChallengeList;

public interface ChallengeListService {

	void create(ChallengeList challengeList);
	void delete(String id);
	void update(ChallengeList challengeList);	
	ChallengeList find(String id);
	List<ChallengeList> findAll();
}
