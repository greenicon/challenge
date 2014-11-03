package com.greenicon.challenge.services;

import java.util.ArrayList;

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
		/*
    	Timestamp ts = new Timestamp(2014-1900, 10-1, 27, 20, 35, 31, 0);
    	System.out.println(ts.toString());
    	System.out.println(challengeService.getChallengesCreatedAfter(ts).size());*/

		
		/*
    	System.out.println(challengeService.getChallengesByTag("aa"));
    	System.out.println(challengeService.getChallengesByTag("aa").size());
		*/
		

		ArrayList<String> challenges = null;
		challenges.add("aa");
		challenges.add("dd");
    	System.out.println(challengeService.getChallengesByTag("aa"));
    	System.out.println(challengeService.getChallengesByTag("aa").size());

	}
}
