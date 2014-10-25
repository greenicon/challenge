package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.UserLogin;

public interface UserLoginDbService {

	void create(UserLogin userLogin);
	void delete(String id);
	void update(UserLogin userLogin);	
	UserLogin find(String id);
	List<UserLogin> findAll();
}
