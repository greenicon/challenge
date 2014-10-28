package com.greenicon.challenge.data.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.greenicon.challenge.data.models.User;

public interface UserRepository extends JpaRepository<User, String>{

	@Query("SELECT u FROM User u WHERE u.firstName =:name OR u.lastName =:name ")
    public List<User> findByName(@Param("name") String name);
	
	//@Query("SELECT fm.user2 FROM FriendsMap fm JOIN Fetch User fm.user1 JOIN Fetch User fm.user2 WHERE fm.user1.id=:userId")
	@Query("SELECT  u FROM User u WHERE u.id IN (:friendIds)")
	public List<User> findFriends(@Param("friendIds") String friendIds);
	
}

