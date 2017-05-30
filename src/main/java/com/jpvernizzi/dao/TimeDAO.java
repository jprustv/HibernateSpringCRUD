package com.jpvernizzi.dao;

import java.util.List;
import com.jpvernizzi.model.Time;
import com.jpvernizzi.model.Jogador;

public interface TimeDAO {

	public void addTime(Time time);

	public List<Time> getAllTimes();

	public void deleteTime(Integer timeId);

	public Time updateTime(Time time);

	public Time getTime(int timeId);
	
	public List<Jogador> getJogadoresTime(int timeId);
	
}