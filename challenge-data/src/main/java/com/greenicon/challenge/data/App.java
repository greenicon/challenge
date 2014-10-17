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
	static RepositoryServiceProvider rsp;

	public RepositoryServiceProvider getRsp() {
		System.out.println("rsp : "+rsp);
		return rsp;
	}

	public static void main( String[] args )
	{

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:SpringContext.xml");//GenericXmlApplicationContext();
		//ctx.load("classpath:SpringContext.xml");

		/*String[] x = ctx.getBeanDefinitionNames();
		for(String s:x){
			System.out.println(s);
		}*/
		/*
		@SuppressWarnings("unused")
		CategoryService a1 = ctx.getBean(CategoryService.class);
		*/rsp = ctx.getBean(RepositoryServiceProvider.class);

		System.out.println(rsp.getCategoryService().findAll());
	}
}
