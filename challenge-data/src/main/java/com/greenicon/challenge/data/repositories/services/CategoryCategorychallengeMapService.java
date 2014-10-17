package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.CategoryCategorychallengeMap;

public interface CategoryCategorychallengeMapService {

	void create(CategoryCategorychallengeMap categoryCategorychallengeMap);
	void delete(String id);
	void update(CategoryCategorychallengeMap categoryCategorychallengeMap);	
	CategoryCategorychallengeMap find(String id);
	List<CategoryCategorychallengeMap> findAll();
}
