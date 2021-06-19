
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

@Entity
@Access(AccessType.PROPERTY)
public class StageInstance extends DomainEntity {

	private Date		start;
	private Date		end;
	private Evaluation	evaluation;


	public StageInstance() {
		super();
	}

	@Past
	@Temporal(TemporalType.TIMESTAMP)
	public Date getStart() {
		return this.start;
	}

	public void setStart(final Date start) {
		this.start = start;
	}

	@Past
	@Temporal(TemporalType.TIMESTAMP)
	public Date getEnd() {
		return this.end;
	}

	public void setEnd(final Date end) {
		this.end = end;
	}

	public Evaluation getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(final Evaluation evaluation) {
		this.evaluation = evaluation;
	}


	//Relaciones

	/****** Stage-StageInstance ******/

	private Stage stage;


	@Valid
	@ManyToOne(optional = true)
	public Stage getStage() {
		return this.stage;
	}

	public void setStage(final Stage stage) {
		this.stage = stage;
	}


	/****** StageInstance-Register ******/

	private Register register;


	@NotNull
	@Valid
	@ManyToOne(optional = false)
	public Register getRegister() {
		return this.register;
	}

	public void setRegister(final Register register) {
		this.register = register;
	}

}
