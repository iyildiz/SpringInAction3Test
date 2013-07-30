package com.habuma.spitter.persistence;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jca.context.SpringContextResourceAdapter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.habuma.spitter.domain.Spitter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spitterHibernate.xml")
public class HibernateSpitterDaoTest {

	@Autowired
	private ApplicationContext applicationContext;
	
	private SpitterDao hibernateSpitterDao;

	@Test
	public void getSpitterById() throws Exception {
		
		hibernateSpitterDao = (SpitterDao) applicationContext.getBean("hibernateSpitterDao");
		
		Spitter spitter2 = hibernateSpitterDao.getSpitterById(2);
		
		assertEquals("2", spitter2.getId().toString());
	}
}