package uk.ac.belfastmet.dwarfs.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;

@Controller
@RequestMapping("/disney")

public class DisneyController {
	
	DwarfRepository dwarfRepository;
	
	public DisneyController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}


	@GetMapping("")
	public String disneyHome(Model model) {  //pageTitle is the key, "disney dwarfs" is the value
									 
		//DwarfService dwarfService = new DwarfService();
		//ArrayList<Dwarf> disneyDwarfs =  dwarfService.getDisneyDwarfs();
		//model.addAttribute("disneyDwarfs", disneyDwarfs);
		//model.addAttribute("disneyDwarfs", dwarfRepository.findAll());
		
		model.addAttribute("dwarfs", dwarfRepository.findByAuthor("Disney"));
		model.addAttribute("pageTitle", "Disney Dwarfs!");
		
		return "dwarfs.html";							  
	}
}
