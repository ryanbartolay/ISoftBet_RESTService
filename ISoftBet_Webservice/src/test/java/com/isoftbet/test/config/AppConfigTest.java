package com.isoftbet.test.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.isoftbet.config.JdbcConfig;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springrest-servlet.xml")
public class AppConfigTest extends TestCase {
	
	@Autowired
	private JdbcConfig jdbcConfig;
	
	@Test
	public void testConfigSuccess() {
		System.out.println(jdbcConfig.getDriver());
	}
}
