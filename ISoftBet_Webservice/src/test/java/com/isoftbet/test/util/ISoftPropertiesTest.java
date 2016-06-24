package com.isoftbet.test.util;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.isoftbet.util.ISoftProperties;

public class ISoftPropertiesTest {
	
	public static String REST_SERVICE_URI = "http://localhost:8080/ISoftBet_Webservice";

	@Before
	public void init() {
		System.out.println("hello");
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/springrest-servlet.xml");
		BeanFactory factory = context;
		ISoftProperties test = (ISoftProperties) factory.getBean("labelsProperties");
		
		System.out.println("hello");
		System.out.println(test.getValue("ryan"));
	}
	
	@Test
	public void testPropertiesSuccessful() {
		
	}
	
}
