
package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.Past;

@Entity
public class StageInstance extends DomainEntity {

	private Date	start;
	private Date	end;
	//private Evaluation evaluation;
	private String	evaluation;


	public StageInstance() {
		super();
	}

	@Past
	public Date getStart() {
		return this.start;
	}

	public void setStart(final Date start) {
		this.start = start;
	}

	@Past
	public Date getEnd() {
		return this.end;
	}

	public void setEnd(final Date end) {
		this.end = end;
	}

	public String getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(final String evaluation) {
		this.evaluation = evaluation;
	}

}
