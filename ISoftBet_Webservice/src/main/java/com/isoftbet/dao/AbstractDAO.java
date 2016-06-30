package com.isoftbet.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AbstractDAO {
	protected JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
