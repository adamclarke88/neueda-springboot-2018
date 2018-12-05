package uk.ac.belfastmet.dwarfs.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;
import uk.ac.belfastmet.dwarfs.service.DwarfService;

@Controller
@RequestMapping("/tolkien")

public class TolkienController {
	
DwarfRepository dwarfRepository;
	
	public TolkienController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	@GetMapping("")
	public String home(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		ArrayList<Dwarf> tolkienDwarfs =  dwarfService.getTolkienDwarfs();
	 
		
		model.addAttribute("pageTitle", "Tolkien Dwarfs!");
		model.addAttribute("dwarfs", tolkienDwarfs);
		return "dwarfs.html";
		
	}

}
