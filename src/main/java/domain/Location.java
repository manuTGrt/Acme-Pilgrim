
package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Embeddable
@Access(AccessType.PROPERTY)
public class Location {

	private String	title;
	private String	descriptionLocation;
	private Double	longitude;
	private Double	latitude;
	private Double	altitude;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getDescriptionLocation() {
		return this.descriptionLocation;
	}

	public void setDescriptionLocation(final String descriptionLocation) {
		this.descriptionLocation = descriptionLocation;
	}

	@Range(min = -180, max = 180)
	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(final Double longitude) {
		this.longitude = longitude;
	}

	@Range(min = -90, max = 90)
	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(final Double latitude) {
		this.latitude = latitude;
	}

	@Min(0)
	public Double getAltitude() {
		return this.altitude;
	}

	public void setAltitude(final Double altitude) {
		this.altitude = altitude;
	}

}
