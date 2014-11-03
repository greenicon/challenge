/**
 * 
 */
package com.greenicon.challenge.services.user.impl;

import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.greenicon.challenge.data.models.Gang;
import com.greenicon.challenge.data.models.User;
import com.greenicon.challenge.data.repositories.services.provider.RepositoryServiceProvider;
import com.greenicon.challenge.services.common.exceptions.DataNotFoundException;
import com.greenicon.challenge.services.common.exceptions.DependencyException;
import com.greenicon.challenge.services.common.exceptions.InvalidInputException;
import com.greenicon.challenge.services.common.utils.Utils;
import com.greenicon.challenge.services.user.UserService;
import com.greenicon.challenge.services.user.util.UserUtils;

/**
 * @author pranav.gopi
 * @createdDate Oct 21, 2014
 */
public class UserServiceImpl implements UserService {

	private static Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Autowired
	private RepositoryServiceProvider rsp;
	
	/* (non-Javadoc)
	 * @see com.greenicon.challenge.services.user.UserService#getUser(java.lang.String)
	 */
	public User getUser(String userId) throws DataNotFoundException, DependencyException {
		User user = null;
		if(null != rsp && null != userId){
			try{
				user = rsp.getUserDbService().find(userId);
			}catch(Throwable e){
				throw new DependencyException(e.getMessage());
			}
		}
		if(null == user)
			throw new DataNotFoundException("User not found for UserId "+userId);
		return user;
	}

	/* (non-Javadoc)
	 * @see com.greenicon.challenge.services.user.UserService#getUsers(java.lang.String)
	 */
	public Collection<User> getUsers(String userName)
			throws DataNotFoundException, DependencyException {
		List<User> users = null;
		if(null != rsp && !Utils.isEmpty(userName)){
			try{
				users = rsp.getUserDbService().findByName(userName);
			}catch(Throwable e){
				throw new DependencyException(e.getMessage());
			}
		}
		if(null == users)
			throw new DataNotFoundException("Users not found for UserName "+userName);
		return users;
	}

	/* (non-Javadoc)
	 * @see com.greenicon.challenge.services.user.UserService#addUser(com.greenicon.challenge.data.models.User)
	 */
	public void addUser(User user) throws InvalidInputException {
		if(logger.isDebugEnabled()){
			logger.debug("Create User->"+user);
		}
		if(UserUtils.validateUser(user)){
			rsp.getUserDbService().create(user);
			logger.info("User added to db->"+user);
		}else{
			logger.error("User validation failed for user:"+user);
		}
		return;
	}

	/* (non-Javadoc)
	 * @see com.greenicon.challenge.services.user.UserService#updateUser(com.greenicon.challenge.data.models.User)
	 */
	public void updateUser(User user) throws InvalidInputException {
		if(logger.isDebugEnabled()){
			logger.debug("Update User->"+user);
		}
		if(UserUtils.validateUser(user)){
			rsp.getUserDbService().update(user);
			logger.info("User updated to db->"+user);
		}else{
			logger.error("User validation failed for user:"+user);
		}
		return;

	}

	/* (non-Javadoc)
	 * @see com.greenicon.challenge.services.user.UserService#getUserFriends(com.greenicon.challenge.data.models.User)
	 */
	/*public Collection<User> getUserFriends(User user)
			throws DataNotFoundException {
		if(logger.isDebugEnabled()){
			logger.debug("Get friends of user ->"+user);
		}
		List<User> friends = rsp.getUserService().findFriends(user);
		if(logger.isDebugEnabled()){
			logger.debug("Friends of user ->"+friends);
		}
		return friends;
	}*/

	/* (non-Javadoc)
	 * @see com.greenicon.challenge.services.user.UserService#addUserFriends(java.util.Collection)
	 */
	public void addUserFriends(User user, Collection<User> friends)
			throws InvalidInputException {
		if(logger.isDebugEnabled()){
			logger.debug("Add friends to user ->"+user+", friends ->"+friends);
		}
		for(User friend: friends){
			rsp.getUserDbService().addFriend(user, friend);
		}
		if(logger.isDebugEnabled()){
			logger.debug("Added friends to user ->"+user+", friends ->"+friends);
		}
	}

	/* (non-Javadoc)
	 * @see com.greenicon.challenge.services.user.UserService#getUserGangs(com.greenicon.challenge.data.models.User)
	 */
	public Collection<Gang> getUserGangs(User user)
			throws DataNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.greenicon.challenge.services.user.UserService#addGangs(java.util.Collection)
	 */
	public void addGangs(Collection<Gang> gangs) throws InvalidInputException {
		// TODO Auto-generated method stub

	}

}
