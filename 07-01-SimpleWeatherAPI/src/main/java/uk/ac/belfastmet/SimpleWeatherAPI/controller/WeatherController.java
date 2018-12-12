package uk.ac.belfastmet.SimpleWeatherAPI.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.SimpleWeatherAPI.domain.TodaysWeather;

@Controller
@RequestMapping()
public class WeatherController {
	
	@GetMapping("/home")
	public String home() {
		return "home.html";
	}
	
	@GetMapping("/weather/{location}")
	public String belfast(@PathVariable("location") String location, Model model) {
		
		String belfastWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=" + location;

		RestTemplate restTemplate = new RestTemplate(); 
		
		// rest template takes a url and maps it to a class	(object)	
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherUrl, TodaysWeather.class);
		
		
		Logger logger = LoggerFactory.getLogger(TodaysWeather.class);
		logger.info(todaysWeather.getLocation().toString());
		logger.info(todaysWeather.getWeather().toString());
		logger.info(todaysWeather.getWeather().getWind().toString());
		
		if (location.equalsIgnoreCase("belfast")) {
			model.addAttribute("locationTitle", "Belfast Weather");
		} else if (location.equalsIgnoreCase("dublin")) {
			model.addAttribute("locationTitle", "Dublin Weather");
		}else {
			model.addAttribute("locationTitle", "London Weather");
		}
		
		model.addAttribute("todaysWeather", todaysWeather);
		return "belfast";
	}
	

	// in java (json) the key value is a map
	
}
