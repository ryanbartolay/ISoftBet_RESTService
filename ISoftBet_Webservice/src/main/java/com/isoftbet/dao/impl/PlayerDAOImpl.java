package com.isoftbet.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.isoftbet.dao.AbstractDAO;
import com.isoftbet.dao.PlayerDAO;
import com.isoftbet.model.Player;

/**
 * @Repository 
 * This annotation also allows the component scanning support to find and 
 * configure your DAOs and repositories without having to provide XML configuration 
 * entries for them.
 **/
@Repository
public class PlayerDAOImpl extends AbstractDAO implements PlayerDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PlayerDAOImpl.class);
	
	/*
	 * Generic mapper for player entity
	 */
	private static final class PlayerMapper implements RowMapper<Player> {
		public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
			Player player = new Player();
			player.setId(rs.getInt("id"));
			player.setPlayerId(rs.getString("playerid"));
			player.setName(rs.getString("name"));
			return player;
		}
	}

	@Override
	public List<Player> findAll() {
		return jdbcTemplate.query("select * from player", new PlayerMapper());
	}

	@Override
	public Player find(long id) {
		return this.find(new Player(id));
	}

	@Override
	public Player find(Player player) {
		try {
			return jdbcTemplate.queryForObject("select * from player where id = ?", new Object[]{player.getId()}, new PlayerMapper());
		} catch(Exception e) {
			logger.error("This is Error message", e);
		}
		return null;
	}

	@Override
	public void add(Player t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void set(Player t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Player t) {
		// TODO Auto-generated method stub

	}
}
