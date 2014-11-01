package com.greenicon.challenge.data;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greenicon.challenge.data.repositories.services.provider.RepositoryServiceProvider;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{

		//ApplicationContext ctx = TestUtils.getApplicationContext();//GenericXmlApplicationContext();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:data-context.xml");
		RepositoryServiceProvider rsp = ctx.getBean(RepositoryServiceProvider.class);
		
		/*	
		List<User> users = rsp.getUserService().findAll(); 
		
		for(User user:users){
			System.out.println(user);
		}
		System.out.println(users);
		 */

		System.out.println(rsp.getCategoryDbService().findAll());
		
		//System.out.println(rsp.getChallengeUserGangMapDbService().findByChallengeIdAndState("1", "1"));
	}
}
