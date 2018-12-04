package uk.ac.belfastmet.titaniccrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.titaniccrud.repository.PassengerRepository;

@Controller
@RequestMapping
public class PassengerController {
	
	PassengerRepository passengerRepository;

	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}
	
	@GetMapping("/passengers")
	public String searchId(Model model) {

		model.addAttribute("pageTitle", "Search!");
		
		return "passengers.html";
	}
	
	@GetMapping("/showAllPassengers")
	public String showPassengers(@RequestParam("id") Integer passengerId, Model model) {

		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passenger", this.passengerRepository.findAll());
		
		return "passengers.html";
	}

}
