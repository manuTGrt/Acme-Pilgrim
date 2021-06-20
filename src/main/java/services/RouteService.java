
package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Route;
import repositories.RouteRepository;

@Service
@Transactional
public class RouteService {

	// Managed repository -----------------------------------------------------

	@Autowired
	private RouteRepository routeRepository;


	// Constructors -----------------------------------------------------------

	public RouteService() {
		super();
	}

	// Simple CRUD methods ---------------------------------------------------

	public Collection<Route> findAll() {
		Collection<Route> result;

		result = this.routeRepository.findAll();
		Assert.notNull(result);

		return result;
	}
}
