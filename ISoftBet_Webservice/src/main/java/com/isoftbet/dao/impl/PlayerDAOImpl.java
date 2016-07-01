package com.isoftbet.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.isoftbet.dao.AbstractDAO;
import com.isoftbet.dao.PlayerDAO;
import com.isoftbet.model.Player;
import com.isoftbet.util.CommonUtils;

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
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	/*
	 * jdbctemplate - inserting object and returning generated key, refer to 
	 * http://docs.spring.io/spring/docs/current/spring-framework-reference/html/jdbc.html#jdbc-auto-genereted-keys
	 */	
	@Override
	public Player add(final Player player) {
		final String sql = "insert into player (playerid, name, balance, updated, deleted) values (?,?,?,?,?)";

		try {
			KeyHolder keyHolder = new GeneratedKeyHolder();
			jdbcTemplate.update(
					new PreparedStatementCreator() {
						public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
							PreparedStatement ps = connection.prepareStatement(sql, new String[] {"id"});
							ps.setString(1, player.getPlayerId());
							ps.setString(2, player.getName());
							ps.setDouble(3, player.getBalance());
							ps.setTimestamp(4, CommonUtils.getCurrentTimestamp());
							ps.setBoolean(5, false);;
							return ps;
						}
					},
					keyHolder);
			player.setId(keyHolder.getKey().longValue());
			return player;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	@Override
	public void set(final Player t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Player t) {
		// TODO Auto-generated method stub

	}
}
