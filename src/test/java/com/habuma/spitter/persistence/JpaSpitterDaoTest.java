package com.habuma.spitter.persistence;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.habuma.spitter.domain.Spitter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spitterJpa.xml")
public class JpaSpitterDaoTest {

	@Autowired
	@Qualifier(value="spitterDao")
	private SpitterDao jpaSpitterDao;

	@Test
	public void getSpitterById() throws Exception {
		
		Spitter spitter2 = jpaSpitterDao.getSpitterById(2);
		
		assertEquals("2", spitter2.getId().toString());
	}
}