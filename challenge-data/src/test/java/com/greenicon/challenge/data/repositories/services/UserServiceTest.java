/**
 * 
 */
package com.greenicon.challenge.data.repositories.services;

import static org.junit.Assert.fail;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.greenicon.challenge.data.models.FriendsMap;
import com.greenicon.challenge.data.models.User;
import com.greenicon.challenge.data.repositories.services.provider.RepositoryServiceProvider;
import com.greenicon.challenge.data.util.TestUtils;

/**
 * @author pranav.gopi
 * @createdDate Oct 19, 2014
 */
public class UserServiceTest {

	static RepositoryServiceProvider rsp;
	static UserDbService userService;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public  void setUp() throws Exception {
		setUpFields();
	}
	
	static void setUpFields(){
		ApplicationContext applicationContext = TestUtils.getApplicationContext();
		rsp = applicationContext.getBean(RepositoryServiceProvider.class);
		userService = rsp.getUserDbService();
	}

	/**
	 * Test method for {@link com.greenicon.challenge.data.repositories.services.UserDataDbService#create(com.greenicon.challenge.data.models.User)}.
	 */
	@Test
	public void testCreate() {
		User user = new User();
		user.setFirstName("pranav");
		user.setLastName("gopi");
		user.setEmail("a");
		user.setMobilenumber("22");
		user.setDob(new Date());
		user.setCoverImageid("1");
		user.setProfileImageid("2");
		System.out.println(user);
		//userService.create(user);
	}

	/**
	 * Test method for {@link com.greenicon.challenge.data.repositories.services.UserDataDbService#delete(java.lang.String)}.
	 */
	@Test
	public void testDelete() {
		Collection<User> users = userService.findAll();
		for(User user:users){
		 userService.delete(user.getId());
		 break;
		}
	}

	/**
	 * Test method for {@link com.greenicon.challenge.data.repositories.services.UserDataDbService#update(com.greenicon.challenge.data.models.User)}.
	 */
	@Ignore
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.greenicon.challenge.data.repositories.services.UserDataDbService#find(java.lang.String)}.
	 */
	@Ignore
	@Test
	public void testFind() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.greenicon.challenge.data.repositories.services.UserDataDbService#findAll()}.
	 */
	@Test
	public void testFindAll() {
		List<User> users = userService.findAll();	
		for(User user:users){
			System.out.println(user);
		}
	}
	
	@Test
	public void testFindByName(){
		System.out.println(userService.findByName("pranav"));
	}
	
	@Test
	public void testFindFriends(){
		User user = userService.findByName("pranav").get(0);
		System.out.println(user);
		FriendsMap friendsMap = new FriendsMap();
		friendsMap.setFriendId("2c93890849312a8d0149312a93c30000");
		System.out.println(friendsMap);
		user.addFriendsMaps(friendsMap);
		System.out.println(friendsMap);
		System.out.println(user);
		userService.update(user);
		System.out.println("done");
		
	}
	
	public static void main(String[] args) throws Exception {
		setUpFields();
		User user = userService.findByName("pranav").get(0);
		System.out.println(user);
		FriendsMap friendsMap = new FriendsMap();
		friendsMap.setFriendId("2c93890849312a8d0149312a93c30000");
		friendsMap.setUser(user);
		rsp.getFriendsMapService().create(friendsMap);
		//friendsMap.setId("1");
//		System.out.println(friendsMap);
//		user.addFriendsMaps(friendsMap);
//		System.out.println(friendsMap);
//		System.out.println(user);
//		userService.update(user);
		System.out.println("done");
		
		user = userService.findByName("pranav").get(0);
		System.out.println(user);
	}

}
