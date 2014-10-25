package com.greenicon.challenge.data.repositories.services;

import java.util.List;

import com.greenicon.challenge.data.models.Category;

public interface CategoryDbService {

	void create(Category category);
	void delete(String id);
	void update(Category category);	
	Category find(String id);
	List<Category> findAll();
}
