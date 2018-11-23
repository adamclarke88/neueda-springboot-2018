package uk.ac.belfastmet.LargestBuildings.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.LargestBuildings.domain.BuildingVolume;
import uk.ac.belfastmet.LargestBuildings.service.BuildingService;

@Controller
@RequestMapping("/buildingVolume")

public class BuildingVolumeController {
	
	@GetMapping("")
	public String buildingVolumeController(Model model) {
		
		BuildingService buildingService = new BuildingService();
		ArrayList<BuildingVolume> buildingVolume = buildingService.getBuildingVolume();
		
		model.addAttribute("buildingVolumeArray", buildingVolume);
		
		return "buildingVolume.html";
	}

}
