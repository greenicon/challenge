package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.UserLogin;
import com.greenicon.challenge.data.repositories.UserLoginRepository;
import com.greenicon.challenge.data.repositories.services.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService{

	@Resource
	UserLoginRepository repository;

	public void create(UserLogin userLogin) {
		repository.saveAndFlush(userLogin);		
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(UserLogin userLogin) {
		repository.save(userLogin);		
	}

	public UserLogin find(String id) {
		return repository.findOne(id);
	}

	public List<UserLogin> findAll() {
		return repository.findAll();
	}

}
