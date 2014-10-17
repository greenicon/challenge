package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.Media;

public interface MediaService {

	void create(Media media);
	void delete(String id);
	void update(Media media);	
	Media find(String id);
	List<Media> findAll();
}
