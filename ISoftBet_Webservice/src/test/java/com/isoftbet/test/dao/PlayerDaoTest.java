package com.isoftbet.test.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.isoftbet.dao.impl.PlayerDAOImpl;
import com.isoftbet.model.Player;
import com.isoftbet.test.model.DAObjectTest;
import com.isoftbet.util.CommonUtils;
import com.isoftbet.util.model.DAObject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springrest-servlet.xml")
public class PlayerDaoTest implements DAObjectTest {
	
	private static final Logger logger = LoggerFactory.getLogger(PlayerDAOImpl.class);
	
	@Autowired
	private DAObject<Player> playerDao;

	@Test
	public void testFindAll() {
		List<Player> players = null;
		assertTrue((players = playerDao.findAll()) instanceof List);
		assertNotNull(players);
		assertTrue("Empty list", players.size() > 0);
	}

	@Test
	public void testFindSuccess() {
		assertTrue(playerDao.find(1) instanceof Player);
		assertNotNull(playerDao.find(1));
		
		assertTrue(playerDao.find(new Player(1)) instanceof Player);
		assertNotNull(playerDao.find(new Player(1)));
	}

	@Test
	public void testFindFail() {		
		assertFalse(playerDao.find(0) instanceof Player);
		assertNull(playerDao.find(0));
		
		assertFalse(playerDao.find(new Player(0)) instanceof Player);
		assertNull(playerDao.find(new Player(0)));
		
		assertNull(playerDao.find(null));
	}

	@Test
	public void testAddSuccess() {
		Player player = new Player();
		player.setBalance(10.50);
		player.setName("Lorem Ipsum");
		player.setPlayerId(CommonUtils.generateAlphaNumericString());
		
		assertNotNull(playerDao.add(player));
		
	}

	@Test
	public void testAddFail() {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testSetSuccess() {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testSetFail() {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testDeleteSuccess() {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testDeleteFail() {
		// TODO Auto-generated method stub
		
	}
}
