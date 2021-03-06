package uk.ac.belfastmet.titanicconsumer.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.titanicconsumer.domain.AllPassengers;
import uk.ac.belfastmet.titanicconsumer.domain.Passenger;
import uk.ac.belfastmet.titanicconsumer.service.PassengerServiceImpl;

@Controller
@RequestMapping("")
public class PassengerController {
	

	@Autowired
	PassengerServiceImpl passengerService;
	AllPassengers allPassengers;
	
	public PassengerController() {
		super();
	}
	
	public PassengerController(PassengerServiceImpl passengerService) {
		super();
		this.passengerService = passengerService;
	}

	public PassengerController(PassengerServiceImpl passengerService, AllPassengers allPassengers) {
		super();
		this.passengerService = passengerService;
		this.allPassengers = allPassengers;
	}
	
	@GetMapping("/{passengerId}")
	public String viewPassenger(@PathVariable("passengerId") Integer passengerId, Model model ) {
		
		model.addAttribute("pageTitle", "View Passenger");

		Passenger passenger = this.passengerService.get(passengerId);
		model.addAttribute("passengers", passenger);
		
		return "viewPassenger.html";
	}
	
	@GetMapping("/passengers")
	public String viewAllPassengers( Model model){
		
		model.addAttribute("pageTitle", "All Passengers");
		
		ArrayList<Passenger> passenger = this.passengerService.list();
		model.addAttribute("passengers", passenger);
		
		return "viewPassenger.html";
	}
	

}
