package uk.ac.belfastmet.ShrekToyStory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
	
	@GetMapping("")
	public String home(Model model) {
		model.addAttribute("pageTitle", "Homepage");
		return "index";
	}
}

// this is a change for git to find



