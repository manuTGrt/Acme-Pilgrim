
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Access(AccessType.PROPERTY)
public class Register extends DomainEntity {

	private Date date;


	public Register() {
		super();
	}

	@Past
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDate() {
		return this.date;
	}

	public void setDate(final Date date) {
		this.date = date;
	}


	//Relaciones

	/****** Pilgrim-Register ******/

	private Pilgrim pilgrim;


	@Valid
	@ManyToOne(optional = true)
	public Pilgrim getPilgrim() {
		return this.pilgrim;
	}

	public void setPilgrim(final Pilgrim pilgrim) {
		this.pilgrim = pilgrim;
	}


	/****** Register-Route ******/

	private Route route;


	@Valid
	@ManyToOne(optional = true)
	public Route getRoute() {
		return this.route;
	}

	public void setRoute(final Route route) {
		this.route = route;
	}


	/****** StageInstance-Register ******/

	private Collection<StageInstance> stageInstances;


	@NotEmpty
	@OneToMany(mappedBy = "register", cascade = CascadeType.ALL)
	public Collection<StageInstance> getStageInstances() {
		return this.stageInstances;
	}

	public void setStageInstances(final Collection<StageInstance> stageInstances) {
		this.stageInstances = stageInstances;
	}

	public void addStageInstance(final StageInstance stageInstance) {
		this.stageInstances.add(stageInstance);
		stageInstance.setRegister(this);
	}

	public void removeStageInstance(final StageInstance stageInstance) {
		this.stageInstances.remove(stageInstance);
		stageInstance.setRegister(null);
	}

}
