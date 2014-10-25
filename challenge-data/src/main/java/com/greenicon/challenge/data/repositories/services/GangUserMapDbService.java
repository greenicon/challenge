package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.GangUserMap;

public interface GangUserMapDbService {
	
	void create(GangUserMap gangUserMap);
	void delete(String id);
	void update(GangUserMap gangUserMap);	
	GangUserMap find(String id);
	List<GangUserMap> findAll();
}
