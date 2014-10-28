package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.User;

public interface UserDbService {

	void create(User user);
	void delete(String id);
	void update(User user);	
	User find(String id);
	List<User> findAll();
	
	List<User> findByName(String firstName);
	
	void addFriend(User user, User friend);
	
	//List<User> findFriends(User user);
}
