package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.ChallengeListProp;

public interface ChallengeListPropService {
	
	void create(ChallengeListProp challengeListProp);
	void delete(String id);
	void update(ChallengeListProp challengeListProp);	
	ChallengeListProp find(String id);
	List<ChallengeListProp> findAll();
}
