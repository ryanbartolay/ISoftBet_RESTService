package com.isoftbet.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.isoftbet.dao.PlayerDAO;
import com.isoftbet.model.Player;

/**
 * @Repository 
 * This annotation also allows the component scanning support to find and 
 * configure your DAOs and repositories without having to provide XML configuration 
 * entries for them.
 **/
@Repository
public class PlayerDAOImpl implements PlayerDAO {

	/** 
	 * Any DAO or repository implementation will need to access to a persistence resource, 
	 * depending on the persistence technology used;
	 * 	for example,
	 * 		a JDBC-based repository will need access to a JDBC DataSource;
	 * 		a JPA-based repository will need access to an EntityManager. 
	 * 		a classic Hibernate APIs than you can inject the SessionFactory:
	 **/
	@Autowired
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	
	@Autowired
	public PlayerDAOImpl(JdbcTemplate jdbcTemplate) {
		
		this.dataSource = dataSource;
	}
	@Override
	public List<Player> findAll() {
		// TODO Auto-generated method stub
		return null;
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
