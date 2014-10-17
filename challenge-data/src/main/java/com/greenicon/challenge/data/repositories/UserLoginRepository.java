package com.greenicon.challenge.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenicon.challenge.data.models.UserLogin;

public interface UserLoginRepository extends JpaRepository<UserLogin, String>{

}
