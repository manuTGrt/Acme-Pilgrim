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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domain.Pilgrim;
import domain.Route;
import domain.Stage;
import services.ActorService;
import services.RouteService;
import services.StageService;

@Controller
@RequestMapping("/administrator")
public class AdministratorController extends AbstractController {

	// Services ---------------------------------------------------------------

	@Autowired
	private ActorService	actorService;

	@Autowired
	private RouteService	routeService;

	@Autowired
	private StageService	stageService;


	// Constructors -----------------------------------------------------------

	public AdministratorController() {
		super();
	}

	// Actors ---------------------------------------------------------------

	@RequestMapping(value = "/list-actors", method = RequestMethod.GET)
	public ModelAndView listactors() {
		ModelAndView result;
		Collection<Pilgrim> actors;

		actors = this.actorService.findAllPilgrim();
		result = new ModelAndView("administrator/list-actors");
		result.addObject("actors", actors);

		return result;
	}

	// Routes ---------------------------------------------------------------

	@RequestMapping("/list-routes")
	public ModelAndView listroutes() {
		ModelAndView result;
		Collection<Route> routes;

		routes = this.routeService.findAll();
		result = new ModelAndView("administrator/list-routes");
		result.addObject("routes", routes);

		return result;
	}

	//Stages ---------------------------------------------------------------
	@RequestMapping(value = "/list-stages", method = RequestMethod.GET)
	public ModelAndView liststages(@RequestParam final int routeId) {
		ModelAndView result;
		Collection<Stage> stages;

		stages = this.stageService.findByRouteId(routeId);

		result = new ModelAndView("administrator/list-stages");
		result.addObject("stages", stages);

		return result;
	}
}
