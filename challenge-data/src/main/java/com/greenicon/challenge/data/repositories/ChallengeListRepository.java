package com.greenicon.challenge.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenicon.challenge.data.models.ChallengeList;

public interface ChallengeListRepository extends JpaRepository<ChallengeList, String>{

}
