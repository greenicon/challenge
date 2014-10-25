package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.CategoryCategorychallengeMap;
import com.greenicon.challenge.data.repositories.CategoryCategorychallengeMapRepository;
import com.greenicon.challenge.data.repositories.services.CategoryCategorychallengeMapDbService;

@Service
public class CategoryCategorychallengeMapServiceImpl implements CategoryCategorychallengeMapDbService{

	@Resource
	CategoryCategorychallengeMapRepository repository;

	public void create(CategoryCategorychallengeMap categoryCategorychallengeMap) {
		repository.saveAndFlush(categoryCategorychallengeMap);
	}

	public void delete(String id) {
		repository.delete(id);
	}

	public void update(CategoryCategorychallengeMap categoryCategorychallengeMap) {
		repository.saveAndFlush(categoryCategorychallengeMap);
	}

	public CategoryCategorychallengeMap find(String id) {
		return repository.findOne(id);
	}

	public List<CategoryCategorychallengeMap> findAll() {
		return repository.findAll();
	}
}
