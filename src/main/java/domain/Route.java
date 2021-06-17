
package domain;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
public class Route extends DomainEntity {

	private String	name;
	private String	description;
	private Boolean	visible;
	private Integer	mediaEvalDuracion;
	private Integer	mediaEvalDificultad;


	public Route() {
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

	public Boolean getVisible() {
		return this.visible;
	}

	public void setVisible(final Boolean visible) {
		this.visible = visible;
	}

	@Range(min = 0, max = 10)
	public Integer getMediaEvalDuracion() {
		return this.mediaEvalDuracion;
	}

	public void setMediaEvalDuracion(final Integer mediaEvalDuracion) {
		this.mediaEvalDuracion = mediaEvalDuracion;
	}

	@Range(min = 0, max = 10)
	public Integer getMediaEvalDificultad() {
		return this.mediaEvalDificultad;
	}

	public void setMediaEvalDificultad(final Integer mediaEvalDificultad) {
		this.mediaEvalDificultad = mediaEvalDificultad;
	}

}
