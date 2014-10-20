/**
 * 
 */
package com.greenicon.challenge.services.user;

import java.util.Collection;

import com.greenicon.challenge.data.models.Gang;
import com.greenicon.challenge.data.models.User;
import com.greenicon.challenge.services.common.exceptions.DataNotFoundException;
import com.greenicon.challenge.services.common.exceptions.InvalidInputException;

/**
 * @author pranav.gopi
 * @createdDate Oct 19, 2014
 */
public interface UserService {
	
	User getUser(String userId) throws DataNotFoundException;
	
	Collection<User> getUsers(String userName) throws DataNotFoundException;
	
	void addUser(User user) throws InvalidInputException;
	
	void updateUser(User user) throws InvalidInputException;
	
	/* Friends */
	Collection<User> getUserFriends(User user) throws DataNotFoundException;
	void addUserFriends(Collection<User> friends) throws InvalidInputException;
	
	
	/* Gangs */
	Collection<Gang> getUserGangs(User user) throws DataNotFoundException;
	void addGangs(Collection<Gang> gangs) throws InvalidInputException;
	
	/* */

}
