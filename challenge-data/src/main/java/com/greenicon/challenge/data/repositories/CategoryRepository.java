/**
 * 
 */
package com.greenicon.challenge.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenicon.challenge.data.models.Category;

public interface CategoryRepository extends JpaRepository<Category, String>{

}
