package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.Category;
import com.greenicon.challenge.data.repositories.CategoryRepository;
import com.greenicon.challenge.data.repositories.services.CategoryDbService;

@Service
public class CategoryDbServiceImpl implements CategoryDbService{

	@Resource
	CategoryRepository repository;

	public void create(Category category) {
		repository.save(category);
	}

	public void delete(String id) {
		repository.delete(id);
	}

	public void update(Category category) {
		repository.save(category);
	}

	public Category find(String id) {
		return repository.findOne(id);
	}

	public List<Category> findAll() {
		return repository.findAll();
	}
}
