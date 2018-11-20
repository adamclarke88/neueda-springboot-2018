package uk.ac.belfastmet.sbController.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping("/toystory")

public class ToyStory {
	
	@GetMapping("/woody")  // routes to /toystory/woody
	public String woody (Model model) {
		return "Woody was played by Tom Hanks";
	}
	
	@GetMapping("/buzz")
	public String buzz (Model model) {
		return "Buzz was played by Tim Allen";
	}
	
	@GetMapping("")  // routes to /toystory - provides a default message
	public String toystory (Model model) {
		return "Toy Story characters";
	}

}
