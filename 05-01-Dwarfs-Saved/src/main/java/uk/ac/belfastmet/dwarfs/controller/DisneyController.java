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
@RequestMapping("/disney")

public class DisneyController {
	
	DwarfRepository dwarfRepository;
	
	public DisneyController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}


	@GetMapping("")
	public String home(Model model) {  //pageTitle is the key, "disney dwarfs" is the value
									  //this is linked to the title attribute on the disney hmtl page
		
		
		//DwarfService dwarfService = new DwarfService();
		//ArrayList<Dwarf> disneyDwarfs =  dwarfService.getDisneyDwarfs();
		

		//model.addAttribute("disneyDwarfs", disneyDwarfs);
		
		//model.addAttribute("disneyDwarfs", dwarfRepository.findAll());
		model.addAttribute("disneyDwarfs", dwarfRepository.findByAuthor("Disney"));
		model.addAttribute("pageTitle", "Disney Dwarfs!");
		
		return "dwarfs.html";							  
	}
	
	

}
