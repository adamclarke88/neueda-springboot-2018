package uk.ac.belfastmet.sbController.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class ToyStory {
	
	@GetMapping("/woody")
	public String woody (Model model) {
		return "Woody was played by Tom Hanks";
	}
	
	@GetMapping("/buzz")
	public String buzz (Model model) {
		return "Buzz was played by Tim Allen";
	}

}
