package uk.ac.belfastmet.ShrekToyStory.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.ShrekToyStory.domain.Character;
import uk.ac.belfastmet.ShrekToyStory.service.CharacterService;

@Controller
@RequestMapping("/toystory")

public class ToyStoryController {
	
	@GetMapping("")
	public String home (Model model) {
		
		CharacterService characterService = new CharacterService();
		ArrayList<Character> toyStoryCharacters = characterService.getToyStoryCharacters();
		
		model.addAttribute("pageTitle", "Toy Story Characters");
		model.addAttribute("toyStoryCharacters", toyStoryCharacters);
		return "toystory.html";
	}

}








