package com.habuma.spitter.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;

public class HibernateSpitterDao implements SpitterDao {

	private SessionFactory sessionFactory;

	public HibernateSpitterDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addSpitter(Spitter spitter) {
		currentSession().save(spitter);
	}

	@Transactional
	public Spitter getSpitterById(long id) {
		return (Spitter) currentSession().get(Spitter.class, id);
	}

	public void saveSpitter(Spitter spitter) {
		currentSession().update(spitter);
	}

	@Override
	public List<Spittle> getSpittlesForSpitter(Spitter spitter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spitter getSpitterByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteSpittle(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Spittle getSpittleById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spitter> findAllSpitters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Spittle> getRecentSpittle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveSpittle(Spittle spittle) {
		// TODO Auto-generated method stub

	}

}
