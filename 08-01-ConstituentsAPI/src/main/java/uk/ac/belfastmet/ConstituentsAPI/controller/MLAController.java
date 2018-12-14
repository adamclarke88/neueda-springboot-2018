package uk.ac.belfastmet.ConstituentsAPI.controller;

import java.util.ArrayList;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.ConstituentsAPI.domain.AllMembersAPI;
import uk.ac.belfastmet.ConstituentsAPI.domain.AllMembersList;
import uk.ac.belfastmet.ConstituentsAPI.domain.MLAs;

@Controller
@RequestMapping()
public class MLAController {
	
	@GetMapping("")
	public String home() {
		
		return "home.html";
	}
	
	@GetMapping("/mlas/{constituencyId}")
	public String displayEvent(@PathVariable("constituencyId") String constituencyId, Model model) {
		String allMembersConstituency1Url = "http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembersByConstituencyId&constituencyId=" + constituencyId;
		RestTemplate restTemplate = new RestTemplate();
		AllMembersAPI allMembersAPI = restTemplate.getForObject(allMembersConstituency1Url, AllMembersAPI.class);
		
		AllMembersList allMembersList = allMembersAPI.getAllMembersList();
		
		ArrayList<MLAs> memberList = allMembersAPI.getAllMembersList().getMembers();
				
//		Logger logger = LoggerFactory.getLogger(MLAController.class);
//		logger.info(allMembersAPI.toString());

		model.addAttribute("members", memberList);
		
		return "home.html";
	}

}