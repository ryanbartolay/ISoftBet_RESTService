package com.isoftbet.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.isoftbet.dao.PlayerDAO;
import com.isoftbet.model.Currency;
import com.isoftbet.model.Player;

/**
 * @Repository 
 * This annotation also allows the component scanning support to find and 
 * configure your DAOs and repositories without having to provide XML configuration 
 * entries for them.
 **/
@Repository
public class PlayerDAOImpl implements PlayerDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Player> findAll() {
		return this.jdbcTemplate.query(
				"select first_name, last_name from t_actor",
				new RowMapper<Player>() {
					public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
						Player player = new Player();
						player.setId(rs.getInt("id"));
						player.setPlayerId(rs.getString("playerid"));
						player.setName(rs.getString("name"));
						return player;
					}
				});
	}

	@Override
	public Player find(long id) {
		// TODO Auto-generated method stub
		return null;
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
