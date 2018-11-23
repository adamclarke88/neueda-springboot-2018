package uk.ac.belfastmet.LargestBuildings.domain;

public class BuildingFloorArea extends Building {
	
	private String floorArea;

	public BuildingFloorArea() {
		super();
	}

	public BuildingFloorArea(String floorArea) {
		super();
		this.floorArea = floorArea;
	}

	public String getFloorArea() {
		return floorArea;
	}

	public void setFloorArea(String floorArea) {
		this.floorArea = floorArea;
	}
	
	

}
