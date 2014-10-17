package com.greenicon.challenge.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenicon.challenge.data.models.Media;

public interface MediaRepository extends JpaRepository<Media, String>{

}
