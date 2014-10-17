package com.greenicon.challenge.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenicon.challenge.data.models.UserData;

public interface UserDataRepository extends JpaRepository<UserData, String>{

}
