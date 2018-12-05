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
	public String disneyHome(Model model) {  //pageTitle is the key, "disney dwarfs" is the value
									 
		//DwarfService dwarfService = new DwarfService();
		//ArrayList<Dwarf> disneyDwarfs =  dwarfService.getDisneyDwarfs();
		//model.addAttribute("disneyDwarfs", disneyDwarfs);
		//model.addAttribute("disneyDwarfs", dwarfRepository.findAll());
		
		model.addAttribute("dwarfs", dwarfRepository.findByAuthor("Tolkien"));
		model.addAttribute("pageTitle", "Tolkien Dwarfs!");
		
		return "dwarfs.html";							  
	}

}
