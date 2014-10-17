package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.MediaData;

public interface MediaDataService {

	void create(MediaData mediaData);
	void delete(String id);
	void update(MediaData mediaData);	
	MediaData find(String id);
	List<MediaData> findAll();
}
