
package domain;

import javax.persistence.Entity;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
public class Stage extends DomainEntity {

	private String	name;
	private String	description;
	private Integer	length;
	private Integer	difficultyLever;
	//private Location origin;
	private String	origin;
	//private Location destination;
	private String	destination;


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
	public Integer getDifficultyLever() {
		return this.difficultyLever;
	}

	public void setDifficultyLever(final Integer difficultyLever) {
		this.difficultyLever = difficultyLever;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(final String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(final String destination) {
		this.destination = destination;
	}

}
