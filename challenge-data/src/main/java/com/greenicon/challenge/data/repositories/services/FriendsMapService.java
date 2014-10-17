package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.FriendsMap;

public interface FriendsMapService {

	void create(FriendsMap friendsMap);
	void delete(String id);
	void update(FriendsMap friendsMap);	
	FriendsMap find(String id);
	List<FriendsMap> findAll();
}
