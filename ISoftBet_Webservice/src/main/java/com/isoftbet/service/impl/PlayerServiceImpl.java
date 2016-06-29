package com.isoftbet.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.isoftbet.dao.PlayerDAO;
import com.isoftbet.model.Player;
import com.isoftbet.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {

	private PlayerDAO playerDao;
	
	public PlayerDAO getPlayerDao() {
		return playerDao;
	}

	public void setPlayerDao(PlayerDAO playerDao) {
		this.playerDao = playerDao;
	}

	@Override
	public List<Player> retrieveAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player retrieve(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player retrieve(Player t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Player t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Player t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Player t) {
		// TODO Auto-generated method stub
		
	}

}
