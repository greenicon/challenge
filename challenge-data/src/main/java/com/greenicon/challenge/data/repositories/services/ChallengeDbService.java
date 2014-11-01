package com.greenicon.challenge.data.repositories.services;

import java.sql.Timestamp;
import java.util.List;

import com.greenicon.challenge.data.models.Challenge;

public interface ChallengeDbService {

	void create(Challenge challenge);
	void delete(String id);
	void update(Challenge challenge);	
	Challenge find(String id);
	List<Challenge> findAll();

	List<Challenge> findByByCategory(String category);
	//List<Challenge> findByByTag(String tag);
	List<Challenge> findByLocationId(String locationId);
	List<Challenge> findByCreatedtsAfter(Timestamp time);
}
