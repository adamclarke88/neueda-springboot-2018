package uk.ac.belfastmet.ConstituentsAPI.domain;

import java.util.ArrayList;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersList {
	
	@JsonProperty("Member")
	ArrayList<Member> allMembersList;
	
	public String toString() {
		return this.allMembersList.toString();
	}

}
