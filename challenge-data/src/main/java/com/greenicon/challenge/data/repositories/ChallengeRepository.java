package com.greenicon.challenge.data.repositories;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenicon.challenge.data.models.Challenge;

public interface ChallengeRepository extends JpaRepository<Challenge, String>{

	List<Challenge> findByCategory(String category);
	//List<Challenge> findByTag(String tag);
	List<Challenge> findByLocationId(String locationId);
	List<Challenge> findByCreatedtsAfter(Timestamp time);
	
	List<String> findByChallengeIdAndState(String challengeeId, String state);
}
