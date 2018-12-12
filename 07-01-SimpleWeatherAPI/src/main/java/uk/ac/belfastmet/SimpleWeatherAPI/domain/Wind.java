package uk.ac.belfastmet.SimpleWeatherAPI.domain;

import lombok.Data;

@Data
public class Wind {
	
	private Integer speed;
	private String direction;

	
	
	public String toString() {
		
		String wind = "\n" + this.getSpeed() + ", " + this.getDirection();

		return wind;
	}

	
}
