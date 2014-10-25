package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.Media;
import com.greenicon.challenge.data.repositories.MediaRepository;
import com.greenicon.challenge.data.repositories.services.MediaDbService;

@Service
public class MediaDbServiceImpl implements MediaDbService{

	@Resource
	MediaRepository repository;

	public void create(Media media) {
		repository.saveAndFlush(media);		
	}

	public void delete(String id) {
		repository.delete(id);		
	}

	public void update(Media media) {
		repository.saveAndFlush(media);		
	}

	public Media find(String id) {
		return repository.findOne(id);
	}

	public List<Media> findAll() {
		return repository.findAll();
	}
}
