
package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.Past;

@Entity
public class Register extends DomainEntity {

	private Date date;


	public Register() {
		super();
	}

	@Past
	public Date getDate() {
		return this.date;
	}

	public void setDate(final Date date) {
		this.date = date;
	}


	//Relaciones
	private Pilgrim pilgrim;


	@Valid
	@ManyToOne(optional = true)
	public Pilgrim getPilgrim() {
		return this.pilgrim;
	}

	public void setPilgrim(final Pilgrim pilgrim) {
		this.pilgrim = pilgrim;
	}

}
