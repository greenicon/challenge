package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.FriendsMap;
import com.greenicon.challenge.data.repositories.FriendsMapRepository;
import com.greenicon.challenge.data.repositories.services.FriendsMapDbService;

@Service
public class FriendsMapDbServiceImpl implements FriendsMapDbService{

	@Resource
	FriendsMapRepository repository;

	public void create(FriendsMap friendsMap) {
		repository.saveAndFlush(friendsMap);		
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(FriendsMap friendsMap) {
		repository.saveAndFlush(friendsMap);		
	}

	public FriendsMap find(String id) {
		return repository.findOne(id);
	}

	public List<FriendsMap> findAll() {
		return repository.findAll();
	}
}
