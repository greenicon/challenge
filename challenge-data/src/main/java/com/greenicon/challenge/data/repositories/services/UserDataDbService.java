package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.UserData;

public interface UserDataDbService {

	void create(UserData userData);
	void delete(String id);
	void update(UserData userData);	
	UserData find(String id);
	List<UserData> findAll();
}
