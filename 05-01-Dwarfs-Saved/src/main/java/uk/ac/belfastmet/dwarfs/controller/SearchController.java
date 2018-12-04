package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uk.ac.belfastmet.dwarfs.repository.DwarfRepository;

@Controller
@RequestMapping("")
public class SearchController {
	
	DwarfRepository dwarfRepository;
	
	public SearchController(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}

	@GetMapping("/searchid")
	public String searchId(@RequestParam("id") Integer dwarfId, Model model) {

		model.addAttribute("pageTitle", "Search!");
		model.addAttribute("dwarf", this.dwarfRepository.findByDwarfId(dwarfId));
		
		return "index.html";
	}
	
	@GetMapping("/searchAuthor")
	public String searchAuthor(@RequestParam("author") String author, Model model) {

		model.addAttribute("pageTitle", "Author Search!");
		model.addAttribute("dwarfAuthor", this.dwarfRepository.findByAuthor(author));
		
		return "index.html";
	}
	
	 @GetMapping("/searchbyauthorandname")
	 public String searchNameAuthor(@RequestParam("name") String name, @RequestParam("author") String author, Model model) {
	  model.addAttribute("pageTitle","Search!");
	     model.addAttribute("dwarfs", this.dwarfRepository.findByNameAndAuthor(name,author));
	  return "dwarf.html";
	 }
	

}
