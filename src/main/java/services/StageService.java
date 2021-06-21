
package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import domain.Stage;
import repositories.StageRepository;

@Service
@Transactional
public class StageService {

	// Managed repository -----------------------------------------------------

	@Autowired
	private StageRepository stageRepository;


	// Constructors -----------------------------------------------------------

	public StageService() {
		super();
	}

	// Simple CRUD methods ---------------------------------------------------

	public Collection<Stage> findAll() {
		Collection<Stage> result;

		result = this.stageRepository.findAll();
		Assert.notNull(result);

		return result;
	}

	public Collection<Stage> findByRouteId(final int route) {
		Collection<Stage> result;

		result = this.stageRepository.findByRouteId(route);
		Assert.notNull(result);

		return result;
	}

}
