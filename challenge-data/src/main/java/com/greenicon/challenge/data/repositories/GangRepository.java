package com.greenicon.challenge.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenicon.challenge.data.models.Gang;

public interface GangRepository extends JpaRepository<Gang, String>{

}
