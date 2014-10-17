package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.ChallengeListUserGangMap;

public interface ChallengeListUserGangMapService {
	
	void create(ChallengeListUserGangMap challengeListUserGangMap);
	void delete(String id);
	void update(ChallengeListUserGangMap challengeListUserGangMap);	
	ChallengeListUserGangMap find(String id);
	List<ChallengeListUserGangMap> findAll();
}
