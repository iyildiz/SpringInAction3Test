package com.habuma.spitter.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Component;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;

@Component
public class JdbcTemplateSpitterDao implements SpitterDao {
	// <start id="ugly_addSpitter_vars" />

	private static final String SQL_INSERT_SPITTER = "insert into spitter (username, password, fullname)  values (:username, :password, :fullname)";

	@Autowired
	private SimpleJdbcTemplate jdbcTemplate;

	// <start id="ugly_saveSpitter_vars" />
	private static final String SQL_UPDATE_SPITTER = "update spitter set username = ?, password = ?, fullname = ?"
			+ "where id = ?";
	// <end id="ugly_saveSpitter_vars" />

	// <start id="ugly_getSpitter_vars" />
	private static final String SQL_SELECT_SPITTER = "select id, username, password, fullname from spitter where id = ?";

	// <end id="ugly_getSpitter_vars" />

	// <start id="ugly_addSpitter" />
	public void addSpitter(Spitter spitter) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("username", spitter.getUsername());
		params.put("password", spitter.getPassword());
		params.put("fullname", spitter.getFullName());
		jdbcTemplate.update(SQL_INSERT_SPITTER, params);
		// spitter.setId(queryForIdentity());
	}

	public Spitter getSpitterById(long id) {
		return jdbcTemplate.queryForObject(SQL_SELECT_SPITTER, Spitter.class,
				new ParameterizedRowMapper<Spitter>() {
					public Spitter mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Spitter spitter = new Spitter();
						spitter.setId(rs.getLong(1));
						spitter.setUsername(rs.getString(2));
						spitter.setPassword(rs.getString(3));
						spitter.setFullName(rs.getString(4));
						return spitter;
					}
				}, id);
	}

	public void saveSpitter(Spitter spitter) {

		jdbcTemplate.update(SQL_UPDATE_SPITTER, spitter.getUsername(),
				spitter.getPassword(), spitter.getFullName(), spitter.getId());

	}

	// <end id="ugly_saveSpitter" />

	public List<Spittle> getRecentSpittle() {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveSpittle(Spittle spittle) {
		// TODO Auto-generated method stub

	}

	public List<Spittle> getSpittlesForSpitter(Spitter spitter) {
		// TODO Auto-generated method stub
		return null;
	}

	public Spitter getSpitterByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteSpittle(long id) {
		throw new UnsupportedOperationException();
	}

	public Spittle getSpittleById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Spitter> findAllSpitters() {
		// TODO Auto-generated method stub
		return null;
	}

}
