package com.jpvernizzi.service;

import java.util.List;

import com.jpvernizzi.model.Jogador;
import com.jpvernizzi.model.Time;

public interface TimeService {
	
	public void addTime(Time time);

	public List<Time> getAllTimes();

	public void deleteTime(Integer timeId);

	public Time getTime(int timeId);

	public Time updateTime(Time time);
	
	public List<Jogador> getJogadoresTime(int timeId);
}
