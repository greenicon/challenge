package com.greenicon.challenge.data;

import java.util.List;

import org.springframework.context.ApplicationContext;

import com.greenicon.challenge.data.models.User;
import com.greenicon.challenge.data.repositories.services.provider.RepositoryServiceProvider;
import com.greenicon.challenge.data.util.TestUtils;

/**
 * Hello world!
 *
 */
public class App 
{
	static RepositoryServiceProvider rsp;

	public RepositoryServiceProvider getRsp() {
		System.out.println("rsp : "+rsp);
		return rsp;
	}

	public static void main( String[] args )
	{

		ApplicationContext ctx = TestUtils.getApplicationContext();//GenericXmlApplicationContext();
		rsp = ctx.getBean(RepositoryServiceProvider.class);

		List<User> users = rsp.getUserService().findAll(); 
		
		for(User user:users){
			System.out.println(user);
		}
		System.out.println(users);
		System.out.println(rsp.getCategoryService().findAll());
	}
}
