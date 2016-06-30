package com.isoftbet.runtime;

import javax.sql.DataSource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/springrest-servlet.xml");
		BeanFactory factory = context;
		DataSource test = (DataSource) factory.getBean("dataSource");
	}
} 

