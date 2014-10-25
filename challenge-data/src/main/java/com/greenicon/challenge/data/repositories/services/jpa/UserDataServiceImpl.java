package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.UserData;
import com.greenicon.challenge.data.repositories.UserDataRepository;
import com.greenicon.challenge.data.repositories.services.UserDataDbService;

@Service
public class UserDataServiceImpl implements UserDataDbService{

	@Resource
	UserDataRepository repository;

	public void create(UserData userData) {
		repository.saveAndFlush(userData);		
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(UserData userData) {
		repository.saveAndFlush(userData);		
	}

	public UserData find(String id) {
		return repository.findOne(id);
	}

	public List<UserData> findAll() {
		return repository.findAll();
	}
}
