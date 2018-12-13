package uk.ac.belfastmet.ConstituentsAPI.controller;

import java.util.ArrayList;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.ConstituentsAPI.domain.AllMembersAPI;
import uk.ac.belfastmet.ConstituentsAPI.domain.AllMembersList;
import uk.ac.belfastmet.ConstituentsAPI.domain.Member;

@Controller
@RequestMapping
public class MembersController {
	
	@GetMapping("")
	public String home(Model model) {
		
		
		RestTemplate restTemplate = new RestTemplate();
		
		String allMembersUrl = "http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembers"; 
		
		
		AllMembersAPI allMembersAPI = restTemplate.getForObject(allMembersUrl, AllMembersAPI.class);		
		

		AllMembersList  allMembersList = allMembersAPI.getAllMembersList().get("Member").getAllMembers();
		
		ArrayList<Member> members = allMembersAPI.getAllMembersList().get("Member");
		
		
		
//		model.addAttribute("members", allMembersList.getAllMembers());
		
		return "home.html";
	}

}
