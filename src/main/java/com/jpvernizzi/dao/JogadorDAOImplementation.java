package com.jpvernizzi.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpvernizzi.model.Jogador;
import com.jpvernizzi.model.Time;

@Repository
public class JogadorDAOImplementation implements JogadorDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addJogador(Jogador jogador) {
		sessionFactory.getCurrentSession().saveOrUpdate(jogador);

	}

	@SuppressWarnings("unchecked")
	public List<Jogador> getAllJogadores() {

		return sessionFactory.getCurrentSession().createQuery("from Jogador")
				.list();
	}

	@Override
	public void deleteJogador(Integer jogadorId) {
		Jogador jogador = (Jogador) sessionFactory.getCurrentSession().load(
				Jogador.class, jogadorId);
		if (jogador != null) {
			this.sessionFactory.getCurrentSession().delete(jogador);
		}

	}

	public Jogador getJogador(int jogadorId) {
		return (Jogador) sessionFactory.getCurrentSession().get(
				Jogador.class, jogadorId);
	}

	@Override
	public Jogador updateJogador(Jogador jogador) {
		sessionFactory.getCurrentSession().update(jogador);
		return jogador;
	} 
	
	public List<Time> getAllTimes(){
		return sessionFactory.getCurrentSession().createQuery("from Time")
				.list();
	}

}