package com.greenicon.challenge.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenicon.challenge.data.models.User;

public interface UserRepository extends JpaRepository<User, String>{

}
