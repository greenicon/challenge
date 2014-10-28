/**
 * 
 */
package com.greenicon.challenge.services.user;

import java.util.Collection;

import com.greenicon.challenge.data.models.Gang;
import com.greenicon.challenge.data.models.User;
import com.greenicon.challenge.services.common.exceptions.ChallengeException;
import com.greenicon.challenge.services.common.exceptions.DataNotFoundException;
import com.greenicon.challenge.services.common.exceptions.DependencyException;
import com.greenicon.challenge.services.common.exceptions.InvalidInputException;

/**
 * @author pranav.gopi
 * @createdDate Oct 19, 2014
 */
public interface UserService {
	
	User getUser(String userId) throws ChallengeException;
	
	Collection<User> getUsers(String userName) throws ChallengeException;
	
	void addUser(User user) throws ChallengeException;
	
	void updateUser(User user) throws ChallengeException;
	
	/* Friends */
	//Collection<User> getUserFriends(User user) throws ChallengeException;
	void addUserFriends(User user, Collection<User> friends) throws ChallengeException;
	
	
	/* Gangs */
	Collection<Gang> getUserGangs(User user) throws ChallengeException;
	void addGangs(Collection<Gang> gangs) throws ChallengeException;
	
	/* */

}
