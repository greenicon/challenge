package com.greenicon.challenge.data.repositories;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.greenicon.challenge.data.models.ChallengeUserGangMap;

public interface ChallengeUserGangMapRepository extends JpaRepository<ChallengeUserGangMap, String>{

	@Query("SELECT c.challenge FROM ChallengeUserGangMap c WHERE c.challengeeId =:challengeeId AND c.state =:state")
    public Collection<String> findByChallengeeIdAndState(@Param("challengeeId") String challengeeId, @Param("state") String state);
}
