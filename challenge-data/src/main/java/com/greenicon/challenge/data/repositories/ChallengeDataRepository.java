package com.greenicon.challenge.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenicon.challenge.data.models.ChallengeData;

public interface ChallengeDataRepository extends JpaRepository<ChallengeData, String>{

}
