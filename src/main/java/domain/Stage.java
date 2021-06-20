
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
@Access(AccessType.PROPERTY)
public class Stage extends DomainEntity {

	private String		name;
	private String		description;
	private Integer		length;
	private Integer		difficultyLevel;
	private Location	origin;
	//private Location	destination;


	public Stage() {
		super();
	}

	@NotBlank
	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@Min(1)
	public Integer getLength() {
		return this.length;
	}

	public void setLength(final Integer length) {
		this.length = length;
	}

	@Range(min = 0, max = 10)
	public Integer getDifficultyLevel() {
		return this.difficultyLevel;
	}

	public void setDifficultyLevel(final Integer difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public Location getOrigin() {
		return this.origin;
	}

	public void setOrigin(final Location origin) {
		this.origin = origin;
	}

	/*
	 * public Location getDestination() {
	 * return this.destination;
	 * }
	 *
	 * public void setDestination(final Location destination) {
	 * this.destination = destination;
	 * }
	 */


	//Relaciones

	/****** Stage-StageInstance ******/

	Collection<StageInstance> stageInstances;


	@OneToMany(mappedBy = "stage")
	public Collection<StageInstance> getStageInstances() {
		return this.stageInstances;
	}

	public void setStageInstances(final Collection<StageInstance> stageInstances) {
		this.stageInstances = stageInstances;
	}

	public void addStageInstance(final StageInstance stageInstance) {
		this.stageInstances.add(stageInstance);
		stageInstance.setStage(this);
	}

	public void removeStageInstance(final StageInstance stageInstance) {
		this.stageInstances.remove(stageInstance);
		stageInstance.setStage(null);
	}


	/****** Route-Stage ******/
	//private Collection<Route> routes;

	private Route routes;


	@NotNull
	@ManyToOne(optional = false)
	public Route getRoutes() {
		return this.routes;
	}

	public void setRoutes(final Route routes) {
		this.routes = routes;
	}

	//@NotEmpty
	/*
	 * @ManyToMany(cascade = {
	 * CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH
	 * })
	 * public Collection<Route> getRoutes() {
	 * return this.routes;
	 * }
	 *
	 * public void setRoutes(final Route route) {
	 * this.routes.add(route);
	 * }
	 */

}
