package com.jpvernizzi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpvernizzi.dao.TimeDAO;
import com.jpvernizzi.model.Jogador;
import com.jpvernizzi.model.Time;

@Service
@Transactional
public class TimeServiceImplementation implements TimeService {

	@Autowired
	private TimeDAO timeDAO;

	@Override
	@Transactional
	public void addTime(Time time) {
		timeDAO.addTime(time);
	}

	@Override
	@Transactional
	public List<Time> getAllTimes() {
		return timeDAO.getAllTimes();
	}

	@Override
	@Transactional
	public void deleteTime(Integer timeId) {
		timeDAO.deleteTime(timeId);
	}

	public Time getTime(int timeId) {
		return timeDAO.getTime(timeId);
	}

	public Time updateTime(Time time) {
		// TODO Auto-generated method stub
		return timeDAO.updateTime(time);
	}

	public void setTimeDAO(TimeDAO timeDAO) {
		this.timeDAO = timeDAO;
	}

	@Override
	public List<Jogador> getJogadoresTime(int timeId) {
		return timeDAO.getJogadoresTime(timeId);
	}

}