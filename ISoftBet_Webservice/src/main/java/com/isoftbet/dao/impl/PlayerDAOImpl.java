package com.isoftbet.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
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
		return jdbcTemplate.queryForObject("select * from player where id = ?", new Object[]{id}, new PlayerMapper());
	}

	@Override
	public Player find(Player t) {
		// TODO Auto-generated method stub
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
