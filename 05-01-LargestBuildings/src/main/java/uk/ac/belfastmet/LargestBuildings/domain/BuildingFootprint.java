package uk.ac.belfastmet.LargestBuildings.domain;

public class BuildingFootprint extends Building{
	
	private String footprint;
	private String lengthXwidth;
	private String description;
	
	public BuildingFootprint() {
		super();
	}

	public BuildingFootprint(String footprint, String lengthXwidth, String description) {
		super();
		this.footprint = footprint;
		this.lengthXwidth = lengthXwidth;
		this.description = description;
	}

	public String getFootprint() {
		return footprint;
	}

	public void setFootprint(String footprint) {
		this.footprint = footprint;
	}

	public String getLengthXwidth() {
		return lengthXwidth;
	}

	public void setLengthXwidth(String lengthXwidth) {
		this.lengthXwidth = lengthXwidth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
