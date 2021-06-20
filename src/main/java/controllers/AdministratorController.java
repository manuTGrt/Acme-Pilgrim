/*
 * AdministratorController.java
 *
 * Copyright (C) 2018 Universidad de Sevilla
 *
 * The use of this project is hereby constrained to the conditions of the
 * TDG Licence, a copy of which you may download from
 * http://www.tdg-seville.info/License.html
 */

package controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import domain.Actor;
import services.ActorService;

@Controller
@RequestMapping("/administrator")
public class AdministratorController extends AbstractController {

	// Services ---------------------------------------------------------------

	@Autowired
	private ActorService actorService;


	// Constructors -----------------------------------------------------------

	public AdministratorController() {
		super();
	}

	// Actors ---------------------------------------------------------------

	@RequestMapping(value = "/list-actors", method = RequestMethod.GET)
	public ModelAndView listactors() {
		ModelAndView result;
		Collection<Actor> actors;

		actors = this.actorService.findAll();
		result = new ModelAndView("administrator/list-actors");
		result.addObject("actors", actors);

		return result;
	}

	// Action-2 ---------------------------------------------------------------

	@RequestMapping("/action-2")
	public ModelAndView action2() {
		ModelAndView result;

		result = new ModelAndView("administrator/action-2");

		return result;
	}

}
