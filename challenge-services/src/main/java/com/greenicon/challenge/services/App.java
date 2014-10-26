package com.greenicon.challenge.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greenicon.challenge.services.challenge.ChallengeService;
import com.greenicon.challenge.services.common.exceptions.DataNotFoundException;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws DataNotFoundException
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:services-context.xml");
		
		/*
    	
    	System.out.println(ctx.getBeanDefinitionCount());
    	
    	for(String s:ctx.getBeanDefinitionNames()){
    		System.out.println(s);
    	}
    	
    	*/
    	
    	
    	ChallengeService challengeService = ctx.getBean(ChallengeService.class);
    	
    	System.out.println(challengeService.getChallengeById(1+""));
    }
}
