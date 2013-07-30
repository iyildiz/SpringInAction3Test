package com.habuma.spitter.persistence;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.persistence.JdbcSpitterDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spitter.xml")
public class JdbcSpitterDaoTest {

	@Autowired
	private JdbcSpitterDao jdbcSpitterDao;

	@Test
	public void getSpitterById() throws Exception {
		
		Spitter spitter2 = jdbcSpitterDao.getSpitterById(2);
		
		assertEquals("2", spitter2.getId().toString());
	}
}