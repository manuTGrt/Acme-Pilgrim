
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Pilgrim extends Actor {

	private Date	birthDates;
	private String	nationality;
	//private CreditCard	creditCard;
	private String	creditCard;


	public Pilgrim() {
		super();

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

	public String getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(final String creditCard) {
		this.creditCard = creditCard;
	}


	//Relaciones
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
