package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.User;
import com.greenicon.challenge.data.repositories.UserRepository;
import com.greenicon.challenge.data.repositories.services.UserDbService;

@Service
public class UserServiceImpl implements UserDbService{

	@Resource
	UserRepository repository;

	public void create(User user) {
		repository.saveAndFlush(user);		
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(User user) {
		repository.saveAndFlush(user);		
	}

	public User find(String id) {
		return repository.findOne(id);
	}

	public List<User> findAll() {
		return repository.findAll();
	}
}
