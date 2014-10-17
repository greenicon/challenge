package com.greenicon.challenge.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenicon.challenge.data.models.Challenge;

public interface ChallengeRepository extends JpaRepository<Challenge, String>{

}
