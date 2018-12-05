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
	
	@GetMapping("/passengerSearch")
	public String searchId(Model model) {
		model.addAttribute("pageTitle", "Search!");
		return "passengerSearch.html";
	}
	
	@GetMapping("/showAllPassengers")
	public String showPassengers(@RequestParam("id") Integer passengerId, Model model) {
		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("passenger", this.passengerRepository.findAll());
		return "passengers.html";
	}
	
	@GetMapping("/passengerIdSearch")
	public String searchById(@RequestParam("id") String  passengerId, Model model) {
		model.addAttribute("pageTitle", "ID Search!");
		model.addAttribute("passenger", this.passengerRepository.findByPassengerId(passengerId));
		return "passengerSearch.html";
	}
	
	@GetMapping("/passengerNameSearch")
	public String searchByName(@RequestParam("name") String name, Model model) {
		model.addAttribute("pageTitle", "Name Search!");
		model.addAttribute("passenger", this.passengerRepository.findByNameContaining(name));
		return "passengerSearch.html";
	}
	
	@GetMapping("/passengersFindAll")
	public String allDwarfsTest(Model model) {  
		model.addAttribute("passenger", this.passengerRepository.findAll());
		model.addAttribute("pageTitle", "Disney Dwarfs!");
		return "passengers.html";							  
	}
}
