package com.greenicon.challenge.data.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUtils {

	public static ApplicationContext getApplicationContext(){
		return new ClassPathXmlApplicationContext("classpath:data-context.xml");
	}
}
