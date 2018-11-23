package uk.ac.belfastmet.LargestBuildings.service;

import java.util.ArrayList;


import uk.ac.belfastmet.LargestBuildings.domain.BuildingVolume;

public class BuildingService {
	
	public BuildingService() {
		super();
	}
	
	public ArrayList<BuildingVolume> getBuildingVolume(){
		
		ArrayList<BuildingVolume> buildings = new ArrayList<BuildingVolume>();
			
		BuildingVolume boeingEverettFactory = new BuildingVolume("Boeing Everett Factory", "United States", "Everett, Washington",
				"398,000 m2", "13.3 million m3", 
				"Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.", 
				"homebuilding.jpg", "googlemapss");
				buildings.add(boeingEverettFactory);
				
		BuildingVolume greatMosqueOfMecca = new BuildingVolume("Great Mosque of Mecca", "Saudi arabia", "Hijaz-Saudi Arabia",
				"356,000 m2", "8 million m3", 
				"The largest mosque in the world, the most sacred place for the Muslims, and surrounds Islam's holiest place, the Kaaba.", 
				"homebuilding.jpg", "googlemap");
				buildings.add(greatMosqueOfMecca);
						
		BuildingVolume jeanLucLagarderePlant = new BuildingVolume("Jean-Luc Lagardère Plant", "France", "Toulouse-Blagnac",
				"122,500 m2", "5.6 million m3", 
				"The assembly hall of the Airbus A380, the world's largest airliner.", 
				"homebuilding.jpg", "googlemap");
				buildings.add(jeanLucLagarderePlant);
								
		BuildingVolume boeingCompositeWingCenter = new BuildingVolume("Boeing Composite Wing Center", "United States", "Everett, Washington",
				"111,500 m2", "3.7 million m3", 
				"Boeing's assembly site for the production of composite wings for the 777-8 and 777-9", 
				"homebuilding.jpg", "googlemap");
				buildings.add(boeingCompositeWingCenter);
										
		BuildingVolume aerium = new BuildingVolume("Aerium", "Germany", "Halbe, Brandenburg",
				"398,000 m2", "13.3 million m3", 
				"Boeing's assembly site for a selection of the company's largest aircraft, originally built for construction of the 747.", 
				"homebuilding.jpg", "googlemap");
				buildings.add(aerium);
				
		return buildings;
		
	}
	
}
