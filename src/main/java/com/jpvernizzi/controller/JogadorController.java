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
import com.jpvernizzi.model.Time;
import com.jpvernizzi.service.TimeService;

@Controller
public class JogadorController {

	private static final Logger logger = Logger
			.getLogger(JogadorController.class);

	public JogadorController() {
		System.out.println("JogadorController()");
	}

	@Autowired
	private JogadorService jogadorService;
	@Autowired
	private TimeService timeService;
	
	// TODO: Tentar usar @Autowired TeamService pra acessar e pegar os times

	@RequestMapping(value = "/jogadores")
	public ModelAndView listJogador(ModelAndView model) throws IOException {
		List<Jogador> listJogador = jogadorService.getAllJogadores();
		model.addObject("listJogador", listJogador);
		model.setViewName("jogadores");
		return model;
	}
 
	@RequestMapping(value = "/newJogador", method = RequestMethod.GET)
	public ModelAndView newJogador(ModelAndView model) {
		Jogador jogador = new Jogador();
		List<Time> listTime = timeService.getAllTimes();
		
		model.addObject("listTime", listTime);
		model.addObject("jogador", jogador);
		
		model.setViewName("JogadorForm");
		
		
		return model;
	}

	@RequestMapping(value = "/saveJogador", method = RequestMethod.POST)
	public ModelAndView saveJogador(@ModelAttribute Jogador jogador) {
		if (jogador.getId() == 0) { // Cria um Jogador se o ID for 0
			System.out.println(jogador.getNome());
			
			jogadorService.addJogador(jogador);
		} else { // caso contrário, Atualiza o Jogador
			jogadorService.updateJogador(jogador);
		}
		return new ModelAndView("redirect:/jogadores");
	}

	@RequestMapping(value = "/deleteJogador", method = RequestMethod.GET)
	public ModelAndView deleteJogador(HttpServletRequest request) {
		int jogadorId = Integer.parseInt(request.getParameter("id"));
		jogadorService.deleteJogador(jogadorId);
		return new ModelAndView("redirect:/jogadores");
	}

	@RequestMapping(value = "/editJogador", method = RequestMethod.GET)
	public ModelAndView editJogador(HttpServletRequest request) {
		int jogadorId = Integer.parseInt(request.getParameter("id"));
		Jogador jogador = jogadorService.getJogador(jogadorId);
		
		List<Time> listTime = timeService.getAllTimes();

		
		ModelAndView model = new ModelAndView("JogadorForm");
		model.addObject("jogador", jogador);
		model.addObject("listTime", listTime);

		return model;
	} 

}