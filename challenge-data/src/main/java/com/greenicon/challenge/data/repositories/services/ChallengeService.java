package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.Challenge;

public interface ChallengeService {

	void create(Challenge challenge);
	void delete(String id);
	void update(Challenge challenge);	
	Challenge find(String id);
	List<Challenge> findAll();
}
