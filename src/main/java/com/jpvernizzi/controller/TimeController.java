package com.jpvernizzi.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jpvernizzi.model.Jogador;
import com.jpvernizzi.model.Time;
import com.jpvernizzi.service.JogadorService;
import com.jpvernizzi.service.TimeService;

@Controller
public class TimeController {

	private static final Logger logger = Logger
			.getLogger(TimeController.class);

	public TimeController() {
		System.out.println("TimeController()");
	}

	@Autowired
	private TimeService timeService;
	@Autowired
	private JogadorService jogadorService;
	
	@RequestMapping(value = {"/", "/times"})
	public ModelAndView listTime(ModelAndView model) throws IOException {
		List<Time> listTime = timeService.getAllTimes();
		model.addObject("listTime", listTime);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newTime", method = RequestMethod.GET)
	public ModelAndView newTime(ModelAndView model) {
		Time time = new Time();
		model.addObject("time", time);
		model.setViewName("TimeForm");
		return model;
	}

	@RequestMapping(value = "/saveTime", method = RequestMethod.POST)
	public ModelAndView saveTime(@ModelAttribute Time time) {
		if (time.getId() == 0) { // Cria um Time se o ID for 0
			timeService.addTime(time);
		} else { // Caso contrário, atualiza o Time
			timeService.updateTime(time);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteTime", method = RequestMethod.GET)
	public ModelAndView deleteTime(HttpServletRequest request) {
		int timeId = Integer.parseInt(request.getParameter("id"));
		timeService.deleteTime(timeId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editTime", method = RequestMethod.GET)
	public ModelAndView editTime(HttpServletRequest request) {
		int timeId = Integer.parseInt(request.getParameter("id"));
		Time time = timeService.getTime(timeId);
		ModelAndView model = new ModelAndView("TimeForm");
		model.addObject("time", time);

		return model;
	}
	
	@RequestMapping(value = "/timeJogadores", method = RequestMethod.GET)
	public ModelAndView listJogadoresTime(HttpServletRequest request) {
		int timeId = Integer.parseInt(request.getParameter("id"));
		List<Jogador> listJogadoresTime = timeService.getJogadoresTime(timeId);
		ModelAndView model = new ModelAndView("jogadoresTimeForm");
		model.addObject("listJogadoresTime", listJogadoresTime);
		
		Time time = timeService.getTime(timeId);
		model.addObject("time", time);
	
		model.setViewName("TimeJogadores");
		return model;
	}

}