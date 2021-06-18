
package domain;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
public class Pilgrim extends Actor {

	private Date		birthDates;
	private String		nationality;
	private CreditCard	creditCard;


	public Pilgrim() {
		super();

		this.registers = new HashSet<Register>();

	}

	public Date getBirthDates() {
		return this.birthDates;
	}

	public void setBirthDates(final Date birthDates) {
		this.birthDates = birthDates;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(final String nationality) {
		this.nationality = nationality;
	}

	public CreditCard getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}


	//Relaciones

	/****** Pilgrim-Register ******/

	Collection<Register> registers;


	@NotNull
	@OneToMany(mappedBy = "pilgrim")
	public Collection<Register> getRegisters() {
		return this.registers;
	}

	public void setRegister(final Collection<Register> registers) {
		this.registers = registers;
	}

	public void addRegister(final Register register) {
		this.registers.add(register);
		register.setPilgrim(this);
	}

	public void removeRegister(final Register register) {
		this.registers.remove(register);
		register.setPilgrim(null);
	}

}
