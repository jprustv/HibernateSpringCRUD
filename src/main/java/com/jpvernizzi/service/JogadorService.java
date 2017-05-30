package com.jpvernizzi.service;

import java.util.List;

import com.jpvernizzi.model.Jogador;

public interface JogadorService {
	
	public void addJogador(Jogador jogador);

	public List<Jogador> getAllJogadores();

	public void deleteJogador(Integer jogadorId);

	public Jogador getJogador(int jogadorId);

	public Jogador updateJogador(Jogador jogador); 
}
