package uk.ac.belfastmet.BelfastEventsAPI.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.BelfastEventsAPI.domain.AllEvents;

@Controller
@RequestMapping()
public class EventsController {
	
	@GetMapping("/home")
	public String home() {
		return "home.html";
	}
	
	@GetMapping("/events")
	public String events(Model model) {
		
		String belfastEventsUrl = "https://neueda-flask-bndouglas.c9users.io/belfast-events/api/";

		RestTemplate restTemplate = new RestTemplate(); 
		
		// rest template takes a url and maps it to a class	(object)	
		AllEvents allEvents = restTemplate.getForObject(belfastEventsUrl, AllEvents.class);
		
//		
//		Logger logger = LoggerFactory.getLogger(TodaysWeather.class);
//		logger.info(todaysWeather.getLocation().toString());
//		logger.info(todaysWeather.getWeather().toString());
//		logger.info(todaysWeather.getWeather().getWind().toString());
		
		model.addAttribute("allEvents", allEvents.getAllEvents());
		return "events.html";
	}

//	@GetMapping("/events")
//	public String displayEvent(Model model) {
//		String eventUrl = "https://neueda-flask-bndouglas.c9users.io/belfast-events/api/";
//		RestTemplate restTemplate = new RestTemplate();
//		
//		AllEvents allEvents = restTemplate.getForObject(eventUrl, AllEvents.class);
//
//		
//		model.addAttribute("events", allEvents.getAllEvents());
//		
//		return "events.html";
//	}
	
}
