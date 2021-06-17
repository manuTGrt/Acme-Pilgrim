
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Range;

@Embeddable
@Access(AccessType.PROPERTY)
public class Evaluation {

	private int		evalDuracion;
	private int		evalDificultad;
	private Date	moment;
	private String	comment;


	@Range(min = 0, max = 10)
	public int getEvalDuracion() {
		return this.evalDuracion;
	}

	public void setEvalDuracion(final int evalDuracion) {
		this.evalDuracion = evalDuracion;
	}

	@Range(min = 0, max = 10)
	public int getEvalDificultad() {
		return this.evalDificultad;
	}

	public void setEvalDificultad(final int evalDificultad) {
		this.evalDificultad = evalDificultad;
	}

	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(final String comment) {
		this.comment = comment;
	}

}
