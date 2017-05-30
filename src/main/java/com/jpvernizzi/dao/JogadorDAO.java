package com.jpvernizzi.dao;

import java.util.List;
import com.jpvernizzi.model.Jogador;
import com.jpvernizzi.model.Time;

public interface JogadorDAO {

	public void addJogador(Jogador jogador);

	public List<Jogador> getAllJogadores();

	public void deleteJogador(Integer jogadorId);

	public Jogador updateJogador(Jogador jogador);

	public Jogador getJogador(int jogadorId); 
	
	public List<Time> getAllTimes();
	
}