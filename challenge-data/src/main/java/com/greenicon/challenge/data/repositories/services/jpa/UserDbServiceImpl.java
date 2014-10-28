package com.greenicon.challenge.data.repositories.services.jpa;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.greenicon.challenge.data.models.FriendsMap;
import com.greenicon.challenge.data.models.User;
import com.greenicon.challenge.data.repositories.FriendsMapRepository;
import com.greenicon.challenge.data.repositories.UserRepository;
import com.greenicon.challenge.data.repositories.services.UserDbService;

@Service
public class UserDbServiceImpl implements UserDbService{

	@Resource
	UserRepository userRepository;
	
	@Resource
	FriendsMapRepository friendsMapRepository;

	public void create(User user) {
		userRepository.saveAndFlush(user);		
	}

	public void delete(String id) {
		userRepository.delete(id);		
	}

	public void update(User user) {
		userRepository.saveAndFlush(user);		
	}

	public User find(String id) {
		return userRepository.findOne(id);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public List<User> findByName(String firstName){
		return userRepository.findByName(firstName);
	}
	
	/* (non-Javadoc)
	 * @see com.greenicon.challenge.data.repositories.services.UserService#addFriend(com.greenicon.challenge.data.models.User, com.greenicon.challenge.data.models.User)
	 */
	public void addFriend(User user, User friend) {
		FriendsMap friendsMap = new FriendsMap();
		friendsMap.setFriendId(friend.getId());
		friendsMap.setUser(user);
		friendsMapRepository.save(friendsMap);
		user.addFriendsMaps(friendsMap);
	}

	/* (non-Javadoc)
	 * @see com.greenicon.challenge.data.repositories.services.UserService#findFriends(com.greenicon.challenge.data.models.User)
	 */
	/**/
}
