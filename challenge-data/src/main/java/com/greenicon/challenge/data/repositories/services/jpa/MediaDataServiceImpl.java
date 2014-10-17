package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.MediaData;
import com.greenicon.challenge.data.repositories.MediaDataRepository;
import com.greenicon.challenge.data.repositories.services.MediaDataService;

@Service
public class MediaDataServiceImpl implements MediaDataService{

	@Resource
	MediaDataRepository repository;

	public void create(MediaData mediaData) {
		repository.saveAndFlush(mediaData);		
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(MediaData mediaData) {
		repository.saveAndFlush(mediaData);
	}

	public MediaData find(String id) {
		return repository.findOne(id);
	}

	public List<MediaData> findAll() {
		return repository.findAll();
	}
}
