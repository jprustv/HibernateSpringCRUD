package com.jpvernizzi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpvernizzi.dao.JogadorDAO;
import com.jpvernizzi.model.Jogador;

@Service
@Transactional
public class JogadorServiceImplementation implements JogadorService {

	@Autowired
	private JogadorDAO jogadorDAO;

	@Override
	@Transactional
	public void addJogador(Jogador jogador) {
		jogadorDAO.addJogador(jogador);
	}

	@Override
	@Transactional
	public List<Jogador> getAllJogadores() {
		return jogadorDAO.getAllJogadores();
	}

	@Override
	@Transactional
	public void deleteJogador(Integer jogadorId) {
		jogadorDAO.deleteJogador(jogadorId);
	}

	public Jogador getJogador(int jogadorId) {
		return jogadorDAO.getJogador(jogadorId);
	}

	public Jogador updateJogador(Jogador jogador) {
		// TODO Auto-generated method stub
		return jogadorDAO.updateJogador(jogador);
	}

	public void setJogadorDAO(JogadorDAO jogadorDAO) {
		this.jogadorDAO = jogadorDAO;
	} 

}