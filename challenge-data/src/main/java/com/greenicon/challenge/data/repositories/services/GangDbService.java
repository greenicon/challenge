package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.Gang;

public interface GangDbService {

	void create(Gang gang);
	void delete(String id);
	void update(Gang gang);	
	Gang find(String id);
	List<Gang> findAll();
}
