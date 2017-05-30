package com.jpvernizzi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpvernizzi.model.Jogador;
import com.jpvernizzi.model.Time;

@Repository
public class TimeDAOImplementation implements TimeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addTime(Time time) {
		sessionFactory.getCurrentSession().saveOrUpdate(time);

	}

	@SuppressWarnings("unchecked")
	public List<Time> getAllTimes() {

		return sessionFactory.getCurrentSession().createQuery("from Time")
				.list();
	}

	@Override
	public void deleteTime(Integer timeId) {
		Time time = (Time) sessionFactory.getCurrentSession().load(
				Time.class, timeId);
		if (time != null) {
			this.sessionFactory.getCurrentSession().delete(time);
		}

	}

	public Time getTime(int timeId) {
		return (Time) sessionFactory.getCurrentSession().get(
				Time.class, timeId);
	}

	@Override
	public Time updateTime(Time time) {
		sessionFactory.getCurrentSession().update(time);
		return time;
	}

	@Override
	public List<Jogador> getJogadoresTime(int timeId) {
		String query = "from Jogador where time = " + Integer.toString(timeId);
		return sessionFactory.getCurrentSession().createQuery(query)
				.list();
	}

}