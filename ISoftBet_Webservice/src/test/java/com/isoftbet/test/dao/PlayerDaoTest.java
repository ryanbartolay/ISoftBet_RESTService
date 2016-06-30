package com.isoftbet.test.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.isoftbet.dao.PlayerDAO;
import com.isoftbet.test.util.AppTestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springrest-servlet.xml")
public class PlayerDaoTest extends AppTestCase {
	
	@Autowired
	private PlayerDAO playerDao;
	
	@Test
	public void testRetrieveAllSuccess() {
		System.out.println(playerDao);
	}
}
